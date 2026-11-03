package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ColorMatrixKt {
    /* renamed from: dot-Me4OoYI, reason: not valid java name */
    private static final float m5412dotMe4OoYI(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 5;
        return (fArr[i3 + 3] * fArr2[15 + i2]) + (fArr[i3 + 2] * fArr2[10 + i2]) + (fArr[i3 + 1] * fArr2[5 + i2]) + (fArr[i3] * fArr2[i2]);
    }
}
