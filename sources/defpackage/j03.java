package defpackage;

import android.animation.ValueAnimator;
import android.widget.ImageView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j03 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l03 b;

    public /* synthetic */ j03(l03 l03Var, int i) {
        this.a = i;
        this.b = l03Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        l03 l03Var = this.b;
        switch (i) {
            case 0:
                valueAnimator.getClass();
                ImageView imageView = l03Var.b;
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                int intValue = ((Integer) animatedValue).intValue();
                imageView.setPadding(intValue, intValue, intValue, intValue);
                return;
            default:
                valueAnimator.getClass();
                ImageView imageView2 = l03Var.b;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                int intValue2 = ((Integer) animatedValue2).intValue();
                imageView2.setPadding(intValue2, intValue2, intValue2, intValue2);
                return;
        }
    }
}
