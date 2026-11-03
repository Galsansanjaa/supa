package j$.time.temporal;

import j$.time.format.a0;
import j$.time.format.b0;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public enum a implements q {
    NANO_OF_SECOND("NanoOfSecond", u.f(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", u.f(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", u.f(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", u.f(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", u.f(0, 999)),
    MILLI_OF_DAY("MilliOfDay", u.f(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", u.f(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", u.f(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", u.f(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", u.f(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", u.f(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", u.f(1, 12)),
    HOUR_OF_DAY("HourOfDay", u.f(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", u.f(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", u.f(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", u.f(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", u.f(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", u.f(1, 7)),
    DAY_OF_MONTH("DayOfMonth", u.g(1, 28, 31), 0),
    DAY_OF_YEAR("DayOfYear", u.g(1, 365, 366)),
    EPOCH_DAY("EpochDay", u.f(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", u.g(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", u.f(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", u.f(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", u.f(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", u.g(1, 999999999, 1000000000)),
    YEAR("Year", u.f(-999999999, 999999999), 0),
    ERA("Era", u.f(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", u.f(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", u.f(-64800, 64800));

    public final String a;
    public final u b;

    static {
        b bVar = b.NANOS;
    }

    a(String str, u uVar) {
        this.a = str;
        this.b = uVar;
    }

    a(String str, u uVar, int i) {
        this.a = str;
        this.b = uVar;
    }

    @Override // j$.time.temporal.q
    public final boolean e(TemporalAccessor temporalAccessor) {
        return temporalAccessor.c(this);
    }

    @Override // j$.time.temporal.q
    public final u f(TemporalAccessor temporalAccessor) {
        return temporalAccessor.g(this);
    }

    @Override // j$.time.temporal.q
    public final TemporalAccessor g(Map map, a0 a0Var, b0 b0Var) {
        return null;
    }

    @Override // j$.time.temporal.q
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // j$.time.temporal.q
    public final long j(TemporalAccessor temporalAccessor) {
        return temporalAccessor.x(this);
    }

    @Override // j$.time.temporal.q
    public final u range() {
        return this.b;
    }

    @Override // j$.time.temporal.q
    public final m t(m mVar, long j) {
        return mVar.a(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    public final void x(long j) {
        this.b.b(j, this);
    }

    public final boolean z() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }
}
