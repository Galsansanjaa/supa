package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class qs1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss1 b;

    public /* synthetic */ qs1(ss1 ss1Var, int i) {
        this.a = i;
        this.b = ss1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        ss1 ss1Var = this.b;
        switch (i) {
            case 0:
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                float floatValue = ((Float) animatedValue).floatValue();
                TextView textView = ss1Var.n;
                textView.setScaleX(floatValue);
                textView.setScaleY(floatValue);
                int i2 = (int) ((1.0f - floatValue) * 10.0f);
                textView.setPadding(i2, i2, i2, i2);
                return;
            default:
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                float floatValue2 = ((Float) animatedValue2).floatValue();
                TextView textView2 = ss1Var.n;
                textView2.setScaleX(floatValue2);
                textView2.setScaleY(floatValue2);
                int i3 = (int) ((1.0f - floatValue2) * 10.0f);
                textView2.setPadding(i3, i3, i3, i3);
                return;
        }
    }
}
