package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.nf2;
import defpackage.qi0;
import defpackage.sb0;
import defpackage.sg3;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class DpCornerSize implements CornerSize, InspectableValue {
    private final float size;

    private DpCornerSize(float f) {
        this.size = f;
    }

    public /* synthetic */ DpCornerSize(float f, sb0 sb0Var) {
        this(f);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    private final float m1366component1D9Ej5fM() {
        return this.size;
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ DpCornerSize m1367copy0680j_4$default(DpCornerSize dpCornerSize, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dpCornerSize.size;
        }
        return dpCornerSize.m1368copy0680j_4(f);
    }

    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final DpCornerSize m1368copy0680j_4(float f) {
        return new DpCornerSize(f, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DpCornerSize) && Dp.m8054equalsimpl0(this.size, ((DpCornerSize) obj).size);
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
    public /* bridge */ /* synthetic */ Object getValueOverride() {
        return Dp.m8047boximpl(m1369getValueOverrideD9Ej5fM());
    }

    /* renamed from: getValueOverride-D9Ej5fM, reason: not valid java name */
    public float m1369getValueOverrideD9Ej5fM() {
        return this.size;
    }

    public int hashCode() {
        return Dp.m8055hashCodeimpl(this.size);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo1361toPxTmRCtEA(long j, Density density) {
        return density.mo473toPx0680j_4(this.size);
    }

    public String toString() {
        return sg3.p("CornerSize(size = ", this.size, ".dp)");
    }
}
