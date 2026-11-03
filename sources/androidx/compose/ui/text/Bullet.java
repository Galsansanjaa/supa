package androidx.compose.ui.text;

import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import defpackage.jh2;
import defpackage.lt;
import defpackage.sb0;
import defpackage.yo0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class Bullet implements AnnotatedString.Annotation {
    private static final Bullet Default;
    private static final long DefaultPadding;
    private static final long DefaultSize;
    private final float alpha;
    private final Brush brush;
    private final DrawStyle drawStyle;
    private final long height;
    private final long padding;
    private final Shape shape;
    private final long width;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = DrawStyle.$stable;
    private static final long DefaultIndentation = TextUnitKt.getEm(1);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final Bullet getDefault() {
            return Bullet.Default;
        }

        /* renamed from: getDefaultIndentation-XSAIIZE, reason: not valid java name */
        public final long m7323getDefaultIndentationXSAIIZE() {
            return Bullet.DefaultIndentation;
        }

        /* renamed from: getDefaultPadding-XSAIIZE, reason: not valid java name */
        public final long m7324getDefaultPaddingXSAIIZE() {
            return Bullet.DefaultPadding;
        }

        /* renamed from: getDefaultSize-XSAIIZE, reason: not valid java name */
        public final long m7325getDefaultSizeXSAIIZE() {
            return Bullet.DefaultSize;
        }
    }

    static {
        long em = TextUnitKt.getEm(0.25d);
        DefaultSize = em;
        long em2 = TextUnitKt.getEm(0.25d);
        DefaultPadding = em2;
        Default = new Bullet(CircleShape.INSTANCE, em, em, em2, null, 0.0f, null, StylePropertiesKt.TextDirectionMask, null);
    }

    private Bullet(Shape shape, long j, long j2, long j3, Brush brush, float f, DrawStyle drawStyle) {
        this.shape = shape;
        this.width = j;
        this.height = j2;
        this.padding = j3;
        this.brush = brush;
        this.alpha = f;
        this.drawStyle = drawStyle;
    }

    public /* synthetic */ Bullet(Shape shape, long j, long j2, long j3, Brush brush, float f, DrawStyle drawStyle, int i, sb0 sb0Var) {
        this(shape, j, j2, j3, (i & 16) != 0 ? null : brush, (i & 32) != 0 ? Float.NaN : f, (i & 64) != 0 ? Fill.INSTANCE : drawStyle, null);
    }

    public /* synthetic */ Bullet(Shape shape, long j, long j2, long j3, Brush brush, float f, DrawStyle drawStyle, sb0 sb0Var) {
        this(shape, j, j2, j3, brush, f, drawStyle);
    }

    /* renamed from: copy-w_4Rhrw$default, reason: not valid java name */
    public static /* synthetic */ Bullet m7318copyw_4Rhrw$default(Bullet bullet, Shape shape, long j, long j2, long j3, Brush brush, float f, DrawStyle drawStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            shape = bullet.shape;
        }
        if ((i & 2) != 0) {
            j = bullet.width;
        }
        if ((i & 4) != 0) {
            j2 = bullet.height;
        }
        if ((i & 8) != 0) {
            j3 = bullet.padding;
        }
        if ((i & 16) != 0) {
            brush = bullet.brush;
        }
        if ((i & 32) != 0) {
            f = bullet.alpha;
        }
        if ((i & 64) != 0) {
            drawStyle = bullet.drawStyle;
        }
        DrawStyle drawStyle2 = drawStyle;
        Brush brush2 = brush;
        long j4 = j3;
        long j5 = j2;
        return bullet.m7319copyw_4Rhrw(shape, j, j5, j4, brush2, f, drawStyle2);
    }

    /* renamed from: copy-w_4Rhrw, reason: not valid java name */
    public final Bullet m7319copyw_4Rhrw(Shape shape, long j, long j2, long j3, Brush brush, float f, DrawStyle drawStyle) {
        return new Bullet(shape, j, j2, j3, brush, f, drawStyle, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Bullet)) {
            Bullet bullet = (Bullet) obj;
            return jh2.k(this.shape, bullet.shape) && TextUnit.m8236equalsimpl0(this.width, bullet.width) && TextUnit.m8236equalsimpl0(this.height, bullet.height) && TextUnit.m8236equalsimpl0(this.padding, bullet.padding) && jh2.k(this.brush, bullet.brush) && this.alpha == bullet.alpha && jh2.k(this.drawStyle, bullet.drawStyle);
        }
        return false;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    /* renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m7320getHeightXSAIIZE() {
        return this.height;
    }

    /* renamed from: getPadding-XSAIIZE, reason: not valid java name */
    public final long m7321getPaddingXSAIIZE() {
        return this.padding;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m7322getWidthXSAIIZE() {
        return this.width;
    }

    public int hashCode() {
        int m8240hashCodeimpl = (TextUnit.m8240hashCodeimpl(this.padding) + ((TextUnit.m8240hashCodeimpl(this.height) + ((TextUnit.m8240hashCodeimpl(this.width) + (this.shape.hashCode() * 31)) * 31)) * 31)) * 31;
        Brush brush = this.brush;
        return this.drawStyle.hashCode() + yo0.i(this.alpha, (m8240hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        Shape shape = this.shape;
        String m8246toStringimpl = TextUnit.m8246toStringimpl(this.width);
        String m8246toStringimpl2 = TextUnit.m8246toStringimpl(this.height);
        String m8246toStringimpl3 = TextUnit.m8246toStringimpl(this.padding);
        Brush brush = this.brush;
        float f = this.alpha;
        DrawStyle drawStyle = this.drawStyle;
        StringBuilder sb = new StringBuilder("Bullet(shape=");
        sb.append(shape);
        sb.append(", size=(");
        sb.append(m8246toStringimpl);
        sb.append(", ");
        lt.L(sb, m8246toStringimpl2, "), padding=", m8246toStringimpl3, ", brush=");
        sb.append(brush);
        sb.append(", alpha=");
        sb.append(f);
        sb.append(", drawStyle=");
        sb.append(drawStyle);
        sb.append(")");
        return sb.toString();
    }
}
