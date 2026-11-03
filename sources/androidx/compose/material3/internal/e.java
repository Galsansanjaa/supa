package androidx.compose.material3.internal;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        DisposableEffectResult BasicEdgeToEdgeDialog$lambda$9$lambda$8;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                BasicEdgeToEdgeDialog$lambda$9$lambda$8 = BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog$lambda$9$lambda$8((DialogWrapper) obj2, (DisposableEffectScope) obj);
                return BasicEdgeToEdgeDialog$lambda$9$lambda$8;
            default:
                return BasicTooltipKt$TooltipPopup$2.a((String) obj2, (SemanticsPropertyReceiver) obj);
        }
    }
}
