package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.collection.ArrayMap;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class tt2 {
    public final Context a;
    public final m30 b;
    public final p50 c;
    public final ScheduledThreadPoolExecutor e;
    public final rt2 g;
    public final ArrayMap d = new ArrayMap();
    public boolean f = false;

    public tt2(m30 m30Var, rt2 rt2Var, p50 p50Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = m30Var;
        this.g = rt2Var;
        this.c = p50Var;
        this.a = context;
        this.e = scheduledThreadPoolExecutor;
    }

    public static boolean a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(qt2 qt2Var) {
        synchronized (this.d) {
            try {
                String str = qt2Var.c;
                if (this.d.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.d.get(str);
                    uo2 uo2Var = (uo2) arrayDeque.poll();
                    if (uo2Var != null) {
                        uo2Var.b(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.d.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void c(boolean z) {
        this.f = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6 A[Catch: IOException -> 0x0085, TRY_LEAVE, TryCatch #0 {IOException -> 0x0085, blocks: (B:8:0x002a, B:13:0x00d0, B:15:0x00d6, B:19:0x003c, B:21:0x0044, B:23:0x0072, B:26:0x0087, B:28:0x008f, B:30:0x00bd), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt2.d():boolean");
    }

    public final void e(long j) {
        this.e.schedule(new vt2(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        c(true);
    }
}
