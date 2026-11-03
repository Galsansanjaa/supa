package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.os0;
import defpackage.sb0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface SharedTransitionScope extends LookaheadScope {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public interface OverlayClip {
        Path getClipPath(SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density);
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public interface PlaceholderSize {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final PlaceholderSize AnimatedSize = new PlaceholderSize() { // from class: androidx.compose.animation.SharedTransitionScope$PlaceholderSize$Companion$AnimatedSize$1
                @Override // androidx.compose.animation.SharedTransitionScope.PlaceholderSize
                /* renamed from: calculateSize-JyjRU_E */
                public final long mo173calculateSizeJyjRU_E(long j, long j2) {
                    return j2;
                }
            };
            private static final PlaceholderSize ContentSize = new PlaceholderSize() { // from class: androidx.compose.animation.SharedTransitionScope$PlaceholderSize$Companion$ContentSize$1
                @Override // androidx.compose.animation.SharedTransitionScope.PlaceholderSize
                /* renamed from: calculateSize-JyjRU_E */
                public final long mo173calculateSizeJyjRU_E(long j, long j2) {
                    return j;
                }
            };

            private Companion() {
            }

            public final PlaceholderSize getAnimatedSize() {
                return AnimatedSize;
            }

            public final PlaceholderSize getContentSize() {
                return ContentSize;
            }
        }

        /* renamed from: calculateSize-JyjRU_E, reason: not valid java name */
        long mo173calculateSizeJyjRU_E(long j, long j2);
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public interface ResizeMode {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final ResizeMode RemeasureToBounds = RemeasureImpl.INSTANCE;

            private Companion() {
            }

            public static /* synthetic */ ResizeMode scaleToBounds$default(Companion companion, ContentScale contentScale, Alignment alignment, int i, Object obj) {
                if ((i & 1) != 0) {
                    contentScale = ContentScale.Companion.getFillWidth();
                }
                if ((i & 2) != 0) {
                    alignment = Alignment.Companion.getCenter();
                }
                return companion.scaleToBounds(contentScale, alignment);
            }

            public final ResizeMode getRemeasureToBounds() {
                return RemeasureToBounds;
            }

            public final ResizeMode scaleToBounds(ContentScale contentScale, Alignment alignment) {
                ScaleToBoundsImpl ScaleToBoundsCached;
                ScaleToBoundsCached = SharedTransitionScopeKt.ScaleToBoundsCached(contentScale, alignment);
                return ScaleToBoundsCached;
            }
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public interface SharedContentConfig {
        /* renamed from: alternativeTargetBoundsInTransitionScopeAfterRemoval-cSwnlzA */
        Rect mo83alternativeTargetBoundsInTransitionScopeAfterRemovalcSwnlzA(SharedContentState sharedContentState, Rect rect, long j);

        boolean getPermitTransformDuringDeferredTransition();

        boolean getShouldKeepEnabledForOngoingAnimation();

        boolean isEnabled(SharedContentState sharedContentState);
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class SharedContentState {
        public static final int $stable = 8;
        private final MutableState config$delegate;
        private final MutableState internalState$delegate;
        private final Object key;

        public SharedContentState(Object obj, SharedContentConfig sharedContentConfig) {
            MutableState mutableStateOf$default;
            MutableState mutableStateOf$default2;
            this.key = obj;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedContentConfig, null, 2, null);
            this.config$delegate = mutableStateOf$default;
            mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            this.internalState$delegate = mutableStateOf$default2;
        }

        public /* synthetic */ SharedContentState(Object obj, SharedContentConfig sharedContentConfig, int i, sb0 sb0Var) {
            this(obj, (i & 2) != 0 ? SharedTransitionDefaults.SharedContentConfig.INSTANCE : sharedContentConfig);
        }

        private final SharedElementEntry getNonNullInternalState() {
            SharedElementEntry internalState$animation = getInternalState$animation();
            if (internalState$animation != null) {
                return internalState$animation;
            }
            v5.m("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
            return null;
        }

        public final Path getClipPathInOverlay() {
            return getNonNullInternalState().getClipPathInOverlay$animation();
        }

        public final SharedContentConfig getConfig$animation() {
            return (SharedContentConfig) this.config$delegate.getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final SharedElementEntry getInternalState$animation() {
            return (SharedElementEntry) this.internalState$delegate.getValue();
        }

        public final Object getKey() {
            return this.key;
        }

        public final SharedContentState getParentSharedContentState() {
            SharedElementEntry parentState = getNonNullInternalState().getParentState();
            if (parentState != null) {
                return parentState.getUserState();
            }
            return null;
        }

        public final boolean isAnimating$animation() {
            BoundsAnimation boundsAnimation;
            SharedElementEntry internalState$animation = getInternalState$animation();
            return ((internalState$animation == null || (boundsAnimation = internalState$animation.getBoundsAnimation()) == null) ? null : boundsAnimation.getAnimationState()) != null;
        }

        public final boolean isEnabledByUser$animation() {
            SharedContentConfig config$animation = getConfig$animation();
            if (config$animation.isEnabled(this)) {
                return true;
            }
            return isAnimating$animation() && config$animation.getShouldKeepEnabledForOngoingAnimation();
        }

        public final boolean isMatchFound() {
            SharedElement sharedElement;
            SharedElementEntry internalState$animation = getInternalState$animation();
            if (internalState$animation == null || (sharedElement = internalState$animation.getSharedElement()) == null) {
                return false;
            }
            return sharedElement.getFoundMatch();
        }

        /* renamed from: prepareTransitionWithInitialVelocity-TH1AsA0, reason: not valid java name */
        public final void m174prepareTransitionWithInitialVelocityTH1AsA0(long j) {
            SharedElementEntry nonNullInternalState = getNonNullInternalState();
            if (getConfig$animation().isEnabled(this)) {
                nonNullInternalState.getSharedElement().m151updateExitVelocityTH1AsA0$animation(j);
            }
        }

        public final void setConfig$animation(SharedContentConfig sharedContentConfig) {
            this.config$delegate.setValue(sharedContentConfig);
        }

        public final void setInternalState$animation(SharedElementEntry sharedElementEntry) {
            this.internalState$delegate.setValue(sharedElementEntry);
        }
    }

    OverlayClip OverlayClip(Shape shape);

    SharedContentConfig SharedContentConfig();

    SharedContentConfig SharedContentConfig(boolean z);

    boolean isTransitionActive();

    SharedContentState rememberSharedContentState(Object obj, SharedContentConfig sharedContentConfig, Composer composer, int i);

    SharedContentState rememberSharedContentState(Object obj, Composer composer, int i);

    Modifier renderInSharedTransitionScopeOverlay(Modifier modifier, float f, os0 os0Var);

    Modifier sharedBounds(Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, BoundsTransform boundsTransform, ResizeMode resizeMode, PlaceholderSize placeholderSize, boolean z, float f, OverlayClip overlayClip);

    Modifier sharedElement(Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, PlaceholderSize placeholderSize, boolean z, float f, OverlayClip overlayClip);

    Modifier sharedElementWithCallerManagedVisibility(Modifier modifier, SharedContentState sharedContentState, boolean z, BoundsTransform boundsTransform, PlaceholderSize placeholderSize, boolean z2, float f, OverlayClip overlayClip);

    Modifier skipToLookaheadPosition(Modifier modifier, os0 os0Var);

    Modifier skipToLookaheadSize(Modifier modifier, os0 os0Var);
}
