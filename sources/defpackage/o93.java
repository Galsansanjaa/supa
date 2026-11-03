package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class o93 {
    public static final o93 b;
    public ru1 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [o93, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.a = null;
        b = obj;
    }

    public static ru1 a(Context context) {
        ru1 ru1Var;
        o93 o93Var = b;
        synchronized (o93Var) {
            try {
                ru1Var = o93Var.a;
                if (ru1Var == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    ru1Var = new ru1(context);
                    o93Var.a = ru1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ru1Var;
    }
}
