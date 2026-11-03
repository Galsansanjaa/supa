package defpackage;

import androidx.autofill.HintConstants;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ag implements cs1 {
    public static final ag a = new Object();
    public static final em0 b = em0.a(HintConstants.AUTOFILL_HINT_NAME);
    public static final em0 c = em0.a("code");
    public static final em0 d = em0.a("address");

    @Override // defpackage.zi0
    public final void a(Object obj, Object obj2) {
        r60 r60Var = (r60) obj;
        ds1 ds1Var = (ds1) obj2;
        ds1Var.a(b, ((gi) r60Var).a);
        gi giVar = (gi) r60Var;
        ds1Var.a(c, giVar.b);
        ds1Var.g(d, giVar.c);
    }
}
