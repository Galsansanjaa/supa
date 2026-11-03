package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class vr0 implements uk2 {
    public final uk2 a;

    public vr0(uk2 uk2Var) {
        uk2Var.getClass();
        this.a = uk2Var;
    }

    @Override // defpackage.uk2
    public final or2 b() {
        return this.a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.uk2
    public long r(tq tqVar, long j) {
        tqVar.getClass();
        return this.a.r(tqVar, j);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
