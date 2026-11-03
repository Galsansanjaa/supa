package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class jq0 implements kp0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z42 b;

    public /* synthetic */ jq0(z42 z42Var, int i) {
        this.a = i;
        this.b = z42Var;
    }

    @Override // defpackage.kp0
    public final Object emit(Object obj, a10 a10Var) {
        int i = this.a;
        z42 z42Var = this.b;
        switch (i) {
            case 0:
                z42Var.a = obj;
                throw new d(this);
            default:
                z42Var.a = obj;
                throw new d(this);
        }
    }
}
