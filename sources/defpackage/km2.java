package defpackage;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class km2 {
    public final i2 a;
    public zo b;
    public ka2 c;
    public final sz d;
    public final jw0 e;
    public final Object f;
    public final ma2 g;
    public int h;
    public b42 i;
    public boolean j;
    public boolean k;
    public fz0 l;

    public km2(sz szVar, i2 i2Var, a42 a42Var, jw0 jw0Var, Object obj) {
        this.d = szVar;
        this.a = i2Var;
        this.e = jw0Var;
        bp.m.getClass();
        this.g = new ma2(i2Var, szVar.e, a42Var, jw0Var);
        this.f = obj;
    }

    public final synchronized b42 a() {
        return this.i;
    }

    public final Socket b(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.l = null;
        }
        if (z2) {
            this.k = true;
        }
        b42 b42Var = this.i;
        if (b42Var != null) {
            if (z) {
                b42Var.k = true;
            }
            if (this.l == null && (this.k || b42Var.k)) {
                ArrayList arrayList = b42Var.n;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((Reference) arrayList.get(i)).get() == this) {
                        arrayList.remove(i);
                        if (this.i.n.isEmpty()) {
                            this.i.o = System.nanoTime();
                            bp bpVar = bp.m;
                            b42 b42Var2 = this.i;
                            bpVar.getClass();
                            sz szVar = this.d;
                            szVar.getClass();
                            if (b42Var2.k || szVar.a == 0) {
                                szVar.d.remove(b42Var2);
                                socket = this.i.e;
                                this.i = null;
                                return socket;
                            }
                            szVar.notifyAll();
                        }
                        socket = null;
                        this.i = null;
                        return socket;
                    }
                }
                ak1.i();
            }
        }
        return null;
    }

    public final b42 c(int i, int i2, int i3, boolean z) {
        b42 b42Var;
        boolean z2;
        Socket socket;
        Socket b;
        b42 b42Var2;
        boolean z3;
        ka2 ka2Var;
        boolean z4;
        zo zoVar;
        synchronized (this.d) {
            try {
                if (this.k) {
                    throw new IllegalStateException("released");
                }
                if (this.l != null) {
                    throw new IllegalStateException("codec != null");
                }
                b42Var = this.i;
                z2 = true;
                socket = null;
                b = (b42Var == null || !b42Var.k) ? null : b(false, false, true);
                b42Var2 = this.i;
                if (b42Var2 != null) {
                    b42Var = null;
                } else {
                    b42Var2 = null;
                }
                if (!this.j) {
                    b42Var = null;
                }
                if (b42Var2 == null) {
                    bp bpVar = bp.m;
                    sz szVar = this.d;
                    i2 i2Var = this.a;
                    bpVar.getClass();
                    bp.p(szVar, i2Var, this, null);
                    b42 b42Var3 = this.i;
                    if (b42Var3 != null) {
                        z3 = true;
                        b42Var2 = b42Var3;
                    } else {
                        ka2Var = this.c;
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                ka2Var = null;
            } finally {
            }
        }
        f63.d(b);
        if (b42Var != null) {
            this.e.getClass();
        }
        if (z3) {
            this.e.getClass();
        }
        if (b42Var2 != null) {
            return b42Var2;
        }
        if (ka2Var != null || ((zoVar = this.b) != null && zoVar.b < ((ArrayList) zoVar.c).size())) {
            z4 = false;
        } else {
            this.b = this.g.b();
            z4 = true;
        }
        synchronized (this.d) {
            if (z4) {
                try {
                    zo zoVar2 = this.b;
                    zoVar2.getClass();
                    ArrayList arrayList = new ArrayList((ArrayList) zoVar2.c);
                    int size = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        ka2 ka2Var2 = (ka2) arrayList.get(i4);
                        bp bpVar2 = bp.m;
                        sz szVar2 = this.d;
                        i2 i2Var2 = this.a;
                        bpVar2.getClass();
                        bp.p(szVar2, i2Var2, this, ka2Var2);
                        b42 b42Var4 = this.i;
                        if (b42Var4 != null) {
                            this.c = ka2Var2;
                            z3 = true;
                            b42Var2 = b42Var4;
                            break;
                        }
                        i4++;
                    }
                } finally {
                }
            }
            if (!z3) {
                if (ka2Var == null) {
                    zo zoVar3 = this.b;
                    if (!(zoVar3.b < ((ArrayList) zoVar3.c).size())) {
                        throw new NoSuchElementException();
                    }
                    ArrayList arrayList2 = (ArrayList) zoVar3.c;
                    int i5 = zoVar3.b;
                    zoVar3.b = i5 + 1;
                    ka2Var = (ka2) arrayList2.get(i5);
                }
                this.c = ka2Var;
                this.h = 0;
                b42Var2 = new b42(this.d, ka2Var);
                if (this.i != null) {
                    throw new IllegalStateException();
                }
                this.i = b42Var2;
                this.j = false;
                b42Var2.n.add(new jm2(this, this.f));
            }
        }
        if (z3) {
            this.e.getClass();
            return b42Var2;
        }
        b42Var2.c(i, i2, i3, z, this.e);
        bp bpVar3 = bp.m;
        sz szVar3 = this.d;
        bpVar3.getClass();
        szVar3.e.b(b42Var2.c);
        synchronized (this.d) {
            try {
                this.j = true;
                bp bpVar4 = bp.m;
                sz szVar4 = this.d;
                bpVar4.getClass();
                if (!szVar4.f) {
                    szVar4.f = true;
                    sz.g.execute(szVar4.c);
                }
                szVar4.d.add(b42Var2);
                if (b42Var2.h == null) {
                    z2 = false;
                }
                if (z2) {
                    bp bpVar5 = bp.m;
                    sz szVar5 = this.d;
                    i2 i2Var3 = this.a;
                    bpVar5.getClass();
                    socket = bp.l(szVar5, i2Var3, this);
                    b42Var2 = this.i;
                }
            } finally {
            }
        }
        f63.d(socket);
        this.e.getClass();
        return b42Var2;
    }

    public final b42 d(boolean z, int i, boolean z2, int i2, int i3) {
        while (true) {
            b42 c = c(i, i2, i3, z);
            synchronized (this.d) {
                try {
                    if (c.l == 0) {
                        return c;
                    }
                    if (c.h(z2)) {
                        return c;
                    }
                    e();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e() {
        b42 b42Var;
        Socket b;
        synchronized (this.d) {
            b42Var = this.i;
            b = b(true, false, false);
            if (this.i != null) {
                b42Var = null;
            }
        }
        f63.d(b);
        if (b42Var != null) {
            this.e.getClass();
        }
    }

    public final void f() {
        b42 b42Var;
        Socket b;
        synchronized (this.d) {
            b42Var = this.i;
            b = b(false, true, false);
            if (this.i != null) {
                b42Var = null;
            }
        }
        f63.d(b);
        if (b42Var != null) {
            this.e.getClass();
        }
    }

    public final void g(IOException iOException) {
        b42 b42Var;
        boolean z;
        Socket b;
        synchronized (this.d) {
            try {
                b42Var = null;
                if (iOException instanceof lm2) {
                    int i = ((lm2) iOException).a;
                    if (i == 5) {
                        this.h++;
                    }
                    if (i != 5 || this.h > 1) {
                        this.c = null;
                        z = true;
                    }
                    z = false;
                } else {
                    b42 b42Var2 = this.i;
                    if (b42Var2 != null) {
                        if (!(b42Var2.h != null) || (iOException instanceof vz)) {
                            if (b42Var2.l == 0) {
                                ka2 ka2Var = this.c;
                                if (ka2Var != null && iOException != null) {
                                    this.g.a(ka2Var, iOException);
                                }
                                this.c = null;
                            }
                            z = true;
                        }
                    }
                    z = false;
                }
                b42 b42Var3 = this.i;
                b = b(z, false, true);
                if (this.i == null && this.j) {
                    b42Var = b42Var3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f63.d(b);
        if (b42Var != null) {
            this.e.getClass();
        }
    }

    public final void h(boolean z, fz0 fz0Var, IOException iOException) {
        b42 b42Var;
        Socket b;
        boolean z2;
        this.e.getClass();
        synchronized (this.d) {
            try {
                if (fz0Var != this.l) {
                    throw new IllegalStateException("expected " + this.l + " but was " + fz0Var);
                }
                if (!z) {
                    this.i.l++;
                }
                b42Var = this.i;
                b = b(z, false, true);
                if (this.i != null) {
                    b42Var = null;
                }
                z2 = this.k;
            } catch (Throwable th) {
                throw th;
            }
        }
        f63.d(b);
        if (b42Var != null) {
            this.e.getClass();
        }
        if (iOException != null) {
            this.e.getClass();
        } else if (z2) {
            this.e.getClass();
        }
    }

    public final String toString() {
        b42 a = a();
        return a != null ? a.toString() : this.a.toString();
    }
}
