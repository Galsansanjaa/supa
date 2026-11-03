package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class f44 extends qp3 {
    private static final f44 zzh;
    private static volatile uq3 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [qp3, f44] */
    static {
        ?? qp3Var = new qp3();
        zzh = qp3Var;
        qp3.m(f44.class, qp3Var);
    }

    public static e44 s() {
        return (e44) zzh.h();
    }

    public static f44 t() {
        return zzh;
    }

    @Override // defpackage.qp3
    public final Object q(int i) {
        uq3 uq3Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new yq3(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", ho3.o, "zzf", ho3.m, "zzg", ho3.n});
        }
        if (i2 == 3) {
            return new qp3();
        }
        if (i2 == 4) {
            return new op3(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        uq3 uq3Var2 = zzi;
        if (uq3Var2 != null) {
            return uq3Var2;
        }
        synchronized (f44.class) {
            try {
                uq3Var = zzi;
                if (uq3Var == null) {
                    uq3Var = new pp3(zzh);
                    zzi = uq3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return uq3Var;
    }

    public final int r() {
        int c = k93.c(this.zzf);
        if (c == 0) {
            return 1;
        }
        return c;
    }

    public final void u(int i) {
        this.zzf = k93.g(i);
        this.zzb |= 2;
    }

    public final int v() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int w() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i3 = 5;
                        if (i2 != 4) {
                            i = i2 != 5 ? 0 : 6;
                        }
                    }
                }
                i = i3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void x(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void y(int i) {
        this.zzg = i - 1;
        this.zzb |= 4;
    }
}
