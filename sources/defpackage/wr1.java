package defpackage;

import android.net.nsd.NsdManager$ServiceInfoCallback;
import android.net.nsd.NsdServiceInfo;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class wr1 implements NsdManager$ServiceInfoCallback {
    public final /* synthetic */ yr1 a;

    public wr1(yr1 yr1Var) {
        this.a = yr1Var;
    }

    public final void onServiceInfoCallbackRegistrationFailed(int i) {
    }

    public final void onServiceInfoCallbackUnregistered() {
    }

    public final void onServiceLost() {
    }

    public final void onServiceUpdated(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        this.a.d(nsdServiceInfo);
    }
}
