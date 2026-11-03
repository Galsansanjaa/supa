package androidx.compose.ui.semantics;

import android.graphics.Region;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.unit.IntRect;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class SemanticRegionImpl implements SemanticsRegion {
    private final Region region = new Region();

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public boolean difference(IntRect intRect) {
        return this.region.op(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom(), Region.Op.DIFFERENCE);
    }

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public IntRect getBounds() {
        return RectHelper_androidKt.toComposeIntRect(this.region.getBounds());
    }

    public final Region getRegion() {
        return this.region;
    }

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public boolean intersect(SemanticsRegion semanticsRegion) {
        Region region = this.region;
        semanticsRegion.getClass();
        return region.op(((SemanticRegionImpl) semanticsRegion).region, Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public boolean isEmpty() {
        return this.region.isEmpty();
    }

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public void set(IntRect intRect) {
        this.region.set(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }
}
