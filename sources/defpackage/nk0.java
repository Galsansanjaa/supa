package defpackage;

import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.runtime.retain.RetainedEffectImpl;
import androidx.compose.runtime.retain.RetainedEffectKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class nk0 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps0 b;

    public /* synthetic */ nk0(ps0 ps0Var, int i) {
        this.a = i;
        this.b = ps0Var;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        RetainedEffectImpl RetainedEffect$lambda$1$0;
        RetainedEffectImpl RetainedEffect$lambda$0$0;
        RetainedEffectImpl RetainedEffect$lambda$2$0;
        RetainedEffectImpl RetainedEffect$lambda$3$0;
        int i = this.a;
        ps0 ps0Var = this.b;
        switch (i) {
            case 0:
                return ExposedDropdownMenuKt.f(ps0Var);
            case 1:
                RetainedEffect$lambda$1$0 = RetainedEffectKt.RetainedEffect$lambda$1$0(ps0Var);
                return RetainedEffect$lambda$1$0;
            case 2:
                RetainedEffect$lambda$0$0 = RetainedEffectKt.RetainedEffect$lambda$0$0(ps0Var);
                return RetainedEffect$lambda$0$0;
            case 3:
                RetainedEffect$lambda$2$0 = RetainedEffectKt.RetainedEffect$lambda$2$0(ps0Var);
                return RetainedEffect$lambda$2$0;
            case 4:
                RetainedEffect$lambda$3$0 = RetainedEffectKt.RetainedEffect$lambda$3$0(ps0Var);
                return RetainedEffect$lambda$3$0;
            default:
                return SearchBarKt.A(ps0Var);
        }
    }
}
