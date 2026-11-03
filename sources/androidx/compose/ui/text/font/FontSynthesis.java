package androidx.compose.ui.text.font;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class FontSynthesis {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m7608constructorimpl(0);
    private static final int Weight = m7608constructorimpl(1);
    private static final int Style = m7608constructorimpl(2);
    private static final int All = m7608constructorimpl(65535);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getAll-GVVA2EU, reason: not valid java name */
        public final int m7616getAllGVVA2EU() {
            return FontSynthesis.All;
        }

        /* renamed from: getNone-GVVA2EU, reason: not valid java name */
        public final int m7617getNoneGVVA2EU() {
            return FontSynthesis.None;
        }

        /* renamed from: getStyle-GVVA2EU, reason: not valid java name */
        public final int m7618getStyleGVVA2EU() {
            return FontSynthesis.Style;
        }

        /* renamed from: getWeight-GVVA2EU, reason: not valid java name */
        public final int m7619getWeightGVVA2EU() {
            return FontSynthesis.Weight;
        }

        /* renamed from: valueOf-9CiegCU, reason: not valid java name */
        public final int m7620valueOf9CiegCU(int i) {
            boolean z = true;
            if (i != 0 && i != 1 && i != 2 && i != 65535) {
                z = false;
            }
            if (!z) {
                InlineClassHelperKt.throwIllegalArgumentException("The given value=" + i + " is not recognized by FontSynthesis.");
            }
            return FontSynthesis.m7608constructorimpl(i);
        }
    }

    private /* synthetic */ FontSynthesis(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontSynthesis m7607boximpl(int i) {
        return new FontSynthesis(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7608constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7609equalsimpl(int i, Object obj) {
        return (obj instanceof FontSynthesis) && i == ((FontSynthesis) obj).m7615unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7610equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7611hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: isStyleOn-impl$ui_text, reason: not valid java name */
    public static final boolean m7612isStyleOnimpl$ui_text(int i) {
        return (i & 2) != 0;
    }

    /* renamed from: isWeightOn-impl$ui_text, reason: not valid java name */
    public static final boolean m7613isWeightOnimpl$ui_text(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7614toStringimpl(int i) {
        return m7610equalsimpl0(i, None) ? "None" : m7610equalsimpl0(i, Weight) ? "Weight" : m7610equalsimpl0(i, Style) ? "Style" : m7610equalsimpl0(i, All) ? "All" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m7609equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m7611hashCodeimpl(this.value);
    }

    public String toString() {
        return m7614toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7615unboximpl() {
        return this.value;
    }
}
