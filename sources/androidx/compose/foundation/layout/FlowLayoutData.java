package androidx.compose.foundation.layout;

import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FlowLayoutData {
    public static final int $stable = 8;
    private float fillCrossAxisFraction;

    public FlowLayoutData(float f) {
        this.fillCrossAxisFraction = f;
    }

    public static /* synthetic */ FlowLayoutData copy$default(FlowLayoutData flowLayoutData, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = flowLayoutData.fillCrossAxisFraction;
        }
        return flowLayoutData.copy(f);
    }

    public final float component1() {
        return this.fillCrossAxisFraction;
    }

    public final FlowLayoutData copy(float f) {
        return new FlowLayoutData(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlowLayoutData) && Float.compare(this.fillCrossAxisFraction, ((FlowLayoutData) obj).fillCrossAxisFraction) == 0;
    }

    public final float getFillCrossAxisFraction() {
        return this.fillCrossAxisFraction;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.fillCrossAxisFraction);
    }

    public final void setFillCrossAxisFraction(float f) {
        this.fillCrossAxisFraction = f;
    }

    public String toString() {
        return sg3.p("FlowLayoutData(fillCrossAxisFraction=", this.fillCrossAxisFraction, ")");
    }
}
