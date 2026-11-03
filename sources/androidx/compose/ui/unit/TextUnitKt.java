package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    /* renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m8251TextUnitanM5pPY(float f, long j) {
        return pack(j, f);
    }

    /* renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m8252checkArithmeticR2X_6o(long j) {
        if (TextUnit.m8237getRawTypeimpl(j) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    /* renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m8253checkArithmeticNB67dxo(long j, long j2) {
        if (!((TextUnit.m8237getRawTypeimpl(j) == 0 || TextUnit.m8237getRawTypeimpl(j2) == 0) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m8267equalsimpl0(TextUnit.m8238getTypeUIouoOA(j), TextUnit.m8238getTypeUIouoOA(j2))) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + TextUnitType.m8269toStringimpl(TextUnit.m8238getTypeUIouoOA(j)) + " and " + TextUnitType.m8269toStringimpl(TextUnit.m8238getTypeUIouoOA(j2)));
    }

    /* renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m8254checkArithmeticvU0ePk(long j, long j2, long j3) {
        boolean z = false;
        if (!((TextUnit.m8237getRawTypeimpl(j) == 0 || TextUnit.m8237getRawTypeimpl(j2) == 0 || TextUnit.m8237getRawTypeimpl(j3) == 0) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m8267equalsimpl0(TextUnit.m8238getTypeUIouoOA(j), TextUnit.m8238getTypeUIouoOA(j2)) && TextUnitType.m8267equalsimpl0(TextUnit.m8238getTypeUIouoOA(j2), TextUnit.m8238getTypeUIouoOA(j3))) {
            z = true;
        }
        if (z) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + TextUnitType.m8269toStringimpl(TextUnit.m8238getTypeUIouoOA(j)) + " and " + TextUnitType.m8269toStringimpl(TextUnit.m8238getTypeUIouoOA(j2)));
    }

    public static final long getEm(double d) {
        return pack(UNIT_TYPE_EM, (float) d);
    }

    public static final long getEm(float f) {
        return pack(UNIT_TYPE_EM, f);
    }

    public static final long getEm(int i) {
        return pack(UNIT_TYPE_EM, i);
    }

    public static /* synthetic */ void getEm$annotations(double d) {
    }

    public static /* synthetic */ void getEm$annotations(float f) {
    }

    public static /* synthetic */ void getEm$annotations(int i) {
    }

    public static final long getSp(double d) {
        return pack(UNIT_TYPE_SP, (float) d);
    }

    public static final long getSp(float f) {
        return pack(UNIT_TYPE_SP, f);
    }

    public static final long getSp(int i) {
        return pack(UNIT_TYPE_SP, i);
    }

    public static /* synthetic */ void getSp$annotations(double d) {
    }

    public static /* synthetic */ void getSp$annotations(float f) {
    }

    public static /* synthetic */ void getSp$annotations(int i) {
    }

    /* renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m8255isSpecifiedR2X_6o(long j) {
        return !(TextUnit.m8237getRawTypeimpl(j) == 0);
    }

    /* renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m8256isSpecifiedR2X_6o$annotations(long j) {
    }

    /* renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m8257isUnspecifiedR2X_6o(long j) {
        return TextUnit.m8237getRawTypeimpl(j) == 0;
    }

    /* renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m8258isUnspecifiedR2X_6o$annotations(long j) {
    }

    /* renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m8259lerpC3pnCVY(long j, long j2, float f) {
        m8253checkArithmeticNB67dxo(j, j2);
        return pack(TextUnit.m8237getRawTypeimpl(j), MathHelpersKt.lerp(TextUnit.m8239getValueimpl(j), TextUnit.m8239getValueimpl(j2), f));
    }

    public static final long pack(long j, float f) {
        return TextUnit.m8231constructorimpl(j | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    /* renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m8260takeOrElseeAf_CNQ(long j, os0 os0Var) {
        return !((TextUnit.m8237getRawTypeimpl(j) > 0L ? 1 : (TextUnit.m8237getRawTypeimpl(j) == 0L ? 0 : -1)) == 0) ? j : ((TextUnit) os0Var.invoke()).m8248unboximpl();
    }

    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m8261timesmpE4wyQ(double d, long j) {
        m8252checkArithmeticR2X_6o(j);
        return pack(TextUnit.m8237getRawTypeimpl(j), TextUnit.m8239getValueimpl(j) * ((float) d));
    }

    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m8262timesmpE4wyQ(float f, long j) {
        m8252checkArithmeticR2X_6o(j);
        return pack(TextUnit.m8237getRawTypeimpl(j), TextUnit.m8239getValueimpl(j) * f);
    }

    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m8263timesmpE4wyQ(int i, long j) {
        m8252checkArithmeticR2X_6o(j);
        return pack(TextUnit.m8237getRawTypeimpl(j), TextUnit.m8239getValueimpl(j) * i);
    }
}
