package androidx.compose.ui.node;

import defpackage.vg1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class DistanceAndFlags {
    private final long packedValue;

    private /* synthetic */ DistanceAndFlags(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DistanceAndFlags m6880boximpl(long j) {
        return new DistanceAndFlags(j);
    }

    /* renamed from: compareTo-9YPOF3E, reason: not valid java name */
    public static final int m6881compareTo9YPOF3E(long j, long j2) {
        boolean m6888isInLayerimpl = m6888isInLayerimpl(j);
        if (m6888isInLayerimpl != m6888isInLayerimpl(j2)) {
            return m6888isInLayerimpl ? -1 : 1;
        }
        return (Math.min(m6885getDistanceimpl(j), m6885getDistanceimpl(j2)) >= 0.0f && m6887isInExpandedBoundsimpl(j) != m6887isInExpandedBoundsimpl(j2)) ? m6887isInExpandedBoundsimpl(j) ? -1 : 1 : (int) Math.signum(m6885getDistanceimpl(j) - m6885getDistanceimpl(j2));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6882constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6883equalsimpl(long j, Object obj) {
        return (obj instanceof DistanceAndFlags) && j == ((DistanceAndFlags) obj).m6890unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6884equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m6885getDistanceimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6886hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: isInExpandedBounds-impl, reason: not valid java name */
    public static final boolean m6887isInExpandedBoundsimpl(long j) {
        return (j & 2) != 0;
    }

    /* renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m6888isInLayerimpl(long j) {
        return (j & 1) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6889toStringimpl(long j) {
        return vg1.B(j, "DistanceAndFlags(packedValue=", ")");
    }

    public boolean equals(Object obj) {
        return m6883equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m6886hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m6889toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6890unboximpl() {
        return this.packedValue;
    }
}
