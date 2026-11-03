package androidx.compose.ui.graphics.colorspace;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ColorModel {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Rgb = m5761constructorimpl(12884901888L);
    private static final long Xyz = m5761constructorimpl(12884901889L);
    private static final long Lab = m5761constructorimpl(12884901890L);
    private static final long Cmyk = m5761constructorimpl(17179869187L);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getCmyk-xdoWZVw, reason: not valid java name */
        public final long m5768getCmykxdoWZVw() {
            return ColorModel.Cmyk;
        }

        /* renamed from: getLab-xdoWZVw, reason: not valid java name */
        public final long m5769getLabxdoWZVw() {
            return ColorModel.Lab;
        }

        /* renamed from: getRgb-xdoWZVw, reason: not valid java name */
        public final long m5770getRgbxdoWZVw() {
            return ColorModel.Rgb;
        }

        /* renamed from: getXyz-xdoWZVw, reason: not valid java name */
        public final long m5771getXyzxdoWZVw() {
            return ColorModel.Xyz;
        }
    }

    private /* synthetic */ ColorModel(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorModel m5760boximpl(long j) {
        return new ColorModel(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5761constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5762equalsimpl(long j, Object obj) {
        return (obj instanceof ColorModel) && j == ((ColorModel) obj).m5767unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5763equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getComponentCount$annotations() {
    }

    /* renamed from: getComponentCount-impl, reason: not valid java name */
    public static final int m5764getComponentCountimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5765hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5766toStringimpl(long j) {
        return m5763equalsimpl0(j, Rgb) ? "Rgb" : m5763equalsimpl0(j, Xyz) ? "Xyz" : m5763equalsimpl0(j, Lab) ? "Lab" : m5763equalsimpl0(j, Cmyk) ? "Cmyk" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5762equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5765hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m5766toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5767unboximpl() {
        return this.packedValue;
    }
}
