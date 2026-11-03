package androidx.compose.ui.layout;

import defpackage.vg1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ValueInsets {
    private final long packedValue;

    private /* synthetic */ ValueInsets(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ValueInsets m6824boximpl(long j) {
        return new ValueInsets(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6825constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6826equalsimpl(long j, Object obj) {
        return (obj instanceof ValueInsets) && j == ((ValueInsets) obj).m6834unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6827equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getBottom-impl, reason: not valid java name */
    public static final int m6828getBottomimpl(long j) {
        return (int) (j & 65535);
    }

    /* renamed from: getLeft-impl, reason: not valid java name */
    public static final int m6829getLeftimpl(long j) {
        return (int) ((j >>> 48) & 65535);
    }

    /* renamed from: getRight-impl, reason: not valid java name */
    public static final int m6830getRightimpl(long j) {
        return (int) ((j >>> 16) & 65535);
    }

    /* renamed from: getTop-impl, reason: not valid java name */
    public static final int m6831getTopimpl(long j) {
        return (int) ((j >>> 32) & 65535);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6832hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6833toStringimpl(long j) {
        StringBuilder E = vg1.E("ValueInsets(", (int) ((j >>> 48) & 65535), ", ", (int) ((j >>> 32) & 65535), ", ");
        E.append((int) ((j >>> 16) & 65535));
        E.append(", ");
        E.append((int) (j & 65535));
        E.append(")");
        return E.toString();
    }

    public boolean equals(Object obj) {
        return m6826equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m6832hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m6833toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6834unboximpl() {
        return this.packedValue;
    }
}
