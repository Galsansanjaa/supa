package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class b94 implements ServiceConnection {
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean m;
    public IBinder n;
    public final a84 o;
    public ComponentName p;
    public final /* synthetic */ ua4 q;

    public b94(ua4 ua4Var, a84 a84Var) {
        this.q = ua4Var;
        this.o = a84Var;
    }

    public final uz a(String str, Executor executor) {
        try {
            Intent a = bs3.a(this.q.b, this.o);
            this.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(bw3.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                ua4 ua4Var = this.q;
                a00 a00Var = ua4Var.d;
                Context context = ua4Var.b;
                a84 a84Var = this.o;
                boolean d = a00Var.d(context, str, a, this, 4225, executor);
                this.m = d;
                if (d) {
                    ua4Var.c.sendMessageDelayed(ua4Var.c.obtainMessage(1, a84Var), ua4Var.f);
                    uz uzVar = uz.p;
                    StrictMode.setVmPolicy(vmPolicy);
                    return uzVar;
                }
                this.b = 2;
                try {
                    ua4Var.d.c(ua4Var.b, this);
                } catch (IllegalArgumentException unused) {
                }
                uz uzVar2 = new uz(null, null, 16);
                StrictMode.setVmPolicy(vmPolicy);
                return uzVar2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (lq3 e) {
            return e.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ua4 ua4Var = this.q;
        synchronized (ua4Var.a) {
            try {
                ua4Var.c.removeMessages(1, this.o);
                this.n = iBinder;
                this.p = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ua4 ua4Var = this.q;
        synchronized (ua4Var.a) {
            try {
                ua4Var.c.removeMessages(1, this.o);
                this.n = null;
                this.p = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
