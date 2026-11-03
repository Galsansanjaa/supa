package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class mu extends cz1 {
    public static final mu c = new cz1(qu.a);

    @Override // defpackage.p
    public final int e(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.jw, defpackage.p
    public final void h(jz jzVar, int i, Object obj) {
        ku kuVar = (ku) obj;
        kuVar.getClass();
        char decodeCharElement = jzVar.decodeCharElement(this.b, i);
        kuVar.b(kuVar.d() + 1);
        char[] cArr = kuVar.a;
        int i2 = kuVar.b;
        kuVar.b = i2 + 1;
        cArr[i2] = decodeCharElement;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ku] */
    @Override // defpackage.p
    public final Object i(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        ?? obj2 = new Object();
        obj2.a = cArr;
        obj2.b = cArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.cz1
    public final Object l() {
        return new char[0];
    }

    @Override // defpackage.cz1
    public final void m(kz kzVar, Object obj, int i) {
        char[] cArr = (char[]) obj;
        kzVar.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            kzVar.encodeCharElement(this.b, i2, cArr[i2]);
        }
    }
}
