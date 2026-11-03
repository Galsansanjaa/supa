package j$.time;

import androidx.compose.animation.core.AnimationKt;
import androidx.core.app.NotificationManagerCompat;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.s;
import j$.time.temporal.u;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.n, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;
    public static final Instant c = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Instant K(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        f.k("Instant exceeds minimum or maximum instant");
        return null;
    }

    public static Instant L(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.x(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.e(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e) {
            f.h("Unable to obtain Instant from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
            return null;
        }
    }

    public static Instant ofEpochMilli(long j) {
        return K(a.D(j, 1000L), ((int) a.C(j, 1000L)) * 1000000);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return K(a.z(j, a.D(j2, 1000000000L)), (int) a.C(j2, 1000000000L));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 2, this);
    }

    public final Instant M(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(a.z(a.z(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.m
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final Instant b(long j, s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (Instant) sVar.e(this, j);
        }
        switch (e.b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return M(0L, j);
            case 2:
                return M(j / AnimationKt.MillisToNanos, (j % AnimationKt.MillisToNanos) * 1000);
            case 3:
                return M(j / 1000, (j % 1000) * AnimationKt.MillisToNanos);
            case 4:
                return M(j, 0L);
            case 5:
                return M(a.E(j, 60L), 0L);
            case 6:
                return M(a.E(j, 3600L), 0L);
            case 7:
                return M(a.E(j, 43200L), 0L);
            case 8:
                return M(a.E(j, 86400L), 0L);
            default:
                f.b(sVar, "Unsupported unit: ");
                return null;
        }
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (Instant) qVar.t(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.x(j);
        int i = e.a[aVar.ordinal()];
        if (i == 1) {
            return j != ((long) this.b) ? K(this.a, (int) j) : this;
        }
        if (i == 2) {
            int i2 = ((int) j) * 1000;
            return i2 != this.b ? K(this.a, i2) : this;
        }
        if (i == 3) {
            int i3 = ((int) j) * 1000000;
            return i3 != this.b ? K(this.a, i3) : this;
        }
        if (i == 4) {
            return j != this.a ? K(j, this.b) : this;
        }
        throw new RuntimeException(d.a("Unsupported field: ", qVar));
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.K(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.ofInstant(this, zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.NANO_OF_SECOND || qVar == j$.time.temporal.a.MICRO_OF_SECOND || qVar == j$.time.temporal.a.MILLI_OF_SECOND : qVar != null && qVar.e(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int compare = Long.compare(this.a, instant2.a);
        return compare != 0 ? compare : this.b - instant2.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.r.d(this, qVar).a(qVar.j(this), qVar);
        }
        int i = e.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.b / 1000;
        }
        if (i == 3) {
            return this.b / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.b.a(this.a, aVar);
        }
        throw new RuntimeException(d.a("Unsupported field: ", qVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    /* renamed from: f */
    public final j$.time.temporal.m s(LocalDate localDate) {
        return (Instant) a.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final u g(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m j(j$.time.temporal.m mVar) {
        return mVar.a(this.a, j$.time.temporal.a.INSTANT_SECONDS).a(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m t(long j, j$.time.temporal.b bVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, bVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, bVar);
    }

    public long toEpochMilli() {
        long j = this.a;
        return (j >= 0 || this.b <= 0) ? a.z(a.E(j, 1000L), this.b / 1000000) : a.z(a.E(j + 1, 1000L), (this.b / 1000000) + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
    }

    public final String toString() {
        return DateTimeFormatter.f.a(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.q qVar) {
        int i;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.j(this);
        }
        int i2 = e.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else if (i2 == 2) {
            i = this.b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new RuntimeException(d.a("Unsupported field: ", qVar));
            }
            i = this.b / 1000000;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(h hVar) {
        if (hVar == j$.time.temporal.r.c) {
            return j$.time.temporal.b.NANOS;
        }
        if (hVar == j$.time.temporal.r.b || hVar == j$.time.temporal.r.a || hVar == j$.time.temporal.r.e || hVar == j$.time.temporal.r.d || hVar == j$.time.temporal.r.f || hVar == j$.time.temporal.r.g) {
            return null;
        }
        return hVar.d(this);
    }
}
