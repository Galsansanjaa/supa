package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.util.Objects;
import j$.util.concurrent.t;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ List A(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ Map.Entry B(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(obj), Objects.requireNonNull(obj2));
    }

    public static /* synthetic */ long C(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long D(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ long E(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (numberOfLeadingZeros >= 64) {
            if ((j2 != Long.MIN_VALUE) | (j >= 0)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long F(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static String G(Object obj, Object obj2) {
        String str;
        String obj3;
        String str2 = "null";
        if (obj == null || (str = obj.toString()) == null) {
            str = "null";
        }
        int length = str.length();
        if (obj2 != null && (obj3 = obj2.toString()) != null) {
            str2 = obj3;
        }
        int length2 = str2.length();
        char[] cArr = new char[length + length2 + 1];
        str.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str2.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static b H() {
        return new b(ZoneId.systemDefault());
    }

    public static j$.time.temporal.m a(j$.time.chrono.b bVar, j$.time.temporal.m mVar) {
        return mVar.a(bVar.y(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static t b(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new t(1, biConsumer, biConsumer2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static j$.util.function.b c(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                DoubleConsumer.this.accept(d);
                doubleConsumer2.accept(d);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.time.a.c(this, doubleConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.e] */
    public static j$.util.function.e d(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        Objects.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: j$.util.function.e
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                IntConsumer.this.accept(i);
                intConsumer2.accept(i);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return j$.time.a.d(this, intConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.f] */
    public static j$.util.function.f e(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.f
            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                LongConsumer.this.accept(j);
                longConsumer2.accept(j);
            }

            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.time.a.e(this, longConsumer3);
            }
        };
    }

    public static int f(j$.time.chrono.b bVar, j$.time.chrono.b bVar2) {
        int compare = Long.compare(bVar.y(), bVar2.y());
        if (compare != 0) {
            return compare;
        }
        return ((j$.time.chrono.a) bVar.getChronology()).p(bVar2.getChronology());
    }

    public static int g(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
        int compareTo = chronoLocalDateTime.toLocalDate().compareTo(chronoLocalDateTime2.toLocalDate());
        return (compareTo == 0 && (compareTo = chronoLocalDateTime.toLocalTime().compareTo(chronoLocalDateTime2.toLocalTime())) == 0) ? chronoLocalDateTime.getChronology().p(chronoLocalDateTime2.getChronology()) : compareTo;
    }

    public static int h(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int compare = Long.compare(chronoZonedDateTime.toEpochSecond(), chronoZonedDateTime2.toEpochSecond());
        return (compare == 0 && (compare = chronoZonedDateTime.toLocalTime().getNano() - chronoZonedDateTime2.toLocalTime().getNano()) == 0 && (compare = chronoZonedDateTime.toLocalDateTime().C(chronoZonedDateTime2.toLocalDateTime())) == 0 && (compare = chronoZonedDateTime.getZone().getId().compareTo(chronoZonedDateTime2.getZone().getId())) == 0) ? chronoZonedDateTime.getChronology().p(chronoZonedDateTime2.getChronology()) : compare;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object i(java.util.concurrent.ConcurrentMap r2, java.lang.Object r3, java.util.function.BiFunction r4) {
        /*
        L0:
            java.lang.Object r0 = r2.get(r3)
        L4:
            java.lang.Object r1 = r4.apply(r3, r0)
            if (r1 == 0) goto L1a
            if (r0 == 0) goto L13
            boolean r0 = r2.replace(r3, r0, r1)
            if (r0 == 0) goto L0
            goto L19
        L13:
            java.lang.Object r0 = r2.putIfAbsent(r3, r1)
            if (r0 != 0) goto L4
        L19:
            return r1
        L1a:
            if (r0 == 0) goto L22
            boolean r0 = r2.remove(r3, r0)
            if (r0 == 0) goto L0
        L22:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.a.i(java.util.concurrent.ConcurrentMap, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    public static void j(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static int k(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.r.a(chronoZonedDateTime, qVar);
        }
        int i = j$.time.chrono.h.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i != 1) {
            return i != 2 ? chronoZonedDateTime.toLocalDateTime().e(qVar) : chronoZonedDateTime.getOffset().getTotalSeconds();
        }
        throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int l(j$.time.chrono.k kVar, j$.time.temporal.q qVar) {
        return qVar == j$.time.temporal.a.ERA ? kVar.getValue() : j$.time.temporal.r.a(kVar, qVar);
    }

    public static long m(j$.time.chrono.k kVar, j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return kVar.getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(d.a("Unsupported field: ", qVar));
        }
        return qVar.j(kVar);
    }

    public static boolean n(j$.time.chrono.b bVar, j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).isDateBased() : qVar != null && qVar.e(bVar);
    }

    public static boolean o(j$.time.chrono.k kVar, j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.ERA : qVar != null && qVar.e(kVar);
    }

    public static Object p(ConcurrentMap concurrentMap, Object obj, Object obj2, BiFunction biFunction) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(obj2);
        while (true) {
            Object obj3 = concurrentMap.get(obj);
            while (obj3 == null) {
                obj3 = concurrentMap.putIfAbsent(obj, obj2);
                if (obj3 == null) {
                    return obj2;
                }
            }
            Object apply = biFunction.apply(obj3, obj2);
            if (apply != null) {
                if (concurrentMap.replace(obj, obj3, apply)) {
                    return apply;
                }
            } else if (concurrentMap.remove(obj, obj3)) {
                return null;
            }
        }
    }

    public static Object q(j$.time.chrono.b bVar, h hVar) {
        if (hVar == j$.time.temporal.r.a || hVar == j$.time.temporal.r.e || hVar == j$.time.temporal.r.d || hVar == j$.time.temporal.r.g) {
            return null;
        }
        return hVar == j$.time.temporal.r.b ? bVar.getChronology() : hVar == j$.time.temporal.r.c ? j$.time.temporal.b.DAYS : hVar.d(bVar);
    }

    public static Object r(ChronoLocalDateTime chronoLocalDateTime, h hVar) {
        if (hVar == j$.time.temporal.r.a || hVar == j$.time.temporal.r.e || hVar == j$.time.temporal.r.d) {
            return null;
        }
        return hVar == j$.time.temporal.r.g ? chronoLocalDateTime.toLocalTime() : hVar == j$.time.temporal.r.b ? chronoLocalDateTime.getChronology() : hVar == j$.time.temporal.r.c ? j$.time.temporal.b.NANOS : hVar.d(chronoLocalDateTime);
    }

    public static Object s(ChronoZonedDateTime chronoZonedDateTime, h hVar) {
        return (hVar == j$.time.temporal.r.e || hVar == j$.time.temporal.r.a) ? chronoZonedDateTime.getZone() : hVar == j$.time.temporal.r.d ? chronoZonedDateTime.getOffset() : hVar == j$.time.temporal.r.g ? chronoZonedDateTime.toLocalTime() : hVar == j$.time.temporal.r.b ? chronoZonedDateTime.getChronology() : hVar == j$.time.temporal.r.c ? j$.time.temporal.b.NANOS : hVar.d(chronoZonedDateTime);
    }

    public static Object t(j$.time.chrono.k kVar, h hVar) {
        return hVar == j$.time.temporal.r.c ? j$.time.temporal.b.ERAS : j$.time.temporal.r.c(kVar, hVar);
    }

    public static long u(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        return ((chronoLocalDateTime.toLocalDate().y() * 86400) + chronoLocalDateTime.toLocalTime().W()) - zoneOffset.getTotalSeconds();
    }

    public static long v(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.toLocalDate().y() * 86400) + chronoZonedDateTime.toLocalTime().W()) - chronoZonedDateTime.getOffset().getTotalSeconds();
    }

    public static String w(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static String x(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static /* synthetic */ int y(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long z(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }
}
