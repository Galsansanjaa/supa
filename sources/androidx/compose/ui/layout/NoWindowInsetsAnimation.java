package androidx.compose.ui.layout;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class NoWindowInsetsAnimation implements WindowInsetsAnimation {
    public static final int $stable = 0;
    public static final NoWindowInsetsAnimation INSTANCE = new NoWindowInsetsAnimation();

    private NoWindowInsetsAnimation() {
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public float getAlpha() {
        return 1.0f;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public long getDurationMillis() {
        return 0L;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public float getFraction() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public RectRulers getSource() {
        return WindowInsetsRulersKt.getNeverProvidedRectRulers();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public RectRulers getTarget() {
        return WindowInsetsRulersKt.getNeverProvidedRectRulers();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public boolean isAnimating() {
        return false;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public boolean isVisible() {
        return true;
    }
}
