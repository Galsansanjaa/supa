package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class us3 implements du3, ut3 {
    public final String a;
    public final HashMap b = new HashMap();

    public us3(String str) {
        this.a = str;
    }

    public abstract du3 a(hg2 hg2Var, List list);

    @Override // defpackage.du3
    public final String b() {
        return this.a;
    }

    @Override // defpackage.du3
    public final Iterator c() {
        return new ot3(this.b.keySet().iterator());
    }

    @Override // defpackage.ut3
    public final du3 d(String str) {
        HashMap hashMap = this.b;
        return hashMap.containsKey(str) ? (du3) hashMap.get(str) : du3.e;
    }

    @Override // defpackage.du3
    public final Boolean e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us3)) {
            return false;
        }
        us3 us3Var = (us3) obj;
        String str = this.a;
        if (str != null) {
            return str.equals(us3Var.a);
        }
        return false;
    }

    @Override // defpackage.du3
    public final du3 f(String str, hg2 hg2Var, ArrayList arrayList) {
        return "toString".equals(str) ? new iu3(this.a) : k93.s(this, new iu3(str), hg2Var, arrayList);
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.ut3
    public final void i(String str, du3 du3Var) {
        HashMap hashMap = this.b;
        if (du3Var == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, du3Var);
        }
    }

    @Override // defpackage.du3
    public final Double j() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.ut3
    public final boolean k(String str) {
        return this.b.containsKey(str);
    }

    @Override // defpackage.du3
    public du3 m() {
        return this;
    }
}
