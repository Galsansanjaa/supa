package androidx.compose.ui.unit;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class Dp implements Comparable<Dp> {
    public static final Companion Companion = new Companion(null);
    private static final float Hairline = m8049constructorimpl(0.0f);
    private static final float Infinity = m8049constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m8049constructorimpl(Float.NaN);
    private final float value;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getHairline-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m8064getHairlineD9Ej5fM$annotations() {
        }

        /* renamed from: getInfinity-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m8065getInfinityD9Ej5fM$annotations() {
        }

        /* renamed from: getUnspecified-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m8066getUnspecifiedD9Ej5fM$annotations() {
        }

        /* renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m8067getHairlineD9Ej5fM() {
            return Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m8068getInfinityD9Ej5fM() {
            return Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m8069getUnspecifiedD9Ej5fM() {
            return Dp.Unspecified;
        }
    }

    private /* synthetic */ Dp(float f) {
        this.value = f;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Dp m8047boximpl(float f) {
        return new Dp(f);
    }

    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m8048compareTo0680j_4(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m8049constructorimpl(float f) {
        return f;
    }

    /* renamed from: div-0680j_4, reason: not valid java name */
    public static final float m8050div0680j_4(float f, float f2) {
        return f / f2;
    }

    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m8051divu2uoSUM(float f, float f2) {
        return m8049constructorimpl(f / f2);
    }

    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m8052divu2uoSUM(float f, int i) {
        return m8049constructorimpl(f / i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8053equalsimpl(float f, Object obj) {
        return (obj instanceof Dp) && Float.compare(f, ((Dp) obj).m8063unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8054equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8055hashCodeimpl(float f) {
        return Float.floatToIntBits(f);
    }

    /* renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m8056minus5rwHm24(float f, float f2) {
        return m8049constructorimpl(f - f2);
    }

    /* renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m8057plus5rwHm24(float f, float f2) {
        return m8049constructorimpl(f + f2);
    }

    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m8058timesu2uoSUM(float f, float f2) {
        return m8049constructorimpl(f * f2);
    }

    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m8059timesu2uoSUM(float f, int i) {
        return m8049constructorimpl(f * i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8060toStringimpl(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    /* renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m8061unaryMinusD9Ej5fM(float f) {
        return m8049constructorimpl(-f);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Dp dp) {
        return m8062compareTo0680j_4(dp.m8063unboximpl());
    }

    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public int m8062compareTo0680j_4(float f) {
        return m8048compareTo0680j_4(this.value, f);
    }

    public boolean equals(Object obj) {
        return m8053equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m8055hashCodeimpl(this.value);
    }

    public String toString() {
        return m8060toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m8063unboximpl() {
        return this.value;
    }
}
