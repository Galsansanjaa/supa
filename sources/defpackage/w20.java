package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class w20 extends t implements d10 {
    public static final v20 Key = new v20(jw0.n, new cq(26));

    public w20() {
        super(jw0.n);
    }

    public static /* synthetic */ w20 limitedParallelism$default(w20 w20Var, int i, String str, int i2, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: limitedParallelism");
            return null;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return w20Var.limitedParallelism(i, str);
    }

    public abstract void dispatch(j20 j20Var, Runnable runnable);

    public void dispatchYield(j20 j20Var, Runnable runnable) {
        ta3.E(this, j20Var, runnable);
    }

    @Override // defpackage.t, defpackage.j20
    public <E extends h20> E get(i20 i20Var) {
        E e;
        i20Var.getClass();
        if (!(i20Var instanceof v20)) {
            if (jw0.n == i20Var) {
                return this;
            }
            return null;
        }
        v20 v20Var = (v20) i20Var;
        i20 key = getKey();
        key.getClass();
        if ((key == v20Var || v20Var.b == key) && (e = (E) v20Var.a.invoke(this)) != null) {
            return e;
        }
        return null;
    }

    @Override // defpackage.d10
    public final <T> a10 interceptContinuation(a10 a10Var) {
        return new ge0(this, a10Var);
    }

    public boolean isDispatchNeeded(j20 j20Var) {
        return true;
    }

    @hd0
    public /* synthetic */ w20 limitedParallelism(int i) {
        return limitedParallelism(i, null);
    }

    public w20 limitedParallelism(int i, String str) {
        np3.j(i);
        return new ld1(this, i, str);
    }

    @Override // defpackage.t, defpackage.j20
    public j20 minusKey(i20 i20Var) {
        i20Var.getClass();
        if (i20Var instanceof v20) {
            v20 v20Var = (v20) i20Var;
            i20 key = getKey();
            key.getClass();
            if ((key != v20Var && v20Var.b != key) || ((h20) v20Var.a.invoke(this)) == null) {
                return this;
            }
        } else if (jw0.n != i20Var) {
            return this;
        }
        return mi0.a;
    }

    @hd0
    public final w20 plus(w20 w20Var) {
        return w20Var;
    }

    @Override // defpackage.d10
    public final void releaseInterceptedContinuation(a10 a10Var) {
        Unsafe unsafe;
        long j;
        a10Var.getClass();
        ge0 ge0Var = (ge0) a10Var;
        do {
            unsafe = zd.a;
            j = ge0.r;
        } while (unsafe.getObjectVolatile(ge0Var, j) == ta3.b);
        Object objectVolatile = unsafe.getObjectVolatile(ge0Var, j);
        qs qsVar = objectVolatile instanceof qs ? (qs) objectVolatile : null;
        if (qsVar != null) {
            qsVar.m();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + nb0.u(this);
    }
}
