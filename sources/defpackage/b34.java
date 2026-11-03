package defpackage;

import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class b34 extends qp3 {
    private static final b34 zzm;
    private static volatile uq3 zzn;
    private int zzb;
    private bq3 zze = xq3.o;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        b34 b34Var = new b34();
        zzm = b34Var;
        qp3.m(b34.class, b34Var);
    }

    public static z24 H() {
        return (z24) zzm.h();
    }

    public final long A() {
        return this.zzh;
    }

    public final boolean B() {
        return (this.zzb & 8) != 0;
    }

    public final int C() {
        return this.zzi;
    }

    public final boolean D() {
        return (this.zzb & 32) != 0;
    }

    public final long E() {
        return this.zzk;
    }

    public final boolean F() {
        return (this.zzb & 64) != 0;
    }

    public final long G() {
        return this.zzl;
    }

    public final /* synthetic */ void I(int i, h34 h34Var) {
        s();
        this.zze.set(i, h34Var);
    }

    public final /* synthetic */ void J(h34 h34Var) {
        h34Var.getClass();
        s();
        this.zze.add(h34Var);
    }

    public final void K(Iterable iterable) {
        s();
        op3.b(iterable, this.zze);
    }

    public final void L() {
        this.zze = xq3.o;
    }

    public final /* synthetic */ void M(int i) {
        s();
        this.zze.remove(i);
    }

    public final /* synthetic */ void N(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void O(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }

    public final /* synthetic */ void P(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    public final /* synthetic */ void Q(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    public final /* synthetic */ void R(long j) {
        this.zzb |= 32;
        this.zzk = j;
    }

    @Override // defpackage.qp3
    public final Object q(int i) {
        uq3 uq3Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new yq3(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", h34.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new b34();
        }
        if (i2 == 4) {
            return new op3(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        uq3 uq3Var2 = zzn;
        if (uq3Var2 != null) {
            return uq3Var2;
        }
        synchronized (b34.class) {
            try {
                uq3Var = zzn;
                if (uq3Var == null) {
                    uq3Var = new pp3(zzm);
                    zzn = uq3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return uq3Var;
    }

    public final /* synthetic */ void r(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    public final void s() {
        bq3 bq3Var = this.zze;
        if (((no3) bq3Var).a) {
            return;
        }
        this.zze = k93.n(bq3Var);
    }

    public final List t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final h34 v(int i) {
        return (h34) this.zze.get(i);
    }

    public final String w() {
        return this.zzf;
    }

    public final boolean x() {
        return (this.zzb & 2) != 0;
    }

    public final long y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzb & 4) != 0;
    }
}
