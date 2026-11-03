package defpackage;

import androidx.compose.foundation.text.selection.SelectionRegistrar;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class un implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectionRegistrar b;

    public /* synthetic */ un(SelectionRegistrar selectionRegistrar, int i) {
        this.a = i;
        this.b = selectionRegistrar;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        long nextSelectableId;
        int i = this.a;
        SelectionRegistrar selectionRegistrar = this.b;
        switch (i) {
            case 0:
                nextSelectableId = selectionRegistrar.nextSelectableId();
                break;
            default:
                nextSelectableId = selectionRegistrar.nextSelectableId();
                break;
        }
        return Long.valueOf(nextSelectableId);
    }
}
