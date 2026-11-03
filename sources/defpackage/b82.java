package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class b82 extends cm {
    public b82(a10 a10Var) {
        super(a10Var);
        if (a10Var == null || a10Var.getContext() == mi0.a) {
            return;
        }
        v5.m("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.a10
    public j20 getContext() {
        return mi0.a;
    }
}
