package androidx.compose.ui.semantics;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class LiveRegionMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Polite = m7235constructorimpl(0);
    private static final int Assertive = m7235constructorimpl(1);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getAssertive-0phEisY, reason: not valid java name */
        public final int m7241getAssertive0phEisY() {
            return LiveRegionMode.Assertive;
        }

        /* renamed from: getPolite-0phEisY, reason: not valid java name */
        public final int m7242getPolite0phEisY() {
            return LiveRegionMode.Polite;
        }
    }

    private /* synthetic */ LiveRegionMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LiveRegionMode m7234boximpl(int i) {
        return new LiveRegionMode(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m7235constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7236equalsimpl(int i, Object obj) {
        return (obj instanceof LiveRegionMode) && i == ((LiveRegionMode) obj).m7240unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7237equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7238hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7239toStringimpl(int i) {
        return m7237equalsimpl0(i, Polite) ? "Polite" : m7237equalsimpl0(i, Assertive) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m7236equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7238hashCodeimpl(this.value);
    }

    public String toString() {
        return m7239toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7240unboximpl() {
        return this.value;
    }
}
