package defpackage;

import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ri1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object m;

    public /* synthetic */ ri1(Object obj, int i, int i2) {
        this.a = i2;
        this.m = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.m;
        switch (i) {
            case 0:
                ((MaterialButton) obj).lambda$setIconSize$1(i2);
                return;
            case 1:
                rr1 rr1Var = (rr1) obj;
                ProgressBar progressBar = rr1Var.A;
                if (progressBar != null) {
                    progressBar.setProgress(i2);
                }
                TextView textView = rr1Var.z;
                if (textView != null) {
                    textView.setText(i2 + "%");
                    return;
                }
                return;
            case 2:
                ((ResourcesCompat.FontCallback) obj).lambda$callbackFailAsync$1(i2);
                return;
            default:
                SideSheetBehavior.b((SideSheetBehavior) obj, i2);
                return;
        }
    }
}
