package androidx.compose.ui;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import defpackage.bl1;
import defpackage.ea0;
import defpackage.jw0;
import defpackage.os0;
import defpackage.ps0;
import defpackage.r00;
import defpackage.r71;
import defpackage.t71;
import defpackage.ts0;
import defpackage.vg1;
import defpackage.y40;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface Modifier {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.ui.Modifier
        public boolean all(ps0 ps0Var) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public boolean any(ps0 ps0Var) {
            return false;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldIn(R r, ts0 ts0Var) {
            return r;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldOut(R r, ts0 ts0Var) {
            return r;
        }

        @Override // androidx.compose.ui.Modifier
        public Modifier then(Modifier modifier) {
            return modifier;
        }

        public String toString() {
            return "Modifier";
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static Modifier then(Modifier modifier, Modifier modifier2) {
            return bl1.a(modifier, modifier2);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public interface Element extends Modifier {

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes.dex */
        public static final class DefaultImpls {
            @Deprecated
            public static boolean all(Element element, ps0 ps0Var) {
                return vg1.a(element, ps0Var);
            }

            @Deprecated
            public static boolean any(Element element, ps0 ps0Var) {
                return vg1.c(element, ps0Var);
            }

            @Deprecated
            public static <R> R foldIn(Element element, R r, ts0 ts0Var) {
                return (R) ts0Var.invoke(r, element);
            }

            @Deprecated
            public static <R> R foldOut(Element element, R r, ts0 ts0Var) {
                return (R) ts0Var.invoke(element, r);
            }

            @Deprecated
            public static Modifier then(Element element, Modifier modifier) {
                return bl1.a(element, modifier);
            }
        }

        @Override // androidx.compose.ui.Modifier
        boolean all(ps0 ps0Var);

        @Override // androidx.compose.ui.Modifier
        boolean any(ps0 ps0Var);

        @Override // androidx.compose.ui.Modifier
        <R> R foldIn(R r, ts0 ts0Var);

        @Override // androidx.compose.ui.Modifier
        <R> R foldOut(R r, ts0 ts0Var);
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static abstract class Node implements DelegatableNode {
        public static final int $stable = 8;
        private Node child;
        private NodeCoordinator coordinator;
        private os0 detachedListener;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;
        private ObserverNodeOwnerScope ownerScope;
        private Node parent;
        private y40 scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;
        private Node node = this;
        private int aggregateChildKindSet = -1;

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public final int getAggregateChildKindSet$ui() {
            return this.aggregateChildKindSet;
        }

        public final Node getChild$ui() {
            return this.child;
        }

        public final NodeCoordinator getCoordinator$ui() {
            return this.coordinator;
        }

        public final y40 getCoroutineScope() {
            y40 y40Var = this.scope;
            if (y40Var != null) {
                return y40Var;
            }
            r00 a = ea0.a(DelegatableNodeKt.requireOwner(this).getCoroutineContext().plus(new t71((r71) DelegatableNodeKt.requireOwner(this).getCoroutineContext().get(jw0.y))));
            this.scope = a;
            return a;
        }

        public final os0 getDetachedListener$ui() {
            return this.detachedListener;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final int getKindSet$ui() {
            return this.kindSet;
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        public final Node getNode() {
            return this.node;
        }

        public final ObserverNodeOwnerScope getOwnerScope$ui() {
            return this.ownerScope;
        }

        public final Node getParent$ui() {
            return this.parent;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final boolean isAttached() {
            return this.isAttached;
        }

        /* renamed from: isKind-H91voCI$ui, reason: not valid java name */
        public final boolean m4813isKindH91voCI$ui(int i) {
            return (getKindSet$ui() & i) != 0;
        }

        public void markAsAttached$ui() {
            if (this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node attached multiple times");
            }
            if (!(this.coordinator != null)) {
                InlineClassHelperKt.throwIllegalStateException("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void markAsDetached$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            y40 y40Var = this.scope;
            if (y40Var != null) {
                ea0.j(y40Var, new ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        public void onAttach() {
        }

        @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
        public void onDensityChange() {
        }

        public void onDetach() {
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        public void onLayoutDirectionChange() {
        }

        public void onReset() {
        }

        public void reset$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("reset() called on an unattached node");
            }
            onReset();
        }

        public void runAttachLifecycle$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            onAttach();
            this.onDetachRunExpected = true;
        }

        public void runDetachLifecycle$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node detached multiple times");
            }
            if (!(this.coordinator != null)) {
                InlineClassHelperKt.throwIllegalStateException("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            os0 os0Var = this.detachedListener;
            if (os0Var != null) {
                os0Var.invoke();
            }
            onDetach();
        }

        public final void setAggregateChildKindSet$ui(int i) {
            this.aggregateChildKindSet = i;
        }

        public void setAsDelegateTo$ui(Node node) {
            this.node = node;
        }

        public final void setChild$ui(Node node) {
            this.child = node;
        }

        public final void setDetachedListener$ui(os0 os0Var) {
            this.detachedListener = os0Var;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui(boolean z) {
            this.insertedNodeAwaitingAttachForInvalidation = z;
        }

        public final void setKindSet$ui(int i) {
            this.kindSet = i;
        }

        public final void setOwnerScope$ui(ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        public final void setParent$ui(Node node) {
            this.parent = node;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui(boolean z) {
            this.updatedNodeAwaitingAttachForInvalidation = z;
        }

        public final void sideEffect(os0 os0Var) {
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(os0Var);
        }

        public void updateCoordinator$ui(NodeCoordinator nodeCoordinator) {
            this.coordinator = nodeCoordinator;
        }
    }

    boolean all(ps0 ps0Var);

    boolean any(ps0 ps0Var);

    <R> R foldIn(R r, ts0 ts0Var);

    <R> R foldOut(R r, ts0 ts0Var);

    Modifier then(Modifier modifier);
}
