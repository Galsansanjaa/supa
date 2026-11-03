package androidx.compose.foundation.lazy.staggeredgrid;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class StaggeredGridItemSpan {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final StaggeredGridItemSpan FullLine = new StaggeredGridItemSpan(0);
    private static final StaggeredGridItemSpan SingleLane = new StaggeredGridItemSpan(1);
    private final int value;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final StaggeredGridItemSpan getFullLine() {
            return StaggeredGridItemSpan.FullLine;
        }

        public final StaggeredGridItemSpan getSingleLane() {
            return StaggeredGridItemSpan.SingleLane;
        }
    }

    private StaggeredGridItemSpan(int i) {
        this.value = i;
    }

    public final int getValue$foundation() {
        return this.value;
    }
}
