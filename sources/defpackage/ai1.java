package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ai1 implements Map, Serializable, ia1 {
    public static final ai1 x;
    public Object[] a;
    public Object[] b;
    public int[] m;
    public int[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public bi1 t;
    public ci1 u;
    public bi1 v;
    public boolean w;

    static {
        ai1 ai1Var = new ai1(0);
        ai1Var.w = true;
        x = ai1Var;
    }

    public ai1() {
        this(8);
    }

    public ai1(int i) {
        if (i < 0) {
            v5.m("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.a = objArr;
        this.b = null;
        this.m = iArr;
        this.n = new int[highestOneBit];
        this.o = 2;
        this.p = 0;
        this.q = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int j = j(obj);
            int i = this.o * 2;
            int length = this.n.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.n;
                int i3 = iArr[j];
                if (i3 <= 0) {
                    int i4 = this.p;
                    Object[] objArr = this.a;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.p = i5;
                        objArr[i4] = obj;
                        this.m[i4] = j;
                        iArr[j] = i5;
                        this.s++;
                        this.r++;
                        if (i2 > this.o) {
                            this.o = i2;
                        }
                        return i4;
                    }
                    g(1);
                } else {
                    if (jh2.k(this.a[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        k(this.n.length * 2);
                        break;
                    }
                    j = j == 0 ? this.n.length - 1 : j - 1;
                }
            }
        }
    }

    public final ai1 b() {
        c();
        this.w = true;
        if (this.s > 0) {
            return this;
        }
        ai1 ai1Var = x;
        ai1Var.getClass();
        return ai1Var;
    }

    public final void c() {
        if (this.w) {
            z72.f();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.p - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.m;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.n[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        od4.v(this.a, 0, this.p);
        Object[] objArr = this.b;
        if (objArr != null) {
            od4.v(objArr, 0, this.p);
        }
        this.s = 0;
        this.p = 0;
        this.r++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void e(boolean z) {
        int i;
        Object[] objArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.p;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.m;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.n[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        od4.v(this.a, i3, i);
        if (objArr != null) {
            od4.v(objArr, i3, this.p);
        }
        this.p = i3;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        bi1 bi1Var = this.v;
        if (bi1Var != null) {
            return bi1Var;
        }
        bi1 bi1Var2 = new bi1(this, 0);
        this.v = bi1Var2;
        return bi1Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.s == map.size() && f(map.entrySet());
    }

    public final boolean f(Collection collection) {
        boolean k;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int h = h(entry.getKey());
                    if (h < 0) {
                        k = false;
                    } else {
                        Object[] objArr = this.b;
                        objArr.getClass();
                        k = jh2.k(objArr[h], entry.getValue());
                    }
                    if (!k) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void g(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = this.p;
        int i3 = length - i2;
        int i4 = i2 - this.s;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            e(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            n0 n0Var = r0.Companion;
            int length2 = objArr.length;
            n0Var.getClass();
            int e = n0.e(length2, i5);
            Object[] objArr2 = this.a;
            objArr2.getClass();
            this.a = Arrays.copyOf(objArr2, e);
            Object[] objArr3 = this.b;
            this.b = objArr3 != null ? Arrays.copyOf(objArr3, e) : null;
            this.m = Arrays.copyOf(this.m, e);
            int highestOneBit = Integer.highestOneBit((e >= 1 ? e : 1) * 3);
            if (highestOneBit > this.n.length) {
                k(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int h = h(obj);
        if (h < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        return objArr[h];
    }

    public final int h(Object obj) {
        int j = j(obj);
        int i = this.o;
        while (true) {
            int i2 = this.n[j];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (jh2.k(this.a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            j = j == 0 ? this.n.length - 1 : j - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        yh1 yh1Var = new yh1(this, 0);
        int i = 0;
        while (yh1Var.hasNext()) {
            int i2 = yh1Var.b;
            ai1 ai1Var = yh1Var.a;
            if (i2 >= ai1Var.p) {
                f31.b();
                return 0;
            }
            yh1Var.b = i2 + 1;
            yh1Var.m = i2;
            Object obj = ai1Var.a[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ai1Var.b;
            objArr.getClass();
            Object obj2 = objArr[yh1Var.m];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            yh1Var.b();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int i = this.p;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.m[i] >= 0) {
                Object[] objArr = this.b;
                objArr.getClass();
                if (jh2.k(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.s == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.m[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.r
            int r0 = r0 + 1
            r5.r = r0
            int r0 = r5.p
            int r1 = r5.s
            r2 = 0
            if (r0 <= r1) goto L10
            r5.e(r2)
        L10:
            int[] r0 = new int[r6]
            r5.n = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.q = r6
        L1c:
            int r6 = r5.p
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.a
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.o
        L2c:
            int[] r3 = r5.n
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.m
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.String r5 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            defpackage.hu2.h(r5)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai1.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        bi1 bi1Var = this.t;
        if (bi1Var != null) {
            return bi1Var;
        }
        bi1 bi1Var2 = new bi1(this, 1);
        this.t = bi1Var2;
        return bi1Var2;
    }

    public final void l(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.b;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i2 = this.m[i];
        int i3 = this.o * 2;
        int length = this.n.length / 2;
        if (i3 > length) {
            i3 = length;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = i2;
        while (true) {
            i2 = i2 == 0 ? this.n.length - 1 : i2 - 1;
            i5++;
            int i7 = this.o;
            int[] iArr = this.n;
            if (i5 > i7) {
                iArr[i6] = 0;
                break;
            }
            int i8 = iArr[i2];
            if (i8 == 0) {
                iArr[i6] = 0;
                break;
            }
            if (i8 < 0) {
                iArr[i6] = -1;
                i6 = i2;
                i5 = 0;
            } else {
                int i9 = i8 - 1;
                int j = j(this.a[i9]) - i2;
                int[] iArr2 = this.n;
                if ((j & (iArr2.length - 1)) >= i5) {
                    iArr2[i6] = i8;
                    this.m[i9] = i6;
                    i6 = i2;
                    i5 = 0;
                }
                iArr = iArr2;
            }
            i4--;
            if (i4 < 0) {
                iArr[i6] = -1;
                break;
            }
        }
        this.m[i] = -1;
        this.s--;
        this.r++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a = a(obj);
        Object[] objArr = this.b;
        if (objArr == null) {
            int length = this.a.length;
            if (length < 0) {
                v5.m("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.b = objArr;
        }
        if (a >= 0) {
            objArr[a] = obj2;
            return null;
        }
        int i = (-a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a = a(entry.getKey());
            Object[] objArr = this.b;
            if (objArr == null) {
                int length = this.a.length;
                if (length < 0) {
                    v5.m("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.b = objArr;
                }
            }
            if (a >= 0) {
                objArr[a] = entry.getValue();
            } else {
                int i = (-a) - 1;
                if (!jh2.k(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int h = h(obj);
        if (h < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        Object obj2 = objArr[h];
        l(h);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.s;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.s * 3) + 2);
        sb.append("{");
        int i = 0;
        yh1 yh1Var = new yh1(this, 0);
        while (yh1Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = yh1Var.b;
            ai1 ai1Var = yh1Var.a;
            if (i2 >= ai1Var.p) {
                f31.b();
                return null;
            }
            yh1Var.b = i2 + 1;
            yh1Var.m = i2;
            Object obj = ai1Var.a[i2];
            if (obj == ai1Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ai1Var.b;
            objArr.getClass();
            Object obj2 = objArr[yh1Var.m];
            if (obj2 == ai1Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            yh1Var.b();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        ci1 ci1Var = this.u;
        if (ci1Var != null) {
            return ci1Var;
        }
        ci1 ci1Var2 = new ci1(this, 0);
        this.u = ci1Var2;
        return ci1Var2;
    }
}
