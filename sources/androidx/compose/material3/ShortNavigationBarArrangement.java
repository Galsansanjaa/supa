package androidx.compose.material3;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ShortNavigationBarArrangement {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int EqualWeight = m2998constructorimpl(0);
    private static final int Centered = m2998constructorimpl(1);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getCentered-LnnQw40, reason: not valid java name */
        public final int m3004getCenteredLnnQw40() {
            return ShortNavigationBarArrangement.Centered;
        }

        /* renamed from: getEqualWeight-LnnQw40, reason: not valid java name */
        public final int m3005getEqualWeightLnnQw40() {
            return ShortNavigationBarArrangement.EqualWeight;
        }
    }

    private /* synthetic */ ShortNavigationBarArrangement(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ShortNavigationBarArrangement m2997boximpl(int i) {
        return new ShortNavigationBarArrangement(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m2998constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2999equalsimpl(int i, Object obj) {
        return (obj instanceof ShortNavigationBarArrangement) && i == ((ShortNavigationBarArrangement) obj).m3003unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3000equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3001hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3002toStringimpl(int i) {
        return m3000equalsimpl0(i, EqualWeight) ? "EqualWeight" : m3000equalsimpl0(i, Centered) ? "Centered" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m2999equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3001hashCodeimpl(this.value);
    }

    public String toString() {
        return m3002toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3003unboximpl() {
        return this.value;
    }
}
