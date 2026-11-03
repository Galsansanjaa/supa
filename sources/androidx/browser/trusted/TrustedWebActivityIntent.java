package androidx.browser.trusted;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.trusted.TrustedWebActivityDisplayMode;
import androidx.core.content.ContextCompat;
import androidx.core.content.IntentCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TrustedWebActivityIntent {
    private final List<Uri> mFileHandlingUris;
    private final Intent mIntent;
    private final List<Uri> mSharedFileUris;

    public TrustedWebActivityIntent(Intent intent, List<Uri> list, List<Uri> list2) {
        this.mIntent = intent;
        this.mSharedFileUris = list;
        this.mFileHandlingUris = list2;
    }

    private void grantUriPermissionToProvider(Context context) {
        Iterator<Uri> it = this.mSharedFileUris.iterator();
        while (it.hasNext()) {
            context.grantUriPermission(this.mIntent.getPackage(), it.next(), 1);
        }
        for (Uri uri : this.mFileHandlingUris) {
            if (context.checkCallingOrSelfUriPermission(uri, 1) == 0) {
                int checkCallingOrSelfUriPermission = context.checkCallingOrSelfUriPermission(uri, 2);
                Intent intent = this.mIntent;
                if (checkCallingOrSelfUriPermission == 0) {
                    context.grantUriPermission(intent.getPackage(), uri, 3);
                } else {
                    context.grantUriPermission(intent.getPackage(), uri, 1);
                }
            }
        }
    }

    public List<TrustedWebActivityDisplayMode> getDisplayOverrideList() {
        ArrayList parcelableArrayListExtra = IntentCompat.getParcelableArrayListExtra(getIntent(), TrustedWebActivityIntentBuilder.EXTRA_DISPLAY_OVERRIDE, Bundle.class);
        if (parcelableArrayListExtra == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int size = parcelableArrayListExtra.size();
        int i = 0;
        while (i < size) {
            Object obj = parcelableArrayListExtra.get(i);
            i++;
            Bundle bundle = (Bundle) obj;
            int i2 = bundle.getInt(TrustedWebActivityDisplayMode.KEY_ID);
            arrayList.add(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? new TrustedWebActivityDisplayMode.DefaultMode() : new TrustedWebActivityDisplayMode.WindowControlsOverlayMode() : new TrustedWebActivityDisplayMode.TabbedMode() : new TrustedWebActivityDisplayMode.MinimalUiMode() : new TrustedWebActivityDisplayMode.BrowserMode() : TrustedWebActivityDisplayMode.ImmersiveMode.fromBundle(bundle));
        }
        return arrayList;
    }

    public FileHandlingData getFileHandlingData() {
        return FileHandlingData.fromBundle(getIntent().getBundleExtra(TrustedWebActivityIntentBuilder.EXTRA_FILE_HANDLING_DATA));
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public int getLaunchHandlerClientMode() {
        return getIntent().getIntExtra(TrustedWebActivityIntentBuilder.EXTRA_LAUNCH_HANDLER_CLIENT_MODE, 0);
    }

    public Uri getOriginalLaunchUrl() {
        return (Uri) IntentCompat.getParcelableExtra(getIntent(), TrustedWebActivityIntentBuilder.EXTRA_ORIGINAL_LAUNCH_URL, Uri.class);
    }

    public void launchTrustedWebActivity(Context context) {
        grantUriPermissionToProvider(context);
        ContextCompat.startActivity(context, this.mIntent, null);
    }
}
