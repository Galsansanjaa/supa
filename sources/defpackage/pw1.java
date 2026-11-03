package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class pw1 implements Iterator, fa1 {
    public final nw1 a;

    public pw1(mw1 mw1Var) {
        tu2[] tu2VarArr = new tu2[8];
        for (int i = 0; i < 8; i++) {
            tu2VarArr[i] = new vu2(this);
        }
        this.a = new nw1(mw1Var, tu2VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.m;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (Map.Entry) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
