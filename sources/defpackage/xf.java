package defpackage;

import androidx.autofill.HintConstants;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xf implements cs1 {
    public static final xf a = new Object();
    public static final em0 b = em0.a("baseAddress");
    public static final em0 c = em0.a("size");
    public static final em0 d = em0.a(HintConstants.AUTOFILL_HINT_NAME);
    public static final em0 e = em0.a("uuid");

    @Override // defpackage.zi0
    public final void a(Object obj, Object obj2) {
        p60 p60Var = (p60) obj;
        ds1 ds1Var = (ds1) obj2;
        ds1Var.g(b, ((ei) p60Var).a);
        ei eiVar = (ei) p60Var;
        ds1Var.g(c, eiVar.b);
        ds1Var.a(d, eiVar.c);
        String str = eiVar.d;
        ds1Var.a(e, str != null ? str.getBytes(g70.a) : null);
    }
}
