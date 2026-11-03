package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import defpackage.a10;
import defpackage.lt;
import defpackage.ts0;
import defpackage.yo0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface AwaitPointerEventScope extends Density {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m6476getExtendedTouchPaddingNHjbRc(AwaitPointerEventScope awaitPointerEventScope) {
            return Size.Companion.m5168getZeroNHjbRc();
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m6477roundToPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return lt.a(awaitPointerEventScope, j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m6478roundToPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return lt.b(awaitPointerEventScope, f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m6479toDpGaN1DYA(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return yo0.b(awaitPointerEventScope, j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6480toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return lt.d(awaitPointerEventScope, f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6481toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, int i) {
            return lt.e(awaitPointerEventScope, i);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m6482toDpSizekrfVVM(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return lt.f(awaitPointerEventScope, j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m6483toPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return lt.g(awaitPointerEventScope, j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m6484toPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return awaitPointerEventScope.getDensity() * f;
        }

        @Deprecated
        public static Rect toRect(AwaitPointerEventScope awaitPointerEventScope, DpRect dpRect) {
            return lt.h(awaitPointerEventScope, dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m6485toSizeXkaWNTQ(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return lt.i(awaitPointerEventScope, j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m6486toSp0xMU5do(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return yo0.c(awaitPointerEventScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6487toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return lt.j(awaitPointerEventScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6488toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, int i) {
            return lt.k(awaitPointerEventScope, i);
        }

        @Deprecated
        public static <T> Object withTimeout(AwaitPointerEventScope awaitPointerEventScope, long j, ts0 ts0Var, a10 a10Var) {
            return ts0Var.invoke(awaitPointerEventScope, a10Var);
        }

        @Deprecated
        public static <T> Object withTimeoutOrNull(AwaitPointerEventScope awaitPointerEventScope, long j, ts0 ts0Var, a10 a10Var) {
            return ts0Var.invoke(awaitPointerEventScope, a10Var);
        }
    }

    Object awaitPointerEvent(PointerEventPass pointerEventPass, a10 a10Var);

    PointerEvent getCurrentEvent();

    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    long mo6474getExtendedTouchPaddingNHjbRc();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo6475getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    <T> Object withTimeout(long j, ts0 ts0Var, a10 a10Var);

    <T> Object withTimeoutOrNull(long j, ts0 ts0Var, a10 a10Var);
}
