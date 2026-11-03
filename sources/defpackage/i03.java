package defpackage;

import android.view.View;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i03 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l03 b;
    public final /* synthetic */ r7 m;

    public /* synthetic */ i03(l03 l03Var, r7 r7Var, int i) {
        this.a = i;
        this.b = l03Var;
        this.m = r7Var;
    }

    public /* synthetic */ i03(r7 r7Var, l03 l03Var) {
        this.a = 3;
        this.m = r7Var;
        this.b = l03Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        l03 l03Var = this.b;
        r7 r7Var = this.m;
        switch (i) {
            case 0:
                hz2 hz2Var = l03Var.a;
                if (hz2Var != null) {
                    hz2Var.a(r7Var);
                    return;
                }
                return;
            case 1:
                hz2 hz2Var2 = l03Var.a;
                if (hz2Var2 != null) {
                    hz2Var2.k(r7Var, l03Var.s);
                    return;
                }
                return;
            case 2:
                hz2 hz2Var3 = l03Var.a;
                if (hz2Var3 != null) {
                    hz2Var3.x(r7Var);
                    return;
                }
                return;
            default:
                boolean z = r7Var.F;
                hz2 hz2Var4 = l03Var.a;
                if (z) {
                    if (hz2Var4 != null) {
                        hz2Var4.K(r7Var);
                        return;
                    }
                    return;
                } else {
                    if (hz2Var4 != null) {
                        hz2Var4.b(r7Var);
                        return;
                    }
                    return;
                }
        }
    }
}
