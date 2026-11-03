package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class c60 {
    public final Context a;
    public final ca0 b;
    public final dq1 c;
    public final long d;
    public xk0 e;
    public xk0 f;
    public v50 g;
    public final l11 h;
    public final gn0 i;
    public final n4 j;
    public final n4 k;
    public final q50 l;
    public final e60 m;
    public final mu0 n;
    public final p50 o;

    public c60(rn0 rn0Var, l11 l11Var, e60 e60Var, ca0 ca0Var, n4 n4Var, n4 n4Var2, gn0 gn0Var, q50 q50Var, mu0 mu0Var, p50 p50Var) {
        this.b = ca0Var;
        rn0Var.a();
        this.a = rn0Var.a;
        this.h = l11Var;
        this.m = e60Var;
        this.j = n4Var;
        this.k = n4Var2;
        this.i = gn0Var;
        this.l = q50Var;
        this.n = mu0Var;
        this.o = p50Var;
        this.d = System.currentTimeMillis();
        this.c = new dq1(3);
    }

    public final void a(wm0 wm0Var) {
        p50.h();
        p50.h();
        this.e.h();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.j.c(new y50(this));
                this.g.i();
                if (!wm0Var.d().b.a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.g.d(wm0Var)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.g.j(((uo2) ((AtomicReference) wm0Var.r).get()).a);
                c();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(wm0 wm0Var) {
        Future<?> submit = ((n70) this.o.b).a.submit(new w50(this, wm0Var, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final void c() {
        p50.h();
        try {
            xk0 xk0Var = this.e;
            gn0 gn0Var = (gn0) xk0Var.m;
            if (new File((File) gn0Var.n, (String) xk0Var.b).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }
}
