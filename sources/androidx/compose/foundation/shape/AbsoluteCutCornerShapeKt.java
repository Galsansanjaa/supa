package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AbsoluteCutCornerShapeKt {
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(float f) {
        return AbsoluteCutCornerShape(CornerSizeKt.CornerSize(f));
    }

    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(float f, float f2, float f3, float f4) {
        return new AbsoluteCutCornerShape(CornerSizeKt.CornerSize(f), CornerSizeKt.CornerSize(f2), CornerSizeKt.CornerSize(f3), CornerSizeKt.CornerSize(f4));
    }

    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(int i) {
        return AbsoluteCutCornerShape(CornerSizeKt.CornerSize(i));
    }

    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(int i, int i2, int i3, int i4) {
        return new AbsoluteCutCornerShape(CornerSizeKt.CornerSize(i), CornerSizeKt.CornerSize(i2), CornerSizeKt.CornerSize(i3), CornerSizeKt.CornerSize(i4));
    }

    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(CornerSize cornerSize) {
        return new AbsoluteCutCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static /* synthetic */ AbsoluteCutCornerShape AbsoluteCutCornerShape$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return AbsoluteCutCornerShape(f, f2, f3, f4);
    }

    public static /* synthetic */ AbsoluteCutCornerShape AbsoluteCutCornerShape$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return AbsoluteCutCornerShape(i, i2, i3, i4);
    }

    /* renamed from: AbsoluteCutCornerShape-0680j_4, reason: not valid java name */
    public static final AbsoluteCutCornerShape m1354AbsoluteCutCornerShape0680j_4(float f) {
        return AbsoluteCutCornerShape(CornerSizeKt.m1362CornerSize0680j_4(f));
    }

    /* renamed from: AbsoluteCutCornerShape-a9UjIt4, reason: not valid java name */
    public static final AbsoluteCutCornerShape m1355AbsoluteCutCornerShapea9UjIt4(float f, float f2, float f3, float f4) {
        return new AbsoluteCutCornerShape(CornerSizeKt.m1362CornerSize0680j_4(f), CornerSizeKt.m1362CornerSize0680j_4(f2), CornerSizeKt.m1362CornerSize0680j_4(f3), CornerSizeKt.m1362CornerSize0680j_4(f4));
    }

    /* renamed from: AbsoluteCutCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ AbsoluteCutCornerShape m1356AbsoluteCutCornerShapea9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return m1355AbsoluteCutCornerShapea9UjIt4(f, f2, f3, f4);
    }

    public static final AbsoluteCutCornerShape lerp(AbsoluteCutCornerShape absoluteCutCornerShape, AbsoluteCutCornerShape absoluteCutCornerShape2, float f) {
        return new AbsoluteCutCornerShape(RoundedCornerShapeKt.lerp(absoluteCutCornerShape.getTopStart(), absoluteCutCornerShape2.getTopStart(), f), RoundedCornerShapeKt.lerp(absoluteCutCornerShape.getTopEnd(), absoluteCutCornerShape2.getTopEnd(), f), RoundedCornerShapeKt.lerp(absoluteCutCornerShape.getBottomEnd(), absoluteCutCornerShape2.getBottomEnd(), f), RoundedCornerShapeKt.lerp(absoluteCutCornerShape.getBottomStart(), absoluteCutCornerShape2.getBottomStart(), f));
    }
}
