package androidx.compose.animation.core;

import defpackage.vg1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class Motion {
    private final long packedValue;

    private /* synthetic */ Motion(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Motion m247boximpl(long j) {
        return new Motion(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m248constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m249equalsimpl(long j, Object obj) {
        return (obj instanceof Motion) && j == ((Motion) obj).m255unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m250equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m251getValueimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getVelocity-impl, reason: not valid java name */
    public static final float m252getVelocityimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m253hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m254toStringimpl(long j) {
        return vg1.B(j, "Motion(packedValue=", ")");
    }

    public boolean equals(Object obj) {
        return m249equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m253hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m254toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m255unboximpl() {
        return this.packedValue;
    }
}
