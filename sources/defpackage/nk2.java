package defpackage;

import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import androidx.compose.ui.node.TraversableNode;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class nk2 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps0 b;
    public final /* synthetic */ ps0 m;

    public /* synthetic */ nk2(int i, ps0 ps0Var, ps0 ps0Var2) {
        this.a = i;
        this.b = ps0Var;
        this.m = ps0Var2;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 mergedReadObserver$lambda$0;
        vy2 mergedWriteObserver$lambda$0;
        vy2 mergeObservers$lambda$1;
        int i = this.a;
        ps0 ps0Var = this.m;
        ps0 ps0Var2 = this.b;
        switch (i) {
            case 0:
                mergedReadObserver$lambda$0 = SnapshotKt.mergedReadObserver$lambda$0(ps0Var2, ps0Var, obj);
                return mergedReadObserver$lambda$0;
            case 1:
                mergedWriteObserver$lambda$0 = SnapshotKt.mergedWriteObserver$lambda$0(ps0Var2, ps0Var, obj);
                return mergedWriteObserver$lambda$0;
            case 2:
                mergeObservers$lambda$1 = SnapshotObserverKt.mergeObservers$lambda$1(ps0Var2, ps0Var, obj);
                return mergeObservers$lambda$1;
            default:
                return Boolean.valueOf(TextContextMenuModifierKt.a(ps0Var2, ps0Var, (TraversableNode) obj));
        }
    }
}
