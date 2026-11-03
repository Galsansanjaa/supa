package defpackage;

import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.ui.geometry.Rect;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class jn implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextFieldSelectionState b;

    public /* synthetic */ jn(TextFieldSelectionState textFieldSelectionState, int i) {
        this.a = i;
        this.b = textFieldSelectionState;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        boolean TextFieldCursorHandle$lambda$0$0;
        TextFieldHandleState selectionHandleState$foundation;
        TextFieldHandleState selectionHandleState$foundation2;
        Rect derivedVisibleContentBounds$foundation;
        TextFieldCharSequence observeTextChanges$lambda$0;
        Rect derivedVisibleContentBounds_delegate$lambda$0;
        vy2 addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$1;
        vy2 addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$2;
        int i = this.a;
        TextFieldSelectionState textFieldSelectionState = this.b;
        switch (i) {
            case 0:
                TextFieldCursorHandle$lambda$0$0 = BasicTextFieldKt.TextFieldCursorHandle$lambda$0$0(textFieldSelectionState);
                break;
            case 1:
                selectionHandleState$foundation = textFieldSelectionState.getSelectionHandleState$foundation(true, false);
                return selectionHandleState$foundation;
            case 2:
                selectionHandleState$foundation2 = textFieldSelectionState.getSelectionHandleState$foundation(false, false);
                return selectionHandleState$foundation2;
            case 3:
                derivedVisibleContentBounds$foundation = textFieldSelectionState.getDerivedVisibleContentBounds$foundation();
                return derivedVisibleContentBounds$foundation;
            case 4:
                observeTextChanges$lambda$0 = TextFieldSelectionState.observeTextChanges$lambda$0(textFieldSelectionState);
                return observeTextChanges$lambda$0;
            case 5:
                derivedVisibleContentBounds_delegate$lambda$0 = TextFieldSelectionState.derivedVisibleContentBounds_delegate$lambda$0(textFieldSelectionState);
                return derivedVisibleContentBounds_delegate$lambda$0;
            case 6:
                TextFieldCursorHandle$lambda$0$0 = TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$0(textFieldSelectionState);
                break;
            case 7:
                addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$1 = TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$1(textFieldSelectionState);
                return addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$1;
            default:
                addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$2 = TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$2(textFieldSelectionState);
                return addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$2;
        }
        return Boolean.valueOf(TextFieldCursorHandle$lambda$0$0);
    }
}
