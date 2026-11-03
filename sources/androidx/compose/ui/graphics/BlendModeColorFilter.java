package androidx.compose.ui.graphics;

import defpackage.sb0;
import defpackage.wa2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class BlendModeColorFilter extends ColorFilter {
    public static final int $stable = 0;
    private final int blendMode;
    private final long color;

    private BlendModeColorFilter(long j, int i) {
        this(j, i, AndroidColorFilter_androidKt.m5198actualTintColorFilterxETnrds(j, i), null);
    }

    private BlendModeColorFilter(long j, int i, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.color = j;
        this.blendMode = i;
    }

    public /* synthetic */ BlendModeColorFilter(long j, int i, android.graphics.ColorFilter colorFilter, sb0 sb0Var) {
        this(j, i, colorFilter);
    }

    public /* synthetic */ BlendModeColorFilter(long j, int i, sb0 sb0Var) {
        this(j, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlendModeColorFilter)) {
            return false;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj;
        return Color.m5333equalsimpl0(this.color, blendModeColorFilter.color) && BlendMode.m5247equalsimpl0(this.blendMode, blendModeColorFilter.blendMode);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m5280getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m5281getColor0d7_KjU() {
        return this.color;
    }

    public int hashCode() {
        return BlendMode.m5248hashCodeimpl(this.blendMode) + (Color.m5339hashCodeimpl(this.color) * 31);
    }

    public String toString() {
        return wa2.t("BlendModeColorFilter(color=", Color.m5340toStringimpl(this.color), ", blendMode=", BlendMode.m5249toStringimpl(this.blendMode), ")");
    }
}
