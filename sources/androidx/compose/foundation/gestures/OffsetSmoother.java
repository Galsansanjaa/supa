package androidx.compose.foundation.gestures;

import androidx.collection.LongList;
import androidx.collection.MutableLongList;
import androidx.compose.ui.geometry.Offset;
import defpackage.ps0;
import defpackage.sc1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class OffsetSmoother {
    public static final int $stable = 8;
    private MutableLongList eventRotatingArray = new MutableLongList(0, 1, null);
    private int eventRotatingIndex;

    private static final float smoothEventPosition_MK_Hz9U$averageBy(LongList longList, ps0 ps0Var) {
        long[] jArr = longList.content;
        int i = longList._size;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += ((Number) ps0Var.invoke(Long.valueOf(jArr[i2]))).floatValue();
        }
        return f / longList._size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float smoothEventPosition_MK_Hz9U$lambda$1(long j) {
        return Float.intBitsToFloat((int) (Offset.m5082constructorimpl(j) >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float smoothEventPosition_MK_Hz9U$lambda$2(long j) {
        return Float.intBitsToFloat((int) (Offset.m5082constructorimpl(j) & 4294967295L));
    }

    public final void reset() {
        this.eventRotatingIndex = 0;
        this.eventRotatingArray.clear();
    }

    /* renamed from: smoothEventPosition-MK-Hz9U, reason: not valid java name */
    public final long m603smoothEventPositionMKHz9U(long j) {
        MutableLongList mutableLongList = this.eventRotatingArray;
        if (mutableLongList._size == 3) {
            int i = this.eventRotatingIndex;
            this.eventRotatingIndex = i + 1;
            mutableLongList.set(i, j);
        } else {
            mutableLongList.add(j);
        }
        if (this.eventRotatingIndex == 3) {
            this.eventRotatingIndex = 0;
        }
        float smoothEventPosition_MK_Hz9U$averageBy = smoothEventPosition_MK_Hz9U$averageBy(this.eventRotatingArray, new sc1(22));
        float smoothEventPosition_MK_Hz9U$averageBy2 = smoothEventPosition_MK_Hz9U$averageBy(this.eventRotatingArray, new sc1(23));
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(smoothEventPosition_MK_Hz9U$averageBy) << 32) | (Float.floatToRawIntBits(smoothEventPosition_MK_Hz9U$averageBy2) & 4294967295L));
    }
}
