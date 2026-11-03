package androidx.compose.foundation.selection;

import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SemanticsPropertyReceiver b;

    public /* synthetic */ a(int i, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.a = i;
        this.b = semanticsPropertyReceiver;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        boolean f;
        int i = this.a;
        SemanticsPropertyReceiver semanticsPropertyReceiver = this.b;
        FillableData fillableData = (FillableData) obj;
        switch (i) {
            case 0:
                f = ToggleableNode.f(semanticsPropertyReceiver, fillableData);
                break;
            default:
                f = TriStateToggleableNode.d(semanticsPropertyReceiver, fillableData);
                break;
        }
        return Boolean.valueOf(f);
    }
}
