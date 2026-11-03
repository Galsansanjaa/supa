package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class be1 extends AbstractMap implements Serializable {
    public static final xd1 s = new xd1(0);
    public final boolean b;
    public ae1 m;
    public final ae1 p;
    public zd1 q;
    public zd1 r;
    public int n = 0;
    public int o = 0;
    public final Comparator a = s;

    public be1(boolean z) {
        this.b = z;
        this.p = new ae1(z);
    }

    public final ae1 a(Object obj, boolean z) {
        int i;
        ae1 ae1Var;
        ae1 ae1Var2 = this.m;
        xd1 xd1Var = s;
        Comparator comparator = this.a;
        if (ae1Var2 != null) {
            Comparable comparable = comparator == xd1Var ? (Comparable) obj : null;
            while (true) {
                Object obj2 = ae1Var2.p;
                i = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i == 0) {
                    return ae1Var2;
                }
                ae1 ae1Var3 = i < 0 ? ae1Var2.b : ae1Var2.m;
                if (ae1Var3 == null) {
                    break;
                }
                ae1Var2 = ae1Var3;
            }
        } else {
            i = 0;
        }
        ae1 ae1Var4 = ae1Var2;
        if (!z) {
            return null;
        }
        ae1 ae1Var5 = this.p;
        if (ae1Var4 != null) {
            ae1Var = new ae1(this.b, ae1Var4, obj, ae1Var5, ae1Var5.o);
            if (i < 0) {
                ae1Var4.b = ae1Var;
            } else {
                ae1Var4.m = ae1Var;
            }
            b(ae1Var4, true);
        } else {
            if (comparator == xd1Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            ae1Var = new ae1(this.b, ae1Var4, obj, ae1Var5, ae1Var5.o);
            this.m = ae1Var;
        }
        this.n++;
        this.o++;
        return ae1Var;
    }

    public final void b(ae1 ae1Var, boolean z) {
        while (ae1Var != null) {
            ae1 ae1Var2 = ae1Var.b;
            ae1 ae1Var3 = ae1Var.m;
            int i = ae1Var2 != null ? ae1Var2.s : 0;
            int i2 = ae1Var3 != null ? ae1Var3.s : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                ae1 ae1Var4 = ae1Var3.b;
                ae1 ae1Var5 = ae1Var3.m;
                int i4 = (ae1Var4 != null ? ae1Var4.s : 0) - (ae1Var5 != null ? ae1Var5.s : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    f(ae1Var);
                } else {
                    g(ae1Var3);
                    f(ae1Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                ae1 ae1Var6 = ae1Var2.b;
                ae1 ae1Var7 = ae1Var2.m;
                int i5 = (ae1Var6 != null ? ae1Var6.s : 0) - (ae1Var7 != null ? ae1Var7.s : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    g(ae1Var);
                } else {
                    f(ae1Var2);
                    g(ae1Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                ae1Var.s = i + 1;
                if (z) {
                    return;
                }
            } else {
                ae1Var.s = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            ae1Var = ae1Var.a;
        }
    }

    public final void c(ae1 ae1Var, boolean z) {
        ae1 ae1Var2;
        ae1 ae1Var3;
        int i;
        if (z) {
            ae1 ae1Var4 = ae1Var.o;
            ae1Var4.n = ae1Var.n;
            ae1Var.n.o = ae1Var4;
        }
        ae1 ae1Var5 = ae1Var.b;
        ae1 ae1Var6 = ae1Var.m;
        ae1 ae1Var7 = ae1Var.a;
        int i2 = 0;
        if (ae1Var5 == null || ae1Var6 == null) {
            if (ae1Var5 != null) {
                e(ae1Var, ae1Var5);
                ae1Var.b = null;
            } else if (ae1Var6 != null) {
                e(ae1Var, ae1Var6);
                ae1Var.m = null;
            } else {
                e(ae1Var, null);
            }
            b(ae1Var7, false);
            this.n--;
            this.o++;
            return;
        }
        if (ae1Var5.s > ae1Var6.s) {
            ae1 ae1Var8 = ae1Var5.m;
            while (true) {
                ae1 ae1Var9 = ae1Var8;
                ae1Var3 = ae1Var5;
                ae1Var5 = ae1Var9;
                if (ae1Var5 == null) {
                    break;
                } else {
                    ae1Var8 = ae1Var5.m;
                }
            }
        } else {
            ae1 ae1Var10 = ae1Var6.b;
            while (true) {
                ae1Var2 = ae1Var6;
                ae1Var6 = ae1Var10;
                if (ae1Var6 == null) {
                    break;
                } else {
                    ae1Var10 = ae1Var6.b;
                }
            }
            ae1Var3 = ae1Var2;
        }
        c(ae1Var3, false);
        ae1 ae1Var11 = ae1Var.b;
        if (ae1Var11 != null) {
            i = ae1Var11.s;
            ae1Var3.b = ae1Var11;
            ae1Var11.a = ae1Var3;
            ae1Var.b = null;
        } else {
            i = 0;
        }
        ae1 ae1Var12 = ae1Var.m;
        if (ae1Var12 != null) {
            i2 = ae1Var12.s;
            ae1Var3.m = ae1Var12;
            ae1Var12.a = ae1Var3;
            ae1Var.m = null;
        }
        ae1Var3.s = Math.max(i, i2) + 1;
        e(ae1Var, ae1Var3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.m = null;
        this.n = 0;
        this.o++;
        ae1 ae1Var = this.p;
        ae1Var.o = ae1Var;
        ae1Var.n = ae1Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        ae1 ae1Var = null;
        if (obj != null) {
            try {
                ae1Var = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return ae1Var != null;
    }

    public final void e(ae1 ae1Var, ae1 ae1Var2) {
        ae1 ae1Var3 = ae1Var.a;
        ae1Var.a = null;
        if (ae1Var2 != null) {
            ae1Var2.a = ae1Var3;
        }
        if (ae1Var3 == null) {
            this.m = ae1Var2;
        } else if (ae1Var3.b == ae1Var) {
            ae1Var3.b = ae1Var2;
        } else {
            ae1Var3.m = ae1Var2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zd1 zd1Var = this.q;
        if (zd1Var != null) {
            return zd1Var;
        }
        zd1 zd1Var2 = new zd1(this, 0);
        this.q = zd1Var2;
        return zd1Var2;
    }

    public final void f(ae1 ae1Var) {
        ae1 ae1Var2 = ae1Var.b;
        ae1 ae1Var3 = ae1Var.m;
        ae1 ae1Var4 = ae1Var3.b;
        ae1 ae1Var5 = ae1Var3.m;
        ae1Var.m = ae1Var4;
        if (ae1Var4 != null) {
            ae1Var4.a = ae1Var;
        }
        e(ae1Var, ae1Var3);
        ae1Var3.b = ae1Var;
        ae1Var.a = ae1Var3;
        int max = Math.max(ae1Var2 != null ? ae1Var2.s : 0, ae1Var4 != null ? ae1Var4.s : 0) + 1;
        ae1Var.s = max;
        ae1Var3.s = Math.max(max, ae1Var5 != null ? ae1Var5.s : 0) + 1;
    }

    public final void g(ae1 ae1Var) {
        ae1 ae1Var2 = ae1Var.b;
        ae1 ae1Var3 = ae1Var.m;
        ae1 ae1Var4 = ae1Var2.b;
        ae1 ae1Var5 = ae1Var2.m;
        ae1Var.b = ae1Var5;
        if (ae1Var5 != null) {
            ae1Var5.a = ae1Var;
        }
        e(ae1Var, ae1Var2);
        ae1Var2.m = ae1Var;
        ae1Var.a = ae1Var2;
        int max = Math.max(ae1Var3 != null ? ae1Var3.s : 0, ae1Var5 != null ? ae1Var5.s : 0) + 1;
        ae1Var.s = max;
        ae1Var2.s = Math.max(max, ae1Var4 != null ? ae1Var4.s : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            ae1 r2 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r2 = r0
        La:
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r2.r
            return r2
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be1.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zd1 zd1Var = this.r;
        if (zd1Var != null) {
            return zd1Var;
        }
        zd1 zd1Var2 = new zd1(this, 1);
        this.r = zd1Var2;
        return zd1Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            hu2.q("key == null");
            return null;
        }
        if (obj2 == null && !this.b) {
            hu2.q("value == null");
            return null;
        }
        ae1 a = a(obj, true);
        Object obj3 = a.r;
        a.r = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            ae1 r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.c(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r2 = r3.r
            return r2
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be1.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.n;
    }
}
