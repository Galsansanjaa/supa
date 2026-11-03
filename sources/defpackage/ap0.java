package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ap0 extends cz1 {
    public static final ap0 c = new cz1(cp0.a);

    @Override // defpackage.p
    public final int e(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.jw, defpackage.p
    public final void h(jz jzVar, int i, Object obj) {
        zo0 zo0Var = (zo0) obj;
        zo0Var.getClass();
        float decodeFloatElement = jzVar.decodeFloatElement(this.b, i);
        zo0Var.b(zo0Var.d() + 1);
        float[] fArr = zo0Var.a;
        int i2 = zo0Var.b;
        zo0Var.b = i2 + 1;
        fArr[i2] = decodeFloatElement;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zo0] */
    @Override // defpackage.p
    public final Object i(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        ?? obj2 = new Object();
        obj2.a = fArr;
        obj2.b = fArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.cz1
    public final Object l() {
        return new float[0];
    }

    @Override // defpackage.cz1
    public final void m(kz kzVar, Object obj, int i) {
        float[] fArr = (float[]) obj;
        kzVar.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            kzVar.encodeFloatElement(this.b, i2, fArr[i2]);
        }
    }
}
