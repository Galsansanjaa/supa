package androidx.compose.ui.node;

import defpackage.ps0;
import defpackage.sb0;
import defpackage.sc1;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ObserverNodeOwnerScope implements OwnerScope {
    private final ObserverModifierNode observerNode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final ps0 OnObserveReadsChanged = new sc1(21);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final ps0 getOnObserveReadsChanged$ui() {
            return ObserverNodeOwnerScope.OnObserveReadsChanged;
        }
    }

    public ObserverNodeOwnerScope(ObserverModifierNode observerModifierNode) {
        this.observerNode = observerModifierNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy2 OnObserveReadsChanged$lambda$0(ObserverNodeOwnerScope observerNodeOwnerScope) {
        if (observerNodeOwnerScope.isValidOwnerScope()) {
            observerNodeOwnerScope.observerNode.onObservedReadsChanged();
        }
        return vy2.a;
    }

    public final ObserverModifierNode getObserverNode$ui() {
        return this.observerNode;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.observerNode.getNode().isAttached();
    }
}
