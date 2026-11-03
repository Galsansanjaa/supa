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
public interface PointerInputScope extends Density {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m6617getExtendedTouchPaddingNHjbRc(PointerInputScope pointerInputScope) {
            return Size.Companion.m5168getZeroNHjbRc();
        }

        @Deprecated
        public static boolean getInterceptOutOfBoundsChildEvents(PointerInputScope pointerInputScope) {
            return false;
        }

        public static /* synthetic */ void getInterceptOutOfBoundsChildEvents$annotations() {
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m6618roundToPxR2X_6o(PointerInputScope pointerInputScope, long j) {
            return lt.a(pointerInputScope, j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m6619roundToPx0680j_4(PointerInputScope pointerInputScope, float f) {
            return lt.b(pointerInputScope, f);
        }

        @Deprecated
        public static void setInterceptOutOfBoundsChildEvents(PointerInputScope pointerInputScope, boolean z) {
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m6620toDpGaN1DYA(PointerInputScope pointerInputScope, long j) {
            return yo0.b(pointerInputScope, j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6621toDpu2uoSUM(PointerInputScope pointerInputScope, float f) {
            return lt.d(pointerInputScope, f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6622toDpu2uoSUM(PointerInputScope pointerInputScope, int i) {
            return lt.e(pointerInputScope, i);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m6623toDpSizekrfVVM(PointerInputScope pointerInputScope, long j) {
            return lt.f(pointerInputScope, j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m6624toPxR2X_6o(PointerInputScope pointerInputScope, long j) {
            return lt.g(pointerInputScope, j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m6625toPx0680j_4(PointerInputScope pointerInputScope, float f) {
            return pointerInputScope.getDensity() * f;
        }

        @Deprecated
        public static Rect toRect(PointerInputScope pointerInputScope, DpRect dpRect) {
            return lt.h(pointerInputScope, dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m6626toSizeXkaWNTQ(PointerInputScope pointerInputScope, long j) {
            return lt.i(pointerInputScope, j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m6627toSp0xMU5do(PointerInputScope pointerInputScope, float f) {
            return yo0.c(pointerInputScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6628toSpkPz2Gy4(PointerInputScope pointerInputScope, float f) {
            return lt.j(pointerInputScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6629toSpkPz2Gy4(PointerInputScope pointerInputScope, int i) {
            return lt.k(pointerInputScope, i);
        }
    }

    <R> Object awaitPointerEventScope(ts0 ts0Var, a10 a10Var);

    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    long mo463getExtendedTouchPaddingNHjbRc();

    boolean getInterceptOutOfBoundsChildEvents();

    /* renamed from: getSize-YbymL2g */
    long mo464getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    void setInterceptOutOfBoundsChildEvents(boolean z);
}
