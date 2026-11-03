package defpackage;

import androidx.compose.foundation.layout.ContextualFlowColumnOverflow;
import androidx.compose.foundation.layout.ContextualFlowRowOverflow;
import androidx.compose.foundation.layout.FlowColumnOverflow;
import androidx.compose.foundation.layout.FlowLayoutOverflowState;
import androidx.compose.foundation.layout.FlowRowOverflow;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class u00 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ us0 b;

    public /* synthetic */ u00(us0 us0Var, int i) {
        this.a = i;
        this.b = us0Var;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        us0 us0Var = this.b;
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) obj;
        switch (i) {
            case 0:
                return ContextualFlowColumnOverflow.Companion.a(us0Var, flowLayoutOverflowState);
            case 1:
                return ContextualFlowColumnOverflow.Companion.d(us0Var, flowLayoutOverflowState);
            case 2:
                return ContextualFlowColumnOverflow.Companion.f(us0Var, flowLayoutOverflowState);
            case 3:
                return ContextualFlowRowOverflow.Companion.b(us0Var, flowLayoutOverflowState);
            case 4:
                return ContextualFlowRowOverflow.Companion.e(us0Var, flowLayoutOverflowState);
            case 5:
                return ContextualFlowRowOverflow.Companion.a(us0Var, flowLayoutOverflowState);
            case 6:
                return FlowColumnOverflow.Companion.e(us0Var, flowLayoutOverflowState);
            case 7:
                return FlowColumnOverflow.Companion.f(us0Var, flowLayoutOverflowState);
            case 8:
                return FlowColumnOverflow.Companion.d(us0Var, flowLayoutOverflowState);
            case 9:
                return FlowRowOverflow.Companion.f(us0Var, flowLayoutOverflowState);
            case 10:
                return FlowRowOverflow.Companion.a(us0Var, flowLayoutOverflowState);
            default:
                return FlowRowOverflow.Companion.d(us0Var, flowLayoutOverflowState);
        }
    }
}
