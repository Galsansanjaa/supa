package androidx.compose.foundation.text;

import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.compose.ui.unit.TextUnitKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextAutoSizeDefaults {
    public static final int $stable = 0;
    public static final TextAutoSizeDefaults INSTANCE = new TextAutoSizeDefaults();
    private static final long MinFontSize = TextUnitKt.getSp(12);
    private static final long MaxFontSize = TextUnitKt.getSp(StylePropertiesKt.TextDirectionMask);

    private TextAutoSizeDefaults() {
    }

    /* renamed from: getMaxFontSize-XSAIIZE, reason: not valid java name */
    public final long m1641getMaxFontSizeXSAIIZE() {
        return MaxFontSize;
    }

    /* renamed from: getMinFontSize-XSAIIZE, reason: not valid java name */
    public final long m1642getMinFontSizeXSAIIZE() {
        return MinFontSize;
    }
}
