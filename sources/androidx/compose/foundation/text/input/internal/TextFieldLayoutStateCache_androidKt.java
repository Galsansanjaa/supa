package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.style.TextDirection;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextFieldLayoutStateCache_androidKt {
    public static final int resolveTextDirectionForKeyboardTypePhone(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        byte resolve = i >= 28 ? DigitDirectionalityApi28.INSTANCE.resolve(locale) : i >= 24 ? DigitDirectionalityApi24.INSTANCE.resolve(locale) : DigitDirectionalityApi21.INSTANCE.resolve(locale);
        return (resolve == 1 || resolve == 2) ? TextDirection.Companion.m7960getRtls_7Xco() : TextDirection.Companion.m7959getLtrs_7Xco();
    }
}
