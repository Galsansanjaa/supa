package androidx.compose.ui.platform;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AutoClearFocusBehavior {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m7143constructorimpl(0);
    private static final int CursorBased = m7143constructorimpl(1);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getCursorBased-4UtRPd4, reason: not valid java name */
        public final int m7149getCursorBased4UtRPd4() {
            return AutoClearFocusBehavior.CursorBased;
        }

        /* renamed from: getDefault-4UtRPd4, reason: not valid java name */
        public final int m7150getDefault4UtRPd4() {
            return m7149getCursorBased4UtRPd4();
        }

        /* renamed from: getNone-4UtRPd4, reason: not valid java name */
        public final int m7151getNone4UtRPd4() {
            return AutoClearFocusBehavior.None;
        }
    }

    private /* synthetic */ AutoClearFocusBehavior(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AutoClearFocusBehavior m7142boximpl(int i) {
        return new AutoClearFocusBehavior(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m7143constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7144equalsimpl(int i, Object obj) {
        return (obj instanceof AutoClearFocusBehavior) && i == ((AutoClearFocusBehavior) obj).m7148unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7145equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7146hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7147toStringimpl(int i) {
        return sg3.o(i, "AutoClearFocusBehavior(value=", ")");
    }

    public boolean equals(Object obj) {
        return m7144equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7146hashCodeimpl(this.value);
    }

    public String toString() {
        return m7147toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7148unboximpl() {
        return this.value;
    }
}
