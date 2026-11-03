package defpackage;

import com.inmobi.cmp.core.model.Vector;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class dg3 extends bb1 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Vector b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dg3(int i, Vector vector) {
        super(2);
        this.a = i;
        this.b = vector;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        vy2 vy2Var = vy2.a;
        Vector vector = this.b;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (!vector.contains(intValue)) {
                    if (booleanValue) {
                        vector.set(intValue);
                    } else {
                        vector.unset(intValue);
                    }
                }
                return vy2Var;
            case 1:
                int intValue2 = ((Number) obj).intValue();
                if (((Boolean) obj2).booleanValue()) {
                    vector.set(intValue2);
                } else {
                    vector.unset(intValue2);
                }
                return vy2Var;
            default:
                int intValue3 = ((Number) obj).intValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                if (vector.getMap().containsKey(Integer.valueOf(intValue3))) {
                    if (booleanValue2) {
                        vector.set(intValue3);
                    } else {
                        vector.unset(intValue3);
                    }
                }
                return vy2Var;
        }
    }
}
