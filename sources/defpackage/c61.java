package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class c61 extends cz1 {
    public static final c61 c = new cz1(j61.a);

    @Override // defpackage.p
    public final int e(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.jw, defpackage.p
    public final void h(jz jzVar, int i, Object obj) {
        b61 b61Var = (b61) obj;
        b61Var.getClass();
        int decodeIntElement = jzVar.decodeIntElement(this.b, i);
        b61Var.b(b61Var.d() + 1);
        int[] iArr = b61Var.a;
        int i2 = b61Var.b;
        b61Var.b = i2 + 1;
        iArr[i2] = decodeIntElement;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, b61] */
    @Override // defpackage.p
    public final Object i(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        ?? obj2 = new Object();
        obj2.a = iArr;
        obj2.b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.cz1
    public final Object l() {
        return new int[0];
    }

    @Override // defpackage.cz1
    public final void m(kz kzVar, Object obj, int i) {
        int[] iArr = (int[]) obj;
        kzVar.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            kzVar.encodeIntElement(this.b, i2, iArr[i2]);
        }
    }
}
