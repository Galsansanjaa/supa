package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class gq1 extends ConnectivityManager.NetworkCallback {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final /* synthetic */ hq1 b;

    public gq1(hq1 hq1Var) {
        this.b = hq1Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        this.a.post(new fq1(this.b, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        this.a.post(new fq1(this.b, 1));
    }
}
