package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class o64 {
    public static final Object j = new Object();
    public static final AtomicReference k = new AtomicReference();
    public static volatile o64 l = null;
    public static final mn2 m = m60.z(q14.m);
    public final oc3 a = new oc3(11);
    public final Context b;
    public final mn2 c;
    public final mn2 d;
    public final mn2 e;
    public final mn2 f;
    public final qb4 g;
    public final mn2 h;
    public final cb4 i;

    public o64(Context context, mn2 mn2Var, mn2 mn2Var2, mn2 mn2Var3, mn2 mn2Var4, mn2 mn2Var5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        mn2Var.getClass();
        mn2Var2.getClass();
        mn2Var3.getClass();
        mn2Var4.getClass();
        mn2Var5.getClass();
        mn2 z = m60.z(mn2Var);
        mn2 z2 = m60.z(mn2Var2);
        mn2 z3 = m60.z(new vk3(mn2Var3, 9));
        mn2 z4 = m60.z(mn2Var4);
        mn2 z5 = m60.z(mn2Var5);
        this.b = applicationContext;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = new qb4(applicationContext, z, z4, z2);
        this.h = z5;
        this.i = new cb4(applicationContext, z, z3, z2);
    }

    public static void b() {
        t61.M();
        if (k.get() == null && t61.m == null) {
            t61.m = new bv0(6);
        }
    }

    public final hl1 a() {
        return (hl1) this.c.get();
    }
}
