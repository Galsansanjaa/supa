package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusDirection;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FocusOwnerImplKt {
    /* renamed from: is1dFocusSearch-3ESFkO8, reason: not valid java name */
    public static final boolean m4998is1dFocusSearch3ESFkO8(int i) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        return FocusDirection.m4971equalsimpl0(i, companion.m4979getNextdhqQ8s()) || FocusDirection.m4971equalsimpl0(i, companion.m4980getPreviousdhqQ8s());
    }
}
