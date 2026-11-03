package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class vt2 implements Runnable {
    public static final Object q = new Object();
    public static Boolean r;
    public static Boolean s;
    public final /* synthetic */ int a;
    public final long b;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;

    public vt2(c74 c74Var, Bundle bundle, v64 v64Var, v64 v64Var2, long j) {
        this.a = 3;
        this.m = bundle;
        this.n = v64Var;
        this.o = v64Var2;
        this.b = j;
        Objects.requireNonNull(c74Var);
        this.p = c74Var;
    }

    public /* synthetic */ vt2(Object obj, String str, String str2, Object obj2, long j, int i) {
        this.a = i;
        this.m = str;
        this.n = str2;
        this.o = obj2;
        this.b = j;
        this.p = obj;
    }

    public vt2(tt2 tt2Var, Context context, m30 m30Var, long j) {
        this.a = 0;
        this.p = tt2Var;
        this.m = context;
        this.b = j;
        this.n = m30Var;
        this.o = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (q) {
            try {
                Boolean bool = s;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                s = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (q) {
            try {
                Boolean bool = r;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                r = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public synchronized boolean d() {
        boolean z;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.m).getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        Object obj = this.o;
        Object obj2 = this.n;
        Object obj3 = this.p;
        Object obj4 = this.m;
        switch (i) {
            case 0:
                tt2 tt2Var = (tt2) obj3;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
                Context context = (Context) obj4;
                if (c(context)) {
                    wakeLock.acquire(180000L);
                }
                try {
                    try {
                        tt2Var.c(true);
                        if (!((m30) obj2).f()) {
                            tt2Var.c(false);
                            if (!c(context)) {
                                return;
                            }
                        } else if (!a(context) || d()) {
                            if (tt2Var.d()) {
                                tt2Var.c(false);
                            } else {
                                tt2Var.e(j);
                            }
                            if (!c(context)) {
                                return;
                            }
                        } else {
                            new ut2(this, this).a();
                            if (!c(context)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                        tt2Var.c(false);
                        if (!c(context)) {
                            return;
                        }
                    }
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                } catch (Throwable th) {
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            case 1:
                String str = (String) obj2;
                ja4 ja4Var = ((r44) obj3).j;
                String str2 = (String) obj4;
                if (str2 == null) {
                    ja4Var.c().r();
                    String str3 = ja4Var.Q;
                    if (str3 == null || str3.equals(str)) {
                        ja4Var.Q = str;
                        ja4Var.P = null;
                        return;
                    }
                    return;
                }
                v64 v64Var = new v64(j, (String) obj, str2);
                ja4Var.c().r();
                String str4 = ja4Var.Q;
                if (str4 != null) {
                    str4.equals(str);
                }
                ja4Var.Q = str;
                ja4Var.P = v64Var;
                return;
            case 2:
                ((m64) obj3).D(this.b, this.o, (String) obj4, (String) obj2);
                return;
            default:
                Bundle bundle = (Bundle) obj4;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                c74 c74Var = (c74) obj3;
                ra4 ra4Var = ((t34) c74Var.a).s;
                t34.k(ra4Var);
                c74Var.y((v64) obj2, (v64) obj, this.b, true, ra4Var.C("screen_view", bundle, null, false));
                return;
        }
    }
}
