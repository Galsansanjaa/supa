package defpackage;

import android.app.AlertDialog;
import android.view.View;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k10 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m10 b;

    public /* synthetic */ k10(m10 m10Var, int i) {
        this.a = i;
        this.b = m10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        m10 m10Var = this.b;
        switch (i) {
            case 0:
                AlertDialog alertDialog = m10Var.a;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                m10Var.A();
                return;
            case 1:
                AlertDialog alertDialog2 = m10Var.a;
                alertDialog2.getClass();
                alertDialog2.dismiss();
                return;
            default:
                AlertDialog alertDialog3 = m10Var.a;
                alertDialog3.getClass();
                alertDialog3.dismiss();
                return;
        }
    }
}
