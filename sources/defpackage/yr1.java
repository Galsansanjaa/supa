package defpackage;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class yr1 {
    public final jm3 a;
    public final NsdManager b;
    public xr1 c;
    public wr1 d;
    public vr1 e;
    public NsdServiceInfo f;
    public final ArrayList g;

    public yr1(Context context, jm3 jm3Var) {
        jm3Var.getClass();
        this.a = jm3Var;
        Object systemService = context.getSystemService("servicediscovery");
        systemService.getClass();
        this.b = (NsdManager) systemService;
        this.g = new ArrayList();
    }

    public final void a() {
        if (this.e == null) {
            vr1 vr1Var = new vr1(this);
            this.e = vr1Var;
            try {
                this.b.discoverServices("_nsduptodown._tcp.", 1, vr1Var);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                Object obj = this.a.b;
            }
        }
    }

    public final void b() {
        wr1 wr1Var;
        vr1 vr1Var = this.e;
        NsdManager nsdManager = this.b;
        if (vr1Var != null) {
            try {
                nsdManager.stopServiceDiscovery(vr1Var);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.e = null;
        }
        if (Build.VERSION.SDK_INT >= 34 && (wr1Var = this.d) != null) {
            try {
                nsdManager.unregisterServiceInfoCallback(wr1Var);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.g.clear();
        this.f = null;
    }

    public final void c(NsdServiceInfo nsdServiceInfo) {
        wr1 wr1Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            if (this.d == null) {
                this.d = new wr1(this);
            }
        } else if (this.c == null) {
            this.c = new xr1(this);
        }
        NsdManager nsdManager = this.b;
        if (i < 34) {
            nsdManager.resolveService(nsdServiceInfo, this.c);
            return;
        }
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        if (newSingleThreadScheduledExecutor == null || (wr1Var = this.d) == null) {
            return;
        }
        nsdManager.registerServiceInfoCallback(nsdServiceInfo, newSingleThreadScheduledExecutor, wr1Var);
    }

    public final void d(NsdServiceInfo nsdServiceInfo) {
        String serviceName = nsdServiceInfo.getServiceName();
        String str = k13.s;
        if (str == null) {
            jh2.b0("myNsdServiceName");
            throw null;
        }
        if (jh2.k(serviceName, str)) {
            return;
        }
        this.f = nsdServiceInfo;
        this.a.getClass();
        tr1 tr1Var = k13.z;
        if (tr1Var != null) {
            tr1Var.a();
        }
    }
}
