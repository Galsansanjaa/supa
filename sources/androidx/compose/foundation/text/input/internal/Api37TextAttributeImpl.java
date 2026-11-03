package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.TextAttribute;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class Api37TextAttributeImpl {
    public static final Api37TextAttributeImpl INSTANCE = new Api37TextAttributeImpl();

    private Api37TextAttributeImpl() {
    }

    public final boolean isTextSuggestionSelected(TextAttribute textAttribute) {
        return textAttribute.isTextSuggestionSelected();
    }
}
