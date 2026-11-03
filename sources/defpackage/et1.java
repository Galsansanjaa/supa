package defpackage;

import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditor;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditorKt;
import androidx.compose.runtime.composer.linkbuffer.SlotTableKt;
import androidx.compose.runtime.composer.linkbuffer.changelist.Operation;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class et1 implements SlotTableEditor.VisitSlotsInRememberOrderCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ RememberManager b;

    public /* synthetic */ et1(RememberManager rememberManager, int i) {
        this.a = i;
        this.b = rememberManager;
    }

    @Override // androidx.compose.runtime.composer.linkbuffer.SlotTableEditor.VisitSlotsInRememberOrderCallback
    public final boolean visit(int i, int i2, Object obj) {
        int i3 = this.a;
        RememberManager rememberManager = this.b;
        switch (i3) {
            case 0:
                return Operation.RemoveTailGroupsAndValues.a(rememberManager, i, i2, obj);
            case 1:
                return SlotTableEditorKt.b(rememberManager, i, i2, obj);
            case 2:
                return SlotTableKt.b(rememberManager, i, i2, obj);
            default:
                return SlotTableKt.a(rememberManager, i, i2, obj);
        }
    }
}
