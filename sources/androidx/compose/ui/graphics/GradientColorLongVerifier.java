package androidx.compose.ui.graphics;

import defpackage.n1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class GradientColorLongVerifier {
    public static final GradientColorLongVerifier INSTANCE = new GradientColorLongVerifier();

    private GradientColorLongVerifier() {
    }

    /* renamed from: createLinearGradientColorLong-VjE6UOU, reason: not valid java name */
    public final android.graphics.LinearGradient m5480createLinearGradientColorLongVjE6UOU(long j, long j2, long[] jArr, float[] fArr, int i) {
        return n1.c(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), jArr, fArr, AndroidTileMode_androidKt.m5241toAndroidTileMode0vamqd0(i));
    }

    /* renamed from: createRadialGradientColorLong-8uybcMk, reason: not valid java name */
    public final android.graphics.RadialGradient m5481createRadialGradientColorLong8uybcMk(long j, float f, long[] jArr, float[] fArr, int i) {
        return n1.d(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, jArr, fArr, AndroidTileMode_androidKt.m5241toAndroidTileMode0vamqd0(i));
    }

    /* renamed from: createSweepGradientColorLong-9KIMszo, reason: not valid java name */
    public final android.graphics.SweepGradient m5482createSweepGradientColorLong9KIMszo(long j, long[] jArr, float[] fArr) {
        return n1.f(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), jArr, fArr);
    }
}
