package androidx.compose.ui.graphics;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class FilterQuality {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m5425constructorimpl(0);
    private static final int Low = m5425constructorimpl(1);
    private static final int Medium = m5425constructorimpl(2);
    private static final int High = m5425constructorimpl(3);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getHigh-f-v9h1I, reason: not valid java name */
        public final int m5431getHighfv9h1I() {
            return FilterQuality.High;
        }

        /* renamed from: getLow-f-v9h1I, reason: not valid java name */
        public final int m5432getLowfv9h1I() {
            return FilterQuality.Low;
        }

        /* renamed from: getMedium-f-v9h1I, reason: not valid java name */
        public final int m5433getMediumfv9h1I() {
            return FilterQuality.Medium;
        }

        /* renamed from: getNone-f-v9h1I, reason: not valid java name */
        public final int m5434getNonefv9h1I() {
            return FilterQuality.None;
        }
    }

    private /* synthetic */ FilterQuality(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FilterQuality m5424boximpl(int i) {
        return new FilterQuality(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5425constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5426equalsimpl(int i, Object obj) {
        return (obj instanceof FilterQuality) && i == ((FilterQuality) obj).m5430unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5427equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5428hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5429toStringimpl(int i) {
        return m5427equalsimpl0(i, None) ? "None" : m5427equalsimpl0(i, Low) ? "Low" : m5427equalsimpl0(i, Medium) ? "Medium" : m5427equalsimpl0(i, High) ? "High" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5426equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m5428hashCodeimpl(this.value);
    }

    public String toString() {
        return m5429toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5430unboximpl() {
        return this.value;
    }
}
