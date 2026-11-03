package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sn3 extends AbstractSet {
    public final int a;
    public final /* synthetic */ tn3 b;

    public sn3(tn3 tn3Var, int i) {
        this.b = tn3Var;
        this.a = i;
    }

    public final int c() {
        int i = this.a;
        if (i == -1) {
            return 0;
        }
        return this.b.b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.b.a, c(), d(), obj, this.a == -1 ? tn3.p : un3.b) >= 0;
    }

    public final int d() {
        return this.b.b[this.a + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new rn3(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return d() - c();
    }
}
