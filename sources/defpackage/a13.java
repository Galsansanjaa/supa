package defpackage;

import android.view.animation.Animation;
import android.widget.ImageView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class a13 implements Animation.AnimationListener {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ Animation b;

    public a13(ImageView imageView, Animation animation) {
        this.a = imageView;
        this.b = animation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.startAnimation(this.b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
