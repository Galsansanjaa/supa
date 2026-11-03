package androidx.compose.ui.text.style;

import defpackage.lt;
import defpackage.sb0;
import defpackage.wa2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class LineBreak {
    public static final Companion Companion = new Companion(null);
    private static final int Heading;
    private static final int Paragraph;
    private static final int Simple;
    private static final int Unspecified;
    private final int mask;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getHeading-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m7850getHeadingrAG3T2k$annotations() {
        }

        /* renamed from: getParagraph-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m7851getParagraphrAG3T2k$annotations() {
        }

        /* renamed from: getSimple-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m7852getSimplerAG3T2k$annotations() {
        }

        /* renamed from: getUnspecified-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m7853getUnspecifiedrAG3T2k$annotations() {
        }

        /* renamed from: getHeading-rAG3T2k, reason: not valid java name */
        public final int m7854getHeadingrAG3T2k() {
            return LineBreak.Heading;
        }

        /* renamed from: getParagraph-rAG3T2k, reason: not valid java name */
        public final int m7855getParagraphrAG3T2k() {
            return LineBreak.Paragraph;
        }

        /* renamed from: getSimple-rAG3T2k, reason: not valid java name */
        public final int m7856getSimplerAG3T2k() {
            return LineBreak.Simple;
        }

        /* renamed from: getUnspecified-rAG3T2k, reason: not valid java name */
        public final int m7857getUnspecifiedrAG3T2k() {
            return LineBreak.Unspecified;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Strategy {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Simple = m7859constructorimpl(1);
        private static final int HighQuality = m7859constructorimpl(2);
        private static final int Balanced = m7859constructorimpl(3);
        private static final int Unspecified = m7859constructorimpl(0);

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(sb0 sb0Var) {
                this();
            }

            /* renamed from: getBalanced-fcGXIks, reason: not valid java name */
            public final int m7865getBalancedfcGXIks() {
                return Strategy.Balanced;
            }

            /* renamed from: getHighQuality-fcGXIks, reason: not valid java name */
            public final int m7866getHighQualityfcGXIks() {
                return Strategy.HighQuality;
            }

            /* renamed from: getSimple-fcGXIks, reason: not valid java name */
            public final int m7867getSimplefcGXIks() {
                return Strategy.Simple;
            }

            /* renamed from: getUnspecified-fcGXIks, reason: not valid java name */
            public final int m7868getUnspecifiedfcGXIks() {
                return Strategy.Unspecified;
            }
        }

        private /* synthetic */ Strategy(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strategy m7858boximpl(int i) {
            return new Strategy(i);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m7859constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7860equalsimpl(int i, Object obj) {
            return (obj instanceof Strategy) && i == ((Strategy) obj).m7864unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7861equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7862hashCodeimpl(int i) {
            return i;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7863toStringimpl(int i) {
            return m7861equalsimpl0(i, Simple) ? "Strategy.Simple" : m7861equalsimpl0(i, HighQuality) ? "Strategy.HighQuality" : m7861equalsimpl0(i, Balanced) ? "Strategy.Balanced" : m7861equalsimpl0(i, Unspecified) ? "Strategy.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m7860equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m7862hashCodeimpl(this.value);
        }

        public String toString() {
            return m7863toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m7864unboximpl() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Strictness {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m7870constructorimpl(1);
        private static final int Loose = m7870constructorimpl(2);
        private static final int Normal = m7870constructorimpl(3);
        private static final int Strict = m7870constructorimpl(4);
        private static final int Unspecified = m7870constructorimpl(0);
        private final int value;

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(sb0 sb0Var) {
                this();
            }

            /* renamed from: getDefault-usljTpc, reason: not valid java name */
            public final int m7876getDefaultusljTpc() {
                return Strictness.Default;
            }

            /* renamed from: getLoose-usljTpc, reason: not valid java name */
            public final int m7877getLooseusljTpc() {
                return Strictness.Loose;
            }

            /* renamed from: getNormal-usljTpc, reason: not valid java name */
            public final int m7878getNormalusljTpc() {
                return Strictness.Normal;
            }

            /* renamed from: getStrict-usljTpc, reason: not valid java name */
            public final int m7879getStrictusljTpc() {
                return Strictness.Strict;
            }

            /* renamed from: getUnspecified-usljTpc, reason: not valid java name */
            public final int m7880getUnspecifiedusljTpc() {
                return Strictness.Unspecified;
            }
        }

        private /* synthetic */ Strictness(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strictness m7869boximpl(int i) {
            return new Strictness(i);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m7870constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7871equalsimpl(int i, Object obj) {
            return (obj instanceof Strictness) && i == ((Strictness) obj).m7875unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7872equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7873hashCodeimpl(int i) {
            return i;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7874toStringimpl(int i) {
            return m7872equalsimpl0(i, Default) ? "Strictness.None" : m7872equalsimpl0(i, Loose) ? "Strictness.Loose" : m7872equalsimpl0(i, Normal) ? "Strictness.Normal" : m7872equalsimpl0(i, Strict) ? "Strictness.Strict" : m7872equalsimpl0(i, Unspecified) ? "Strictness.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m7871equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m7873hashCodeimpl(this.value);
        }

        public String toString() {
            return m7874toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m7875unboximpl() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class WordBreak {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m7882constructorimpl(1);
        private static final int Phrase = m7882constructorimpl(2);
        private static final int Unspecified = m7882constructorimpl(0);
        private final int value;

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(sb0 sb0Var) {
                this();
            }

            /* renamed from: getDefault-jp8hJ3c, reason: not valid java name */
            public final int m7888getDefaultjp8hJ3c() {
                return WordBreak.Default;
            }

            /* renamed from: getPhrase-jp8hJ3c, reason: not valid java name */
            public final int m7889getPhrasejp8hJ3c() {
                return WordBreak.Phrase;
            }

            /* renamed from: getUnspecified-jp8hJ3c, reason: not valid java name */
            public final int m7890getUnspecifiedjp8hJ3c() {
                return WordBreak.Unspecified;
            }
        }

        private /* synthetic */ WordBreak(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WordBreak m7881boximpl(int i) {
            return new WordBreak(i);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m7882constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7883equalsimpl(int i, Object obj) {
            return (obj instanceof WordBreak) && i == ((WordBreak) obj).m7887unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7884equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7885hashCodeimpl(int i) {
            return i;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7886toStringimpl(int i) {
            return m7884equalsimpl0(i, Default) ? "WordBreak.None" : m7884equalsimpl0(i, Phrase) ? "WordBreak.Phrase" : m7884equalsimpl0(i, Unspecified) ? "WordBreak.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m7883equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m7885hashCodeimpl(this.value);
        }

        public String toString() {
            return m7886toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m7887unboximpl() {
            return this.value;
        }
    }

    static {
        int packBytes;
        int packBytes2;
        int packBytes3;
        Strategy.Companion companion = Strategy.Companion;
        int m7867getSimplefcGXIks = companion.m7867getSimplefcGXIks();
        Strictness.Companion companion2 = Strictness.Companion;
        int m7878getNormalusljTpc = companion2.m7878getNormalusljTpc();
        WordBreak.Companion companion3 = WordBreak.Companion;
        packBytes = LineBreak_androidKt.packBytes(m7867getSimplefcGXIks, m7878getNormalusljTpc, companion3.m7888getDefaultjp8hJ3c());
        Simple = m7838constructorimpl(packBytes);
        packBytes2 = LineBreak_androidKt.packBytes(companion.m7865getBalancedfcGXIks(), companion2.m7877getLooseusljTpc(), companion3.m7889getPhrasejp8hJ3c());
        Heading = m7838constructorimpl(packBytes2);
        packBytes3 = LineBreak_androidKt.packBytes(companion.m7866getHighQualityfcGXIks(), companion2.m7879getStrictusljTpc(), companion3.m7888getDefaultjp8hJ3c());
        Paragraph = m7838constructorimpl(packBytes3);
        Unspecified = m7838constructorimpl(0);
    }

    private /* synthetic */ LineBreak(int i) {
        this.mask = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineBreak m7837boximpl(int i) {
        return new LineBreak(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7838constructorimpl(int i) {
        return i;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7839constructorimpl(int i, int i2, int i3) {
        int packBytes;
        packBytes = LineBreak_androidKt.packBytes(i, i2, i3);
        return m7838constructorimpl(packBytes);
    }

    /* renamed from: copy-gijOMQM, reason: not valid java name */
    public static final int m7840copygijOMQM(int i, int i2, int i3, int i4) {
        return m7839constructorimpl(i2, i3, i4);
    }

    /* renamed from: copy-gijOMQM$default, reason: not valid java name */
    public static /* synthetic */ int m7841copygijOMQM$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = m7844getStrategyfcGXIks(i);
        }
        if ((i5 & 2) != 0) {
            i3 = m7845getStrictnessusljTpc(i);
        }
        if ((i5 & 4) != 0) {
            i4 = m7846getWordBreakjp8hJ3c(i);
        }
        return m7840copygijOMQM(i, i2, i3, i4);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7842equalsimpl(int i, Object obj) {
        return (obj instanceof LineBreak) && i == ((LineBreak) obj).m7849unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7843equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getStrategy-fcGXIks, reason: not valid java name */
    public static final int m7844getStrategyfcGXIks(int i) {
        int unpackByte1;
        unpackByte1 = LineBreak_androidKt.unpackByte1(i);
        return Strategy.m7859constructorimpl(unpackByte1);
    }

    /* renamed from: getStrictness-usljTpc, reason: not valid java name */
    public static final int m7845getStrictnessusljTpc(int i) {
        int unpackByte2;
        unpackByte2 = LineBreak_androidKt.unpackByte2(i);
        return Strictness.m7870constructorimpl(unpackByte2);
    }

    /* renamed from: getWordBreak-jp8hJ3c, reason: not valid java name */
    public static final int m7846getWordBreakjp8hJ3c(int i) {
        int unpackByte3;
        unpackByte3 = LineBreak_androidKt.unpackByte3(i);
        return WordBreak.m7882constructorimpl(unpackByte3);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7847hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7848toStringimpl(int i) {
        String m7863toStringimpl = Strategy.m7863toStringimpl(m7844getStrategyfcGXIks(i));
        String m7874toStringimpl = Strictness.m7874toStringimpl(m7845getStrictnessusljTpc(i));
        return wa2.v(lt.D("LineBreak(strategy=", m7863toStringimpl, ", strictness=", m7874toStringimpl, ", wordBreak="), WordBreak.m7886toStringimpl(m7846getWordBreakjp8hJ3c(i)), ")");
    }

    public boolean equals(Object obj) {
        return m7842equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m7847hashCodeimpl(this.mask);
    }

    public String toString() {
        return m7848toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7849unboximpl() {
        return this.mask;
    }
}
