package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ur extends vr0 {
    public final /* synthetic */ de0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur(uk2 uk2Var, de0 de0Var) {
        super(uk2Var);
        this.b = de0Var;
    }

    @Override // defpackage.vr0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
        super.close();
    }
}
