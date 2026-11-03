package androidx.compose.animation;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class IsLookaheadAnimationVisualDebuggingEnabledKt {
    private static final boolean isLookaheadAnimationVisualDebuggingEnabledDefault = false;
    private static final boolean isLookaheadAnimationVisualDebuggingForceEnabled = false;

    public static final boolean isLookaheadAnimationVisualDebuggingEnabled() {
        return isLookaheadAnimationVisualDebuggingEnabledDefault() || isLookaheadAnimationVisualDebuggingForceEnabled();
    }

    public static final boolean isLookaheadAnimationVisualDebuggingEnabledDefault() {
        return false;
    }

    public static final boolean isLookaheadAnimationVisualDebuggingForceEnabled() {
        return isLookaheadAnimationVisualDebuggingForceEnabled;
    }
}
