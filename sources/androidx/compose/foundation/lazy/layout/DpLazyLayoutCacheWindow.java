package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class DpLazyLayoutCacheWindow implements LazyLayoutCacheWindow {
    private final float ahead;
    private final float behind;

    private DpLazyLayoutCacheWindow(float f, float f2) {
        this.ahead = f;
        this.behind = f2;
    }

    public /* synthetic */ DpLazyLayoutCacheWindow(float f, float f2, sb0 sb0Var) {
        this(f, f2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
    public int calculateAheadWindow(Density density, int i) {
        return density.mo467roundToPx0680j_4(this.ahead);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
    public int calculateBehindWindow(Density density, int i) {
        return density.mo467roundToPx0680j_4(this.behind);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DpLazyLayoutCacheWindow) {
            DpLazyLayoutCacheWindow dpLazyLayoutCacheWindow = (DpLazyLayoutCacheWindow) obj;
            if (Dp.m8054equalsimpl0(dpLazyLayoutCacheWindow.ahead, this.ahead) && Dp.m8054equalsimpl0(dpLazyLayoutCacheWindow.behind, this.behind)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getAhead-D9Ej5fM, reason: not valid java name */
    public final float m1214getAheadD9Ej5fM() {
        return this.ahead;
    }

    /* renamed from: getBehind-D9Ej5fM, reason: not valid java name */
    public final float m1215getBehindD9Ej5fM() {
        return this.behind;
    }

    public int hashCode() {
        return Dp.m8055hashCodeimpl(this.behind) + (Dp.m8055hashCodeimpl(this.ahead) * 31);
    }
}
