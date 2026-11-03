package androidx.compose.foundation.text.selection;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class HandlePositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final Alignment handleReferencePoint;
    private final OffsetProvider positionProvider;
    private long prevPosition = Offset.Companion.m5106getZeroF1C5BW0();

    public HandlePositionProvider(Alignment alignment, OffsetProvider offsetProvider) {
        this.handleReferencePoint = alignment;
        this.positionProvider = offsetProvider;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo442calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        long mo1496provideF1C5BW0 = this.positionProvider.mo1496provideF1C5BW0();
        if ((9223372034707292159L & mo1496provideF1C5BW0) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            mo1496provideF1C5BW0 = this.prevPosition;
        }
        this.prevPosition = mo1496provideF1C5BW0;
        return IntOffset.m8177plusqkQi6aY(IntOffset.m8177plusqkQi6aY(intRect.m8202getTopLeftnOccac(), IntOffsetKt.m8190roundk4lQ0M(mo1496provideF1C5BW0)), this.handleReferencePoint.mo4801alignKFBX0sM(j2, IntSize.Companion.m8221getZeroYbymL2g(), layoutDirection));
    }
}
