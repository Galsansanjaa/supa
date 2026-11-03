package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.ui.geometry.Rect;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class CachedSharedContentConfig implements SharedTransitionScope.SharedContentConfig {
    public static final CachedSharedContentConfig INSTANCE = new CachedSharedContentConfig();

    private CachedSharedContentConfig() {
    }

    @Override // androidx.compose.animation.SharedTransitionScope.SharedContentConfig
    /* renamed from: alternativeTargetBoundsInTransitionScopeAfterRemoval-cSwnlzA, reason: not valid java name */
    public final Rect mo83alternativeTargetBoundsInTransitionScopeAfterRemovalcSwnlzA(SharedTransitionScope.SharedContentState sharedContentState, Rect rect, long j) {
        return null;
    }

    @Override // androidx.compose.animation.SharedTransitionScope.SharedContentConfig
    public final boolean getPermitTransformDuringDeferredTransition() {
        return true;
    }

    @Override // androidx.compose.animation.SharedTransitionScope.SharedContentConfig
    public final boolean getShouldKeepEnabledForOngoingAnimation() {
        return true;
    }

    @Override // androidx.compose.animation.SharedTransitionScope.SharedContentConfig
    public final boolean isEnabled(SharedTransitionScope.SharedContentState sharedContentState) {
        return true;
    }
}
