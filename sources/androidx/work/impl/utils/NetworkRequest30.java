package androidx.work.impl.utils;

import android.net.NetworkRequest;
import android.net.NetworkSpecifier;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class NetworkRequest30 {
    public static final NetworkRequest30 INSTANCE = new NetworkRequest30();

    private NetworkRequest30() {
    }

    public final NetworkSpecifier getNetworkSpecifier(NetworkRequest networkRequest) {
        networkRequest.getClass();
        return networkRequest.getNetworkSpecifier();
    }
}
