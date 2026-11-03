package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class dr3 implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator m;
    public final /* synthetic */ br3 n;

    public final Iterator a() {
        Iterator it = this.m;
        if (it != null) {
            return it;
        }
        Iterator it2 = this.n.m.entrySet().iterator();
        this.m = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a + 1;
        br3 br3Var = this.n;
        return i < br3Var.b || (!br3Var.m.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        br3 br3Var = this.n;
        return i < br3Var.b ? (cr3) br3Var.a[i] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            hu2.h("remove() was called before next()");
            return;
        }
        this.b = false;
        br3 br3Var = this.n;
        br3Var.g();
        int i = this.a;
        if (i >= br3Var.b) {
            a().remove();
        } else {
            this.a = i - 1;
            br3Var.e(i);
        }
    }
}
