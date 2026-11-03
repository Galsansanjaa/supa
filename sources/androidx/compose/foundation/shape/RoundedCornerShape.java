package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.jh2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class RoundedCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public RoundedCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public RoundedCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new RoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo1353createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m5180toRectuvyYCjk(j));
        }
        Rect m5180toRectuvyYCjk = SizeKt.m5180toRectuvyYCjk(j);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f5 = layoutDirection == layoutDirection2 ? f : f2;
        long m5044constructorimpl = CornerRadius.m5044constructorimpl((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
        float f6 = layoutDirection == layoutDirection2 ? f2 : f;
        long m5044constructorimpl2 = CornerRadius.m5044constructorimpl((Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32));
        float f7 = layoutDirection == layoutDirection2 ? f3 : f4;
        long m5044constructorimpl3 = CornerRadius.m5044constructorimpl((Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L));
        float f8 = layoutDirection == layoutDirection2 ? f4 : f3;
        return new Outline.Rounded(RoundRectKt.m5142RoundRectZAM2FJo(m5180toRectuvyYCjk, m5044constructorimpl, m5044constructorimpl2, m5044constructorimpl3, CornerRadius.m5044constructorimpl((Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj;
        return jh2.k(getTopStart(), roundedCornerShape.getTopStart()) && jh2.k(getTopEnd(), roundedCornerShape.getTopEnd()) && jh2.k(getBottomEnd(), roundedCornerShape.getBottomEnd()) && jh2.k(getBottomStart(), roundedCornerShape.getBottomStart());
    }

    public int hashCode() {
        return getBottomStart().hashCode() + ((getBottomEnd().hashCode() + ((getTopEnd().hashCode() + (getTopStart().hashCode() * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape, androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f) {
        if (jh2.k(obj, RectangleShapeKt.getRectangleShape()) || obj == null) {
            obj = RoundedCornerShapeKt.RoundedCornerShape(0.0f);
        }
        if (obj instanceof RoundedCornerShape) {
            return RoundedCornerShapeKt.lerp(this, (RoundedCornerShape) obj, f);
        }
        return null;
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ")";
    }
}
