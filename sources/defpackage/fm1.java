package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class fm1 extends di1 implements ha1 {
    public final pw1 m;
    public Object n;

    public fm1(pw1 pw1Var, Object obj, Object obj2) {
        super(obj, obj2);
        this.m = pw1Var;
        this.n = obj2;
    }

    @Override // defpackage.di1, java.util.Map.Entry
    public final Object getValue() {
        return this.n;
    }

    @Override // defpackage.di1, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.n;
        this.n = obj;
        nw1 nw1Var = this.m.a;
        mw1 mw1Var = nw1Var.n;
        Object obj3 = this.a;
        if (!mw1Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = nw1Var.m;
        if (!z) {
            mw1Var.put(obj3, obj);
        } else {
            if (!z) {
                f31.b();
                return null;
            }
            tu2 tu2Var = nw1Var.a[nw1Var.b];
            Object obj4 = tu2Var.a[tu2Var.m];
            mw1Var.put(obj3, obj);
            nw1Var.c(obj4 != null ? obj4.hashCode() : 0, mw1Var.m, obj4, 0, 0, false);
        }
        nw1Var.q = mw1Var.o;
        return obj2;
    }
}
