package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class fe0 extends Exception {
    public final Throwable a;

    public fe0(Throwable th, w20 w20Var, j20 j20Var) {
        super("Coroutine dispatcher " + w20Var + " threw an exception, context = " + j20Var, th);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
