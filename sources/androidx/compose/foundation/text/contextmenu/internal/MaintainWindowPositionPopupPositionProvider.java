package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class MaintainWindowPositionPopupPositionProvider implements PopupPositionProvider {
    private final PopupPositionProvider popupPositionProvider;
    private LayoutDirection previousLayoutDirection;
    private IntSize previousPopupContentSize;
    private IntOffset previousPosition;
    private IntSize previousWindowSize;

    public MaintainWindowPositionPopupPositionProvider(PopupPositionProvider popupPositionProvider) {
        this.popupPositionProvider = popupPositionProvider;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo442calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        IntOffset intOffset = this.previousPosition;
        if (intOffset != null) {
            IntSize intSize = this.previousWindowSize;
            if ((intSize == null ? false : IntSize.m8214equalsimpl0(intSize.m8220unboximpl(), j)) && this.previousLayoutDirection == layoutDirection) {
                IntSize intSize2 = this.previousPopupContentSize;
                if (intSize2 != null ? IntSize.m8214equalsimpl0(intSize2.m8220unboximpl(), j2) : false) {
                    return intOffset.m8182unboximpl();
                }
            }
        }
        long mo442calculatePositionllwVHH4 = this.popupPositionProvider.mo442calculatePositionllwVHH4(intRect, j, layoutDirection, j2);
        this.previousWindowSize = IntSize.m8208boximpl(j);
        this.previousLayoutDirection = layoutDirection;
        this.previousPopupContentSize = IntSize.m8208boximpl(j2);
        this.previousPosition = IntOffset.m8164boximpl(mo442calculatePositionllwVHH4);
        return mo442calculatePositionllwVHH4;
    }

    public final PopupPositionProvider getPopupPositionProvider() {
        return this.popupPositionProvider;
    }

    public final LayoutDirection getPreviousLayoutDirection() {
        return this.previousLayoutDirection;
    }

    /* renamed from: getPreviousPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m1694getPreviousPopupContentSizebOM6tXw() {
        return this.previousPopupContentSize;
    }

    /* renamed from: getPreviousPosition-JyOPPKE, reason: not valid java name */
    public final IntOffset m1695getPreviousPositionJyOPPKE() {
        return this.previousPosition;
    }

    /* renamed from: getPreviousWindowSize-bOM6tXw, reason: not valid java name */
    public final IntSize m1696getPreviousWindowSizebOM6tXw() {
        return this.previousWindowSize;
    }

    public final void setPreviousLayoutDirection(LayoutDirection layoutDirection) {
        this.previousLayoutDirection = layoutDirection;
    }

    /* renamed from: setPreviousPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1697setPreviousPopupContentSizefhxjrPA(IntSize intSize) {
        this.previousPopupContentSize = intSize;
    }

    /* renamed from: setPreviousPosition-fg0MpWk, reason: not valid java name */
    public final void m1698setPreviousPositionfg0MpWk(IntOffset intOffset) {
        this.previousPosition = intOffset;
    }

    /* renamed from: setPreviousWindowSize-fhxjrPA, reason: not valid java name */
    public final void m1699setPreviousWindowSizefhxjrPA(IntSize intSize) {
        this.previousWindowSize = intSize;
    }
}
