package defpackage;

import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.BasicTooltipState;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class fo implements os0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ y40 b;
    public final /* synthetic */ BasicTooltipState m;

    public /* synthetic */ fo(BasicTooltipState basicTooltipState, y40 y40Var) {
        this.m = basicTooltipState;
        this.b = y40Var;
    }

    public /* synthetic */ fo(y40 y40Var, BasicTooltipState basicTooltipState) {
        this.b = y40Var;
        this.m = basicTooltipState;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        BasicTooltipState basicTooltipState = this.m;
        y40 y40Var = this.b;
        switch (i) {
            case 0:
                return BasicTooltipKt.i(y40Var, basicTooltipState);
            default:
                return Boolean.valueOf(BasicTooltipKt.b(y40Var, basicTooltipState));
        }
    }
}
