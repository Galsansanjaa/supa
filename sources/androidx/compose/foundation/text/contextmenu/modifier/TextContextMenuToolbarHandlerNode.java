package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import defpackage.g50;
import defpackage.mi2;
import defpackage.od4;
import defpackage.ps0;
import defpackage.r71;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextContextMenuToolbarHandlerNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, TextContextMenuDataProvider {
    public static final int $stable = 8;
    private ps0 computeContentBounds;
    private ps0 onHide;
    private ps0 onShow;
    private ToolbarRequester requester;
    private r71 textToolbarJob;
    private final State derivedData$delegate = SnapshotStateKt.derivedStateOf(new mi2(this, 6));
    private Rect previousContentBounds = Rect.Companion.getZero();

    public TextContextMenuToolbarHandlerNode(ToolbarRequester toolbarRequester, ps0 ps0Var, ps0 ps0Var2, ps0 ps0Var3) {
        this.requester = toolbarRequester;
        this.onShow = ps0Var;
        this.onHide = ps0Var2;
        this.computeContentBounds = ps0Var3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextContextMenuData derivedData_delegate$lambda$0(TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode) {
        return textContextMenuToolbarHandlerNode.isAttached() ? TextContextMenuModifierKt.collectTextContextMenuData(textContextMenuToolbarHandlerNode) : TextContextMenuData.Companion.getEmpty();
    }

    private final TextContextMenuData getDerivedData() {
        return (TextContextMenuData) this.derivedData$delegate.getValue();
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
    public Rect contentBounds(LayoutCoordinates layoutCoordinates) {
        Rect rect;
        if (isAttached() && (rect = (Rect) this.computeContentBounds.invoke(layoutCoordinates)) != null) {
            this.previousContentBounds = rect;
            return rect;
        }
        return this.previousContentBounds;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
    public TextContextMenuData data() {
        return getDerivedData();
    }

    public final ps0 getComputeContentBounds() {
        return this.computeContentBounds;
    }

    public final ps0 getOnHide() {
        return this.onHide;
    }

    public final ps0 getOnShow() {
        return this.onShow;
    }

    public final ToolbarRequester getRequester() {
        return this.requester;
    }

    public final void hide() {
        r71 r71Var = this.textToolbarJob;
        if (r71Var == null) {
            return;
        }
        r71Var.cancel(null);
        this.textToolbarJob = null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.requester.setToolbarHandlerState$foundation(ToolbarHandlerState.Attached);
        this.requester.setToolbarHandlerNode$foundation(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.requester.setToolbarHandlerState$foundation(ToolbarHandlerState.Detached);
        this.requester.setToolbarHandlerNode$foundation(null);
        super.onDetach();
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
    /* renamed from: position-tuRUvjQ */
    public long mo1705positiontuRUvjQ(LayoutCoordinates layoutCoordinates) {
        return contentBounds(layoutCoordinates).m5125getTopLeftF1C5BW0();
    }

    public final void setComputeContentBounds(ps0 ps0Var) {
        this.computeContentBounds = ps0Var;
    }

    public final void setOnHide(ps0 ps0Var) {
        this.onHide = ps0Var;
    }

    public final void setOnShow(ps0 ps0Var) {
        this.onShow = ps0Var;
    }

    public final void setRequester(ToolbarRequester toolbarRequester) {
        this.requester = toolbarRequester;
    }

    public final void show() {
        TextContextMenuProvider textContextMenuProvider;
        if (isAttached()) {
            r71 r71Var = this.textToolbarJob;
            if ((r71Var == null || !r71Var.isActive()) && (textContextMenuProvider = (TextContextMenuProvider) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextContextMenuProviderKt.getLocalTextContextMenuToolbarProvider())) != null) {
                this.textToolbarJob = od4.s(getCoroutineScope(), null, g50.n, new TextContextMenuToolbarHandlerNode$show$1(this, textContextMenuProvider, null), 1);
            }
        }
    }

    public final void update(ToolbarRequester toolbarRequester) {
        this.requester.setToolbarHandlerNode$foundation(null);
        this.requester = toolbarRequester;
        toolbarRequester.setToolbarHandlerNode$foundation(this);
        this.requester.setToolbarHandlerState$foundation(isAttached() ? ToolbarHandlerState.Attached : ToolbarHandlerState.Detached);
    }
}
