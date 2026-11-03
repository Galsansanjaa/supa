package androidx.compose.foundation.shape;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import defpackage.nf2;
import defpackage.qi0;
import defpackage.sg3;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class PercentCornerSize implements CornerSize, InspectableValue {
    private final float percent;

    public PercentCornerSize(float f) {
        this.percent = f;
        if (f < 0.0f || f > 100.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    private final float component1() {
        return this.percent;
    }

    public static /* synthetic */ PercentCornerSize copy$default(PercentCornerSize percentCornerSize, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = percentCornerSize.percent;
        }
        return percentCornerSize.copy(f);
    }

    public final PercentCornerSize copy(float f) {
        return new PercentCornerSize(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PercentCornerSize) && Float.compare(this.percent, ((PercentCornerSize) obj).percent) == 0;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final nf2 getInspectableElements() {
        return qi0.a;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final String getNameFallback() {
        return null;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public String getValueOverride() {
        return this.percent + "%";
    }

    public int hashCode() {
        return Float.floatToIntBits(this.percent);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo1361toPxTmRCtEA(long j, Density density) {
        return (this.percent / 100.0f) * Size.m5158getMinDimensionimpl(j);
    }

    public String toString() {
        return sg3.p("CornerSize(size = ", this.percent, "%)");
    }
}
