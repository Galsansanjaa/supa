package androidx.compose.ui.semantics;

import defpackage.hd0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class InputTextSuggestionState {
    public static final int $stable = 0;
    private final boolean isCommittedByInputMethodEditor;
    private final boolean isTransliterationSuggestionSelected;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InputTextSuggestionState() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.InputTextSuggestionState.<init>():void");
    }

    @hd0
    public /* synthetic */ InputTextSuggestionState(boolean z) {
        this(z, false);
    }

    public /* synthetic */ InputTextSuggestionState(boolean z, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? false : z);
    }

    public InputTextSuggestionState(boolean z, boolean z2) {
        this.isCommittedByInputMethodEditor = z;
        this.isTransliterationSuggestionSelected = z2;
    }

    public /* synthetic */ InputTextSuggestionState(boolean z, boolean z2, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputTextSuggestionState)) {
            return false;
        }
        InputTextSuggestionState inputTextSuggestionState = (InputTextSuggestionState) obj;
        return this.isCommittedByInputMethodEditor == inputTextSuggestionState.isCommittedByInputMethodEditor && this.isTransliterationSuggestionSelected == inputTextSuggestionState.isTransliterationSuggestionSelected;
    }

    public int hashCode() {
        return ((this.isCommittedByInputMethodEditor ? 1231 : 1237) * 31) + (this.isTransliterationSuggestionSelected ? 1231 : 1237);
    }

    public final boolean isCommittedByInputMethodEditor() {
        return this.isCommittedByInputMethodEditor;
    }

    public final boolean isTransliterationSuggestionSelected() {
        return this.isTransliterationSuggestionSelected;
    }

    public String toString() {
        return "InputTextSuggestionState(isCommittedByInputMethodEditor=" + this.isCommittedByInputMethodEditor + ", suggestionSelected=" + this.isTransliterationSuggestionSelected + ")";
    }
}
