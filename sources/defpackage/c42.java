package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class c42 {
    public final ArrayList a;
    public final km2 b;
    public final fz0 c;
    public final b42 d;
    public final int e;
    public final k72 f;
    public final a42 g;
    public final jw0 h;
    public final int i;
    public final int j;
    public final int k;
    public int l;

    public c42(ArrayList arrayList, km2 km2Var, fz0 fz0Var, b42 b42Var, int i, k72 k72Var, a42 a42Var, jw0 jw0Var, int i2, int i3, int i4) {
        this.a = arrayList;
        this.d = b42Var;
        this.b = km2Var;
        this.c = fz0Var;
        this.e = i;
        this.f = k72Var;
        this.g = a42Var;
        this.h = jw0Var;
        this.i = i2;
        this.j = i3;
        this.k = i4;
    }

    public final u72 a(k72 k72Var) {
        return b(k72Var, this.b, this.c, this.d);
    }

    public final u72 b(k72 k72Var, km2 km2Var, fz0 fz0Var, b42 b42Var) {
        k72 k72Var2;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = this.e;
        if (i >= size) {
            throw new AssertionError();
        }
        this.l++;
        fz0 fz0Var2 = this.c;
        if (fz0Var2 != null) {
            k72Var2 = k72Var;
            if (!this.d.j(k72Var2.a)) {
                sn0.o(arrayList.get(i - 1), "network interceptor ", " must retain the same host and port");
                return null;
            }
        } else {
            k72Var2 = k72Var;
        }
        if (fz0Var2 != null && this.l > 1) {
            sn0.o(arrayList.get(i - 1), "network interceptor ", " must call proceed() exactly once");
            return null;
        }
        int i2 = i + 1;
        c42 c42Var = new c42(arrayList, km2Var, fz0Var, b42Var, i2, k72Var2, this.g, this.h, this.i, this.j, this.k);
        n61 n61Var = (n61) arrayList.get(i);
        u72 a = n61Var.a(c42Var);
        if (fz0Var != null && i2 < arrayList.size() && c42Var.l != 1) {
            f31.e(n61Var, "network interceptor ", " must call proceed() exactly once");
            return null;
        }
        if (a != null) {
            if (a.q != null) {
                return a;
            }
            f31.e(n61Var, "interceptor ", " returned a response with no body");
            return null;
        }
        throw new NullPointerException("interceptor " + n61Var + " returned null");
    }
}
