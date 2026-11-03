package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class df0 extends cz1 {
    public static final df0 c = new cz1(gf0.a);

    @Override // defpackage.p
    public final int e(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.jw, defpackage.p
    public final void h(jz jzVar, int i, Object obj) {
        cf0 cf0Var = (cf0) obj;
        cf0Var.getClass();
        double decodeDoubleElement = jzVar.decodeDoubleElement(this.b, i);
        cf0Var.b(cf0Var.d() + 1);
        double[] dArr = cf0Var.a;
        int i2 = cf0Var.b;
        cf0Var.b = i2 + 1;
        dArr[i2] = decodeDoubleElement;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, cf0] */
    @Override // defpackage.p
    public final Object i(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        ?? obj2 = new Object();
        obj2.a = dArr;
        obj2.b = dArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.cz1
    public final Object l() {
        return new double[0];
    }

    @Override // defpackage.cz1
    public final void m(kz kzVar, Object obj, int i) {
        double[] dArr = (double[]) obj;
        kzVar.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            kzVar.encodeDoubleElement(this.b, i2, dArr[i2]);
        }
    }
}
