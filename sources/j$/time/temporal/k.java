package j$.time.temporal;

import j$.time.chrono.Chronology;
import j$.time.format.a0;
import j$.time.format.b0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public enum k implements q {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient u b;
    public final transient long c;

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j) {
        this.a = str;
        this.b = u.f((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // j$.time.temporal.q
    public final boolean e(TemporalAccessor temporalAccessor) {
        return temporalAccessor.c(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final u f(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.c(a.EPOCH_DAY)) {
            return this.b;
        }
        j$.time.f.j(this, "Unsupported field: ");
        return null;
    }

    @Override // j$.time.temporal.q
    public final TemporalAccessor g(Map map, a0 a0Var, b0 b0Var) {
        long longValue = ((Long) ((HashMap) map).remove(this)).longValue();
        Chronology a = Chronology.CC.a(a0Var);
        b0 b0Var2 = b0.LENIENT;
        long j = this.c;
        if (b0Var == b0Var2) {
            return a.d(j$.time.a.F(longValue, j));
        }
        this.b.b(longValue, this);
        return a.d(longValue - j);
    }

    @Override // j$.time.temporal.q
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.q
    public final long j(TemporalAccessor temporalAccessor) {
        return temporalAccessor.x(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.q
    public final u range() {
        return this.b;
    }

    @Override // j$.time.temporal.q
    public final m t(m mVar, long j) {
        if (this.b.e(j)) {
            return mVar.a(j$.time.a.F(j, this.c), a.EPOCH_DAY);
        }
        throw new RuntimeException("Invalid value: " + this.a + " " + j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
