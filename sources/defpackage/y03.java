package defpackage;

import android.animation.ValueAnimator;
import android.widget.ImageView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y03 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageView b;

    public /* synthetic */ y03(ImageView imageView, int i) {
        this.a = i;
        this.b = imageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        ImageView imageView = this.b;
        switch (i) {
            case 0:
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                float floatValue = ((Float) animatedValue).floatValue();
                imageView.setScaleX(floatValue);
                imageView.setScaleY(floatValue);
                int i2 = (int) ((1.0f - floatValue) * 10.0f);
                imageView.setPadding(i2, i2, i2, i2);
                return;
            default:
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                float floatValue2 = ((Float) animatedValue2).floatValue();
                imageView.setScaleX(floatValue2);
                imageView.setScaleY(floatValue2);
                int i3 = (int) ((1.0f - floatValue2) * 10.0f);
                imageView.setPadding(i3, i3, i3, i3);
                return;
        }
    }
}
