package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import defpackage.et0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class TextFieldSelectionState$observeTextChanges$3 extends et0 implements ts0 {
    public static final TextFieldSelectionState$observeTextChanges$3 INSTANCE = new TextFieldSelectionState$observeTextChanges$3();

    public TextFieldSelectionState$observeTextChanges$3() {
        super(2, TextFieldCharSequence.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
    }

    @Override // defpackage.ts0
    public final Boolean invoke(TextFieldCharSequence textFieldCharSequence, CharSequence charSequence) {
        return Boolean.valueOf(textFieldCharSequence.contentEquals(charSequence));
    }
}
