package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class rn3 implements Iterator {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ AbstractSet m;

    public /* synthetic */ rn3(AbstractSet abstractSet, int i) {
        this.a = i;
        this.m = abstractSet;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        AbstractSet abstractSet = this.m;
        switch (i) {
            case 0:
                sn3 sn3Var = (sn3) abstractSet;
                return this.b < sn3Var.d() - sn3Var.c();
            default:
                return this.b < ((bf4) ((er3) abstractSet).b).e;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        AbstractSet abstractSet = this.m;
        switch (i) {
            case 0:
                int i2 = this.b;
                sn3 sn3Var = (sn3) abstractSet;
                if (i2 >= sn3Var.d() - sn3Var.c()) {
                    f31.b();
                    return null;
                }
                tn3 tn3Var = sn3Var.b;
                Object obj = tn3Var.a[sn3Var.c() + i2];
                this.b = i2 + 1;
                return obj;
            default:
                int i3 = this.b;
                this.b = i3 + 1;
                bf4 bf4Var = (bf4) ((er3) abstractSet).b;
                return bf4Var.d(bf4Var.d[i3] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
