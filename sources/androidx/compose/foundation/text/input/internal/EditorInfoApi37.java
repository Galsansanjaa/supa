package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class EditorInfoApi37 {
    public static final EditorInfoApi37 INSTANCE = new EditorInfoApi37();

    private EditorInfoApi37() {
    }

    public final void setEnableTextSuggestionSelectedInputType(EditorInfo editorInfo) {
        editorInfo.inputType |= 2097152;
    }
}
