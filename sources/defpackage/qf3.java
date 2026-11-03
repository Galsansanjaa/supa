package defpackage;

import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class qf3 extends bb1 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf3(Object obj, int i) {
        super(2);
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        String lowerCase;
        int i = this.a;
        vy2 vy2Var = vy2.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                ArrayList arrayList = (ArrayList) obj3;
                Integer valueOf = Integer.valueOf(intValue);
                if (booleanValue) {
                    lowerCase = GBCConsentValue.GRANTED.getValue().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                } else {
                    lowerCase = GBCConsentValue.DENIED.getValue().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                arrayList.add(new dv1(valueOf, lowerCase));
                return vy2Var;
            default:
                int intValue2 = ((Number) obj).intValue();
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                ((LinkedHashMap) obj3).put(String.valueOf(intValue2), bool);
                return vy2Var;
        }
    }
}
