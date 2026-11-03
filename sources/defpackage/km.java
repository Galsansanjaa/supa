package defpackage;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class km {
    public static final zk0[] y = new zk0[0];
    public s3 b;
    public final Context c;
    public final ua4 d;
    public final vu0 e;
    public final vu3 f;
    public um3 i;
    public jm j;
    public IInterface k;
    public ly3 m;
    public final hm o;
    public final im p;
    public final int q;
    public final String r;
    public volatile String s;
    public volatile ea2 t;
    public volatile String a = null;
    public final Object g = new Object();
    public final Object h = new Object();
    public final ArrayList l = new ArrayList();
    public int n = 1;
    public uz u = null;
    public boolean v = false;
    public volatile o44 w = null;
    public final AtomicInteger x = new AtomicInteger(0);

    public km(Context context, Looper looper, ua4 ua4Var, vu0 vu0Var, int i, hm hmVar, im imVar, String str) {
        dn3.p(context, "Context must not be null");
        this.c = context;
        dn3.p(looper, "Looper must not be null");
        dn3.p(ua4Var, "Supervisor must not be null");
        this.d = ua4Var;
        dn3.p(vu0Var, "API availability must not be null");
        this.e = vu0Var;
        this.f = new vu3(this, looper);
        this.q = i;
        this.o = hmVar;
        this.p = imVar;
        this.r = str;
    }

    public final void a() {
        int b = this.e.b(this.c, i());
        if (b == 0) {
            this.j = new mu0(this);
            v(null, 2);
            return;
        }
        v(null, 1);
        this.j = new mu0(this);
        int i = this.x.get();
        vu3 vu3Var = this.f;
        vu3Var.sendMessage(vu3Var.obtainMessage(3, i, b, null));
    }

    public abstract IInterface b(IBinder iBinder);

    public final void c() {
        this.x.incrementAndGet();
        ArrayList arrayList = this.l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((tm3) arrayList.get(i)).d();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.h) {
            this.i = null;
        }
        v(null, 1);
    }

    public final void d(String str) {
        this.a = str;
        c();
    }

    public Account e() {
        return null;
    }

    public zk0[] f() {
        return y;
    }

    public Executor g() {
        return null;
    }

    public Bundle h() {
        return new Bundle();
    }

    public abstract int i();

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(mz0 mz0Var, Set set) {
        String attributionTag;
        Bundle h = h();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag = this.s;
        } else if (this.t == null) {
            attributionTag = this.s;
        } else {
            AttributionSource attributionSource = (AttributionSource) this.t.b;
            attributionTag = attributionSource == null ? this.s : attributionSource.getAttributionTag() == null ? this.s : attributionSource.getAttributionTag();
        }
        String str = attributionTag;
        int i = this.q;
        int i2 = vu0.a;
        Scope[] scopeArr = hu0.y;
        Bundle bundle = new Bundle();
        zk0[] zk0VarArr = hu0.z;
        hu0 hu0Var = new hu0(6, i, i2, null, null, scopeArr, bundle, null, zk0VarArr, zk0VarArr, true, 0, false, str);
        hu0Var.n = this.c.getPackageName();
        hu0Var.q = h;
        if (set != null) {
            hu0Var.p = (Scope[]) set.toArray(new Scope[0]);
        }
        if (r()) {
            Account e = e();
            if (e == null) {
                e = new Account("<<default account>>", "com.google");
            }
            hu0Var.r = e;
            if (mz0Var != 0) {
                hu0Var.o = ((ek3) mz0Var).k;
            }
        }
        hu0Var.s = y;
        hu0Var.t = f();
        if (s()) {
            hu0Var.w = true;
        }
        try {
            synchronized (this.h) {
                try {
                    um3 um3Var = this.i;
                    if (um3Var != null) {
                        um3Var.a(new sx3(this, this.x.get()), hu0Var);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            int i3 = this.x.get();
            vu3 vu3Var = this.f;
            vu3Var.sendMessage(vu3Var.obtainMessage(6, i3, 3));
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.x.get();
            uy3 uy3Var = new uy3(this, 8, null, null);
            vu3 vu3Var2 = this.f;
            vu3Var2.sendMessage(vu3Var2.obtainMessage(1, i4, -1, uy3Var));
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i42 = this.x.get();
            uy3 uy3Var2 = new uy3(this, 8, null, null);
            vu3 vu3Var22 = this.f;
            vu3Var22.sendMessage(vu3Var22.obtainMessage(1, i42, -1, uy3Var2));
        }
    }

    public Set k() {
        return Collections.EMPTY_SET;
    }

    public final IInterface l() {
        IInterface iInterface;
        synchronized (this.g) {
            try {
                if (this.n == 5) {
                    throw new DeadObjectException();
                }
                if (!p()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.k;
                dn3.p(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String m();

    public abstract String n();

    public boolean o() {
        return i() >= 211700000;
    }

    public final boolean p() {
        boolean z;
        synchronized (this.g) {
            z = this.n == 4;
        }
        return z;
    }

    public final boolean q() {
        boolean z;
        synchronized (this.g) {
            int i = this.n;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return this instanceof y72;
    }

    public final /* synthetic */ boolean t(int i, int i2, IInterface iInterface) {
        synchronized (this.g) {
            try {
                if (this.n != i) {
                    return false;
                }
                v(iInterface, i2);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void u() {
        int i;
        int i2;
        synchronized (this.g) {
            i = this.n;
        }
        if (i == 3) {
            this.v = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        vu3 vu3Var = this.f;
        vu3Var.sendMessage(vu3Var.obtainMessage(i2, this.x.get(), 16));
    }

    public final void v(IInterface iInterface, int i) {
        s3 s3Var;
        dn3.j((i == 4) == (iInterface != null));
        synchronized (this.g) {
            try {
                this.n = i;
                this.k = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    ly3 ly3Var = this.m;
                    if (ly3Var != null) {
                        ua4 ua4Var = this.d;
                        String str = this.b.b;
                        dn3.o(str);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        ua4Var.d(str, ly3Var, this.b.c);
                        this.m = null;
                    }
                } else if (i == 2 || i == 3) {
                    ly3 ly3Var2 = this.m;
                    if (ly3Var2 != null && (s3Var = this.b) != null) {
                        String str2 = s3Var.b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        ua4 ua4Var2 = this.d;
                        String str3 = this.b.b;
                        dn3.o(str3);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        ua4Var2.d(str3, ly3Var2, this.b.c);
                        this.x.incrementAndGet();
                    }
                    ly3 ly3Var3 = new ly3(this, this.x.get());
                    this.m = ly3Var3;
                    String n = n();
                    boolean o = o();
                    this.b = new s3(1, n, o);
                    if (o && i() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.b)));
                    }
                    ua4 ua4Var3 = this.d;
                    String str4 = this.b.b;
                    dn3.o(str4);
                    this.b.getClass();
                    String str5 = this.r;
                    if (str5 == null) {
                        str5 = this.c.getClass().getName();
                    }
                    uz c = ua4Var3.c(new a84(str4, this.b.c), ly3Var3, str5, g());
                    if (!(c.b == 0)) {
                        String str6 = this.b.b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str6);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i2 = c.b;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (c.m != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", c.m);
                        }
                        int i3 = this.x.get();
                        vz3 vz3Var = new vz3(this, i2, bundle);
                        vu3 vu3Var = this.f;
                        vu3Var.sendMessage(vu3Var.obtainMessage(7, i3, -1, vz3Var));
                    }
                } else if (i == 4) {
                    dn3.o(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
