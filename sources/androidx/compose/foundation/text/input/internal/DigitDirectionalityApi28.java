package androidx.compose.foundation.text.input.internal;

import android.icu.text.DecimalFormatSymbols;
import androidx.compose.ui.text.intl.Locale;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class DigitDirectionalityApi28 {
    public static final DigitDirectionalityApi28 INSTANCE = new DigitDirectionalityApi28();

    private DigitDirectionalityApi28() {
    }

    public final byte resolve(Locale locale) {
        return Character.getDirectionality(CodepointHelpers_jvmAndAndroidKt.codePointAt(DecimalFormatSymbols.getInstance(locale.getPlatformLocale()).getDigitStrings()[0], 0));
    }
}
