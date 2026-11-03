package defpackage;

import androidx.compose.material3.LabelKt;
import androidx.compose.ui.platform.ViewCompositionStrategy;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ab1 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z42 b;

    public /* synthetic */ ab1(z42 z42Var, int i) {
        this.a = i;
        this.b = z42Var;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        z42 z42Var = this.b;
        switch (i) {
            case 0:
                return LabelKt.b(z42Var);
            default:
                return ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.b(z42Var);
        }
    }
}
