package defpackage;

import android.content.Context;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ye2 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectionManager b;

    public /* synthetic */ ye2(SelectionManager selectionManager, int i) {
        this.a = i;
        this.b = selectionManager;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        vy2 addSelectionContainerTextContextMenuComponents$lambda$0;
        int i = this.a;
        SelectionManager selectionManager = this.b;
        switch (i) {
            case 0:
                return SelectionManager.n(selectionManager, ((Boolean) obj).booleanValue(), ((Long) obj2).longValue());
            default:
                addSelectionContainerTextContextMenuComponents$lambda$0 = SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0(selectionManager, (TextContextMenuBuilderScope) obj, (Context) obj2);
                return addSelectionContainerTextContextMenuComponents$lambda$0;
        }
    }
}
