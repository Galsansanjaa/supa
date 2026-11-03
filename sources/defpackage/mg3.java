package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class mg3 extends bb1 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v42 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mg3(v42 v42Var, int i) {
        super(2);
        this.a = i;
        this.b = v42Var;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        vy2 vy2Var = vy2.a;
        v42 v42Var = this.b;
        switch (i) {
            case 0:
                ((Number) obj).intValue();
                if (!((Boolean) obj2).booleanValue()) {
                    v42Var.a = false;
                }
                return vy2Var;
            default:
                ((Number) obj).intValue();
                if (((Boolean) obj2).booleanValue()) {
                    v42Var.a = false;
                }
                return vy2Var;
        }
    }
}
