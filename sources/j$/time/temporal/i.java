package j$.time.temporal;

import j$.time.Duration;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public enum i implements s {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    public final String a;

    static {
        Duration.f(31556952L, 0);
        Duration.f(7889238L, 0);
    }

    i(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.s
    public final m e(m mVar, long j) {
        int i = c.a[ordinal()];
        if (i == 1) {
            return mVar.a(j$.time.a.z(mVar.e(r4), j), j.c);
        }
        if (i == 2) {
            return mVar.b(j / 4, b.YEARS).b((j % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
