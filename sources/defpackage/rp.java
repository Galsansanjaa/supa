package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class rp extends cz1 {
    public static final rp c = new cz1(tp.a);

    @Override // defpackage.p
    public final int e(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.jw, defpackage.p
    public final void h(jz jzVar, int i, Object obj) {
        qp qpVar = (qp) obj;
        qpVar.getClass();
        boolean decodeBooleanElement = jzVar.decodeBooleanElement(this.b, i);
        qpVar.b(qpVar.d() + 1);
        boolean[] zArr = qpVar.a;
        int i2 = qpVar.b;
        qpVar.b = i2 + 1;
        zArr[i2] = decodeBooleanElement;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qp] */
    @Override // defpackage.p
    public final Object i(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        ?? obj2 = new Object();
        obj2.a = zArr;
        obj2.b = zArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.cz1
    public final Object l() {
        return new boolean[0];
    }

    @Override // defpackage.cz1
    public final void m(kz kzVar, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        kzVar.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            kzVar.encodeBooleanElement(this.b, i2, zArr[i2]);
        }
    }
}
