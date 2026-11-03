package androidx.compose.material3;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class NavigationItemIconPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Top = m2821constructorimpl(0);
    private static final int Start = m2821constructorimpl(1);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getStart--xw1Ddg, reason: not valid java name */
        public final int m2827getStartxw1Ddg() {
            return NavigationItemIconPosition.Start;
        }

        /* renamed from: getTop--xw1Ddg, reason: not valid java name */
        public final int m2828getTopxw1Ddg() {
            return NavigationItemIconPosition.Top;
        }
    }

    private /* synthetic */ NavigationItemIconPosition(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NavigationItemIconPosition m2820boximpl(int i) {
        return new NavigationItemIconPosition(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m2821constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2822equalsimpl(int i, Object obj) {
        return (obj instanceof NavigationItemIconPosition) && i == ((NavigationItemIconPosition) obj).m2826unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2823equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2824hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2825toStringimpl(int i) {
        return m2823equalsimpl0(i, Top) ? "Top" : m2823equalsimpl0(i, Start) ? "Start" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m2822equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2824hashCodeimpl(this.value);
    }

    public String toString() {
        return m2825toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2826unboximpl() {
        return this.value;
    }
}
