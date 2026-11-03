package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class u72 implements Closeable {
    public final k72 a;
    public final e12 b;
    public final int m;
    public final String n;
    public final vv0 o;
    public final fw0 p;
    public final v72 q;
    public final u72 r;
    public final u72 s;
    public final u72 t;
    public final long u;
    public final long v;
    public volatile zr w;

    public u72(t72 t72Var) {
        this.a = t72Var.a;
        this.b = t72Var.b;
        this.m = t72Var.c;
        this.n = t72Var.d;
        this.o = t72Var.e;
        ew0 ew0Var = t72Var.f;
        ew0Var.getClass();
        this.p = new fw0(ew0Var);
        this.q = t72Var.g;
        this.r = t72Var.h;
        this.s = t72Var.i;
        this.t = t72Var.j;
        this.u = t72Var.k;
        this.v = t72Var.l;
    }

    public final zr a() {
        zr zrVar = this.w;
        if (zrVar != null) {
            return zrVar;
        }
        zr a = zr.a(this.p);
        this.w = a;
        return a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v72 v72Var = this.q;
        if (v72Var != null) {
            v72Var.close();
        } else {
            hu2.h("response is not eligible for a body and must not be closed");
        }
    }

    public final String d(String str) {
        String a = this.p.a(str);
        if (a != null) {
            return a;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t72] */
    public final t72 e() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.m;
        obj.d = this.n;
        obj.e = this.o;
        obj.f = this.p.c();
        obj.g = this.q;
        obj.h = this.r;
        obj.i = this.s;
        obj.j = this.t;
        obj.k = this.u;
        obj.l = this.v;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.m + ", message=" + this.n + ", url=" + this.a.a + '}';
    }
}
