package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class yt extends xt {
    public final /* synthetic */ int n;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yt(Object obj, j20 j20Var, int i, vq vqVar, int i2) {
        super(j20Var, i, vqVar);
        this.n = i2;
        this.o = obj;
    }

    @Override // defpackage.xt
    public Object e(tz1 tz1Var, a10 a10Var) {
        int i = this.n;
        vy2 vy2Var = vy2.a;
        Object obj = this.o;
        switch (i) {
            case 0:
                Object invoke = ((ts0) obj).invoke(tz1Var, a10Var);
                return invoke == e50.a ? invoke : vy2Var;
            default:
                mf2 mf2Var = new mf2(tz1Var);
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    od4.s(tz1Var, null, null, new ta((jp0) it.next(), mf2Var, (a10) null, 12), 3);
                }
                return vy2Var;
        }
    }

    @Override // defpackage.xt
    public xt f(j20 j20Var, int i, vq vqVar) {
        int i2 = this.n;
        Object obj = this.o;
        switch (i2) {
            case 0:
                return new yt((ts0) obj, j20Var, i, vqVar, 0);
            default:
                return new yt((Iterable) obj, j20Var, i, vqVar, 1);
        }
    }

    @Override // defpackage.xt
    public vt h(y40 y40Var) {
        switch (this.n) {
            case 1:
                ts0 taVar = new ta(this, null, 10);
                sz1 sz1Var = new sz1(od4.t(y40Var, this.a), dn3.a(this.b, 4, vq.a));
                sz1Var.e0(g50.a, sz1Var, taVar);
                return sz1Var;
            default:
                return super.h(y40Var);
        }
    }

    @Override // defpackage.xt
    public String toString() {
        switch (this.n) {
            case 0:
                return "block[" + ((ts0) this.o) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }
}
