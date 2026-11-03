package androidx.compose.ui;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class CombinedAlignment implements Alignment {
    private final Alignment.Horizontal horizontal;
    private final Alignment.Vertical vertical;

    public CombinedAlignment(Alignment.Horizontal horizontal, Alignment.Vertical vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    @Override // androidx.compose.ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo4801alignKFBX0sM(long j, long j2, LayoutDirection layoutDirection) {
        return IntOffset.m8167constructorimpl((this.horizontal.align((int) (j >> 32), (int) (j2 >> 32), layoutDirection) << 32) | (this.vertical.align((int) (j & 4294967295L), (int) (j2 & 4294967295L)) & 4294967295L));
    }
}
