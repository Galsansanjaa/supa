package androidx.compose.ui.unit;

import androidx.compose.ui.unit.TextUnitType;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TextUnit {
    public static final Companion Companion = new Companion(null);
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m8249getUnspecifiedXSAIIZE$annotations() {
        }

        public final TextUnitType[] getTextUnitTypes$ui_unit() {
            return TextUnit.TextUnitTypes;
        }

        /* renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m8250getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.Companion;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m8264boximpl(companion.m8273getUnspecifiedUIouoOA()), TextUnitType.m8264boximpl(companion.m8272getSpUIouoOA()), TextUnitType.m8264boximpl(companion.m8271getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    private /* synthetic */ TextUnit(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m8229boximpl(long j) {
        return new TextUnit(j);
    }

    /* renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m8230compareToR2X_6o(long j, long j2) {
        TextUnitKt.m8253checkArithmeticNB67dxo(j, j2);
        return Float.compare(m8239getValueimpl(j), m8239getValueimpl(j2));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8231constructorimpl(long j) {
        return j;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m8232divkPz2Gy4(long j, double d) {
        TextUnitKt.m8252checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m8237getRawTypeimpl(j), (float) (m8239getValueimpl(j) / d));
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m8233divkPz2Gy4(long j, float f) {
        TextUnitKt.m8252checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m8237getRawTypeimpl(j), m8239getValueimpl(j) / f);
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m8234divkPz2Gy4(long j, int i) {
        TextUnitKt.m8252checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m8237getRawTypeimpl(j), m8239getValueimpl(j) / i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8235equalsimpl(long j, Object obj) {
        return (obj instanceof TextUnit) && j == ((TextUnit) obj).m8248unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8236equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: getRawType-impl, reason: not valid java name */
    public static final long m8237getRawTypeimpl(long j) {
        return j & 1095216660480L;
    }

    /* renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m8238getTypeUIouoOA(long j) {
        return TextUnitTypes[(int) (m8237getRawTypeimpl(j) >>> 32)].m8270unboximpl();
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m8239getValueimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8240hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m8241isEmimpl(long j) {
        return m8237getRawTypeimpl(j) == 8589934592L;
    }

    /* renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m8242isSpimpl(long j) {
        return m8237getRawTypeimpl(j) == 4294967296L;
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m8243timeskPz2Gy4(long j, double d) {
        TextUnitKt.m8252checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m8237getRawTypeimpl(j), (float) (m8239getValueimpl(j) * d));
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m8244timeskPz2Gy4(long j, float f) {
        TextUnitKt.m8252checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m8237getRawTypeimpl(j), m8239getValueimpl(j) * f);
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m8245timeskPz2Gy4(long j, int i) {
        TextUnitKt.m8252checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m8237getRawTypeimpl(j), m8239getValueimpl(j) * i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8246toStringimpl(long j) {
        long m8238getTypeUIouoOA = m8238getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m8267equalsimpl0(m8238getTypeUIouoOA, companion.m8273getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m8267equalsimpl0(m8238getTypeUIouoOA, companion.m8272getSpUIouoOA())) {
            return m8239getValueimpl(j) + ".sp";
        }
        if (!TextUnitType.m8267equalsimpl0(m8238getTypeUIouoOA, companion.m8271getEmUIouoOA())) {
            return "Invalid";
        }
        return m8239getValueimpl(j) + ".em";
    }

    /* renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m8247unaryMinusXSAIIZE(long j) {
        TextUnitKt.m8252checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m8237getRawTypeimpl(j), -m8239getValueimpl(j));
    }

    public boolean equals(Object obj) {
        return m8235equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m8240hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m8246toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8248unboximpl() {
        return this.packedValue;
    }
}
