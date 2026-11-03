package androidx.compose.ui.autofill;

import defpackage.um2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AutofillUtils_androidKt {
    public static final int MAX_AUTOFILL_TEXT_LENGTH = 5000;

    public static final CharSequence trimToSafeLength(CharSequence charSequence) {
        return charSequence.length() <= 5000 ? charSequence : (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(MAX_AUTOFILL_TEXT_LENGTH))) ? um2.K0(4999, charSequence) : um2.K0(MAX_AUTOFILL_TEXT_LENGTH, charSequence);
    }
}
