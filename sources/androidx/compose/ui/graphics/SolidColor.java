package androidx.compose.ui.graphics;

import defpackage.k93;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class SolidColor extends Brush implements Interpolatable {
    public static final int $stable = 0;
    private final long value;

    private SolidColor(long j) {
        super(null);
        this.value = j;
    }

    public /* synthetic */ SolidColor(long j, sb0 sb0Var) {
        this(j);
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public void mo5283applyToPq9zytI(long j, Paint paint, float f) {
        paint.setAlpha(1.0f);
        long j2 = this.value;
        if (f != 1.0f) {
            j2 = Color.m5331copywmQWz5c$default(j2, Color.m5334getAlphaimpl(j2) * f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        paint.mo5214setColor8_81llA(j2);
        if (paint.getShader() != null) {
            paint.setShader(null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SolidColor) && Color.m5333equalsimpl0(this.value, ((SolidColor) obj).value);
    }

    /* renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m5687getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m5339hashCodeimpl(this.value);
    }

    @Override // androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f) {
        sb0 sb0Var = null;
        if (obj == null) {
            obj = new SolidColor(Color.Companion.m5367getTransparent0d7_KjU(), sb0Var);
        }
        if (obj instanceof SolidColor) {
            return new SolidColor(ColorKt.m5383lerpjxsXWHM(this.value, ((SolidColor) obj).value, f), sb0Var);
        }
        return null;
    }

    public String toString() {
        return k93.m("SolidColor(value=", Color.m5340toStringimpl(this.value), ")");
    }
}
