package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class r00 implements y40 {
    public final j20 a;

    public r00(j20 j20Var) {
        this.a = j20Var;
    }

    @Override // defpackage.y40
    public final j20 getCoroutineContext() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}
