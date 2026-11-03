package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ca3 {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public ca3() {
        new AtomicLong(0L);
    }

    @JavascriptInterface
    public final void sendBooleanValue(final long j, final boolean z) {
        this.a.post(new Runnable(j, z) { // from class: ba3
            public final /* synthetic */ long b;

            @Override // java.lang.Runnable
            public final void run() {
                if (ca3.this.b.remove(Long.valueOf(this.b)) == null) {
                    return;
                }
                qq.c();
            }
        });
    }
}
