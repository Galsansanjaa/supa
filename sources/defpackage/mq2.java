package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class mq2 implements lq2 {
    public final Object a;
    public final ThreadLocal b;
    public final oq2 m;

    public mq2(ThreadLocal threadLocal, Object obj) {
        this.a = obj;
        this.b = threadLocal;
        this.m = new oq2(threadLocal);
    }

    @Override // defpackage.j20
    public final Object fold(Object obj, ts0 ts0Var) {
        return ts0Var.invoke(obj, this);
    }

    @Override // defpackage.j20
    public final h20 get(i20 i20Var) {
        if (this.m.equals(i20Var)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.h20
    public final i20 getKey() {
        return this.m;
    }

    @Override // defpackage.j20
    public final j20 minusKey(i20 i20Var) {
        return this.m.equals(i20Var) ? mi0.a : this;
    }

    @Override // defpackage.j20
    public final j20 plus(j20 j20Var) {
        return xu3.t(this, j20Var);
    }

    @Override // defpackage.lq2
    public final void restoreThreadContext(j20 j20Var, Object obj) {
        this.b.set(obj);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }

    @Override // defpackage.lq2
    public final Object updateThreadContext(j20 j20Var) {
        ThreadLocal threadLocal = this.b;
        Object obj = threadLocal.get();
        threadLocal.set(this.a);
        return obj;
    }
}
