package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.jh2;
import defpackage.os0;
import defpackage.yo0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class OnFirstVisibleElement extends ModifierNodeElement<OnFirstVisibleNode> {
    private final os0 callback;
    private final long minDurationMs;
    private final float minFractionVisible;
    private final LayoutBoundsHolder viewportBounds;

    public OnFirstVisibleElement(long j, float f, LayoutBoundsHolder layoutBoundsHolder, os0 os0Var) {
        this.minDurationMs = j;
        this.minFractionVisible = f;
        this.viewportBounds = layoutBoundsHolder;
        this.callback = os0Var;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OnFirstVisibleNode create() {
        return new OnFirstVisibleNode(this.minDurationMs, this.minFractionVisible, this.viewportBounds, this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && OnFirstVisibleElement.class == obj.getClass()) {
            OnFirstVisibleElement onFirstVisibleElement = (OnFirstVisibleElement) obj;
            return this.minDurationMs == onFirstVisibleElement.minDurationMs && this.minFractionVisible == onFirstVisibleElement.minFractionVisible && jh2.k(this.viewportBounds, onFirstVisibleElement.viewportBounds) && this.callback == onFirstVisibleElement.callback;
        }
        return false;
    }

    public final os0 getCallback() {
        return this.callback;
    }

    public final long getMinDurationMs() {
        return this.minDurationMs;
    }

    public final float getMinFractionVisible() {
        return this.minFractionVisible;
    }

    public final LayoutBoundsHolder getViewportBounds() {
        return this.viewportBounds;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        long j = this.minDurationMs;
        int i = yo0.i(this.minFractionVisible, ((int) (j ^ (j >>> 32))) * 31, 31);
        LayoutBoundsHolder layoutBoundsHolder = this.viewportBounds;
        return this.callback.hashCode() + ((i + (layoutBoundsHolder != null ? layoutBoundsHolder.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFirstVisible");
        inspectorInfo.getProperties().set("minDurationMs", Long.valueOf(this.minDurationMs));
        inspectorInfo.getProperties().set("minFractionVisible", Float.valueOf(this.minFractionVisible));
        inspectorInfo.getProperties().set("viewportBounds", this.viewportBounds);
        inspectorInfo.getProperties().set("callback", this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OnFirstVisibleNode onFirstVisibleNode) {
        onFirstVisibleNode.setMinDurationMs(this.minDurationMs);
        onFirstVisibleNode.setMinFractionVisible(this.minFractionVisible);
        onFirstVisibleNode.setCallback(this.callback);
        onFirstVisibleNode.setViewportBounds(this.viewportBounds);
        onFirstVisibleNode.forceUpdate();
    }
}
