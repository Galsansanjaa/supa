package androidx.compose.animation.core;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class DefaultSpringAnimations implements Animations {
    public static final DefaultSpringAnimations INSTANCE = new DefaultSpringAnimations();
    private static final FloatSpringSpec anim = new FloatSpringSpec(1.0f, 1500.0f, 0.0f, 4, null);

    private DefaultSpringAnimations() {
    }

    @Override // androidx.compose.animation.core.Animations
    public FloatSpringSpec get(int i) {
        return anim;
    }
}
