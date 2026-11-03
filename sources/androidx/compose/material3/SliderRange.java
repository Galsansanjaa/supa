package androidx.compose.material3;

import defpackage.hu2;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SliderRange {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = SliderKt.SliderRange(Float.NaN, Float.NaN);
    private final long packedValue;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getUnspecified-FYbKRX4$annotations */
        public static /* synthetic */ void m3067getUnspecifiedFYbKRX4$annotations() {
        }

        /* renamed from: getUnspecified-FYbKRX4 */
        public final long m3068getUnspecifiedFYbKRX4() {
            return SliderRange.Unspecified;
        }
    }

    private /* synthetic */ SliderRange(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ SliderRange m3058boximpl(long j) {
        return new SliderRange(j);
    }

    /* renamed from: constructor-impl */
    public static long m3059constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl */
    public static boolean m3060equalsimpl(long j, Object obj) {
        return (obj instanceof SliderRange) && j == ((SliderRange) obj).m3066unboximpl();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m3061equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getEndInclusive$annotations() {
    }

    /* renamed from: getEndInclusive-impl */
    public static final float m3062getEndInclusiveimpl(long j) {
        if (j != Unspecified) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        hu2.h("SliderRange is unspecified");
        return 0.0f;
    }

    public static /* synthetic */ void getStart$annotations() {
    }

    /* renamed from: getStart-impl */
    public static final float m3063getStartimpl(long j) {
        if (j != Unspecified) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        hu2.h("SliderRange is unspecified");
        return 0.0f;
    }

    /* renamed from: hashCode-impl */
    public static int m3064hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: toString-impl */
    public static String m3065toStringimpl(long j) {
        if (!SliderKt.m3053isSpecifiedIf1S1O4(j)) {
            return "FloatRange.Unspecified";
        }
        return m3063getStartimpl(j) + ".." + m3062getEndInclusiveimpl(j);
    }

    public boolean equals(Object obj) {
        return m3060equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m3064hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m3065toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ long m3066unboximpl() {
        return this.packedValue;
    }
}
