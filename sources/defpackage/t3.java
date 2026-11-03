package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class t3 {
    public lp a;
    public xy3 b;
    public boolean c;
    public final Object d = new Object();
    public yu3 e;
    public final Context f;
    public final long g;

    public t3(Context context) {
        dn3.o(context);
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext != null ? applicationContext : context;
        this.c = false;
        this.g = -1L;
    }

    public static s3 a(Context context) {
        t3 t3Var = new t3(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            t3Var.c();
            s3 e = t3Var.e();
            d(e, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return e;
        } finally {
        }
    }

    public static void d(s3 s3Var, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (s3Var != null) {
                hashMap.put("limit_ad_tracking", true != s3Var.c ? "0" : "1");
                String str = s3Var.b;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new pi2(hashMap, 1).start();
        }
    }

    public final void b() {
        dn3.n("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f == null || this.a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        a00.b().c(this.f, this.a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.c = false;
                this.b = null;
                this.a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        dn3.n("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    b();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int b = vu0.b.b(context, 12451000);
                    if (b != 0 && b != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    lp lpVar = new lp();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!a00.b().a(context, intent, lpVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.a = lpVar;
                        try {
                            IBinder a = lpVar.a();
                            int i = my3.j;
                            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.b = queryLocalInterface instanceof xy3 ? (xy3) queryLocalInterface : new vx3(a);
                            this.c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new bv0(1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final s3 e() {
        s3 s3Var;
        dn3.n("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        yu3 yu3Var = this.e;
                        if (yu3Var == null || !yu3Var.n) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                dn3.o(this.a);
                dn3.o(this.b);
                try {
                    vx3 vx3Var = (vx3) this.b;
                    vx3Var.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z = true;
                    Parcel a = vx3Var.a(obtain, 1);
                    String readString = a.readString();
                    a.recycle();
                    vx3 vx3Var2 = (vx3) this.b;
                    vx3Var2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = cw3.a;
                    obtain2.writeInt(1);
                    Parcel a2 = vx3Var2.a(obtain2, 2);
                    if (a2.readInt() == 0) {
                        z = false;
                    }
                    a2.recycle();
                    s3Var = new s3(0, readString, z);
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
        return s3Var;
    }

    public final void f() {
        synchronized (this.d) {
            yu3 yu3Var = this.e;
            if (yu3Var != null) {
                yu3Var.m.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new yu3(this, j);
            }
        }
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
