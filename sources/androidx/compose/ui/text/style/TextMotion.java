package androidx.compose.ui.text.style;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TextMotion {
    public static final int $stable = 0;
    private static final TextMotion Animated;
    public static final Companion Companion;
    private static final TextMotion Static;
    private final int linearity;
    private final boolean subpixelTextPositioning;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final TextMotion getAnimated() {
            return TextMotion.Animated;
        }

        public final TextMotion getStatic() {
            return TextMotion.Static;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Linearity {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Linear = m7975constructorimpl(1);
        private static final int FontHinting = m7975constructorimpl(2);
        private static final int None = m7975constructorimpl(3);

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(sb0 sb0Var) {
                this();
            }

            /* renamed from: getFontHinting-4e0Vf04, reason: not valid java name */
            public final int m7981getFontHinting4e0Vf04() {
                return Linearity.FontHinting;
            }

            /* renamed from: getLinear-4e0Vf04, reason: not valid java name */
            public final int m7982getLinear4e0Vf04() {
                return Linearity.Linear;
            }

            /* renamed from: getNone-4e0Vf04, reason: not valid java name */
            public final int m7983getNone4e0Vf04() {
                return Linearity.None;
            }
        }

        private /* synthetic */ Linearity(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Linearity m7974boximpl(int i) {
            return new Linearity(i);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m7975constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7976equalsimpl(int i, Object obj) {
            return (obj instanceof Linearity) && i == ((Linearity) obj).m7980unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7977equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7978hashCodeimpl(int i) {
            return i;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7979toStringimpl(int i) {
            return m7977equalsimpl0(i, Linear) ? "Linearity.Linear" : m7977equalsimpl0(i, FontHinting) ? "Linearity.FontHinting" : m7977equalsimpl0(i, None) ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m7976equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m7978hashCodeimpl(this.value);
        }

        public String toString() {
            return m7979toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m7980unboximpl() {
            return this.value;
        }
    }

    static {
        sb0 sb0Var = null;
        Companion = new Companion(sb0Var);
        Linearity.Companion companion = Linearity.Companion;
        Static = new TextMotion(companion.m7981getFontHinting4e0Vf04(), false, sb0Var);
        Animated = new TextMotion(companion.m7982getLinear4e0Vf04(), true, sb0Var);
    }

    private TextMotion(int i, boolean z) {
        this.linearity = i;
        this.subpixelTextPositioning = z;
    }

    public /* synthetic */ TextMotion(int i, boolean z, sb0 sb0Var) {
        this(i, z);
    }

    /* renamed from: copy-JdDtMQo$ui_text$default, reason: not valid java name */
    public static /* synthetic */ TextMotion m7971copyJdDtMQo$ui_text$default(TextMotion textMotion, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = textMotion.linearity;
        }
        if ((i2 & 2) != 0) {
            z = textMotion.subpixelTextPositioning;
        }
        return textMotion.m7972copyJdDtMQo$ui_text(i, z);
    }

    /* renamed from: copy-JdDtMQo$ui_text, reason: not valid java name */
    public final TextMotion m7972copyJdDtMQo$ui_text(int i, boolean z) {
        return new TextMotion(i, z, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) obj;
        return Linearity.m7977equalsimpl0(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning;
    }

    /* renamed from: getLinearity-4e0Vf04$ui_text, reason: not valid java name */
    public final int m7973getLinearity4e0Vf04$ui_text() {
        return this.linearity;
    }

    public final boolean getSubpixelTextPositioning$ui_text() {
        return this.subpixelTextPositioning;
    }

    public int hashCode() {
        return (Linearity.m7978hashCodeimpl(this.linearity) * 31) + (this.subpixelTextPositioning ? 1231 : 1237);
    }

    public String toString() {
        return equals(Static) ? "TextMotion.Static" : equals(Animated) ? "TextMotion.Animated" : "Invalid";
    }
}
