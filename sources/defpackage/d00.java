package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class d00 implements nf2 {
    public final AtomicReference a;

    public d00(nf2 nf2Var) {
        this.a = new AtomicReference(nf2Var);
    }

    @Override // defpackage.nf2
    public final Iterator iterator() {
        nf2 nf2Var = (nf2) this.a.getAndSet(null);
        if (nf2Var != null) {
            return nf2Var.iterator();
        }
        hu2.h("This sequence can be consumed only once.");
        return null;
    }
}
