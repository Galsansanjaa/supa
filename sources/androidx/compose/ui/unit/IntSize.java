package androidx.compose.ui.unit;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class IntSize {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m8211constructorimpl(0);
    private final long packedValue;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getZero-YbymL2g, reason: not valid java name */
        public final long m8221getZeroYbymL2g() {
            return IntSize.Zero;
        }
    }

    private /* synthetic */ IntSize(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntSize m8208boximpl(long j) {
        return new IntSize(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m8209component1impl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m8210component2impl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8211constructorimpl(long j) {
        return j;
    }

    /* renamed from: div-YEO4UFw, reason: not valid java name */
    public static final long m8212divYEO4UFw(long j, int i) {
        return m8211constructorimpl(((((int) (j >> 32)) / i) << 32) | ((((int) (j & 4294967295L)) / i) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8213equalsimpl(long j, Object obj) {
        return (obj instanceof IntSize) && j == ((IntSize) obj).m8220unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8214equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final int m8215getHeightimpl(long j) {
        return (int) (j & 4294967295L);
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final int m8216getWidthimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8217hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: times-YEO4UFw, reason: not valid java name */
    public static final long m8218timesYEO4UFw(long j, int i) {
        return m8211constructorimpl(((((int) (j >> 32)) * i) << 32) | ((((int) (j & 4294967295L)) * i) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8219toStringimpl(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public boolean equals(Object obj) {
        return m8213equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m8217hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m8219toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8220unboximpl() {
        return this.packedValue;
    }
}
