package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class mc3 {
    public final ConnectivityManager a;

    public mc3(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = this.a;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return (networkCapabilities != null && networkCapabilities.hasCapability(12)) && (networkCapabilities != null && networkCapabilities.hasCapability(16));
    }
}
