package defpackage;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class fg implements cs1 {
    public static final fg a = new Object();
    public static final em0 b = em0.a("timestamp");
    public static final em0 c = em0.a(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
    public static final em0 d = em0.a("app");
    public static final em0 e = em0.a("device");
    public static final em0 f = em0.a("log");
    public static final em0 g = em0.a("rollouts");

    @Override // defpackage.zi0
    public final void a(Object obj, Object obj2) {
        c70 c70Var = (c70) obj;
        ds1 ds1Var = (ds1) obj2;
        ds1Var.g(b, ((ai) c70Var).a);
        ai aiVar = (ai) c70Var;
        ds1Var.a(c, aiVar.b);
        ds1Var.a(d, aiVar.c);
        ds1Var.a(e, aiVar.d);
        ds1Var.a(f, aiVar.e);
        ds1Var.a(g, aiVar.f);
    }
}
