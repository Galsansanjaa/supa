package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public interface Chronology extends Comparable<Chronology> {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* renamed from: j$.time.chrono.Chronology$-CC, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static Chronology a(TemporalAccessor temporalAccessor) {
            Objects.requireNonNull(temporalAccessor, "temporal");
            Object obj = (Chronology) temporalAccessor.z(j$.time.temporal.r.b);
            q qVar = q.d;
            if (obj == null) {
                obj = Objects.requireNonNull(qVar, "defaultObj");
            }
            return (Chronology) obj;
        }

        public static Chronology ofLocale(Locale locale) {
            ConcurrentHashMap concurrentHashMap = a.a;
            Objects.requireNonNull(locale, "locale");
            String unicodeLocaleType = locale.getUnicodeLocaleType("ca");
            if (unicodeLocaleType == null) {
                unicodeLocaleType = locale.equals(a.c) ? "japanese" : null;
            }
            if (unicodeLocaleType == null || "iso".equals(unicodeLocaleType) || "iso8601".equals(unicodeLocaleType)) {
                return q.d;
            }
            do {
                Chronology chronology = (Chronology) a.b.get(unicodeLocaleType);
                if (chronology != null) {
                    return chronology;
                }
            } while (a.g());
            Iterator it = ServiceLoader.load(Chronology.class).iterator();
            while (it.hasNext()) {
                Chronology chronology2 = (Chronology) it.next();
                if (unicodeLocaleType.equals(chronology2.h())) {
                    return chronology2;
                }
            }
            j$.time.f.k("Unknown calendar system: ".concat(unicodeLocaleType));
            return null;
        }
    }

    b D(int i, int i2, int i3);

    b F(Map map, j$.time.format.b0 b0Var);

    ChronoZonedDateTime G(Instant instant, ZoneId zoneId);

    boolean J(long j);

    b d(long j);

    boolean equals(Object obj);

    String getId();

    String h();

    int hashCode();

    b i(int i, int i2);

    j$.time.temporal.u l(j$.time.temporal.a aVar);

    List n();

    k o(int i);

    /* renamed from: p */
    int compareTo(Chronology chronology);

    int q(k kVar, int i);

    String toString();

    b v(TemporalAccessor temporalAccessor);

    ChronoLocalDateTime w(LocalDateTime localDateTime);
}
