package defpackage;

import androidx.compose.foundation.layout.ContextualFlowLayoutKt;
import androidx.compose.foundation.layout.FlowLineInfo;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class v00 implements vs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vs0 b;

    public /* synthetic */ v00(vs0 vs0Var, int i) {
        this.a = i;
        this.b = vs0Var;
    }

    @Override // defpackage.vs0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        int intValue = ((Integer) obj).intValue();
        FlowLineInfo flowLineInfo = (FlowLineInfo) obj2;
        Composer composer = (Composer) obj3;
        int intValue2 = ((Integer) obj4).intValue();
        vs0 vs0Var = this.b;
        switch (i) {
            case 0:
                return ContextualFlowLayoutKt.c(vs0Var, intValue, flowLineInfo, composer, intValue2);
            default:
                return ContextualFlowLayoutKt.b(vs0Var, intValue, flowLineInfo, composer, intValue2);
        }
    }
}
