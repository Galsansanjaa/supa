package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface PlatformFocusOwner {
    void clearOwnerFocus();

    void focusTargetAvailable();

    Rect getEmbeddedViewFocusRect();

    /* renamed from: moveFocusInChildren-3ESFkO8, reason: not valid java name */
    boolean mo5032moveFocusInChildren3ESFkO8(int i);

    /* renamed from: requestOwnerFocus-7o62pno, reason: not valid java name */
    boolean mo5033requestOwnerFocus7o62pno(FocusDirection focusDirection, Rect rect);
}
