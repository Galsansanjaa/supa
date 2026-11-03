package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class WrapperVerificationHelperMethods {
    public static final int $stable = 0;
    public static final WrapperVerificationHelperMethods INSTANCE = new WrapperVerificationHelperMethods();

    private WrapperVerificationHelperMethods() {
    }

    /* renamed from: getColor-vNxB06k, reason: not valid java name */
    public final long m5757getColorvNxB06k(android.graphics.Paint paint) {
        return AndroidColor_androidKt.fromColorLong(Color.Companion, paint.getColorLong());
    }

    /* renamed from: setBlendMode-GB0RdKg, reason: not valid java name */
    public final void m5758setBlendModeGB0RdKg(android.graphics.Paint paint, int i) {
        paint.setBlendMode(AndroidBlendMode_androidKt.m5182toAndroidBlendModes9anfk8(i));
    }

    /* renamed from: setColor-4WTKRHQ, reason: not valid java name */
    public final void m5759setColor4WTKRHQ(android.graphics.Paint paint, long j) {
        paint.setColor(AndroidColor_androidKt.m5201toSupportedColorLong8_81llA(j));
    }
}
