package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class so2 implements nf2, nh0 {
    public final nf2 a;
    public final int b;

    public so2(nf2 nf2Var, int i) {
        this.a = nf2Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        z72.l(i, "count must be non-negative, but was ");
        throw null;
    }

    @Override // defpackage.nh0
    public final nf2 a(int i) {
        return i >= this.b ? this : new so2(this.a, i);
    }

    @Override // defpackage.nf2
    public final Iterator iterator() {
        return new s21(this);
    }
}
