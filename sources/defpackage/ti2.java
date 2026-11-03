package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ti2 extends cz1 {
    public static final ti2 c = new cz1(wi2.a);

    @Override // defpackage.p
    public final int e(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.jw, defpackage.p
    public final void h(jz jzVar, int i, Object obj) {
        si2 si2Var = (si2) obj;
        si2Var.getClass();
        short decodeShortElement = jzVar.decodeShortElement(this.b, i);
        si2Var.b(si2Var.d() + 1);
        short[] sArr = si2Var.a;
        int i2 = si2Var.b;
        si2Var.b = i2 + 1;
        sArr[i2] = decodeShortElement;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, si2] */
    @Override // defpackage.p
    public final Object i(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        ?? obj2 = new Object();
        obj2.a = sArr;
        obj2.b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.cz1
    public final Object l() {
        return new short[0];
    }

    @Override // defpackage.cz1
    public final void m(kz kzVar, Object obj, int i) {
        short[] sArr = (short[]) obj;
        kzVar.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            kzVar.encodeShortElement(this.b, i2, sArr[i2]);
        }
    }
}
