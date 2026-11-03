package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.DpRect;
import defpackage.kh0;
import defpackage.lt;
import defpackage.ps0;
import defpackage.yo0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface ContentDrawScope extends DrawScope {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m5840drawImageAZ2fEMs(ContentDrawScope contentDrawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
            kh0.d(contentDrawScope, imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, 0, 512, null);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m5841getCenterF1C5BW0(ContentDrawScope contentDrawScope) {
            int i = kh0.a;
            return SizeKt.m5169getCenteruvyYCjk(contentDrawScope.getDrawContext().mo5831getSizeNHjbRc());
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m5842getSizeNHjbRc(ContentDrawScope contentDrawScope) {
            int i = kh0.a;
            return contentDrawScope.getDrawContext().mo5831getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m5843recordJVtK1S4(ContentDrawScope contentDrawScope, GraphicsLayer graphicsLayer, long j, ps0 ps0Var) {
            int i = kh0.a;
            graphicsLayer.m5943recordmLhObY(contentDrawScope, contentDrawScope.getLayoutDirection(), j, new DrawScope$record$1(contentDrawScope, ps0Var));
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m5844roundToPxR2X_6o(ContentDrawScope contentDrawScope, long j) {
            return lt.a(contentDrawScope, j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m5845roundToPx0680j_4(ContentDrawScope contentDrawScope, float f) {
            return lt.b(contentDrawScope, f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5846toDpGaN1DYA(ContentDrawScope contentDrawScope, long j) {
            return yo0.b(contentDrawScope, j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5847toDpu2uoSUM(ContentDrawScope contentDrawScope, float f) {
            return lt.d(contentDrawScope, f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5848toDpu2uoSUM(ContentDrawScope contentDrawScope, int i) {
            return lt.e(contentDrawScope, i);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m5849toDpSizekrfVVM(ContentDrawScope contentDrawScope, long j) {
            return lt.f(contentDrawScope, j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m5850toPxR2X_6o(ContentDrawScope contentDrawScope, long j) {
            return lt.g(contentDrawScope, j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m5851toPx0680j_4(ContentDrawScope contentDrawScope, float f) {
            return contentDrawScope.getDensity() * f;
        }

        @Deprecated
        public static Rect toRect(ContentDrawScope contentDrawScope, DpRect dpRect) {
            return lt.h(contentDrawScope, dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m5852toSizeXkaWNTQ(ContentDrawScope contentDrawScope, long j) {
            return lt.i(contentDrawScope, j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5853toSp0xMU5do(ContentDrawScope contentDrawScope, float f) {
            return yo0.c(contentDrawScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5854toSpkPz2Gy4(ContentDrawScope contentDrawScope, float f) {
            return lt.j(contentDrawScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5855toSpkPz2Gy4(ContentDrawScope contentDrawScope, int i) {
            return lt.k(contentDrawScope, i);
        }
    }

    void drawContent();
}
