package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class DrawerPredictiveBackState {
    public static final int $stable = 0;
    private final MutableFloatState scaleXDistance$delegate;
    private final MutableFloatState scaleYDistance$delegate;
    private final MutableState swipeEdgeMatchesDrawer$delegate;

    public DrawerPredictiveBackState() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.swipeEdgeMatchesDrawer$delegate = mutableStateOf$default;
        this.scaleXDistance$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.scaleYDistance$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    public final void clear() {
        setSwipeEdgeMatchesDrawer(true);
        setScaleXDistance(0.0f);
        setScaleYDistance(0.0f);
    }

    public final float getScaleXDistance() {
        return this.scaleXDistance$delegate.getFloatValue();
    }

    public final float getScaleYDistance() {
        return this.scaleYDistance$delegate.getFloatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getSwipeEdgeMatchesDrawer() {
        return ((Boolean) this.swipeEdgeMatchesDrawer$delegate.getValue()).booleanValue();
    }

    public final void setScaleXDistance(float f) {
        this.scaleXDistance$delegate.setFloatValue(f);
    }

    public final void setScaleYDistance(float f) {
        this.scaleYDistance$delegate.setFloatValue(f);
    }

    public final void setSwipeEdgeMatchesDrawer(boolean z) {
        this.swipeEdgeMatchesDrawer$delegate.setValue(Boolean.valueOf(z));
    }

    public final void update(float f, boolean z, boolean z2, float f2, float f3, float f4) {
        setSwipeEdgeMatchesDrawer(z != z2);
        if (!getSwipeEdgeMatchesDrawer()) {
            f2 = f3;
        }
        setScaleXDistance(MathHelpersKt.lerp(0.0f, f2, f));
        setScaleYDistance(MathHelpersKt.lerp(0.0f, f4, f));
    }
}
