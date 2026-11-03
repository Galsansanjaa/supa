package androidx.privacysandbox.ads.adservices.internal;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AdServicesInfo {
    public static final AdServicesInfo INSTANCE = new AdServicesInfo();

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Extensions30ExtImpl {
        public static final Extensions30ExtImpl INSTANCE = new Extensions30ExtImpl();

        private Extensions30ExtImpl() {
        }

        public final int getAdExtServicesVersionS() {
            return SdkExtensions.getExtensionVersion(31);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Extensions30Impl {
        public static final Extensions30Impl INSTANCE = new Extensions30Impl();

        private Extensions30Impl() {
        }

        public final int getAdServicesVersion() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private AdServicesInfo() {
    }

    public final int adServicesVersion() {
        if (Build.VERSION.SDK_INT >= 33) {
            return Extensions30Impl.INSTANCE.getAdServicesVersion();
        }
        return 0;
    }

    public final int extServicesVersionS() {
        int i = Build.VERSION.SDK_INT;
        if (i == 31 || i == 32) {
            return Extensions30ExtImpl.INSTANCE.getAdExtServicesVersionS();
        }
        return 0;
    }
}
