package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class zb0 extends zj0 implements Executor {
    public static final zb0 a = new w20();
    public static final w20 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [w20, zb0] */
    static {
        xy2 xy2Var = xy2.a;
        int i = go2.a;
        if (64 >= i) {
            i = 64;
        }
        b = w20.limitedParallelism$default(xy2Var, nb0.M(i, 12, "kotlinx.coroutines.io.parallelism"), null, 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // defpackage.w20
    public final void dispatch(j20 j20Var, Runnable runnable) {
        b.dispatch(j20Var, runnable);
    }

    @Override // defpackage.w20
    public final void dispatchYield(j20 j20Var, Runnable runnable) {
        b.dispatchYield(j20Var, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(mi0.a, runnable);
    }

    @Override // defpackage.w20
    public final w20 limitedParallelism(int i, String str) {
        return xy2.a.limitedParallelism(i, str);
    }

    @Override // defpackage.w20
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.zj0
    public final Executor v() {
        return this;
    }
}
