package defpackage;

import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class tv1 implements Comparable {
    public static final String b;
    public final nr a;

    static {
        String str = File.separator;
        str.getClass();
        b = str;
    }

    public tv1(nr nrVar) {
        nrVar.getClass();
        this.a = nrVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int c = c.c(this);
        nr nrVar = this.a;
        if (c == -1) {
            c = 0;
        } else if (c < nrVar.f() && nrVar.k(c) == 92) {
            c++;
        }
        int f = nrVar.f();
        int i = c;
        while (c < f) {
            if (nrVar.k(c) == 47 || nrVar.k(c) == 92) {
                arrayList.add(nrVar.q(i, c));
                i = c + 1;
            }
            c++;
        }
        if (i < nrVar.f()) {
            arrayList.add(nrVar.q(i, nrVar.f()));
        }
        return arrayList;
    }

    public final String b() {
        nr nrVar = c.a;
        nr nrVar2 = this.a;
        int m = nr.m(nrVar2, nrVar);
        if (m == -1) {
            m = nr.m(nrVar2, c.b);
        }
        if (m != -1) {
            nrVar2 = nr.r(nrVar2, m + 1, 0, 2);
        } else if (e() != null && nrVar2.f() == 2) {
            nrVar2 = nr.n;
        }
        return nrVar2.t();
    }

    public final tv1 c() {
        nr nrVar = c.d;
        nr nrVar2 = this.a;
        if (jh2.k(nrVar2, nrVar)) {
            return null;
        }
        nr nrVar3 = c.a;
        if (jh2.k(nrVar2, nrVar3)) {
            return null;
        }
        nr nrVar4 = c.b;
        if (jh2.k(nrVar2, nrVar4)) {
            return null;
        }
        nr nrVar5 = c.e;
        nrVar2.getClass();
        nrVar5.getClass();
        int f = nrVar2.f();
        byte[] bArr = nrVar5.a;
        if (nrVar2.o(f - bArr.length, nrVar5, bArr.length) && (nrVar2.f() == 2 || nrVar2.o(nrVar2.f() - 3, nrVar3, 1) || nrVar2.o(nrVar2.f() - 3, nrVar4, 1))) {
            return null;
        }
        int m = nr.m(nrVar2, nrVar3);
        if (m == -1) {
            m = nr.m(nrVar2, nrVar4);
        }
        if (m == 2 && e() != null) {
            if (nrVar2.f() == 3) {
                return null;
            }
            return new tv1(nr.r(nrVar2, 0, 3, 1));
        }
        if (m == 1) {
            nrVar4.getClass();
            if (nrVar2.o(0, nrVar4, nrVar4.f())) {
                return null;
            }
        }
        if (m != -1 || e() == null) {
            return m == -1 ? new tv1(nrVar) : m == 0 ? new tv1(nr.r(nrVar2, 0, 1, 1)) : new tv1(nr.r(nrVar2, 0, m, 1));
        }
        if (nrVar2.f() == 2) {
            return null;
        }
        return new tv1(nr.r(nrVar2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        tv1 tv1Var = (tv1) obj;
        tv1Var.getClass();
        return this.a.compareTo(tv1Var.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, tq] */
    public final tv1 d(String str) {
        str.getClass();
        ?? obj = new Object();
        obj.G(str);
        return c.a(this, c.d(obj, false), false);
    }

    public final Character e() {
        nr nrVar = c.a;
        nr nrVar2 = this.a;
        if (nr.i(nrVar2, nrVar) != -1 || nrVar2.f() < 2 || nrVar2.k(1) != 58) {
            return null;
        }
        char k = (char) nrVar2.k(0);
        if (('a' > k || k >= '{') && ('A' > k || k >= '[')) {
            return null;
        }
        return Character.valueOf(k);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tv1) && jh2.k(((tv1) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final File toFile() {
        return new File(this.a.t());
    }

    public final String toString() {
        return this.a.t();
    }
}
