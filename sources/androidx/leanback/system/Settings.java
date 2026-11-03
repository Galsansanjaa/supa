package androidx.leanback.system;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import androidx.leanback.widget.ShadowOverlayContainer;
import defpackage.v5;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class Settings {
    private static final String ACTION_PARTNER_CUSTOMIZATION = "android.support.v17.leanback.action.PARTNER_CUSTOMIZATION";
    private static final boolean DEBUG = false;
    public static final String OUTLINE_CLIPPING_DISABLED = "OUTLINE_CLIPPING_DISABLED";
    public static final String PREFER_STATIC_SHADOWS = "PREFER_STATIC_SHADOWS";
    private static final String TAG = "Settings";
    private static Settings sInstance;
    private boolean mOutlineClippingDisabled;
    private boolean mPreferStaticShadows;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static class Customizations {
        String mPackageName;
        Resources mResources;

        public Customizations(Resources resources, String str) {
            this.mResources = resources;
            this.mPackageName = str;
        }

        public boolean getBoolean(String str, boolean z) {
            int identifier = this.mResources.getIdentifier(str, "bool", this.mPackageName);
            return identifier > 0 ? this.mResources.getBoolean(identifier) : z;
        }
    }

    private Settings(Context context) {
        generateSetting(getCustomizations(context), context);
    }

    private void generateSetting(Customizations customizations, Context context) {
        if (ShadowOverlayContainer.supportsDynamicShadow()) {
            this.mPreferStaticShadows = false;
            if (customizations != null) {
                this.mPreferStaticShadows = customizations.getBoolean("leanback_prefer_static_shadows", false);
            }
        } else {
            this.mPreferStaticShadows = true;
        }
        boolean isLowRamDevice = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        this.mOutlineClippingDisabled = isLowRamDevice;
        if (customizations != null) {
            this.mOutlineClippingDisabled = customizations.getBoolean("leanback_outline_clipping_disabled", isLowRamDevice);
        }
    }

    private Customizations getCustomizations(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(new Intent(ACTION_PARTNER_CUSTOMIZATION), 0).iterator();
        Resources resources = null;
        String str = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo next = it.next();
            String str2 = next.activityInfo.packageName;
            if (str2 != null && isSystemApp(next)) {
                try {
                    resources = packageManager.getResourcesForApplication(str2);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            if (resources != null) {
                str = str2;
                break;
            }
            str = str2;
        }
        if (resources == null) {
            return null;
        }
        return new Customizations(resources, str);
    }

    public static Settings getInstance(Context context) {
        Settings settings = sInstance;
        if (settings != null) {
            return settings;
        }
        Settings settings2 = new Settings(context);
        sInstance = settings2;
        return settings2;
    }

    private static boolean isSystemApp(ResolveInfo resolveInfo) {
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return (activityInfo == null || (activityInfo.applicationInfo.flags & 1) == 0) ? false : true;
    }

    public boolean getBoolean(String str) {
        return getOrSetBoolean(str, false, false);
    }

    public boolean getOrSetBoolean(String str, boolean z, boolean z2) {
        if (str.compareTo(PREFER_STATIC_SHADOWS) == 0) {
            if (!z) {
                return this.mPreferStaticShadows;
            }
            this.mPreferStaticShadows = z2;
            return z2;
        }
        if (str.compareTo(OUTLINE_CLIPPING_DISABLED) != 0) {
            v5.m("Invalid key");
            return false;
        }
        if (!z) {
            return this.mOutlineClippingDisabled;
        }
        this.mOutlineClippingDisabled = z2;
        return z2;
    }

    public boolean isOutlineClippingDisabled() {
        return this.mOutlineClippingDisabled;
    }

    public boolean preferStaticShadows() {
        return this.mPreferStaticShadows;
    }

    public void setBoolean(String str, boolean z) {
        getOrSetBoolean(str, true, z);
    }
}
