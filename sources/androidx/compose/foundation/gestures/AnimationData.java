package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import defpackage.sb0;
import defpackage.sg3;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AnimationData {
    private final float degrees;
    private final long offset;
    private final float zoom;

    private AnimationData(float f, long j, float f2) {
        this.zoom = f;
        this.offset = j;
        this.degrees = f2;
    }

    public /* synthetic */ AnimationData(float f, long j, float f2, sb0 sb0Var) {
        this(f, j, f2);
    }

    /* renamed from: copy-d-4ec7I$default, reason: not valid java name */
    public static /* synthetic */ AnimationData m495copyd4ec7I$default(AnimationData animationData, float f, long j, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = animationData.zoom;
        }
        if ((i & 2) != 0) {
            j = animationData.offset;
        }
        if ((i & 4) != 0) {
            f2 = animationData.degrees;
        }
        return animationData.m497copyd4ec7I(f, j, f2);
    }

    public final float component1() {
        return this.zoom;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m496component2F1C5BW0() {
        return this.offset;
    }

    public final float component3() {
        return this.degrees;
    }

    /* renamed from: copy-d-4ec7I, reason: not valid java name */
    public final AnimationData m497copyd4ec7I(float f, long j, float f2) {
        return new AnimationData(f, j, f2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimationData)) {
            return false;
        }
        AnimationData animationData = (AnimationData) obj;
        return Float.compare(this.zoom, animationData.zoom) == 0 && Offset.m5087equalsimpl0(this.offset, animationData.offset) && Float.compare(this.degrees, animationData.degrees) == 0;
    }

    public final float getDegrees() {
        return this.degrees;
    }

    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m498getOffsetF1C5BW0() {
        return this.offset;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.degrees) + ((Offset.m5092hashCodeimpl(this.offset) + (Float.floatToIntBits(this.zoom) * 31)) * 31);
    }

    public String toString() {
        float f = this.zoom;
        String m5098toStringimpl = Offset.m5098toStringimpl(this.offset);
        float f2 = this.degrees;
        StringBuilder sb = new StringBuilder("AnimationData(zoom=");
        sb.append(f);
        sb.append(", offset=");
        sb.append(m5098toStringimpl);
        sb.append(", degrees=");
        return sg3.s(sb, ")", f2);
    }
}
