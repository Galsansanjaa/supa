package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class kr extends cz1 {
    public static final kr c = new cz1(lr.a);

    @Override // defpackage.p
    public final int e(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.jw, defpackage.p
    public final void h(jz jzVar, int i, Object obj) {
        jr jrVar = (jr) obj;
        jrVar.getClass();
        byte decodeByteElement = jzVar.decodeByteElement(this.b, i);
        jrVar.b(jrVar.d() + 1);
        byte[] bArr = jrVar.a;
        int i2 = jrVar.b;
        jrVar.b = i2 + 1;
        bArr[i2] = decodeByteElement;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [jr, java.lang.Object] */
    @Override // defpackage.p
    public final Object i(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        ?? obj2 = new Object();
        obj2.a = bArr;
        obj2.b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.cz1
    public final Object l() {
        return new byte[0];
    }

    @Override // defpackage.cz1
    public final void m(kz kzVar, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        kzVar.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            kzVar.encodeByteElement(this.b, i2, bArr[i2]);
        }
    }
}
