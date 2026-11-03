package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.text.input.TextFieldCharSequence;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface TextInputSession extends ImeEditCommandScope {
    TextFieldCharSequence getText();

    boolean onCommitContent(TransferableContent transferableContent);

    /* renamed from: onImeAction-KlQnJC8 */
    void mo1777onImeActionKlQnJC8(int i);

    int performHandwritingGesture(HandwritingGesture handwritingGesture);

    boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal);

    void requestCursorUpdates(int i);

    void sendKeyEvent(KeyEvent keyEvent);

    void updateTouchMode(boolean z);
}
