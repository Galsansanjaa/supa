package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.jh2;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SharedElementEntry implements LayerRenderer, RememberObserver {
    public static final int $stable = 8;
    private SharedElementEntry _parentState;
    private final MutableFloatState _zIndex$delegate;
    private final MutableState boundsAnimation$delegate;
    private BoundsProvider boundsProvider;
    private Path clipPathInOverlay;
    private boolean hasHandoffOccurred;
    private final MutableState isAttached$delegate;
    private final MutableState layer$delegate;
    private final MutableState overlayClip$delegate;
    private final MutableState placeholderSize$delegate;
    private final MutableState renderInOverlayDuringTransition$delegate;
    private final MutableState renderOnlyWhenVisible$delegate;
    private final MutableState sharedElement$delegate;
    private final MutableState userState$delegate;

    public SharedElementEntry(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, SharedTransitionScope.OverlayClip overlayClip, boolean z2, SharedTransitionScope.SharedContentState sharedContentState, float f) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        MutableState mutableStateOf$default7;
        MutableState mutableStateOf$default8;
        MutableState mutableStateOf$default9;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isAttached$delegate = mutableStateOf$default;
        this._zIndex$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z2), null, 2, null);
        this.renderInOverlayDuringTransition$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedElement, null, 2, null);
        this.sharedElement$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundsAnimation, null, 2, null);
        this.boundsAnimation$delegate = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(placeholderSize, null, 2, null);
        this.placeholderSize$delegate = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        this.renderOnlyWhenVisible$delegate = mutableStateOf$default6;
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(overlayClip, null, 2, null);
        this.overlayClip$delegate = mutableStateOf$default7;
        mutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedContentState, null, 2, null);
        this.userState$delegate = mutableStateOf$default8;
        mutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.layer$delegate = mutableStateOf$default9;
    }

    private final boolean getShouldRenderAtAll() {
        if (getBoundsAnimation().getTarget()) {
            return true;
        }
        return (getSharedElement().getState$animation().getMatchIsOrHasBeenConfigured() && !getSharedElement().getState$animation().getActiveMatchFound()) || !getRenderOnlyWhenVisible();
    }

    private final float get_zIndex() {
        return this._zIndex$delegate.getFloatValue();
    }

    private final boolean isMutating() {
        SharedMutableTransformState modifierLocalTransformState;
        BoundsProvider boundsProvider = this.boundsProvider;
        return (boundsProvider == null || (modifierLocalTransformState = boundsProvider.getModifierLocalTransformState()) == null || !modifierLocalTransformState.isMutating()) ? false : true;
    }

    private final void set_zIndex(float f) {
        this._zIndex$delegate.setFloatValue(f);
    }

    public final Rect calculateTargetBounds(Rect rect) {
        return getUserState().getConfig$animation().mo83alternativeTargetBoundsInTransitionScopeAfterRemovalcSwnlzA(getUserState(), rect, IntSizeKt.m8228toSizeozmzZPI(getSharedElement().getScope().getLookaheadRoot$animation().mo6712getSizeYbymL2g()));
    }

    @Override // androidx.compose.animation.LayerRenderer
    public void drawInOverlay(DrawScope drawScope, GraphicsContext graphicsContext) {
        Rect currentBounds;
        long j;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (getShouldRenderInOverlay$animation() && getLayer() == null) {
            setLayer(graphicsContext.createGraphicsLayer());
        }
        GraphicsLayer layer = getLayer();
        if (layer == null || (currentBounds = getSharedElement().getState$animation().getCurrentBounds()) == null || !getShouldRenderInOverlay$animation()) {
            return;
        }
        long m5125getTopLeftF1C5BW0 = currentBounds.m5125getTopLeftF1C5BW0();
        float intBitsToFloat = Float.intBitsToFloat((int) (m5125getTopLeftF1C5BW0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m5125getTopLeftF1C5BW0 & 4294967295L));
        SharedMutableTransformState activeMutableTransformState$animation = getActiveMutableTransformState$animation();
        LayoutCoordinates parentLayoutCoordinates = activeMutableTransformState$animation != null ? activeMutableTransformState$animation.getParentLayoutCoordinates() : null;
        LayoutCoordinates root$animation = getSharedElement().getScope().getRoot$animation();
        if (activeMutableTransformState$animation != null && activeMutableTransformState$animation.isMutating() && parentLayoutCoordinates != null && parentLayoutCoordinates.isAttached() && root$animation.isAttached()) {
            f2 = activeMutableTransformState$animation.getActiveScale$animation();
            long m160getActiveOffsetnOccac$animation = activeMutableTransformState$animation.m160getActiveOffsetnOccac$animation();
            f = IntOffset.m8173getXimpl(m160getActiveOffsetnOccac$animation);
            f5 = IntOffset.m8174getYimpl(m160getActiveOffsetnOccac$animation);
            j = 4294967295L;
            long m149calculatePivotL8ZKhE = SharedContentNodeKt.m149calculatePivotL8ZKhE(parentLayoutCoordinates, root$animation, activeMutableTransformState$animation.m161getActiveTransformOriginSzJe1aQ$animation());
            f3 = Float.intBitsToFloat((int) (m149calculatePivotL8ZKhE >> 32));
            f4 = Float.intBitsToFloat((int) (m149calculatePivotL8ZKhE & 4294967295L));
        } else {
            j = 4294967295L;
            f = 0.0f;
            f2 = 1.0f;
            f3 = 0.0f;
            f4 = 0.0f;
            f5 = 0.0f;
        }
        Path path = this.clipPathInOverlay;
        drawScope.getDrawContext().getTransform().translate(f, f5);
        try {
            long m5082constructorimpl = Offset.m5082constructorimpl((Float.floatToRawIntBits(f4) & j) | (Float.floatToRawIntBits(f3) << 32));
            DrawContext drawContext = drawScope.getDrawContext();
            long mo5831getSizeNHjbRc = drawContext.mo5831getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo5838scale0AR0LA0(f2, f2, m5082constructorimpl);
                if (path == null) {
                    drawScope.getDrawContext().getTransform().translate(intBitsToFloat, intBitsToFloat2);
                    try {
                        GraphicsLayerKt.drawLayer(drawScope, layer);
                    } finally {
                    }
                }
                int m5321getIntersectrtfAjoo = ClipOp.Companion.m5321getIntersectrtfAjoo();
                drawContext = drawScope.getDrawContext();
                mo5831getSizeNHjbRc = drawContext.mo5831getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo5833clipPathmtrdDE(path, m5321getIntersectrtfAjoo);
                    drawScope.getDrawContext().getTransform().translate(intBitsToFloat, intBitsToFloat2);
                    try {
                        GraphicsLayerKt.drawLayer(drawScope, layer);
                        drawScope.getDrawContext().getTransform().translate(-intBitsToFloat, -intBitsToFloat2);
                        drawContext.getCanvas().restore();
                        drawContext.mo5832setSizeuvyYCjk(mo5831getSizeNHjbRc);
                    } finally {
                    }
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo5832setSizeuvyYCjk(mo5831getSizeNHjbRc);
                }
            } catch (Throwable th) {
                throw th;
            }
        } finally {
            drawScope.getDrawContext().getTransform().translate(-f, -f5);
        }
    }

    public final SharedMutableTransformState getActiveMutableTransformState$animation() {
        BoundsProvider boundsProvider;
        SharedMutableTransformState modifierLocalTransformState;
        SharedElementEntry sharedElementEntry = null;
        if (!getUserState().getConfig$animation().getPermitTransformDuringDeferredTransition()) {
            return null;
        }
        BoundsProvider boundsProvider2 = this.boundsProvider;
        SharedMutableTransformState modifierLocalTransformState2 = boundsProvider2 != null ? boundsProvider2.getModifierLocalTransformState() : null;
        if (isMutating() ? !getTarget() : getTarget()) {
            List<SharedElementEntry> enabledEntries = getSharedElement().getEnabledEntries();
            int size = enabledEntries.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                SharedElementEntry sharedElementEntry2 = enabledEntries.get(i);
                SharedElementEntry sharedElementEntry3 = sharedElementEntry2;
                boolean isMutating = sharedElementEntry3.isMutating();
                boolean target = sharedElementEntry3.getTarget();
                if (!isMutating) {
                    target = !target;
                }
                if (target) {
                    sharedElementEntry = sharedElementEntry2;
                    break;
                }
                i++;
            }
            SharedElementEntry sharedElementEntry4 = sharedElementEntry;
            if (sharedElementEntry4 != null && (boundsProvider = sharedElementEntry4.boundsProvider) != null && (modifierLocalTransformState = boundsProvider.getModifierLocalTransformState()) != null) {
                return modifierLocalTransformState;
            }
        }
        return modifierLocalTransformState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BoundsAnimation getBoundsAnimation() {
        return (BoundsAnimation) this.boundsAnimation$delegate.getValue();
    }

    public final BoundsProvider getBoundsProvider() {
        return this.boundsProvider;
    }

    public final Path getClipPathInOverlay$animation() {
        return this.clipPathInOverlay;
    }

    public final boolean getHasHandoffOccurred$animation() {
        return this.hasHandoffOccurred;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GraphicsLayer getLayer() {
        return (GraphicsLayer) this.layer$delegate.getValue();
    }

    public final SharedTransitionScope.OverlayClip getOverlayClip() {
        return (SharedTransitionScope.OverlayClip) this.overlayClip$delegate.getValue();
    }

    @Override // androidx.compose.animation.LayerRenderer
    public SharedElementEntry getParentState() {
        return this._parentState;
    }

    public final SharedTransitionScope.PlaceholderSize getPlaceholderSize() {
        return (SharedTransitionScope.PlaceholderSize) this.placeholderSize$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRenderInOverlayDuringTransition() {
        return ((Boolean) this.renderInOverlayDuringTransition$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRenderOnlyWhenVisible() {
        return ((Boolean) this.renderOnlyWhenVisible$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SharedElement getSharedElement() {
        return (SharedElement) this.sharedElement$delegate.getValue();
    }

    public final boolean getShouldRenderInOverlay$animation() {
        if (getShouldRenderAtAll() && getSharedElement().getBoundsTransformIsActive() && isEnabled() && getRenderInOverlayDuringTransition()) {
            return getSharedElement().getScope().isTransitionActive() || isMutating();
        }
        return false;
    }

    public final boolean getShouldRenderInPlace() {
        if (getSharedElement().getBoundsTransformIsActive()) {
            return !getShouldRenderInOverlay$animation() && getShouldRenderAtAll();
        }
        return true;
    }

    public final boolean getTarget() {
        return getBoundsAnimation().getTarget();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SharedTransitionScope.SharedContentState getUserState() {
        return (SharedTransitionScope.SharedContentState) this.userState$delegate.getValue();
    }

    @Override // androidx.compose.animation.LayerRenderer
    public float getZIndex() {
        return get_zIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAttached() {
        return ((Boolean) this.isAttached$delegate.getValue()).booleanValue();
    }

    public final boolean isEnabled() {
        return isAttached() && getUserState().isEnabledByUser$animation();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        getSharedElement().getScope().onEntryRemoved$animation(this);
        getSharedElement().invalidateTargetBoundsProvider();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        getSharedElement().getScope().onEntryAdded$animation(this);
        getSharedElement().invalidateTargetBoundsProvider();
    }

    public final void setAttached(boolean z) {
        this.isAttached$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setBoundsAnimation(BoundsAnimation boundsAnimation) {
        this.boundsAnimation$delegate.setValue(boundsAnimation);
    }

    public final void setBoundsProvider(BoundsProvider boundsProvider) {
        this.boundsProvider = boundsProvider;
    }

    public final void setClipPathInOverlay$animation(Path path) {
        this.clipPathInOverlay = path;
    }

    public final void setHasHandoffOccurred$animation(boolean z) {
        this.hasHandoffOccurred = z;
    }

    public final void setLayer(GraphicsLayer graphicsLayer) {
        this.layer$delegate.setValue(graphicsLayer);
    }

    public final void setOverlayClip(SharedTransitionScope.OverlayClip overlayClip) {
        this.overlayClip$delegate.setValue(overlayClip);
    }

    public void setParentState(SharedElementEntry sharedElementEntry) {
        if (jh2.k(this._parentState, sharedElementEntry)) {
            return;
        }
        this._parentState = sharedElementEntry;
        getSharedElement().getScope().zOrderChanged$animation();
    }

    public final void setPlaceholderSize(SharedTransitionScope.PlaceholderSize placeholderSize) {
        this.placeholderSize$delegate.setValue(placeholderSize);
    }

    public final void setRenderInOverlayDuringTransition(boolean z) {
        this.renderInOverlayDuringTransition$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setRenderOnlyWhenVisible(boolean z) {
        this.renderOnlyWhenVisible$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setSharedElement(SharedElement sharedElement) {
        this.sharedElement$delegate.setValue(sharedElement);
    }

    public final void setUserState(SharedTransitionScope.SharedContentState sharedContentState) {
        this.userState$delegate.setValue(sharedContentState);
    }

    public void setZIndex(float f) {
        if (get_zIndex() == f) {
            return;
        }
        set_zIndex(f);
        getSharedElement().getScope().zOrderChanged$animation();
    }
}
