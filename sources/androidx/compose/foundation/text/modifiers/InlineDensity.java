package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.Density;
import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class InlineDensity {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m2036constructorimpl(Float.NaN, Float.NaN);
    private final long packedValue;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getUnspecified-L26CHvs, reason: not valid java name */
        public final long m2046getUnspecifiedL26CHvs() {
            return InlineDensity.Unspecified;
        }
    }

    private /* synthetic */ InlineDensity(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InlineDensity m2035boximpl(long j) {
        return new InlineDensity(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2036constructorimpl(float f, float f2) {
        return m2037constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m2037constructorimpl(long j) {
        return j;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2038constructorimpl(Density density) {
        return m2036constructorimpl(density.getDensity(), density.getFontScale());
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2039equalsimpl(long j, Object obj) {
        return (obj instanceof InlineDensity) && j == ((InlineDensity) obj).m2045unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2040equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getDensity-impl, reason: not valid java name */
    public static final float m2041getDensityimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getFontScale-impl, reason: not valid java name */
    public static final float m2042getFontScaleimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2043hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2044toStringimpl(long j) {
        return sg3.q("InlineDensity(density=", m2041getDensityimpl(j), ", fontScale=", m2042getFontScaleimpl(j), ")");
    }

    public boolean equals(Object obj) {
        return m2039equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2043hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m2044toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2045unboximpl() {
        return this.packedValue;
    }
}
