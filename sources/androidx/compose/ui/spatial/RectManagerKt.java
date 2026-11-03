package androidx.compose.ui.spatial;

import androidx.compose.ui.unit.IntOffset;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class RectManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: analyzeComponents-58bKbWc, reason: not valid java name */
    public static final int m7276analyzeComponents58bKbWc(float[] fArr) {
        if (fArr.length < 16) {
            return 0;
        }
        return ((fArr[12] == 0.0f ? 1 : 0) & (fArr[13] == 0.0f ? 1 : 0) & (fArr[14] == 0.0f ? 1 : 0) & (fArr[15] == 1.0f ? 1 : 0)) | ((((((((((fArr[0] == 1.0f ? 1 : 0) & (fArr[1] == 0.0f ? 1 : 0)) & (fArr[2] == 0.0f ? 1 : 0)) & (fArr[4] == 0.0f ? 1 : 0)) & (fArr[5] == 1.0f ? 1 : 0)) & (fArr[6] == 0.0f ? 1 : 0)) & (fArr[8] == 0.0f ? 1 : 0)) & (fArr[9] == 0.0f ? 1 : 0)) & (fArr[10] == 1.0f ? 1 : 0)) << 1);
    }

    private static final boolean getHasNonTranslationComponents(int i) {
        return (i & 2) == 0;
    }

    private static /* synthetic */ void getHasNonTranslationComponents$annotations(int i) {
    }

    private static final boolean isIdentity(int i) {
        return i == 3;
    }

    private static /* synthetic */ void isIdentity$annotations(int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isSet--gyyYBs, reason: not valid java name */
    public static final boolean m7277isSetgyyYBs(long j) {
        return !IntOffset.m8172equalsimpl0(j, IntOffset.Companion.m8183getMaxnOccac());
    }

    public static final int toInt(boolean z) {
        return z ? 1 : 0;
    }
}
