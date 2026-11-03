package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class o74 extends qp3 {
    private static final o74 zzh;
    private static volatile uq3 zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        o74 o74Var = new o74();
        zzh = o74Var;
        qp3.m(o74.class, o74Var);
    }

    public static n74 x() {
        return (n74) zzh.h();
    }

    public static o74 y() {
        return zzh;
    }

    public final /* synthetic */ void A(long j) {
        this.zze = 1;
        this.zzf = Long.valueOf(j);
    }

    public final /* synthetic */ void B(boolean z) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z);
    }

    public final /* synthetic */ void C(double d) {
        this.zze = 3;
        this.zzf = Double.valueOf(d);
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }

    public final /* synthetic */ void E(uo3 uo3Var) {
        uo3Var.getClass();
        this.zze = 5;
        this.zzf = uo3Var;
    }

    public final int F() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    @Override // defpackage.qp3
    public final Object q(int i) {
        uq3 uq3Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new yq3(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i2 == 3) {
            return new o74();
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
        synchronized (o74.class) {
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

    public final String r() {
        return this.zzg;
    }

    public final long s() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean t() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double u() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String v() {
        return this.zze == 4 ? (String) this.zzf : "";
    }

    public final vo3 w() {
        return this.zze == 5 ? (vo3) this.zzf : vo3.b;
    }

    public final /* synthetic */ void z(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }
}
