package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.autofill.HintConstants;
import androidx.credentials.CredentialOption;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class c74 extends wz3 {
    public volatile v64 m;
    public volatile v64 n;
    public v64 o;
    public final ConcurrentHashMap p;
    public cy3 q;
    public volatile boolean r;
    public volatile v64 s;
    public v64 t;
    public boolean u;
    public final Object v;

    public c74(t34 t34Var) {
        super(t34Var);
        this.v = new Object();
        this.p = new ConcurrentHashMap();
    }

    public final void A(String str, v64 v64Var, boolean z) {
        v64 v64Var2;
        v64 v64Var3 = this.m == null ? this.n : this.m;
        if (v64Var.b == null) {
            v64Var2 = new v64(v64Var.a, str != null ? x(str) : null, v64Var.c, v64Var.e, v64Var.f, v64Var.g);
        } else {
            v64Var2 = v64Var;
        }
        this.n = this.m;
        this.m = v64Var2;
        t34 t34Var = (t34) this.a;
        t34Var.u.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        n34 n34Var = t34Var.q;
        t34.m(n34Var);
        n34Var.B(new w64(this, v64Var2, v64Var3, elapsedRealtime, z));
    }

    public final void B(v64 v64Var, boolean z, long j) {
        t34 t34Var = (t34) this.a;
        yx3 yx3Var = t34Var.x;
        t34.j(yx3Var);
        t34Var.u.getClass();
        yx3Var.v(SystemClock.elapsedRealtime());
        boolean z2 = v64Var != null && v64Var.d;
        f94 f94Var = t34Var.r;
        t34.l(f94Var);
        if (!f94Var.p.a(j, z2, z) || v64Var == null) {
            return;
        }
        v64Var.d = false;
    }

    public final v64 C(cy3 cy3Var) {
        dn3.o(cy3Var);
        Integer valueOf = Integer.valueOf(cy3Var.a);
        ConcurrentHashMap concurrentHashMap = this.p;
        v64 v64Var = (v64) concurrentHashMap.get(valueOf);
        if (v64Var == null) {
            String x = x(cy3Var.b);
            ra4 ra4Var = ((t34) this.a).s;
            t34.k(ra4Var);
            v64 v64Var2 = new v64(ra4Var.r0(), null, x);
            concurrentHashMap.put(valueOf, v64Var2);
            v64Var = v64Var2;
        }
        return this.s != null ? this.s : v64Var;
    }

    @Override // defpackage.wz3
    public final boolean v() {
        return false;
    }

    public final v64 w(boolean z) {
        t();
        r();
        v64 v64Var = this.o;
        return (z && v64Var == null) ? this.t : v64Var;
    }

    public final String x(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        t34 t34Var = (t34) this.a;
        int length2 = str2.length();
        t34Var.n.getClass();
        if (length2 <= 500) {
            return str2;
        }
        t34Var.n.getClass();
        return str2.substring(0, CredentialOption.PRIORITY_OIDC_OR_SIMILAR);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(defpackage.v64 r20, defpackage.v64 r21, long r22, boolean r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c74.y(v64, v64, long, boolean, android.os.Bundle):void");
    }

    public final void z(cy3 cy3Var, Bundle bundle) {
        Bundle bundle2;
        if (!((t34) this.a).n.H() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.p.put(Integer.valueOf(cy3Var.a), new v64(bundle2.getLong("id"), bundle2.getString(HintConstants.AUTOFILL_HINT_NAME), bundle2.getString("referrer_name")));
    }
}
