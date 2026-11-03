package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TouchBoundsExpansion;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import defpackage.jh2;
import defpackage.k4;
import defpackage.sb0;
import defpackage.v42;
import defpackage.vx0;
import defpackage.z42;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class HoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private boolean cursorInBoundsOfNode;
    private DpTouchBoundsExpansion dpTouchBoundsExpansion;
    private PointerIcon icon;
    private boolean overrideDescendants;

    public HoverIconModifierNode(PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
        this.icon = pointerIcon;
        this.overrideDescendants = z;
    }

    public /* synthetic */ HoverIconModifierNode(PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i, sb0 sb0Var) {
        this(pointerIcon, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    private final void displayIcon() {
        PointerIcon pointerIcon;
        HoverIconModifierNode findOverridingAncestorNode = findOverridingAncestorNode();
        if (findOverridingAncestorNode == null || (pointerIcon = findOverridingAncestorNode.icon) == null) {
            pointerIcon = this.icon;
        }
        displayIcon(pointerIcon);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z42, java.lang.Object] */
    private final void displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon() {
        ?? obj = new Object();
        TraversableNodeKt.traverseAncestors(this, new k4(obj, 7));
        HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) obj.a;
        if (hoverIconModifierNode != null) {
            hoverIconModifierNode.displayIcon();
        } else {
            displayIcon(null);
        }
    }

    public static final boolean displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$lambda$0(z42 z42Var, HoverIconModifierNode hoverIconModifierNode) {
        Object obj = z42Var.a;
        if (obj == null && hoverIconModifierNode.cursorInBoundsOfNode) {
            z42Var.a = hoverIconModifierNode;
            return true;
        }
        if (obj == null || !hoverIconModifierNode.overrideDescendants || !hoverIconModifierNode.cursorInBoundsOfNode) {
            return true;
        }
        z42Var.a = hoverIconModifierNode;
        return true;
    }

    private final void displayIconFromCurrentNodeOrDescendantsWithCursorInBounds() {
        HoverIconModifierNode findDescendantNodeWithCursorInBounds;
        if (this.cursorInBoundsOfNode) {
            if (!this.overrideDescendants && (findDescendantNodeWithCursorInBounds = findDescendantNodeWithCursorInBounds()) != null) {
                this = findDescendantNodeWithCursorInBounds;
            }
            this.displayIcon();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v42, java.lang.Object] */
    private final void displayIconIfDescendantsDoNotHavePriority() {
        ?? obj = new Object();
        obj.a = true;
        if (!this.overrideDescendants) {
            TraversableNodeKt.traverseDescendants(this, new vx0(obj, 0));
        }
        if (obj.a) {
            displayIcon();
        }
    }

    public static final TraversableNode.Companion.TraverseDescendantsAction displayIconIfDescendantsDoNotHavePriority$lambda$0(v42 v42Var, HoverIconModifierNode hoverIconModifierNode) {
        if (!hoverIconModifierNode.cursorInBoundsOfNode) {
            return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
        }
        v42Var.a = false;
        return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z42, java.lang.Object] */
    private final HoverIconModifierNode findDescendantNodeWithCursorInBounds() {
        ?? obj = new Object();
        TraversableNodeKt.traverseDescendants(this, new k4(obj, 6));
        return (HoverIconModifierNode) obj.a;
    }

    public static final TraversableNode.Companion.TraverseDescendantsAction findDescendantNodeWithCursorInBounds$lambda$0(z42 z42Var, HoverIconModifierNode hoverIconModifierNode) {
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
        if (hoverIconModifierNode.cursorInBoundsOfNode) {
            z42Var.a = hoverIconModifierNode;
            if (hoverIconModifierNode.overrideDescendants) {
                return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            }
        }
        return traverseDescendantsAction;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z42, java.lang.Object] */
    private final HoverIconModifierNode findOverridingAncestorNode() {
        ?? obj = new Object();
        TraversableNodeKt.traverseAncestors(this, new k4(obj, 5));
        return (HoverIconModifierNode) obj.a;
    }

    public static final boolean findOverridingAncestorNode$lambda$0(z42 z42Var, HoverIconModifierNode hoverIconModifierNode) {
        if (!hoverIconModifierNode.overrideDescendants || !hoverIconModifierNode.cursorInBoundsOfNode) {
            return true;
        }
        z42Var.a = hoverIconModifierNode;
        return true;
    }

    private final void onEnter() {
        this.cursorInBoundsOfNode = true;
        displayIconIfDescendantsDoNotHavePriority();
    }

    private final void onExit() {
        if (this.cursorInBoundsOfNode) {
            this.cursorInBoundsOfNode = false;
            if (isAttached()) {
                displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon();
            }
        }
    }

    public abstract void displayIcon(PointerIcon pointerIcon);

    public final DpTouchBoundsExpansion getDpTouchBoundsExpansion() {
        return this.dpTouchBoundsExpansion;
    }

    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    public final PointerIconService getPointerIconService() {
        return (PointerIconService) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalPointerIconService());
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public long mo284getTouchBoundsExpansionRZrCHBk() {
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.dpTouchBoundsExpansion;
        return dpTouchBoundsExpansion != null ? dpTouchBoundsExpansion.m6901roundToTouchBoundsExpansionTW6G1oQ(DelegatableNodeKt.requireDensity(this)) : TouchBoundsExpansion.Companion.m7108getNoneRZrCHBk();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    /* renamed from: isRelevantPointerType-uerMTgs */
    public abstract boolean mo6494isRelevantPointerTypeuerMTgs(int i);

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        onExit();
    }

    @Override // androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        onExit();
        super.onDetach();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo289onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                if (mo6494isRelevantPointerTypeuerMTgs(changes.get(i).m6594getTypeT8wyACA())) {
                    int m6524getType7fucELk = pointerEvent.m6524getType7fucELk();
                    PointerEventType.Companion companion = PointerEventType.Companion;
                    if (PointerEventType.m6531equalsimpl0(m6524getType7fucELk, companion.m6535getEnter7fucELk())) {
                        onEnter();
                        return;
                    } else {
                        if (PointerEventType.m6531equalsimpl0(pointerEvent.m6524getType7fucELk(), companion.m6536getExit7fucELk())) {
                            onExit();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    public final void setDpTouchBoundsExpansion(DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
    }

    public final void setIcon(PointerIcon pointerIcon) {
        if (jh2.k(this.icon, pointerIcon)) {
            return;
        }
        this.icon = pointerIcon;
        if (this.cursorInBoundsOfNode) {
            displayIconIfDescendantsDoNotHavePriority();
        }
    }

    public final void setOverrideDescendants(boolean z) {
        if (this.overrideDescendants != z) {
            this.overrideDescendants = z;
            boolean z2 = this.cursorInBoundsOfNode;
            if (z) {
                if (z2) {
                    displayIcon();
                }
            } else if (z2) {
                displayIconFromCurrentNodeOrDescendantsWithCursorInBounds();
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final boolean sharePointerInputWithSiblings() {
        return false;
    }
}
