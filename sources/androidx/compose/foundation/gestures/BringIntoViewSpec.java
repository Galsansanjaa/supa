package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import defpackage.hd0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface BringIntoViewSpec {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final AnimationSpec<Float> DefaultScrollAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        private static final BringIntoViewSpec DefaultBringIntoViewSpec = new BringIntoViewSpec() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec$Companion$DefaultBringIntoViewSpec$1
            @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
            public final float calculateScrollDistance(float f, float f2, float f3) {
                return BringIntoViewSpec.Companion.defaultCalculateScrollDistance$foundation(f, f2, f3);
            }

            @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
            public final AnimationSpec getScrollAnimationSpec() {
                return BringIntoViewSpec.Companion.getDefaultScrollAnimationSpec$foundation();
            }
        };

        private Companion() {
        }

        public final float defaultCalculateScrollDistance$foundation(float f, float f2, float f3) {
            float f4 = f2 + f;
            if (f >= 0.0f && f4 <= f3) {
                return 0.0f;
            }
            if (f < 0.0f && f4 > f3) {
                return 0.0f;
            }
            float f5 = f4 - f3;
            return Math.abs(f) < Math.abs(f5) ? f : f5;
        }

        public final BringIntoViewSpec getDefaultBringIntoViewSpec$foundation() {
            return DefaultBringIntoViewSpec;
        }

        public final AnimationSpec<Float> getDefaultScrollAnimationSpec$foundation() {
            return DefaultScrollAnimationSpec;
        }
    }

    float calculateScrollDistance(float f, float f2, float f3);

    @hd0
    AnimationSpec<Float> getScrollAnimationSpec();
}
