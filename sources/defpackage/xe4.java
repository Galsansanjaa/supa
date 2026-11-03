package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xe4 {
    public final /* synthetic */ int a;

    public /* synthetic */ xe4(int i) {
        this.a = i;
    }

    private final void b(fe4 fe4Var, Iterator it, te4 te4Var) {
    }

    public final void a(fe4 fe4Var, Iterator it, te4 te4Var) {
        switch (this.a) {
            case 0:
                return;
            default:
                if (!fe4Var.c) {
                    hu2.h("non repeating key");
                    return;
                }
                if (!fe4Var.d || ((do3) do3.b.get()).a <= 20) {
                    fe4Var.a(it, te4Var);
                    return;
                }
                while (it.hasNext()) {
                    te4Var.a(it.next(), fe4Var.a);
                }
                return;
        }
    }
}
