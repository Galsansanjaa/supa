package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.f31;
import defpackage.hd0;
import defpackage.kh0;
import defpackage.lt;
import defpackage.ps0;
import defpackage.yo0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@DrawScopeMarker
/* loaded from: classes3.dex */
public interface DrawScope extends Density {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.Companion.m5278getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.Companion.m5432getLowfv9h1I();

        private Companion() {
        }

        /* renamed from: getDefaultBlendMode-0nO6VwU, reason: not valid java name */
        public final int m5856getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I, reason: not valid java name */
        public final int m5857getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        /* renamed from: drawArc-illE91I$default, reason: not valid java name */
        public static /* synthetic */ void m5858drawArcillE91I$default(DrawScope drawScope, Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
            int i3 = kh0.a;
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
            } else {
                long m5106getZeroF1C5BW0 = (i2 & 16) != 0 ? Offset.Companion.m5106getZeroF1C5BW0() : j;
                drawScope.mo5804drawArcillE91I(brush, f, f2, z, m5106getZeroF1C5BW0, (i2 & 32) != 0 ? kh0.a(drawScope.mo5824getSizeNHjbRc(), m5106getZeroF1C5BW0) : j2, (i2 & 64) != 0 ? 1.0f : f3, (i2 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 256) != 0 ? null : colorFilter, (i2 & 512) != 0 ? DrawScope.Companion.m5856getDefaultBlendMode0nO6VwU() : i);
            }
        }

        /* renamed from: drawCircle-V9BoPsw$default, reason: not valid java name */
        public static /* synthetic */ void m5860drawCircleV9BoPsw$default(DrawScope drawScope, Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
            int i3 = kh0.a;
            if (obj == null) {
                drawScope.mo5806drawCircleV9BoPsw(brush, (i2 & 2) != 0 ? Size.m5158getMinDimensionimpl(drawScope.mo5824getSizeNHjbRc()) / 2.0f : f, (i2 & 4) != 0 ? drawScope.mo5823getCenterF1C5BW0() : j, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? DrawScope.Companion.m5856getDefaultBlendMode0nO6VwU() : i);
            } else {
                f31.f("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
            }
        }

        /* renamed from: drawImage-9jGpkUE$default, reason: not valid java name */
        public static /* synthetic */ void m5862drawImage9jGpkUE$default(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
            int i3 = kh0.a;
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
                return;
            }
            long m8184getZeronOccac = (i2 & 2) != 0 ? IntOffset.Companion.m8184getZeronOccac() : j;
            long m8211constructorimpl = (i2 & 4) != 0 ? IntSize.m8211constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j2;
            drawScope.mo5808drawImage9jGpkUE(imageBitmap, m8184getZeronOccac, m8211constructorimpl, (i2 & 8) != 0 ? IntOffset.Companion.m8184getZeronOccac() : j3, (i2 & 16) != 0 ? m8211constructorimpl : j4, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 128) != 0 ? null : colorFilter, (i2 & 256) != 0 ? DrawScope.Companion.m5856getDefaultBlendMode0nO6VwU() : i);
        }

        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m5863drawImageAZ2fEMs(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
            kh0.d(drawScope, imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, 0, 512, null);
        }

        /* renamed from: drawOval-AsUm42w$default, reason: not valid java name */
        public static /* synthetic */ void m5868drawOvalAsUm42w$default(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
            int i3 = kh0.a;
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
            } else {
                long m5106getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m5106getZeroF1C5BW0() : j;
                drawScope.mo5813drawOvalAsUm42w(brush, m5106getZeroF1C5BW0, (i2 & 4) != 0 ? kh0.a(drawScope.mo5824getSizeNHjbRc(), m5106getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? DrawScope.Companion.m5856getDefaultBlendMode0nO6VwU() : i);
            }
        }

        /* renamed from: drawOval-n-J9OG0$default, reason: not valid java name */
        public static /* synthetic */ void m5869drawOvalnJ9OG0$default(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
            int i3 = kh0.a;
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
            } else {
                long m5106getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m5106getZeroF1C5BW0() : j2;
                drawScope.mo5814drawOvalnJ9OG0(j, m5106getZeroF1C5BW0, (i2 & 4) != 0 ? kh0.a(drawScope.mo5824getSizeNHjbRc(), m5106getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? DrawScope.Companion.m5856getDefaultBlendMode0nO6VwU() : i);
            }
        }

        /* renamed from: drawPoints-Gsft0Ws$default, reason: not valid java name */
        public static /* synthetic */ void m5873drawPointsGsft0Ws$default(DrawScope drawScope, List list, int i, Brush brush, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
            int i5 = kh0.a;
            if (obj == null) {
                drawScope.mo5818drawPointsGsft0Ws(list, i, brush, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? StrokeCap.Companion.m5705getButtKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f2, (i4 & 128) != 0 ? null : colorFilter, (i4 & 256) != 0 ? DrawScope.Companion.m5856getDefaultBlendMode0nO6VwU() : i3);
            } else {
                f31.f("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
            }
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m5878getCenterF1C5BW0(DrawScope drawScope) {
            int i = kh0.a;
            return SizeKt.m5169getCenteruvyYCjk(drawScope.getDrawContext().mo5831getSizeNHjbRc());
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m5879getSizeNHjbRc(DrawScope drawScope) {
            int i = kh0.a;
            return drawScope.getDrawContext().mo5831getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m5880recordJVtK1S4(DrawScope drawScope, GraphicsLayer graphicsLayer, long j, ps0 ps0Var) {
            int i = kh0.a;
            graphicsLayer.m5943recordmLhObY(drawScope, drawScope.getLayoutDirection(), j, new DrawScope$record$1(drawScope, ps0Var));
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m5882roundToPxR2X_6o(DrawScope drawScope, long j) {
            int i = kh0.a;
            return lt.a(drawScope, j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m5883roundToPx0680j_4(DrawScope drawScope, float f) {
            int i = kh0.a;
            return lt.b(drawScope, f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5884toDpGaN1DYA(DrawScope drawScope, long j) {
            int i = kh0.a;
            return yo0.b(drawScope, j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5885toDpu2uoSUM(DrawScope drawScope, float f) {
            int i = kh0.a;
            return lt.d(drawScope, f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5886toDpu2uoSUM(DrawScope drawScope, int i) {
            int i2 = kh0.a;
            return lt.e(drawScope, i);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m5887toDpSizekrfVVM(DrawScope drawScope, long j) {
            int i = kh0.a;
            return lt.f(drawScope, j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m5888toPxR2X_6o(DrawScope drawScope, long j) {
            int i = kh0.a;
            return lt.g(drawScope, j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m5889toPx0680j_4(DrawScope drawScope, float f) {
            int i = kh0.a;
            return drawScope.getDensity() * f;
        }

        @Deprecated
        public static Rect toRect(DrawScope drawScope, DpRect dpRect) {
            int i = kh0.a;
            return lt.h(drawScope, dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m5890toSizeXkaWNTQ(DrawScope drawScope, long j) {
            int i = kh0.a;
            return lt.i(drawScope, j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5891toSp0xMU5do(DrawScope drawScope, float f) {
            int i = kh0.a;
            return yo0.c(drawScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5892toSpkPz2Gy4(DrawScope drawScope, float f) {
            int i = kh0.a;
            return lt.j(drawScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5893toSpkPz2Gy4(DrawScope drawScope, int i) {
            int i2 = kh0.a;
            return lt.k(drawScope, i);
        }
    }

    /* renamed from: drawArc-illE91I */
    void mo5804drawArcillE91I(Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawArc-yD3GUKo */
    void mo5805drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawCircle-V9BoPsw */
    void mo5806drawCircleV9BoPsw(Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo5807drawCircleVaOC9Bg(long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    @hd0
    /* renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo5808drawImage9jGpkUE(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawImage-AZ2fEMs */
    void mo5809drawImageAZ2fEMs(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2);

    /* renamed from: drawImage-gbVJVH8 */
    void mo5810drawImagegbVJVH8(ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawLine-1RTmtNc */
    void mo5811drawLine1RTmtNc(Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo5812drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2);

    /* renamed from: drawOval-AsUm42w */
    void mo5813drawOvalAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawOval-n-J9OG0 */
    void mo5814drawOvalnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawPath-GBMwjPU */
    void mo5815drawPathGBMwjPU(Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawPath-LG529CI */
    void mo5816drawPathLG529CI(Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo5817drawPointsF8ZwMP8(List<Offset> list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3);

    /* renamed from: drawPoints-Gsft0Ws */
    void mo5818drawPointsGsft0Ws(List<Offset> list, int i, Brush brush, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3);

    /* renamed from: drawRect-AsUm42w */
    void mo5819drawRectAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawRect-n-J9OG0 */
    void mo5820drawRectnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo5821drawRoundRectZuiqVtQ(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo5822drawRoundRectuAw5IA(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i);

    /* renamed from: getCenter-F1C5BW0 */
    long mo5823getCenterF1C5BW0();

    DrawContext getDrawContext();

    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc */
    long mo5824getSizeNHjbRc();

    /* renamed from: record-JVtK1S4 */
    void mo5825recordJVtK1S4(GraphicsLayer graphicsLayer, long j, ps0 ps0Var);
}
