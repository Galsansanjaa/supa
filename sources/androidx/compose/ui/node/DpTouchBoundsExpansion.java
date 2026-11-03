package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.lt;
import defpackage.sb0;
import defpackage.sg3;
import defpackage.vg1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class DpTouchBoundsExpansion {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final float bottom;
    private final float end;
    private final boolean isLayoutDirectionAware;
    private final float start;
    private final float top;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: Absolute-a9UjIt4$default, reason: not valid java name */
        public static /* synthetic */ DpTouchBoundsExpansion m6902Absolutea9UjIt4$default(Companion companion, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = Dp.m8049constructorimpl(0.0f);
            }
            if ((i & 2) != 0) {
                f2 = Dp.m8049constructorimpl(0.0f);
            }
            if ((i & 4) != 0) {
                f3 = Dp.m8049constructorimpl(0.0f);
            }
            if ((i & 8) != 0) {
                f4 = Dp.m8049constructorimpl(0.0f);
            }
            return companion.m6903Absolutea9UjIt4(f, f2, f3, f4);
        }

        /* renamed from: Absolute-a9UjIt4, reason: not valid java name */
        public final DpTouchBoundsExpansion m6903Absolutea9UjIt4(float f, float f2, float f3, float f4) {
            return new DpTouchBoundsExpansion(f, f2, f3, f4, false, null);
        }
    }

    private DpTouchBoundsExpansion(float f, float f2, float f3, float f4, boolean z) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
        this.isLayoutDirectionAware = z;
        if (!(f >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Left must be non-negative");
        }
        if (!(f2 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Top must be non-negative");
        }
        if (!(f3 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Right must be non-negative");
        }
        if (f4 >= 0.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Bottom must be non-negative");
    }

    public /* synthetic */ DpTouchBoundsExpansion(float f, float f2, float f3, float f4, boolean z, sb0 sb0Var) {
        this(f, f2, f3, f4, z);
    }

    /* renamed from: copy-lDy3nrA$default, reason: not valid java name */
    public static /* synthetic */ DpTouchBoundsExpansion m6891copylDy3nrA$default(DpTouchBoundsExpansion dpTouchBoundsExpansion, float f, float f2, float f3, float f4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dpTouchBoundsExpansion.start;
        }
        if ((i & 2) != 0) {
            f2 = dpTouchBoundsExpansion.top;
        }
        if ((i & 4) != 0) {
            f3 = dpTouchBoundsExpansion.end;
        }
        if ((i & 8) != 0) {
            f4 = dpTouchBoundsExpansion.bottom;
        }
        if ((i & 16) != 0) {
            z = dpTouchBoundsExpansion.isLayoutDirectionAware;
        }
        boolean z2 = z;
        float f5 = f3;
        return dpTouchBoundsExpansion.m6896copylDy3nrA(f, f2, f5, f4, z2);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m6892component1D9Ej5fM() {
        return this.start;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m6893component2D9Ej5fM() {
        return this.top;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m6894component3D9Ej5fM() {
        return this.end;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m6895component4D9Ej5fM() {
        return this.bottom;
    }

    public final boolean component5() {
        return this.isLayoutDirectionAware;
    }

    /* renamed from: copy-lDy3nrA, reason: not valid java name */
    public final DpTouchBoundsExpansion m6896copylDy3nrA(float f, float f2, float f3, float f4, boolean z) {
        return new DpTouchBoundsExpansion(f, f2, f3, f4, z, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpTouchBoundsExpansion)) {
            return false;
        }
        DpTouchBoundsExpansion dpTouchBoundsExpansion = (DpTouchBoundsExpansion) obj;
        return Dp.m8054equalsimpl0(this.start, dpTouchBoundsExpansion.start) && Dp.m8054equalsimpl0(this.top, dpTouchBoundsExpansion.top) && Dp.m8054equalsimpl0(this.end, dpTouchBoundsExpansion.end) && Dp.m8054equalsimpl0(this.bottom, dpTouchBoundsExpansion.bottom) && this.isLayoutDirectionAware == dpTouchBoundsExpansion.isLayoutDirectionAware;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m6897getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m6898getEndD9Ej5fM() {
        return this.end;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m6899getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m6900getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return vg1.t(this.bottom, vg1.t(this.end, vg1.t(this.top, Dp.m8055hashCodeimpl(this.start) * 31, 31), 31), 31) + (this.isLayoutDirectionAware ? 1231 : 1237);
    }

    public final boolean isLayoutDirectionAware() {
        return this.isLayoutDirectionAware;
    }

    /* renamed from: roundToTouchBoundsExpansion-TW6G1oQ, reason: not valid java name */
    public final long m6901roundToTouchBoundsExpansionTW6G1oQ(Density density) {
        return TouchBoundsExpansion.m7095constructorimpl(TouchBoundsExpansion.Companion.pack$ui(density.mo467roundToPx0680j_4(this.start), density.mo467roundToPx0680j_4(this.top), density.mo467roundToPx0680j_4(this.end), density.mo467roundToPx0680j_4(this.bottom), this.isLayoutDirectionAware));
    }

    public String toString() {
        String m8060toStringimpl = Dp.m8060toStringimpl(this.start);
        String m8060toStringimpl2 = Dp.m8060toStringimpl(this.top);
        String m8060toStringimpl3 = Dp.m8060toStringimpl(this.end);
        String m8060toStringimpl4 = Dp.m8060toStringimpl(this.bottom);
        boolean z = this.isLayoutDirectionAware;
        StringBuilder D = lt.D("DpTouchBoundsExpansion(start=", m8060toStringimpl, ", top=", m8060toStringimpl2, ", end=");
        lt.L(D, m8060toStringimpl3, ", bottom=", m8060toStringimpl4, ", isLayoutDirectionAware=");
        return sg3.u(D, z, ")");
    }
}
