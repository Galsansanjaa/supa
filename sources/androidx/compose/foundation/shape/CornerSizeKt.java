package androidx.compose.foundation.shape;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class CornerSizeKt {
    private static final CornerSize ZeroCornerSize = new CornerSizeKt$ZeroCornerSize$1();

    public static final CornerSize CornerSize(float f) {
        return new PxCornerSize(f);
    }

    public static final CornerSize CornerSize(int i) {
        return new PercentCornerSize(i);
    }

    /* renamed from: CornerSize-0680j_4, reason: not valid java name */
    public static final CornerSize m1362CornerSize0680j_4(float f) {
        return new DpCornerSize(f, null);
    }

    public static final CornerSize getZeroCornerSize() {
        return ZeroCornerSize;
    }

    public static /* synthetic */ void getZeroCornerSize$annotations() {
    }
}
