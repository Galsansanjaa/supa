package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class b71 extends v71 {
    public static final /* synthetic */ long p = zd.a.objectFieldOffset(b71.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile;
    public final u71 o;

    public b71(u71 u71Var) {
        this.o = u71Var;
    }

    @Override // defpackage.v71
    public final boolean k() {
        return true;
    }

    @Override // defpackage.v71
    public final void l(Throwable th) {
        if (zd.a.compareAndSwapInt(this, p, 0, 1)) {
            this.o.invoke(th);
        }
    }
}
