package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class tn3 extends AbstractMap {
    public static final xd1 p = new xd1(19);
    public final Object[] a;
    public final int[] b;
    public final sn3 m;
    public Integer n;
    public String o;

    public tn3() {
        List list = Collections.EMPTY_LIST;
        this.m = new sn3(this, -1);
        this.n = null;
        this.o = null;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw lt.u(it);
        }
        int size = list.size();
        Object[] objArr = new Object[size];
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw lt.u(it2);
        }
        int[] iArr = {0};
        this.a = b(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
        this.b = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x016d, code lost:
    
        if (r8 < 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, tn3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [tn3] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tn3(defpackage.tn3 r21, defpackage.tn3 r22) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn3.<init>(tn3, tn3):void");
    }

    public static boolean b(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    public final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        sn3 sn3Var = (sn3) entry.getValue();
        int d = sn3Var.d() - sn3Var.c();
        System.arraycopy(sn3Var.b.a, sn3Var.c(), objArr, i2, d);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new sn3(this, i));
        int i3 = i2 + d;
        iArr[i + 1] = i3;
        return i3;
    }

    public final Map.Entry c(int i) {
        if (i < this.b[0]) {
            return (Map.Entry) this.a[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Integer num = this.n;
        if (num == null) {
            num = Integer.valueOf(super.hashCode());
            this.n = num;
        }
        return num.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        String str = this.o;
        if (str != null) {
            return str;
        }
        String abstractMap = super.toString();
        this.o = abstractMap;
        return abstractMap;
    }
}
