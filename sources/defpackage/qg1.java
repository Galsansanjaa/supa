package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class qg1 extends cz1 {
    public static final qg1 c = new cz1(ug1.a);

    @Override // defpackage.p
    public final int e(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.jw, defpackage.p
    public final void h(jz jzVar, int i, Object obj) {
        pg1 pg1Var = (pg1) obj;
        pg1Var.getClass();
        long decodeLongElement = jzVar.decodeLongElement(this.b, i);
        pg1Var.b(pg1Var.d() + 1);
        long[] jArr = pg1Var.a;
        int i2 = pg1Var.b;
        pg1Var.b = i2 + 1;
        jArr[i2] = decodeLongElement;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pg1] */
    @Override // defpackage.p
    public final Object i(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        ?? obj2 = new Object();
        obj2.a = jArr;
        obj2.b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.cz1
    public final Object l() {
        return new long[0];
    }

    @Override // defpackage.cz1
    public final void m(kz kzVar, Object obj, int i) {
        long[] jArr = (long[]) obj;
        kzVar.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            kzVar.encodeLongElement(this.b, i2, jArr[i2]);
        }
    }
}
