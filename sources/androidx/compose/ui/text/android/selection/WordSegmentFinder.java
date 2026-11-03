package androidx.compose.ui.text.android.selection;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class WordSegmentFinder implements SegmentFinder {
    public static final int $stable = 8;
    private final CharSequence text;
    private final WordIterator wordIterator;

    public WordSegmentFinder(CharSequence charSequence, WordIterator wordIterator) {
        this.text = charSequence;
        this.wordIterator = wordIterator;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextEndBoundary(int i) {
        do {
            i = this.wordIterator.nextBoundary(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i - 1)));
        return i;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextStartBoundary(int i) {
        do {
            i = this.wordIterator.nextBoundary(i);
            if (i == -1 || i == this.text.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i)));
        return i;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousEndBoundary(int i) {
        do {
            i = this.wordIterator.prevBoundary(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i - 1)));
        return i;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousStartBoundary(int i) {
        do {
            i = this.wordIterator.prevBoundary(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i)));
        return i;
    }
}
