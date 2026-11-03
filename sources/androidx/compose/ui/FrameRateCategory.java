package androidx.compose.ui;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FrameRateCategory {
    private final float value;
    public static final Companion Companion = new Companion(null);
    private static final float Default = m4803constructorimpl(Float.NaN);
    private static final float Normal = m4803constructorimpl(-3.0f);
    private static final float High = m4803constructorimpl(-4.0f);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getDefault-NSsRyOo, reason: not valid java name */
        public final float m4809getDefaultNSsRyOo() {
            return FrameRateCategory.Default;
        }

        /* renamed from: getHigh-NSsRyOo, reason: not valid java name */
        public final float m4810getHighNSsRyOo() {
            return FrameRateCategory.High;
        }

        /* renamed from: getNormal-NSsRyOo, reason: not valid java name */
        public final float m4811getNormalNSsRyOo() {
            return FrameRateCategory.Normal;
        }
    }

    private /* synthetic */ FrameRateCategory(float f) {
        this.value = f;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FrameRateCategory m4802boximpl(float f) {
        return new FrameRateCategory(f);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static float m4803constructorimpl(float f) {
        return f;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4804equalsimpl(float f, Object obj) {
        return (obj instanceof FrameRateCategory) && Float.compare(f, ((FrameRateCategory) obj).m4808unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4805equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4806hashCodeimpl(float f) {
        return Float.floatToIntBits(f);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4807toStringimpl(float f) {
        return f == -3.0f ? "Normal" : f == -4.0f ? "High" : "Default";
    }

    public boolean equals(Object obj) {
        return m4804equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4806hashCodeimpl(this.value);
    }

    public String toString() {
        return m4807toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m4808unboximpl() {
        return this.value;
    }
}
