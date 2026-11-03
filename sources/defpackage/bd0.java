package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class bd0 implements nf2 {
    public final /* synthetic */ int a;
    public final Object b;
    public final rs0 c;

    public bd0(CharSequence charSequence, ts0 ts0Var) {
        this.a = 0;
        charSequence.getClass();
        this.b = charSequence;
        this.c = ts0Var;
    }

    public /* synthetic */ bd0(nf2 nf2Var, ps0 ps0Var, int i) {
        this.a = i;
        this.b = nf2Var;
        this.c = ps0Var;
    }

    public bd0(os0 os0Var, ps0 ps0Var) {
        this.a = 2;
        os0Var.getClass();
        this.b = os0Var;
        this.c = ps0Var;
    }

    @Override // defpackage.nf2
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ad0(this);
            case 1:
                return new nn0(this);
            case 2:
                return new xt0(this);
            default:
                return new fu2(this);
        }
    }
}
