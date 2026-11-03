package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class u91 extends c82 implements us0 {
    public int a;
    public /* synthetic */ rb0 b;
    public final /* synthetic */ zo m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u91(zo zoVar, a10 a10Var) {
        super(3, a10Var);
        this.m = zoVar;
    }

    @Override // defpackage.us0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        u91 u91Var = new u91(this.m, (a10) obj3);
        u91Var.b = (rb0) obj;
        return u91Var.invokeSuspend(vy2.a);
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        zo zoVar = this.m;
        eg0 eg0Var = (eg0) zoVar.c;
        int i = this.a;
        if (i == 0) {
            ta3.H(obj);
            rb0 rb0Var = this.b;
            byte r = eg0Var.r();
            if (r == 1) {
                return zoVar.f(true);
            }
            if (r == 0) {
                return zoVar.f(false);
            }
            if (r != 6) {
                if (r == 8) {
                    return zoVar.d();
                }
                eg0.o(eg0Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.a = 1;
            obj = zoVar.e(rb0Var, this);
            e50 e50Var = e50.a;
            if (obj == e50Var) {
                return e50Var;
            }
        } else {
            if (i != 1) {
                hu2.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ta3.H(obj);
        }
        return (r81) obj;
    }
}
