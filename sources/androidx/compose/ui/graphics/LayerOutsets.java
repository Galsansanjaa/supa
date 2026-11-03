package androidx.compose.ui.graphics;

import androidx.compose.ui.unit.Dp;
import defpackage.lt;
import defpackage.sb0;
import defpackage.vg1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class LayerOutsets {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final LayerOutsets Zero = new LayerOutsets(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final LayerOutsets getZero() {
            return LayerOutsets.Zero;
        }
    }

    private LayerOutsets(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
        if (Dp.m8048compareTo0680j_4(f, Dp.m8049constructorimpl(0.0f)) >= 0 && Dp.m8048compareTo0680j_4(f3, Dp.m8049constructorimpl(0.0f)) >= 0 && Dp.m8048compareTo0680j_4(f2, Dp.m8049constructorimpl(0.0f)) >= 0 && Dp.m8048compareTo0680j_4(f4, Dp.m8049constructorimpl(0.0f)) >= 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Layer outsets must be non-negative");
    }

    public /* synthetic */ LayerOutsets(float f, float f2, float f3, float f4, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? Dp.m8049constructorimpl(0.0f) : f, (i & 2) != 0 ? Dp.m8049constructorimpl(0.0f) : f2, (i & 4) != 0 ? Dp.m8049constructorimpl(0.0f) : f3, (i & 8) != 0 ? Dp.m8049constructorimpl(0.0f) : f4, null);
    }

    public /* synthetic */ LayerOutsets(float f, float f2, float f3, float f4, sb0 sb0Var) {
        this(f, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LayerOutsets)) {
            return false;
        }
        LayerOutsets layerOutsets = (LayerOutsets) obj;
        return Dp.m8054equalsimpl0(this.left, layerOutsets.left) && Dp.m8054equalsimpl0(this.top, layerOutsets.top) && Dp.m8054equalsimpl0(this.right, layerOutsets.right) && Dp.m8054equalsimpl0(this.bottom, layerOutsets.bottom);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m5553getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m5554getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m5555getRightD9Ej5fM() {
        return this.right;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m5556getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return Dp.m8055hashCodeimpl(this.bottom) + vg1.t(this.right, vg1.t(this.top, Dp.m8055hashCodeimpl(this.left) * 31, 31), 31);
    }

    public String toString() {
        String m8060toStringimpl = Dp.m8060toStringimpl(this.left);
        String m8060toStringimpl2 = Dp.m8060toStringimpl(this.top);
        return lt.B(lt.D("LayerOutsets(left=", m8060toStringimpl, ", top=", m8060toStringimpl2, ", right="), Dp.m8060toStringimpl(this.right), ", bottom=", Dp.m8060toStringimpl(this.bottom), ")");
    }
}
