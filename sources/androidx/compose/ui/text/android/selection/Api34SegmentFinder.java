package androidx.compose.ui.text.android.selection;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class Api34SegmentFinder {
    public static final int $stable = 0;
    public static final Api34SegmentFinder INSTANCE = new Api34SegmentFinder();

    private Api34SegmentFinder() {
    }

    public final android.text.SegmentFinder toAndroidSegmentFinder$ui_text(final SegmentFinder segmentFinder) {
        return new android.text.SegmentFinder() { // from class: androidx.compose.ui.text.android.selection.Api34SegmentFinder$toAndroidSegmentFinder$1
            public int nextEndBoundary(int i) {
                return SegmentFinder.this.nextEndBoundary(i);
            }

            public int nextStartBoundary(int i) {
                return SegmentFinder.this.nextStartBoundary(i);
            }

            public int previousEndBoundary(int i) {
                return SegmentFinder.this.previousEndBoundary(i);
            }

            public int previousStartBoundary(int i) {
                return SegmentFinder.this.previousStartBoundary(i);
            }
        };
    }
}
