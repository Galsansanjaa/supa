package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class RenderEffectVerificationHelper {
    public static final RenderEffectVerificationHelper INSTANCE = new RenderEffectVerificationHelper();

    private RenderEffectVerificationHelper() {
    }

    /* renamed from: createBlurEffect-8A-3gB4, reason: not valid java name */
    public final android.graphics.RenderEffect m5657createBlurEffect8A3gB4(RenderEffect renderEffect, float f, float f2, int i) {
        return (f == 0.0f && f2 == 0.0f) ? android.graphics.RenderEffect.createOffsetEffect(0.0f, 0.0f) : renderEffect == null ? android.graphics.RenderEffect.createBlurEffect(f, f2, AndroidTileMode_androidKt.m5241toAndroidTileMode0vamqd0(i)) : android.graphics.RenderEffect.createBlurEffect(f, f2, renderEffect.asAndroidRenderEffect(), AndroidTileMode_androidKt.m5241toAndroidTileMode0vamqd0(i));
    }

    /* renamed from: createOffsetEffect-Uv8p0NA, reason: not valid java name */
    public final android.graphics.RenderEffect m5658createOffsetEffectUv8p0NA(RenderEffect renderEffect, long j) {
        return renderEffect == null ? android.graphics.RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))) : android.graphics.RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), renderEffect.asAndroidRenderEffect());
    }
}
