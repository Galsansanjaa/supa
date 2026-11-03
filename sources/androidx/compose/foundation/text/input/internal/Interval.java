package androidx.compose.foundation.text.input.internal;

import defpackage.sb0;
import defpackage.vg1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class Interval {
    public static final Companion Companion = new Companion(null);
    private static final long Invalid = m1875constructorimpl$default(Integer.MAX_VALUE, 0, false, false, 12, null);
    private final long packed;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getInvalid-7D3R4FY, reason: not valid java name */
        public final long m1885getInvalid7D3R4FY() {
            return Interval.Invalid;
        }
    }

    private /* synthetic */ Interval(long j) {
        this.packed = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Interval m1872boximpl(long j) {
        return new Interval(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1873constructorimpl(int i, int i2, boolean z, boolean z2) {
        return m1874constructorimpl(IntervalKt.packValuesAndFlags(z, i, z2, i2));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1874constructorimpl(long j) {
        return j;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m1875constructorimpl$default(int i, int i2, boolean z, boolean z2, int i3, sb0 sb0Var) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            z2 = false;
        }
        return m1873constructorimpl(i, i2, z, z2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1876equalsimpl(long j, Object obj) {
        return (obj instanceof Interval) && j == ((Interval) obj).m1884unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1877equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m1878getEndimpl(long j) {
        return IntervalKt.unpackValue2(j);
    }

    /* renamed from: getFlag1-impl, reason: not valid java name */
    public static final boolean m1879getFlag1impl(long j) {
        return IntervalKt.unpackFlag1(j);
    }

    /* renamed from: getFlag2-impl, reason: not valid java name */
    public static final boolean m1880getFlag2impl(long j) {
        return IntervalKt.unpackFlag2(j);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m1881getStartimpl(long j) {
        return IntervalKt.unpackValue1(j);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1882hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1883toStringimpl(long j) {
        return vg1.B(j, "Interval(packed=", ")");
    }

    public boolean equals(Object obj) {
        return m1876equalsimpl(this.packed, obj);
    }

    public final long getPacked() {
        return this.packed;
    }

    public int hashCode() {
        return m1882hashCodeimpl(this.packed);
    }

    public String toString() {
        return m1883toStringimpl(this.packed);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1884unboximpl() {
        return this.packed;
    }
}
