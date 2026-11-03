package androidx.collection;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class IntIntPair {
    public final long packedValue;

    private /* synthetic */ IntIntPair(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m23boximpl(long j) {
        return new IntIntPair(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m24component1impl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m25component2impl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m26constructorimpl(int i, int i2) {
        return m27constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m27constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m28equalsimpl(long j, Object obj) {
        return (obj instanceof IntIntPair) && j == ((IntIntPair) obj).m34unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m29equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m30getFirstimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m31getSecondimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m32hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33toStringimpl(long j) {
        return "(" + m30getFirstimpl(j) + ", " + m31getSecondimpl(j) + ')';
    }

    public boolean equals(Object obj) {
        return m28equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m32hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m33toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m34unboximpl() {
        return this.packedValue;
    }
}
