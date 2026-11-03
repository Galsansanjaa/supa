package androidx.compose.ui.layout;

import androidx.compose.ui.unit.IntSize;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class FixedSizeIntrinsicsPlaceable extends Placeable {
    public FixedSizeIntrinsicsPlaceable(int i, int i2) {
        m6755setMeasuredSizeozmzZPI(IntSize.m8211constructorimpl((i2 & 4294967295L) | (i << 32)));
    }

    @Override // androidx.compose.ui.layout.Measured
    public int get(AlignmentLine alignmentLine) {
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo6711placeAtf8xVGno(long j, float f, ps0 ps0Var) {
    }
}
