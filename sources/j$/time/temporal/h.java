package j$.time.temporal;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.a0;
import j$.time.format.b0;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public abstract class h implements q {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ h[] b;

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.q
            public final boolean e(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.c(a.DAY_OF_YEAR) || !temporalAccessor.c(a.MONTH_OF_YEAR) || !temporalAccessor.c(a.YEAR)) {
                    return false;
                }
                h hVar2 = j.a;
                return Chronology.CC.a(temporalAccessor).equals(j$.time.chrono.q.d);
            }

            @Override // j$.time.temporal.q
            public final u f(TemporalAccessor temporalAccessor) {
                if (!e(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: DayOfQuarter");
                }
                long x = temporalAccessor.x(h.QUARTER_OF_YEAR);
                if (x == 1) {
                    return j$.time.chrono.q.d.J(temporalAccessor.x(a.YEAR)) ? u.f(1L, 91L) : u.f(1L, 90L);
                }
                return x == 2 ? u.f(1L, 91L) : (x == 3 || x == 4) ? u.f(1L, 92L) : range();
            }

            @Override // j$.time.temporal.h, j$.time.temporal.q
            public final TemporalAccessor g(Map map, a0 a0Var, b0 b0Var) {
                LocalDate of;
                long j;
                a aVar = a.YEAR;
                HashMap hashMap = (HashMap) map;
                Long l = (Long) hashMap.get(aVar);
                q qVar = h.QUARTER_OF_YEAR;
                Long l2 = (Long) hashMap.get(qVar);
                if (l != null && l2 != null) {
                    int a2 = aVar.b.a(l.longValue(), aVar);
                    long longValue = ((Long) hashMap.get(h.DAY_OF_QUARTER)).longValue();
                    h hVar2 = j.a;
                    if (Chronology.CC.a(a0Var).equals(j$.time.chrono.q.d)) {
                        if (b0Var == b0.LENIENT) {
                            of = LocalDate.of(a2, 1, 1).plusMonths(j$.time.a.E(j$.time.a.F(l2.longValue(), 1L), 3L));
                            j = j$.time.a.F(longValue, 1L);
                        } else {
                            of = LocalDate.of(a2, ((qVar.range().a(l2.longValue(), qVar) - 1) * 3) + 1, 1);
                            if (longValue < 1 || longValue > 90) {
                                if (b0Var == b0.STRICT) {
                                    f(of).b(longValue, this);
                                } else {
                                    range().b(longValue, this);
                                }
                            }
                            j = longValue - 1;
                        }
                        hashMap.remove(this);
                        hashMap.remove(aVar);
                        hashMap.remove(qVar);
                        return of.V(j);
                    }
                    j$.time.f.k("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.q
            public final long j(TemporalAccessor temporalAccessor) {
                if (!e(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.e(a.DAY_OF_YEAR) - h.a[((temporalAccessor.e(a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.q.d.J(temporalAccessor.x(a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.q
            public final u range() {
                return u.g(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.q
            public final m t(m mVar, long j) {
                long j2 = j(mVar);
                range().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.a((j - j2) + mVar.x(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.q
            public final boolean e(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.c(a.MONTH_OF_YEAR)) {
                    return false;
                }
                h hVar3 = j.a;
                return Chronology.CC.a(temporalAccessor).equals(j$.time.chrono.q.d);
            }

            @Override // j$.time.temporal.q
            public final u f(TemporalAccessor temporalAccessor) {
                if (e(temporalAccessor)) {
                    return range();
                }
                throw new RuntimeException("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.q
            public final long j(TemporalAccessor temporalAccessor) {
                if (e(temporalAccessor)) {
                    return (temporalAccessor.x(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new RuntimeException("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.q
            public final u range() {
                return u.f(1L, 4L);
            }

            @Override // j$.time.temporal.q
            public final m t(m mVar, long j) {
                long j2 = j(mVar);
                range().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.a(((j - j2) * 3) + mVar.x(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.q
            public final boolean e(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.c(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar4 = j.a;
                return Chronology.CC.a(temporalAccessor).equals(j$.time.chrono.q.d);
            }

            @Override // j$.time.temporal.q
            public final u f(TemporalAccessor temporalAccessor) {
                if (e(temporalAccessor)) {
                    return u.f(1L, h.K(h.z(LocalDate.M(temporalAccessor))));
                }
                throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.h, j$.time.temporal.q
            public final TemporalAccessor g(Map map, a0 a0Var, b0 b0Var) {
                LocalDate a2;
                long j;
                q qVar = h.WEEK_BASED_YEAR;
                HashMap hashMap = (HashMap) map;
                Long l = (Long) hashMap.get(qVar);
                a aVar = a.DAY_OF_WEEK;
                Long l2 = (Long) hashMap.get(aVar);
                if (l != null && l2 != null) {
                    int a3 = qVar.range().a(l.longValue(), qVar);
                    long longValue = ((Long) hashMap.get(h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                    h hVar4 = j.a;
                    if (Chronology.CC.a(a0Var).equals(j$.time.chrono.q.d)) {
                        LocalDate of = LocalDate.of(a3, 1, 4);
                        if (b0Var == b0.LENIENT) {
                            long longValue2 = l2.longValue();
                            if (longValue2 > 7) {
                                long j2 = longValue2 - 1;
                                of = of.W(j2 / 7);
                                j = j2 % 7;
                            } else {
                                if (longValue2 < 1) {
                                    of = of.W(j$.time.a.F(longValue2, 7L) / 7);
                                    j = (longValue2 + 6) % 7;
                                }
                                a2 = of.W(j$.time.a.F(longValue, 1L)).a(longValue2, aVar);
                            }
                            longValue2 = j + 1;
                            a2 = of.W(j$.time.a.F(longValue, 1L)).a(longValue2, aVar);
                        } else {
                            int a4 = aVar.b.a(l2.longValue(), aVar);
                            if (longValue < 1 || longValue > 52) {
                                if (b0Var == b0.STRICT) {
                                    u.f(1L, h.K(h.z(of))).b(longValue, this);
                                } else {
                                    range().b(longValue, this);
                                }
                            }
                            a2 = of.W(longValue - 1).a(a4, aVar);
                        }
                        hashMap.remove(this);
                        hashMap.remove(qVar);
                        hashMap.remove(aVar);
                        return a2;
                    }
                    j$.time.f.k("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.q
            public final long j(TemporalAccessor temporalAccessor) {
                if (e(temporalAccessor)) {
                    return h.x(LocalDate.M(temporalAccessor));
                }
                throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final u range() {
                return u.g(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.q
            public final m t(m mVar, long j) {
                range().b(j, this);
                return mVar.b(j$.time.a.F(j, j(mVar)), b.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.q
            public final boolean e(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.c(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar5 = j.a;
                return Chronology.CC.a(temporalAccessor).equals(j$.time.chrono.q.d);
            }

            @Override // j$.time.temporal.q
            public final u f(TemporalAccessor temporalAccessor) {
                if (e(temporalAccessor)) {
                    return a.YEAR.b;
                }
                throw new RuntimeException("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final long j(TemporalAccessor temporalAccessor) {
                if (e(temporalAccessor)) {
                    return h.z(LocalDate.M(temporalAccessor));
                }
                throw new RuntimeException("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final u range() {
                return a.YEAR.b;
            }

            @Override // j$.time.temporal.q
            public final m t(m mVar, long j) {
                if (!e(mVar)) {
                    throw new RuntimeException("Unsupported field: WeekBasedYear");
                }
                int a2 = a.YEAR.b.a(j, h.WEEK_BASED_YEAR);
                LocalDate M = LocalDate.M(mVar);
                int e = M.e(a.DAY_OF_WEEK);
                int x = h.x(M);
                if (x == 53 && h.K(a2) == 52) {
                    x = 52;
                }
                return mVar.s(LocalDate.of(a2, 1, 4).V(((x - 1) * 7) + (e - r3.e(r6))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        b = new h[]{hVar, hVar2, hVar3, hVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int K(int i) {
        LocalDate of = LocalDate.of(i, 1, 1);
        if (of.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (of.getDayOfWeek() == DayOfWeek.WEDNESDAY && of.k()) ? 53 : 52;
        }
        return 53;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) b.clone();
    }

    public static int x(LocalDate localDate) {
        int ordinal = localDate.getDayOfWeek().ordinal();
        int O = localDate.O() - 1;
        int i = (3 - ordinal) + O;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (O < i3) {
            if (localDate.O() != 180) {
                localDate = LocalDate.T(localDate.a, SubsamplingScaleImageView.ORIENTATION_180);
            }
            return (int) u.f(1L, K(z(localDate.X(-1L)))).d;
        }
        int i4 = ((O - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.k())) {
            return i4;
        }
        return 1;
    }

    public static int z(LocalDate localDate) {
        int year = localDate.getYear();
        int O = localDate.O();
        if (O <= 3) {
            return O - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (O >= 363) {
            return ((O - 363) - (localDate.k() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }

    public TemporalAccessor g(Map map, a0 a0Var, b0 b0Var) {
        return null;
    }

    @Override // j$.time.temporal.q
    public final boolean isDateBased() {
        return true;
    }
}
