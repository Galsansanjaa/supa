package androidx.compose.material3;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class DisplayMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Picker = m2547constructorimpl(0);
    private static final int Input = m2547constructorimpl(1);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getInput-jFl-4v0, reason: not valid java name */
        public final int m2553getInputjFl4v0() {
            return DisplayMode.Input;
        }

        /* renamed from: getPicker-jFl-4v0, reason: not valid java name */
        public final int m2554getPickerjFl4v0() {
            return DisplayMode.Picker;
        }
    }

    private /* synthetic */ DisplayMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DisplayMode m2546boximpl(int i) {
        return new DisplayMode(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2547constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2548equalsimpl(int i, Object obj) {
        return (obj instanceof DisplayMode) && i == ((DisplayMode) obj).m2552unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2549equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2550hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2551toStringimpl(int i) {
        return m2549equalsimpl0(i, Picker) ? "Picker" : m2549equalsimpl0(i, Input) ? "Input" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m2548equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2550hashCodeimpl(this.value);
    }

    public String toString() {
        return m2551toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2552unboximpl() {
        return this.value;
    }
}
