package j$.time.temporal;

import androidx.compose.animation.core.AnimationKt;
import j$.time.Duration;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public enum b implements s {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");

    public final String a;

    static {
        Duration.g(1L);
        Duration.g(1000L);
        Duration.g(AnimationKt.MillisToNanos);
        Duration.f(1L, 0);
        Duration.f(60L, 0);
        Duration.f(3600L, 0);
        Duration.f(43200L, 0);
        Duration.f(86400L, 0);
        Duration.f(604800L, 0);
        Duration.f(2629746L, 0);
        Duration.f(31556952L, 0);
        Duration.f(315569520L, 0);
        Duration.f(3155695200L, 0);
        Duration.f(31556952000L, 0);
        Duration.f(31556952000000000L, 0);
        Duration.ofSeconds(Long.MAX_VALUE, 999999999L);
    }

    b(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.s
    public final m e(m mVar, long j) {
        return mVar.b(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
