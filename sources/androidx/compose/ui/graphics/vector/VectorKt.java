package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import defpackage.oi0;
import defpackage.ps0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class VectorKt {
    public static final String DefaultGroupName = "";
    public static final String DefaultPathName = "";
    public static final float DefaultPivotX = 0.0f;
    public static final float DefaultPivotY = 0.0f;
    public static final float DefaultRotation = 0.0f;
    public static final float DefaultScaleX = 1.0f;
    public static final float DefaultScaleY = 1.0f;
    public static final float DefaultStrokeLineMiter = 4.0f;
    public static final float DefaultStrokeLineWidth = 0.0f;
    public static final float DefaultTranslationX = 0.0f;
    public static final float DefaultTranslationY = 0.0f;
    public static final float DefaultTrimPathEnd = 1.0f;
    public static final float DefaultTrimPathOffset = 0.0f;
    public static final float DefaultTrimPathStart = 0.0f;
    private static final List<PathNode> EmptyPath = oi0.a;
    private static final int DefaultStrokeLineCap = StrokeCap.Companion.m5705getButtKaPHkGw();
    private static final int DefaultStrokeLineJoin = StrokeJoin.Companion.m5716getMiterLxFBmk8();
    private static final int DefaultTintBlendMode = BlendMode.Companion.m5276getSrcIn0nO6VwU();
    private static final long DefaultTintColor = Color.Companion.m5367getTransparent0d7_KjU();
    private static final int DefaultFillType = PathFillType.Companion.m5628getNonZeroRgk1Os();

    public static final List<PathNode> PathData(ps0 ps0Var) {
        PathBuilder pathBuilder = new PathBuilder();
        ps0Var.invoke(pathBuilder);
        return pathBuilder.getNodes();
    }

    public static final List<PathNode> addPathNodes(String str) {
        return str == null ? EmptyPath : new PathParser().parsePathString(str).toNodes();
    }

    public static final int getDefaultFillType() {
        return DefaultFillType;
    }

    public static final int getDefaultStrokeLineCap() {
        return DefaultStrokeLineCap;
    }

    public static final int getDefaultStrokeLineJoin() {
        return DefaultStrokeLineJoin;
    }

    public static final int getDefaultTintBlendMode() {
        return DefaultTintBlendMode;
    }

    public static final long getDefaultTintColor() {
        return DefaultTintColor;
    }

    public static final List<PathNode> getEmptyPath() {
        return EmptyPath;
    }

    /* renamed from: rgbEqual--OWjLjI, reason: not valid java name */
    public static final boolean m6019rgbEqualOWjLjI(long j, long j2) {
        return Color.m5338getRedimpl(j) == Color.m5338getRedimpl(j2) && Color.m5337getGreenimpl(j) == Color.m5337getGreenimpl(j2) && Color.m5335getBlueimpl(j) == Color.m5335getBlueimpl(j2);
    }

    public static final boolean tintableWithAlphaMask(ColorFilter colorFilter) {
        if (!(colorFilter instanceof BlendModeColorFilter)) {
            return colorFilter == null;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) colorFilter;
        int m5280getBlendMode0nO6VwU = blendModeColorFilter.m5280getBlendMode0nO6VwU();
        BlendMode.Companion companion = BlendMode.Companion;
        return BlendMode.m5247equalsimpl0(m5280getBlendMode0nO6VwU, companion.m5276getSrcIn0nO6VwU()) || BlendMode.m5247equalsimpl0(blendModeColorFilter.m5280getBlendMode0nO6VwU(), companion.m5278getSrcOver0nO6VwU());
    }

    /* renamed from: toOpaque-8_81llA, reason: not valid java name */
    public static final long m6020toOpaque8_81llA(long j) {
        return Color.m5334getAlphaimpl(j) == 1.0f ? j : Color.m5331copywmQWz5c$default(j, 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
    }
}
