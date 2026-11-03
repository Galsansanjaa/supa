package defpackage;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class zf implements cs1 {
    public static final zf a = new Object();
    public static final em0 b = em0.a(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
    public static final em0 c = em0.a("reason");
    public static final em0 d = em0.a("frames");
    public static final em0 e = em0.a("causedBy");
    public static final em0 f = em0.a("overflowCount");

    @Override // defpackage.zi0
    public final void a(Object obj, Object obj2) {
        q60 q60Var = (q60) obj;
        ds1 ds1Var = (ds1) obj2;
        ds1Var.a(b, ((fi) q60Var).a);
        fi fiVar = (fi) q60Var;
        ds1Var.a(c, fiVar.b);
        ds1Var.a(d, fiVar.c);
        ds1Var.a(e, fiVar.d);
        ds1Var.e(f, fiVar.e);
    }
}
