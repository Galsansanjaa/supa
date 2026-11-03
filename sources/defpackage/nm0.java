package defpackage;

import android.app.AlertDialog;
import android.view.View;
import com.uptodown.core.activities.FileExplorerActivity;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class nm0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z42 b;
    public final /* synthetic */ FileExplorerActivity m;

    public /* synthetic */ nm0(z42 z42Var, FileExplorerActivity fileExplorerActivity, int i) {
        this.a = i;
        this.b = z42Var;
        this.m = fileExplorerActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        FileExplorerActivity fileExplorerActivity = this.m;
        z42 z42Var = this.b;
        switch (i) {
            case 0:
                int i2 = FileExplorerActivity.p0;
                r71 r71Var = (r71) z42Var.a;
                if (r71Var != null) {
                    r71Var.cancel(null);
                }
                AlertDialog alertDialog = fileExplorerActivity.R;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                    return;
                }
                return;
            default:
                int i3 = FileExplorerActivity.p0;
                r71 r71Var2 = (r71) z42Var.a;
                if (r71Var2 != null) {
                    r71Var2.cancel(null);
                }
                AlertDialog alertDialog2 = fileExplorerActivity.R;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                    return;
                }
                return;
        }
    }
}
