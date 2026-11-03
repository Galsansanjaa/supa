package androidx.compose.foundation.text.modifiers;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class StylePhase {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Layout = m2088constructorimpl(1);
    private static final int Draw = m2088constructorimpl(2);
    private static final int All = m2088constructorimpl(-1);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getAll-oWBPZag, reason: not valid java name */
        public final int m2094getAlloWBPZag() {
            return StylePhase.All;
        }

        /* renamed from: getDraw-oWBPZag, reason: not valid java name */
        public final int m2095getDrawoWBPZag() {
            return StylePhase.Draw;
        }

        /* renamed from: getLayout-oWBPZag, reason: not valid java name */
        public final int m2096getLayoutoWBPZag() {
            return StylePhase.Layout;
        }
    }

    private /* synthetic */ StylePhase(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StylePhase m2087boximpl(int i) {
        return new StylePhase(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m2088constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2089equalsimpl(int i, Object obj) {
        return (obj instanceof StylePhase) && i == ((StylePhase) obj).m2093unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2090equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2091hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2092toStringimpl(int i) {
        return sg3.o(i, "StylePhase(value=", ")");
    }

    public boolean equals(Object obj) {
        return m2089equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2091hashCodeimpl(this.value);
    }

    public String toString() {
        return m2092toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2093unboximpl() {
        return this.value;
    }
}
