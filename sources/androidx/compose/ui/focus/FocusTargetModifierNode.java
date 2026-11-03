package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNode;
import defpackage.hd0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface FocusTargetModifierNode extends DelegatableNode {
    FocusState getFocusState();

    /* renamed from: getFocusability-LCbbffg, reason: not valid java name */
    int mo5001getFocusabilityLCbbffg();

    @hd0
    /* synthetic */ boolean requestFocus();

    /* renamed from: requestFocus-3ESFkO8, reason: not valid java name */
    boolean mo5002requestFocus3ESFkO8(int i);

    /* renamed from: setFocusability-josRg5g, reason: not valid java name */
    void mo5003setFocusabilityjosRg5g(int i);
}
