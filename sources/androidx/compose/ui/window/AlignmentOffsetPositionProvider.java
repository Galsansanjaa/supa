package androidx.compose.ui.window;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final Alignment alignment;
    private final long offset;

    private AlignmentOffsetPositionProvider(Alignment alignment, long j) {
        this.alignment = alignment;
        this.offset = j;
    }

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment, long j, sb0 sb0Var) {
        this(alignment, j);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo442calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        Alignment alignment = this.alignment;
        IntSize.Companion companion = IntSize.Companion;
        return IntOffset.m8177plusqkQi6aY(IntOffset.m8177plusqkQi6aY(IntOffset.m8177plusqkQi6aY(intRect.m8202getTopLeftnOccac(), alignment.mo4801alignKFBX0sM(companion.m8221getZeroYbymL2g(), intRect.m8200getSizeYbymL2g(), layoutDirection)), IntOffset.m8181unaryMinusnOccac(this.alignment.mo4801alignKFBX0sM(companion.m8221getZeroYbymL2g(), j2, layoutDirection))), IntOffset.m8167constructorimpl(((IntOffset.m8173getXimpl(this.offset) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1)) << 32) | (IntOffset.m8174getYimpl(this.offset) & 4294967295L)));
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name */
    public final long m8296getOffsetnOccac() {
        return this.offset;
    }
}
