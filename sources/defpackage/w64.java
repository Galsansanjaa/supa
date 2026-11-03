package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class w64 implements Runnable {
    public final /* synthetic */ v64 a;
    public final /* synthetic */ v64 b;
    public final /* synthetic */ long m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ c74 o;

    public w64(c74 c74Var, v64 v64Var, v64 v64Var2, long j, boolean z) {
        this.a = v64Var;
        this.b = v64Var2;
        this.m = j;
        this.n = z;
        this.o = c74Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.o.y(this.a, this.b, this.m, this.n, null);
    }
}
