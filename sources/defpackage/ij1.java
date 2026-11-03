package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class ij1 {
    hj1 mConnectionCallbackInternal;
    final Object mConnectionCallbackObj = new mj1(new mu0(this, 15));

    public abstract void onConnected();

    public abstract void onConnectionFailed();

    public abstract void onConnectionSuspended();

    public void setInternalConnectionCallback(hj1 hj1Var) {
        this.mConnectionCallbackInternal = hj1Var;
    }
}
