package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.work.Logger;
import defpackage.wd;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class NetworkRequest28 {
    public static final NetworkRequest28 INSTANCE = new NetworkRequest28();

    private NetworkRequest28() {
    }

    public static final NetworkRequest createNetworkRequest(int[] iArr, int[] iArr2) {
        int[] iArr3;
        iArr.getClass();
        iArr2.getClass();
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                Logger.get().warning(NetworkRequestCompat.Companion.getTAG(), "Ignoring adding capability '" + i + '\'', e);
            }
        }
        iArr3 = NetworkRequestCompatKt.defaultCapabilities;
        for (int i2 : iArr3) {
            if (!wd.a0(i2, iArr)) {
                try {
                    builder.removeCapability(i2);
                } catch (IllegalArgumentException e2) {
                    Logger.get().warning(NetworkRequestCompat.Companion.getTAG(), "Ignoring removing default capability '" + i2 + '\'', e2);
                }
            }
        }
        for (int i3 : iArr2) {
            builder.addTransportType(i3);
        }
        NetworkRequest build = builder.build();
        build.getClass();
        return build;
    }

    public final NetworkRequestCompat createNetworkRequestCompat$work_runtime_release(int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        return new NetworkRequestCompat(createNetworkRequest(iArr, iArr2));
    }

    public final boolean hasCapability$work_runtime_release(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasCapability(i);
    }

    public final boolean hasTransport$work_runtime_release(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasTransport(i);
    }
}
