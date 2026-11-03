package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ry2 extends w20 {
    public static final /* synthetic */ int a = 0;

    static {
        new w20();
    }

    @Override // defpackage.w20
    public final void dispatch(j20 j20Var, Runnable runnable) {
        u93 u93Var = (u93) j20Var.get(u93.b);
        if (u93Var != null) {
            u93Var.a = true;
        } else {
            f31.f("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.w20
    public final boolean isDispatchNeeded(j20 j20Var) {
        return false;
    }

    @Override // defpackage.w20
    public final w20 limitedParallelism(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.w20
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
