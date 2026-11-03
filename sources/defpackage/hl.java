package defpackage;

import android.content.DialogInterface;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class hl implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ os0 b;

    public /* synthetic */ hl(os0 os0Var, int i) {
        this.a = i;
        this.b = os0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.a;
        os0 os0Var = this.b;
        switch (i) {
            case 0:
                os0Var.invoke();
                return;
            default:
                if (os0Var != null) {
                    os0Var.invoke();
                    return;
                }
                return;
        }
    }
}
