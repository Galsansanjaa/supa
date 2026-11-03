package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.k93;
import defpackage.lh0;
import defpackage.sb0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }
    }

    private EditingBuffer(AnnotatedString annotatedString, long j) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m7484getMinimpl(j);
        this.selectionEnd = TextRange.m7483getMaximpl(j);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int m7484getMinimpl = TextRange.m7484getMinimpl(j);
        int m7483getMaximpl = TextRange.m7483getMaximpl(j);
        if (m7484getMinimpl < 0 || m7484getMinimpl > annotatedString.length()) {
            lh0.f(k93.l(m7484getMinimpl, annotatedString.length(), "start (", ") offset is outside of text region "));
            throw null;
        }
        if (m7483getMaximpl < 0 || m7483getMaximpl > annotatedString.length()) {
            lh0.f(k93.l(m7483getMaximpl, annotatedString.length(), "end (", ") offset is outside of text region "));
            throw null;
        }
        if (m7484getMinimpl <= m7483getMaximpl) {
            return;
        }
        v5.m(k93.l(m7484getMinimpl, m7483getMaximpl, "Do not set reversed range: ", " > "));
        throw null;
    }

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j, sb0 sb0Var) {
        this(annotatedString, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private EditingBuffer(String str, long j) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j, (sb0) (0 == true ? 1 : 0));
    }

    public /* synthetic */ EditingBuffer(String str, long j, sb0 sb0Var) {
        this(str, j);
    }

    private final void setSelectionEnd(int i) {
        if (!(i >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionEnd to a negative value: " + i);
        }
        this.selectionEnd = i;
    }

    private final void setSelectionStart(int i) {
        if (!(i >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionStart to a negative value: " + i);
        }
        this.selectionStart = i;
    }

    public final void cancelComposition$ui_text() {
        replace$ui_text(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text(int i, int i2) {
        long TextRange = TextRangeKt.TextRange(i, i2);
        this.gapBuffer.replace(i, i2, "");
        long m7648updateRangeAfterDeletepWDy79M = EditingBufferKt.m7648updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), TextRange);
        setSelectionStart(TextRange.m7484getMinimpl(m7648updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m7483getMaximpl(m7648updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text()) {
            long m7648updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m7648updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), TextRange);
            if (TextRange.m7480getCollapsedimpl(m7648updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text();
            } else {
                this.compositionStart = TextRange.m7484getMinimpl(m7648updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m7483getMaximpl(m7648updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final char get$ui_text(int i) {
        return this.gapBuffer.get(i);
    }

    /* renamed from: getComposition-MzsxiRA$ui_text, reason: not valid java name */
    public final TextRange m7646getCompositionMzsxiRA$ui_text() {
        if (hasComposition$ui_text()) {
            return TextRange.m7474boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    public final int getCompositionEnd$ui_text() {
        return this.compositionEnd;
    }

    public final int getCompositionStart$ui_text() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text() {
        int i = this.selectionStart;
        int i2 = this.selectionEnd;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final int getLength$ui_text() {
        return this.gapBuffer.getLength();
    }

    /* renamed from: getSelection-d9O1mEE$ui_text, reason: not valid java name */
    public final long m7647getSelectiond9O1mEE$ui_text() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getSelectionEnd$ui_text() {
        return this.selectionEnd;
    }

    public final int getSelectionStart$ui_text() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text() {
        return this.compositionStart != -1;
    }

    public final void replace$ui_text(int i, int i2, AnnotatedString annotatedString) {
        replace$ui_text(i, i2, annotatedString.getText());
    }

    public final void replace$ui_text(int i, int i2, String str) {
        if (i < 0 || i > this.gapBuffer.getLength()) {
            lh0.f(k93.l(i, this.gapBuffer.getLength(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            lh0.f(k93.l(i2, this.gapBuffer.getLength(), "end (", ") offset is outside of text region "));
            return;
        }
        if (i > i2) {
            v5.m(k93.l(i, i2, "Do not set reversed range: ", " > "));
            return;
        }
        this.gapBuffer.replace(i, i2, str);
        setSelectionStart(str.length() + i);
        setSelectionEnd(str.length() + i);
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void setComposition$ui_text(int i, int i2) {
        if (i < 0 || i > this.gapBuffer.getLength()) {
            lh0.f(k93.l(i, this.gapBuffer.getLength(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            lh0.f(k93.l(i2, this.gapBuffer.getLength(), "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            v5.m(k93.l(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.compositionStart = i;
            this.compositionEnd = i2;
        }
    }

    public final void setCursor$ui_text(int i) {
        setSelection$ui_text(i, i);
    }

    public final void setSelection$ui_text(int i, int i2) {
        if (i < 0 || i > this.gapBuffer.getLength()) {
            lh0.f(k93.l(i, this.gapBuffer.getLength(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            lh0.f(k93.l(i2, this.gapBuffer.getLength(), "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            v5.m(k93.l(i, i2, "Do not set reversed range: ", " > "));
        } else {
            setSelectionStart(i);
            setSelectionEnd(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnnotatedString toAnnotatedString$ui_text() {
        return new AnnotatedString(toString(), null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return this.gapBuffer.toString();
    }
}
