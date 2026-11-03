package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.lt;
import defpackage.sb0;
import defpackage.sg3;
import defpackage.wa2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class LineHeightStyle {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final LineHeightStyle Default;
    private final float alignment;
    private final int mode;
    private final int trim;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Alignment {
        private final float topRatio;
        public static final Companion Companion = new Companion(null);
        private static final float Top = m7899constructorimpl(0.0f);
        private static final float Center = m7899constructorimpl(0.5f);
        private static final float Proportional = m7899constructorimpl(-1.0f);
        private static final float Bottom = m7899constructorimpl(1.0f);

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(sb0 sb0Var) {
                this();
            }

            /* renamed from: getBottom-PIaL0Z0, reason: not valid java name */
            public final float m7905getBottomPIaL0Z0() {
                return Alignment.Bottom;
            }

            /* renamed from: getCenter-PIaL0Z0, reason: not valid java name */
            public final float m7906getCenterPIaL0Z0() {
                return Alignment.Center;
            }

            /* renamed from: getProportional-PIaL0Z0, reason: not valid java name */
            public final float m7907getProportionalPIaL0Z0() {
                return Alignment.Proportional;
            }

            /* renamed from: getTop-PIaL0Z0, reason: not valid java name */
            public final float m7908getTopPIaL0Z0() {
                return Alignment.Top;
            }
        }

        private /* synthetic */ Alignment(float f) {
            this.topRatio = f;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Alignment m7898boximpl(float f) {
            return new Alignment(f);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static float m7899constructorimpl(float f) {
            if (!((0.0f <= f && f <= 1.0f) || f == -1.0f)) {
                InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7900equalsimpl(float f, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f, ((Alignment) obj).m7904unboximpl()) == 0;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7901equalsimpl0(float f, float f2) {
            return Float.compare(f, f2) == 0;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7902hashCodeimpl(float f) {
            return Float.floatToIntBits(f);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7903toStringimpl(float f) {
            return f == Top ? "LineHeightStyle.Alignment.Top" : f == Center ? "LineHeightStyle.Alignment.Center" : f == Proportional ? "LineHeightStyle.Alignment.Proportional" : f == Bottom ? "LineHeightStyle.Alignment.Bottom" : sg3.p("LineHeightStyle.Alignment(topPercentage = ", f, ")");
        }

        public boolean equals(Object obj) {
            return m7900equalsimpl(this.topRatio, obj);
        }

        public int hashCode() {
            return m7902hashCodeimpl(this.topRatio);
        }

        public String toString() {
            return m7903toStringimpl(this.topRatio);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ float m7904unboximpl() {
            return this.topRatio;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final LineHeightStyle getDefault() {
            return LineHeightStyle.Default;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Mode {
        public static final Companion Companion = new Companion(null);
        private static final int Fixed = m7910constructorimpl(0);
        private static final int Minimum = m7910constructorimpl(1);
        private static final int Tight = m7910constructorimpl(2);
        private final int value;

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(sb0 sb0Var) {
                this();
            }

            /* renamed from: getFixed-lzQqcRY, reason: not valid java name */
            public final int m7916getFixedlzQqcRY() {
                return Mode.Fixed;
            }

            /* renamed from: getMinimum-lzQqcRY, reason: not valid java name */
            public final int m7917getMinimumlzQqcRY() {
                return Mode.Minimum;
            }

            /* renamed from: getTight-lzQqcRY, reason: not valid java name */
            public final int m7918getTightlzQqcRY() {
                return Mode.Tight;
            }
        }

        private /* synthetic */ Mode(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Mode m7909boximpl(int i) {
            return new Mode(i);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m7910constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7911equalsimpl(int i, Object obj) {
            return (obj instanceof Mode) && i == ((Mode) obj).m7915unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7912equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7913hashCodeimpl(int i) {
            return i;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7914toStringimpl(int i) {
            return m7912equalsimpl0(i, Fixed) ? "LineHeightStyle.Mode.Fixed" : m7912equalsimpl0(i, Minimum) ? "LineHeightStyle.Mode.Minimum" : m7912equalsimpl0(i, Tight) ? "LineHeightStyle.Mode.Tight" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m7911equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m7913hashCodeimpl(this.value);
        }

        public String toString() {
            return m7914toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m7915unboximpl() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Trim {
        private static final int FlagTrimBottom = 16;
        private static final int FlagTrimTop = 1;
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int FirstLineTop = m7920constructorimpl(1);
        private static final int LastLineBottom = m7920constructorimpl(16);
        private static final int Both = m7920constructorimpl(17);
        private static final int None = m7920constructorimpl(0);

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(sb0 sb0Var) {
                this();
            }

            /* renamed from: getBoth-EVpEnUU, reason: not valid java name */
            public final int m7928getBothEVpEnUU() {
                return Trim.Both;
            }

            /* renamed from: getFirstLineTop-EVpEnUU, reason: not valid java name */
            public final int m7929getFirstLineTopEVpEnUU() {
                return Trim.FirstLineTop;
            }

            /* renamed from: getLastLineBottom-EVpEnUU, reason: not valid java name */
            public final int m7930getLastLineBottomEVpEnUU() {
                return Trim.LastLineBottom;
            }

            /* renamed from: getNone-EVpEnUU, reason: not valid java name */
            public final int m7931getNoneEVpEnUU() {
                return Trim.None;
            }
        }

        private /* synthetic */ Trim(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Trim m7919boximpl(int i) {
            return new Trim(i);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m7920constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7921equalsimpl(int i, Object obj) {
            return (obj instanceof Trim) && i == ((Trim) obj).m7927unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7922equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7923hashCodeimpl(int i) {
            return i;
        }

        /* renamed from: isTrimFirstLineTop-impl$ui_text, reason: not valid java name */
        public static final boolean m7924isTrimFirstLineTopimpl$ui_text(int i) {
            return (i & 1) > 0;
        }

        /* renamed from: isTrimLastLineBottom-impl$ui_text, reason: not valid java name */
        public static final boolean m7925isTrimLastLineBottomimpl$ui_text(int i) {
            return (i & 16) > 0;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7926toStringimpl(int i) {
            return i == FirstLineTop ? "LineHeightStyle.Trim.FirstLineTop" : i == LastLineBottom ? "LineHeightStyle.Trim.LastLineBottom" : i == Both ? "LineHeightStyle.Trim.Both" : i == None ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m7921equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m7923hashCodeimpl(this.value);
        }

        public String toString() {
            return m7926toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m7927unboximpl() {
            return this.value;
        }
    }

    static {
        sb0 sb0Var = null;
        Companion = new Companion(sb0Var);
        Default = new LineHeightStyle(Alignment.Companion.m7907getProportionalPIaL0Z0(), Trim.Companion.m7928getBothEVpEnUU(), Mode.Companion.m7916getFixedlzQqcRY(), sb0Var);
    }

    private LineHeightStyle(float f, int i) {
        this(f, i, Mode.Companion.m7916getFixedlzQqcRY(), null);
    }

    private LineHeightStyle(float f, int i, int i2) {
        this.alignment = f;
        this.trim = i;
        this.mode = i2;
    }

    public /* synthetic */ LineHeightStyle(float f, int i, int i2, sb0 sb0Var) {
        this(f, i, i2);
    }

    public /* synthetic */ LineHeightStyle(float f, int i, sb0 sb0Var) {
        this(f, i);
    }

    /* renamed from: copy-38bxuX8$default, reason: not valid java name */
    public static /* synthetic */ LineHeightStyle m7893copy38bxuX8$default(LineHeightStyle lineHeightStyle, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f = lineHeightStyle.alignment;
        }
        if ((i3 & 2) != 0) {
            i = lineHeightStyle.trim;
        }
        if ((i3 & 4) != 0) {
            i2 = lineHeightStyle.mode;
        }
        return lineHeightStyle.m7894copy38bxuX8(f, i, i2);
    }

    /* renamed from: copy-38bxuX8, reason: not valid java name */
    public final LineHeightStyle m7894copy38bxuX8(float f, int i, int i2) {
        return new LineHeightStyle(f, i, i2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) obj;
        return Alignment.m7901equalsimpl0(this.alignment, lineHeightStyle.alignment) && Trim.m7922equalsimpl0(this.trim, lineHeightStyle.trim) && Mode.m7912equalsimpl0(this.mode, lineHeightStyle.mode);
    }

    /* renamed from: getAlignment-PIaL0Z0, reason: not valid java name */
    public final float m7895getAlignmentPIaL0Z0() {
        return this.alignment;
    }

    /* renamed from: getMode-lzQqcRY, reason: not valid java name */
    public final int m7896getModelzQqcRY() {
        return this.mode;
    }

    /* renamed from: getTrim-EVpEnUU, reason: not valid java name */
    public final int m7897getTrimEVpEnUU() {
        return this.trim;
    }

    public int hashCode() {
        return Mode.m7913hashCodeimpl(this.mode) + ((Trim.m7923hashCodeimpl(this.trim) + (Alignment.m7902hashCodeimpl(this.alignment) * 31)) * 31);
    }

    public String toString() {
        String m7903toStringimpl = Alignment.m7903toStringimpl(this.alignment);
        String m7926toStringimpl = Trim.m7926toStringimpl(this.trim);
        return wa2.v(lt.D("LineHeightStyle(alignment=", m7903toStringimpl, ", trim=", m7926toStringimpl, ",mode="), Mode.m7914toStringimpl(this.mode), ")");
    }
}
