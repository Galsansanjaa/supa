package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import defpackage.lt;
import defpackage.yo0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface Density extends FontScaling {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m8035roundToPxR2X_6o(Density density, long j) {
            return lt.a(density, j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m8036roundToPx0680j_4(Density density, float f) {
            return lt.b(density, f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m8037toDpGaN1DYA(Density density, long j) {
            return yo0.b(density, j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m8038toDpu2uoSUM(Density density, float f) {
            return lt.d(density, f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m8039toDpu2uoSUM(Density density, int i) {
            return lt.e(density, i);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m8040toDpSizekrfVVM(Density density, long j) {
            return lt.f(density, j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m8041toPxR2X_6o(Density density, long j) {
            return lt.g(density, j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m8042toPx0680j_4(Density density, float f) {
            return density.getDensity() * f;
        }

        @Deprecated
        public static Rect toRect(Density density, DpRect dpRect) {
            return lt.h(density, dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m8043toSizeXkaWNTQ(Density density, long j) {
            return lt.i(density, j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m8044toSp0xMU5do(Density density, float f) {
            return yo0.c(density, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m8045toSpkPz2Gy4(Density density, float f) {
            return lt.j(density, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m8046toSpkPz2Gy4(Density density, int i) {
            return lt.k(density, i);
        }
    }

    float getDensity();

    /* renamed from: roundToPx--R2X_6o */
    int mo466roundToPxR2X_6o(long j);

    /* renamed from: roundToPx-0680j_4 */
    int mo467roundToPx0680j_4(float f);

    /* renamed from: toDp-u2uoSUM */
    float mo469toDpu2uoSUM(float f);

    /* renamed from: toDp-u2uoSUM */
    float mo470toDpu2uoSUM(int i);

    /* renamed from: toDpSize-k-rfVVM */
    long mo471toDpSizekrfVVM(long j);

    /* renamed from: toPx--R2X_6o */
    float mo472toPxR2X_6o(long j);

    /* renamed from: toPx-0680j_4 */
    float mo473toPx0680j_4(float f);

    Rect toRect(DpRect dpRect);

    /* renamed from: toSize-XkaWNTQ */
    long mo474toSizeXkaWNTQ(long j);

    /* renamed from: toSp-kPz2Gy4 */
    long mo476toSpkPz2Gy4(float f);

    /* renamed from: toSp-kPz2Gy4 */
    long mo477toSpkPz2Gy4(int i);
}
