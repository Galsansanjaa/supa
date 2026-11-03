package androidx.compose.foundation.shape;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Interpolatable;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.f31;
import defpackage.yo0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class CornerBasedShape implements Shape, Interpolatable {
    public static final int $stable = 0;
    private final CornerSize bottomEnd;
    private final CornerSize bottomStart;
    private final CornerSize topEnd;
    private final CornerSize topStart;

    public CornerBasedShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        this.topStart = cornerSize;
        this.topEnd = cornerSize2;
        this.bottomEnd = cornerSize3;
        this.bottomStart = cornerSize4;
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: copy");
            return null;
        }
        if ((i & 1) != 0) {
            cornerSize = cornerBasedShape.topStart;
        }
        if ((i & 2) != 0) {
            cornerSize2 = cornerBasedShape.topEnd;
        }
        if ((i & 4) != 0) {
            cornerSize3 = cornerBasedShape.bottomEnd;
        }
        if ((i & 8) != 0) {
            cornerSize4 = cornerBasedShape.bottomStart;
        }
        return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public final CornerBasedShape copy(CornerSize cornerSize) {
        return copy(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public abstract CornerBasedShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4);

    /* renamed from: createOutline-LjSzlW0 */
    public abstract Outline mo1353createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection);

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final Outline mo385createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        float mo1361toPxTmRCtEA = this.topStart.mo1361toPxTmRCtEA(j, density);
        float mo1361toPxTmRCtEA2 = this.topEnd.mo1361toPxTmRCtEA(j, density);
        float mo1361toPxTmRCtEA3 = this.bottomEnd.mo1361toPxTmRCtEA(j, density);
        float mo1361toPxTmRCtEA4 = this.bottomStart.mo1361toPxTmRCtEA(j, density);
        float m5158getMinDimensionimpl = Size.m5158getMinDimensionimpl(j);
        float f = mo1361toPxTmRCtEA + mo1361toPxTmRCtEA4;
        if (f > m5158getMinDimensionimpl) {
            float f2 = m5158getMinDimensionimpl / f;
            mo1361toPxTmRCtEA *= f2;
            mo1361toPxTmRCtEA4 *= f2;
        }
        float f3 = mo1361toPxTmRCtEA2 + mo1361toPxTmRCtEA3;
        if (f3 > m5158getMinDimensionimpl) {
            float f4 = m5158getMinDimensionimpl / f3;
            mo1361toPxTmRCtEA2 *= f4;
            mo1361toPxTmRCtEA3 *= f4;
        }
        if (!(mo1361toPxTmRCtEA >= 0.0f && mo1361toPxTmRCtEA2 >= 0.0f && mo1361toPxTmRCtEA3 >= 0.0f && mo1361toPxTmRCtEA4 >= 0.0f)) {
            StringBuilder v = yo0.v("Corner size in Px can't be negative(topStart = ", mo1361toPxTmRCtEA, ", topEnd = ", mo1361toPxTmRCtEA2, ", bottomEnd = ");
            v.append(mo1361toPxTmRCtEA3);
            v.append(", bottomStart = ");
            v.append(mo1361toPxTmRCtEA4);
            v.append(")!");
            InlineClassHelperKt.throwIllegalArgumentException(v.toString());
        }
        return mo1353createOutlineLjSzlW0(j, mo1361toPxTmRCtEA, mo1361toPxTmRCtEA2, mo1361toPxTmRCtEA3, mo1361toPxTmRCtEA4, layoutDirection);
    }

    public final CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    public final CornerSize getBottomStart() {
        return this.bottomStart;
    }

    public final CornerSize getTopEnd() {
        return this.topEnd;
    }

    public final CornerSize getTopStart() {
        return this.topStart;
    }

    public Object lerp(Object obj, float f) {
        return null;
    }
}
