package androidx.compose.ui.text;

import defpackage.lt;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextRange {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m7491getZerod9O1mEE() {
            return TextRange.Zero;
        }
    }

    private /* synthetic */ TextRange(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m7474boximpl(long j) {
        return new TextRange(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7475constructorimpl(long j) {
        return j;
    }

    /* renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m7476contains5zctL8(long j, long j2) {
        return (m7484getMinimpl(j) <= m7484getMinimpl(j2)) & (m7483getMaximpl(j2) <= m7483getMaximpl(j));
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m7477containsimpl(long j, int i) {
        return i < m7483getMaximpl(j) && m7484getMinimpl(j) <= i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7478equalsimpl(long j, Object obj) {
        return (obj instanceof TextRange) && j == ((TextRange) obj).m7490unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7479equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m7480getCollapsedimpl(long j) {
        return m7486getStartimpl(j) == m7481getEndimpl(j);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m7481getEndimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getLength-impl, reason: not valid java name */
    public static final int m7482getLengthimpl(long j) {
        return m7483getMaximpl(j) - m7484getMinimpl(j);
    }

    /* renamed from: getMax-impl, reason: not valid java name */
    public static final int m7483getMaximpl(long j) {
        return Math.max(m7486getStartimpl(j), m7481getEndimpl(j));
    }

    /* renamed from: getMin-impl, reason: not valid java name */
    public static final int m7484getMinimpl(long j) {
        return Math.min(m7486getStartimpl(j), m7481getEndimpl(j));
    }

    /* renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m7485getReversedimpl(long j) {
        return m7486getStartimpl(j) > m7481getEndimpl(j);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m7486getStartimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7487hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m7488intersects5zctL8(long j, long j2) {
        return (m7484getMinimpl(j) < m7483getMaximpl(j2)) & (m7484getMinimpl(j2) < m7483getMaximpl(j));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7489toStringimpl(long j) {
        return lt.x("TextRange(", m7486getStartimpl(j), ", ", m7481getEndimpl(j), ")");
    }

    public boolean equals(Object obj) {
        return m7478equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m7487hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m7489toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7490unboximpl() {
        return this.packedValue;
    }
}
