package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class dz0 {
    public long b;
    public final int c;
    public final xy0 d;
    public ArrayList e;
    public boolean f;
    public final bz0 g;
    public final az0 h;
    public long a = 0;
    public final cz0 i = new cz0(this);
    public final cz0 j = new cz0(this);
    public int k = 0;

    public dz0(int i, xy0 xy0Var, boolean z, boolean z2, ArrayList arrayList) {
        if (xy0Var == null) {
            hu2.q("connection == null");
            throw null;
        }
        this.c = i;
        this.d = xy0Var;
        this.b = xy0Var.y.b();
        bz0 bz0Var = new bz0(this, xy0Var.x.b());
        this.g = bz0Var;
        az0 az0Var = new az0(this);
        this.h = az0Var;
        bz0Var.o = z2;
        az0Var.m = z;
    }

    public final void a() {
        boolean z;
        boolean g;
        synchronized (this) {
            try {
                bz0 bz0Var = this.g;
                if (!bz0Var.o && bz0Var.n) {
                    az0 az0Var = this.h;
                    if (!az0Var.m) {
                        if (az0Var.b) {
                        }
                    }
                    z = true;
                    g = g();
                }
                z = false;
                g = g();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(6);
        } else {
            if (g) {
                return;
            }
            this.d.g(this.c);
        }
    }

    public final void b() {
        az0 az0Var = this.h;
        if (az0Var.b) {
            hu2.p("stream closed");
        } else {
            if (az0Var.m) {
                hu2.p("stream finished");
                return;
            }
            int i = this.k;
            if (i != 0) {
                throw new lm2(i);
            }
        }
    }

    public final void c(int i) {
        if (d(i)) {
            this.d.B.m(this.c, i);
        }
    }

    public final boolean d(int i) {
        synchronized (this) {
            try {
                if (this.k != 0) {
                    return false;
                }
                if (this.g.o && this.h.m) {
                    return false;
                }
                this.k = i;
                notifyAll();
                this.d.g(this.c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final az0 e() {
        synchronized (this) {
            try {
                if (!this.f && !f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.h;
    }

    public final boolean f() {
        return this.d.a == ((this.c & 1) == 1);
    }

    public final synchronized boolean g() {
        try {
            if (this.k != 0) {
                return false;
            }
            bz0 bz0Var = this.g;
            if (!bz0Var.o) {
                if (bz0Var.n) {
                }
                return true;
            }
            az0 az0Var = this.h;
            if (az0Var.m || az0Var.b) {
                if (this.f) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void h() {
        boolean g;
        synchronized (this) {
            this.g.o = true;
            g = g();
            notifyAll();
        }
        if (g) {
            return;
        }
        this.d.g(this.c);
    }

    public final void i(ArrayList arrayList) {
        boolean z;
        synchronized (this) {
            z = true;
            try {
                this.f = true;
                if (this.e == null) {
                    this.e = arrayList;
                    z = g();
                    notifyAll();
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(this.e);
                    arrayList2.add(null);
                    arrayList2.addAll(arrayList);
                    this.e = arrayList2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        this.d.g(this.c);
    }

    public final synchronized void j(int i) {
        if (this.k == 0) {
            this.k = i;
            notifyAll();
        }
    }
}
