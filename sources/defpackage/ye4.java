package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ye4 {
    public static final we4 d = new we4();
    public static final xe4 e = new xe4(0);
    public final HashMap a;
    public final HashMap b;
    public xe4 c;

    public /* synthetic */ ye4() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = null;
    }

    public ye4(ye4 ye4Var) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap.putAll(ye4Var.a);
        hashMap2.putAll(ye4Var.b);
        this.c = ye4Var.c;
    }

    public void a(fe4 fe4Var, Object obj, te4 te4Var) {
        we4 we4Var = (we4) this.a.get(fe4Var);
        if (we4Var == null) {
            if (!fe4Var.d || ((do3) do3.b.get()).a <= 20) {
                fe4Var.b(obj, te4Var);
                return;
            } else {
                te4Var.a(obj, fe4Var.a);
                return;
            }
        }
        switch (we4Var.a) {
            case 0:
                return;
            default:
                if (!fe4Var.d || ((do3) do3.b.get()).a <= 20) {
                    fe4Var.b(obj, te4Var);
                    return;
                } else {
                    te4Var.a(obj, fe4Var.a);
                    return;
                }
        }
    }

    public void b(fe4 fe4Var, Iterator it, te4 te4Var) {
        xe4 xe4Var = (xe4) this.b.get(fe4Var);
        if (xe4Var != null) {
            xe4Var.a(fe4Var, it, te4Var);
            return;
        }
        xe4 xe4Var2 = this.c;
        if (xe4Var2 != null && !this.a.containsKey(fe4Var)) {
            xe4Var2.a(fe4Var, it, te4Var);
        } else {
            while (it.hasNext()) {
                a(fe4Var, it.next(), te4Var);
            }
        }
    }
}
