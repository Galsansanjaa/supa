package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Ruler;
import defpackage.sb0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PlaceableResult implements OwnerScope {
    private final LookaheadCapablePlaceable placeable;
    private MeasureResult result;
    private final Ruler ruler;

    public PlaceableResult(MeasureResult measureResult, LookaheadCapablePlaceable lookaheadCapablePlaceable, Ruler ruler) {
        this.result = measureResult;
        this.placeable = lookaheadCapablePlaceable;
        this.ruler = ruler;
    }

    public /* synthetic */ PlaceableResult(MeasureResult measureResult, LookaheadCapablePlaceable lookaheadCapablePlaceable, Ruler ruler, int i, sb0 sb0Var) {
        this(measureResult, lookaheadCapablePlaceable, (i & 4) != 0 ? null : ruler);
    }

    public final LookaheadCapablePlaceable getPlaceable() {
        return this.placeable;
    }

    public final MeasureResult getResult() {
        return this.result;
    }

    public final Ruler getRuler() {
        return this.ruler;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.placeable.getCoordinates().isAttached();
    }

    public final void setResult(MeasureResult measureResult) {
        this.result = measureResult;
    }
}
