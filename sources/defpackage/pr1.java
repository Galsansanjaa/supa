package defpackage;

import android.view.View;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class pr1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr1 b;

    public /* synthetic */ pr1(rr1 rr1Var, int i) {
        this.a = i;
        this.b = rr1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        rr1 rr1Var = this.b;
        switch (i) {
            case 0:
                rr1Var.G();
                tr1 tr1Var = k13.z;
                tr1Var.getClass();
                tr1Var.d(false);
                return;
            case 1:
                rr1Var.G();
                tr1 tr1Var2 = k13.z;
                tr1Var2.getClass();
                tr1Var2.e();
                return;
            case 2:
                rr1Var.G();
                return;
            case 3:
                rr1Var.G();
                return;
            default:
                rr1Var.G();
                return;
        }
    }
}
