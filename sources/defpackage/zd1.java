package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class zd1 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ be1 b;

    public /* synthetic */ zd1(be1 be1Var, int i) {
        this.a = i;
        this.b = be1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        be1 be1Var = this.b;
        switch (i) {
            case 0:
                be1Var.clear();
                return;
            default:
                be1Var.clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.a
            be1 r3 = r3.b
            switch(r0) {
                case 0: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r3 = r3.containsKey(r4)
            return r3
        Lc:
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L32
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            r2 = 0
            if (r0 == 0) goto L1f
            ae1 r3 = r3.a(r0, r1)     // Catch: java.lang.ClassCastException -> L1f
            goto L20
        L1f:
            r3 = r2
        L20:
            if (r3 == 0) goto L2f
            java.lang.Object r0 = r3.r
            java.lang.Object r4 = r4.getValue()
            boolean r4 = j$.util.Objects.equals(r0, r4)
            if (r4 == 0) goto L2f
            r2 = r3
        L2f:
            if (r2 == 0) goto L32
            r1 = 1
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd1.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        be1 be1Var = this.b;
        switch (i) {
            case 0:
                return new yd1(be1Var, 0);
            default:
                return new yd1(be1Var, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.a
            r1 = 0
            be1 r5 = r5.b
            r2 = 0
            r3 = 1
            switch(r0) {
                case 0: goto L19;
                default: goto La;
            }
        La:
            if (r6 == 0) goto L10
            ae1 r1 = r5.a(r6, r2)     // Catch: java.lang.ClassCastException -> L10
        L10:
            if (r1 == 0) goto L15
            r5.c(r1, r3)
        L15:
            if (r1 == 0) goto L18
            r2 = r3
        L18:
            return r2
        L19:
            boolean r0 = r6 instanceof java.util.Map.Entry
            if (r0 != 0) goto L1e
            goto L42
        L1e:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r0 = r6.getKey()
            if (r0 == 0) goto L2b
            ae1 r0 = r5.a(r0, r2)     // Catch: java.lang.ClassCastException -> L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            if (r0 == 0) goto L3b
            java.lang.Object r4 = r0.r
            java.lang.Object r6 = r6.getValue()
            boolean r6 = j$.util.Objects.equals(r4, r6)
            if (r6 == 0) goto L3b
            r1 = r0
        L3b:
            if (r1 != 0) goto L3e
            goto L42
        L3e:
            r5.c(r1, r3)
            r2 = r3
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd1.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        be1 be1Var = this.b;
        switch (i) {
            case 0:
                return be1Var.n;
            default:
                return be1Var.n;
        }
    }
}
