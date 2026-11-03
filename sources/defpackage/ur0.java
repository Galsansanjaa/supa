package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class ur0 implements nj2 {
    public final nj2 a;

    public ur0(nj2 nj2Var) {
        nj2Var.getClass();
        this.a = nj2Var;
    }

    @Override // defpackage.nj2
    public final or2 b() {
        return this.a.b();
    }

    @Override // defpackage.nj2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.nj2, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    @Override // defpackage.nj2
    public void o(tq tqVar, long j) {
        this.a.o(tqVar, j);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
