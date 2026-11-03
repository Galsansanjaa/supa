package androidx.compose.ui.text.style;

import androidx.compose.ui.util.MathHelpersKt;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class BaselineShiftKt {
    /* renamed from: isSpecified-4Dl_Bck, reason: not valid java name */
    public static final boolean m7816isSpecified4Dl_Bck(float f) {
        return !Float.isNaN(f);
    }

    /* renamed from: lerp-jWV1Mfo, reason: not valid java name */
    public static final float m7817lerpjWV1Mfo(float f, float f2, float f3) {
        return BaselineShift.m7802constructorimpl(MathHelpersKt.lerp(f, f2, f3));
    }

    /* renamed from: takeOrElse-JpAxnlU, reason: not valid java name */
    public static final float m7818takeOrElseJpAxnlU(float f, os0 os0Var) {
        return Float.isNaN(f) ? ((BaselineShift) os0Var.invoke()).m7807unboximpl() : f;
    }
}
