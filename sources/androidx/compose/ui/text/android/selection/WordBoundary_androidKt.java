package androidx.compose.ui.text.android.selection;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class WordBoundary_androidKt {
    public static final int getWordEnd(WordIterator wordIterator, int i) {
        int punctuationEnd = wordIterator.isAfterPunctuation(wordIterator.nextBoundary(i)) ? wordIterator.getPunctuationEnd(i) : wordIterator.getNextWordEndOnTwoWordBoundary(i);
        return punctuationEnd == -1 ? i : punctuationEnd;
    }

    public static final int getWordStart(WordIterator wordIterator, int i) {
        int punctuationBeginning = wordIterator.isOnPunctuation(wordIterator.prevBoundary(i)) ? wordIterator.getPunctuationBeginning(i) : wordIterator.getPrevWordBeginningOnTwoWordsBoundary(i);
        return punctuationBeginning == -1 ? i : punctuationBeginning;
    }
}
