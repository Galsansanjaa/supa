package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ae1 implements Map.Entry {
    public ae1 a;
    public ae1 b;
    public ae1 m;
    public ae1 n;
    public ae1 o;
    public final Object p;
    public final boolean q;
    public Object r;
    public int s;

    public ae1(boolean z) {
        this.p = null;
        this.q = z;
        this.o = this;
        this.n = this;
    }

    public ae1(boolean z, ae1 ae1Var, Object obj, ae1 ae1Var2, ae1 ae1Var3) {
        this.a = ae1Var;
        this.p = obj;
        this.q = z;
        this.s = 1;
        this.n = ae1Var2;
        this.o = ae1Var3;
        ae1Var3.n = this;
        ae1Var2.o = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.p;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.r;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.p;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.r;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.p;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.r;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.q) {
            hu2.q("value == null");
            return null;
        }
        Object obj2 = this.r;
        this.r = obj;
        return obj2;
    }

    public final String toString() {
        return this.p + "=" + this.r;
    }
}
