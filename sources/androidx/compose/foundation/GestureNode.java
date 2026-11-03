package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.TraversableNode;
import defpackage.sb0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class GestureNode extends Modifier.Node implements TraversableNode, DelegatableNode {
    public static final TraverseKey TraverseKey = new TraverseKey(null);
    private final GestureConnection gestureConnection;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class TraverseKey {
        private TraverseKey() {
        }

        public /* synthetic */ TraverseKey(sb0 sb0Var) {
            this();
        }
    }

    public GestureNode(GestureConnection gestureConnection) {
        this.gestureConnection = gestureConnection;
    }

    public final GestureConnection getGestureConnection() {
        return this.gestureConnection;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return TraverseKey;
    }
}
