package defpackage;

import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.uptodown.core.view.UptodownTextView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class pa implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pa(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                v82 v82Var = (v82) obj;
                UptodownTextView uptodownTextView = v82Var.w;
                uptodownTextView.getViewTreeObserver().removeOnPreDrawListener(this);
                if (ta3.v(uptodownTextView)) {
                    v82Var.B.setVisibility(0);
                }
                return true;
            case 1:
                y82 y82Var = (y82) obj;
                UptodownTextView uptodownTextView2 = y82Var.x;
                uptodownTextView2.getViewTreeObserver().removeOnPreDrawListener(this);
                if (ta3.v(uptodownTextView2)) {
                    y82Var.C.setVisibility(0);
                }
                return true;
            case 2:
                ((by1) obj).b();
                return true;
            case 3:
                i33 i33Var = (i33) obj;
                TextView textView = i33Var.p;
                textView.getViewTreeObserver().removeOnPreDrawListener(this);
                if (ta3.v(textView)) {
                    i33Var.q.setVisibility(0);
                }
                return true;
            default:
                x82 x82Var = ((i53) obj).b;
                x82Var.v.getViewTreeObserver().removeOnPreDrawListener(this);
                if (ta3.v(x82Var.v)) {
                    x82Var.z.setVisibility(0);
                }
                return true;
        }
    }
}
