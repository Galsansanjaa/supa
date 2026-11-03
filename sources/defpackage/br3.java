package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class br3 extends AbstractMap {
    public Object[] a;
    public int b;
    public Map m;
    public boolean n;
    public volatile er3 o;
    public Map p;

    public br3() {
        Map map = Collections.EMPTY_MAP;
        this.m = map;
        this.p = map;
    }

    public final cr3 a(int i) {
        if (i < this.b) {
            return (cr3) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set b() {
        return this.m.isEmpty() ? Collections.EMPTY_SET : this.m.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int f = f(comparable);
        if (f >= 0) {
            return ((cr3) this.a[f]).setValue(obj);
        }
        g();
        Object[] objArr = this.a;
        if (objArr == null) {
            objArr = new Object[16];
            this.a = objArr;
        }
        int i = -(f + 1);
        if (i >= 16) {
            return h().put(comparable, obj);
        }
        if (this.b == 16) {
            cr3 cr3Var = (cr3) objArr[15];
            this.b = 15;
            h().put(cr3Var.a, cr3Var.b);
        }
        Object[] objArr2 = this.a;
        int length = objArr2.length;
        System.arraycopy(objArr2, i, objArr2, i + 1, 15 - i);
        this.a[i] = new cr3(this, comparable, obj);
        this.b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
        }
        if (this.m.isEmpty()) {
            return;
        }
        this.m.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.m.containsKey(comparable);
    }

    public final Object e(int i) {
        g();
        Object[] objArr = this.a;
        Object obj = ((cr3) objArr[i]).b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.b - i) - 1);
        this.b--;
        if (!this.m.isEmpty()) {
            Iterator it = h().entrySet().iterator();
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new cr3(this, (Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.o == null) {
            this.o = new er3(this, 0);
        }
        return this.o;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br3)) {
            return super.equals(obj);
        }
        br3 br3Var = (br3) obj;
        int size = size();
        if (size == br3Var.size()) {
            int i = this.b;
            if (i != br3Var.b) {
                return entrySet().equals(br3Var.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (a(i2).equals(br3Var.a(i2))) {
                }
            }
            if (i != size) {
                return this.m.equals(br3Var.m);
            }
            return true;
        }
        return false;
    }

    public final int f(Comparable comparable) {
        int i = this.b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((cr3) this.a[i2]).a);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((cr3) this.a[i4]).a);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    public final void g() {
        if (this.n) {
            z72.f();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f = f(comparable);
        return f >= 0 ? ((cr3) this.a[f]).b : this.m.get(comparable);
    }

    public final SortedMap h() {
        g();
        if (this.m.isEmpty() && !(this.m instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.m = treeMap;
            this.p = treeMap.descendingMap();
        }
        return (SortedMap) this.m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.a[i3].hashCode();
        }
        return this.m.size() > 0 ? this.m.hashCode() + i2 : i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f = f(comparable);
        if (f >= 0) {
            return e(f);
        }
        if (this.m.isEmpty()) {
            return null;
        }
        return this.m.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.m.size() + this.b;
    }
}
