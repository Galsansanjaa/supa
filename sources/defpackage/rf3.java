package defpackage;

import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.model.ChoiceError;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class rf3 extends bb1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rf3(ih3 ih3Var, int i) {
        super(1);
        this.a = i;
        this.b = ih3Var;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        ChoiceCmpCallback choiceCmpCallback;
        ChoiceCmpCallback choiceCmpCallback2;
        ChoiceCmpCallback choiceCmpCallback3;
        ChoiceCmpCallback choiceCmpCallback4;
        int i = this.a;
        vy2 vy2Var = null;
        ih3 ih3Var = this.b;
        vy2 vy2Var2 = vy2.a;
        switch (i) {
            case 0:
                USRegulationData uSRegulationData = (USRegulationData) obj;
                ih3Var.getClass();
                ih3.c();
                if (uSRegulationData != null && (choiceCmpCallback2 = ih3Var.c) != null) {
                    choiceCmpCallback2.onReceiveUSRegulationsConsent(uSRegulationData);
                    vy2Var = vy2Var2;
                }
                if (vy2Var == null && (choiceCmpCallback = ih3Var.c) != null) {
                    choiceCmpCallback.onCmpError(ChoiceError.ERROR_WHILE_SAVING_CONSENT);
                }
                return vy2Var2;
            case 1:
                USRegulationData uSRegulationData2 = (USRegulationData) obj;
                ih3Var.getClass();
                ih3.c();
                if (uSRegulationData2 != null && (choiceCmpCallback4 = ih3Var.c) != null) {
                    choiceCmpCallback4.onReceiveUSRegulationsConsent(uSRegulationData2);
                    vy2Var = vy2Var2;
                }
                if (vy2Var == null && (choiceCmpCallback3 = ih3Var.c) != null) {
                    choiceCmpCallback3.onCmpError(ChoiceError.ERROR_WHILE_SAVING_CONSENT);
                }
                return vy2Var2;
            default:
                ChoiceCmpCallback choiceCmpCallback5 = ih3Var.c;
                USRegulationData uSRegulationData3 = (USRegulationData) obj;
                if (uSRegulationData3 != null && choiceCmpCallback5 != null) {
                    choiceCmpCallback5.onReceiveUSRegulationsConsent(uSRegulationData3);
                    vy2Var = vy2Var2;
                }
                if (vy2Var == null && choiceCmpCallback5 != null) {
                    choiceCmpCallback5.onCmpError(ChoiceError.ERROR_WHILE_SAVING_CONSENT);
                }
                return vy2Var2;
        }
    }
}
