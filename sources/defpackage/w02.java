package defpackage;

import android.animation.ValueAnimator;
import androidx.core.view.insets.Protection;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w02 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Protection b;

    public /* synthetic */ w02(Protection protection, int i) {
        this.a = i;
        this.b = protection;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Protection protection = this.b;
        switch (i) {
            case 0:
                Protection.b(protection, valueAnimator);
                return;
            default:
                Protection.a(protection, valueAnimator);
                return;
        }
    }
}
