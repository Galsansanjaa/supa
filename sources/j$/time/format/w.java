package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public final class w {
    public final TemporalAccessor a;
    public final DateTimeFormatter b;
    public int c;

    public w(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        Chronology chronology = dateTimeFormatter.e;
        if (chronology != null) {
            Chronology chronology2 = (Chronology) temporalAccessor.z(j$.time.temporal.r.b);
            ZoneId zoneId = (ZoneId) temporalAccessor.z(j$.time.temporal.r.a);
            j$.time.chrono.b bVar = null;
            chronology = Objects.equals(chronology, chronology2) ? null : chronology;
            Objects.equals(null, zoneId);
            if (chronology != null) {
                Chronology chronology3 = chronology != null ? chronology : chronology2;
                if (chronology != null) {
                    if (temporalAccessor.c(j$.time.temporal.a.EPOCH_DAY)) {
                        bVar = chronology3.v(temporalAccessor);
                    } else if (chronology != j$.time.chrono.q.d || chronology2 != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.isDateBased() && temporalAccessor.c(aVar)) {
                                throw new RuntimeException("Unable to apply override chronology '" + chronology + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new v(bVar, temporalAccessor, chronology3, zoneId);
            }
        }
        this.a = temporalAccessor;
        this.b = dateTimeFormatter;
    }

    public final Long a(j$.time.temporal.q qVar) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.c(qVar)) {
            return Long.valueOf(temporalAccessor.x(qVar));
        }
        return null;
    }

    public final Object b(j$.time.h hVar) {
        TemporalAccessor temporalAccessor = this.a;
        Object z = temporalAccessor.z(hVar);
        if (z != null || this.c != 0) {
            return z;
        }
        throw new RuntimeException("Unable to extract " + hVar + " from temporal " + temporalAccessor);
    }

    public final String toString() {
        return this.a.toString();
    }
}
