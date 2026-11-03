package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface Animatable2Compat extends Animatable {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static abstract class AnimationCallback {
        Animatable2.AnimationCallback mPlatformCallback;

        public Animatable2.AnimationCallback getPlatformCallback() {
            Animatable2.AnimationCallback animationCallback = this.mPlatformCallback;
            if (animationCallback != null) {
                return animationCallback;
            }
            Animatable2.AnimationCallback animationCallback2 = new Animatable2.AnimationCallback() { // from class: androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback.1
                @Override // android.graphics.drawable.Animatable2.AnimationCallback
                public void onAnimationEnd(Drawable drawable) {
                    AnimationCallback.this.onAnimationEnd(drawable);
                }

                @Override // android.graphics.drawable.Animatable2.AnimationCallback
                public void onAnimationStart(Drawable drawable) {
                    AnimationCallback.this.onAnimationStart(drawable);
                }
            };
            this.mPlatformCallback = animationCallback2;
            return animationCallback2;
        }

        public void onAnimationEnd(Drawable drawable) {
        }

        public void onAnimationStart(Drawable drawable) {
        }
    }

    void clearAnimationCallbacks();

    void registerAnimationCallback(AnimationCallback animationCallback);

    boolean unregisterAnimationCallback(AnimationCallback animationCallback);
}
