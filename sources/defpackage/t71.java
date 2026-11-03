package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class t71 extends a81 implements nx {
    public final boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t71(r71 r71Var) {
        super(true);
        boolean z = true;
        L(r71Var);
        Unsafe unsafe = zd.a;
        long j = a81.a;
        xu xuVar = (xu) unsafe.getObjectVolatile(this, j);
        yu yuVar = xuVar instanceof yu ? (yu) xuVar : null;
        if (yuVar != null) {
            a81 j2 = yuVar.j();
            while (!j2.F()) {
                xu xuVar2 = (xu) zd.a.getObjectVolatile(j2, j);
                yu yuVar2 = xuVar2 instanceof yu ? (yu) xuVar2 : null;
                if (yuVar2 != null) {
                    j2 = yuVar2.j();
                }
            }
            this.m = z;
        }
        z = false;
        this.m = z;
    }

    @Override // defpackage.a81
    public final boolean F() {
        return this.m;
    }

    @Override // defpackage.a81
    public final boolean G() {
        return true;
    }
}
