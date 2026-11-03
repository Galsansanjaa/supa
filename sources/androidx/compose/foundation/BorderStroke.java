package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Dp;
import defpackage.jh2;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class BorderStroke {
    public static final int $stable = 0;
    private final Brush brush;
    private final float width;

    private BorderStroke(float f, Brush brush) {
        this.width = f;
        this.brush = brush;
    }

    public /* synthetic */ BorderStroke(float f, Brush brush, sb0 sb0Var) {
        this(f, brush);
    }

    /* renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m343copyD5KLDUw$default(BorderStroke borderStroke, float f, Brush brush, int i, Object obj) {
        if ((i & 1) != 0) {
            f = borderStroke.width;
        }
        if ((i & 2) != 0) {
            brush = borderStroke.brush;
        }
        return borderStroke.m344copyD5KLDUw(f, brush);
    }

    /* renamed from: copy-D5KLDUw, reason: not valid java name */
    public final BorderStroke m344copyD5KLDUw(float f, Brush brush) {
        return new BorderStroke(f, brush, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) obj;
        return Dp.m8054equalsimpl0(this.width, borderStroke.width) && jh2.k(this.brush, borderStroke.brush);
    }

    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m345getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return this.brush.hashCode() + (Dp.m8055hashCodeimpl(this.width) * 31);
    }

    public String toString() {
        return "BorderStroke(width=" + Dp.m8060toStringimpl(this.width) + ", brush=" + this.brush + ")";
    }
}
