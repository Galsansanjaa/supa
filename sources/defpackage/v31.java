package defpackage;

import androidx.compose.material3.internal.CalendarModelKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class v31 {
    public long a;
    public int b;

    public synchronized long a(int i) {
        if (i != 429 && (i < 500 || i >= 600)) {
            return CalendarModelKt.MillisecondsIn24Hours;
        }
        return (long) Math.min(Math.pow(2.0d, this.b) + ((long) (Math.random() * 1000.0d)), 1800000.0d);
    }

    public synchronized boolean b() {
        boolean z;
        if (this.b != 0) {
            z = System.currentTimeMillis() > this.a;
        }
        return z;
    }

    public synchronized void c() {
        this.b = 0;
    }

    public synchronized void d(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            c();
            return;
        }
        this.b++;
        this.a = System.currentTimeMillis() + a(i);
    }
}
