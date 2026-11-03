package androidx.compose.foundation.lazy.grid;

import defpackage.vg1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class GridItemSpan {
    private final long packedValue;

    private /* synthetic */ GridItemSpan(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GridItemSpan m1190boximpl(long j) {
        return new GridItemSpan(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1191constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1192equalsimpl(long j, Object obj) {
        return (obj instanceof GridItemSpan) && j == ((GridItemSpan) obj).m1197unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1193equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getCurrentLineSpan-impl, reason: not valid java name */
    public static final int m1194getCurrentLineSpanimpl(long j) {
        return (int) j;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1195hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1196toStringimpl(long j) {
        return vg1.B(j, "GridItemSpan(packedValue=", ")");
    }

    public boolean equals(Object obj) {
        return m1192equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1195hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m1196toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1197unboximpl() {
        return this.packedValue;
    }
}
