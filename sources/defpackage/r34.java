package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class r34 extends qp3 {
    private static final r34 zzi;
    private static volatile uq3 zzj;
    private int zzb;
    private bq3 zze = xq3.o;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        r34 r34Var = new r34();
        zzi = r34Var;
        qp3.m(r34.class, r34Var);
    }

    public static o34 y() {
        return (o34) zzi.h();
    }

    public static o34 z(r34 r34Var) {
        op3 h = zzi.h();
        h.f(r34Var);
        return (o34) h;
    }

    public final /* synthetic */ void A(int i, w34 w34Var) {
        G();
        this.zze.set(i, w34Var);
    }

    public final /* synthetic */ void B(w34 w34Var) {
        G();
        this.zze.add(w34Var);
    }

    public final void C(ArrayList arrayList) {
        G();
        op3.b(arrayList, this.zze);
    }

    public final void D() {
        this.zze = xq3.o;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final void G() {
        bq3 bq3Var = this.zze;
        if (((no3) bq3Var).a) {
            return;
        }
        this.zze = k93.n(bq3Var);
    }

    @Override // defpackage.qp3
    public final Object q(int i) {
        uq3 uq3Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new yq3(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", w34.class, "zzf", "zzg", "zzh", ho3.k});
        }
        if (i2 == 3) {
            return new r34();
        }
        if (i2 == 4) {
            return new op3(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        uq3 uq3Var2 = zzj;
        if (uq3Var2 != null) {
            return uq3Var2;
        }
        synchronized (r34.class) {
            try {
                uq3Var = zzj;
                if (uq3Var == null) {
                    uq3Var = new pp3(zzi);
                    zzj = uq3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return uq3Var;
    }

    public final List r() {
        return this.zze;
    }

    public final int s() {
        return this.zze.size();
    }

    public final w34 t(int i) {
        return (w34) this.zze.get(i);
    }

    public final boolean u() {
        return (this.zzb & 1) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 2) != 0;
    }

    public final String x() {
        return this.zzg;
    }
}
