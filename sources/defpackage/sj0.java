package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class sj0 implements Runnable, Comparable, re0 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public sj0(long j) {
        this.a = j;
    }

    public final pq2 b() {
        Object obj = this._heap;
        if (obj instanceof pq2) {
            return (pq2) obj;
        }
        return null;
    }

    public final int c(long j, tj0 tj0Var, uj0 uj0Var) {
        synchronized (this) {
            if (this._heap == dn3.a) {
                return 2;
            }
            synchronized (tj0Var) {
                try {
                    sj0[] sj0VarArr = tj0Var.a;
                    sj0 sj0Var = sj0VarArr != null ? sj0VarArr[0] : null;
                    int i = uj0.r;
                    if (zd.a.getIntVolatile(uj0Var, uj0.p) == 1) {
                        return 1;
                    }
                    if (sj0Var == null) {
                        tj0Var.c = j;
                    } else {
                        long j2 = sj0Var.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = tj0Var.c;
                        if (j - j3 > 0) {
                            tj0Var.c = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.a - j < 0) {
                        this.a = j;
                    }
                    tj0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((sj0) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(tj0 tj0Var) {
        if (this._heap != dn3.a) {
            this._heap = tj0Var;
        } else {
            v5.m("Failed requirement.");
        }
    }

    @Override // defpackage.re0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                sa4 sa4Var = dn3.a;
                if (obj == sa4Var) {
                    return;
                }
                tj0 tj0Var = obj instanceof tj0 ? (tj0) obj : null;
                if (tj0Var != null) {
                    tj0Var.c(this);
                }
                this._heap = sa4Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
