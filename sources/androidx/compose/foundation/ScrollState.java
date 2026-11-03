package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import defpackage.a10;
import defpackage.cc2;
import defpackage.e50;
import defpackage.ea0;
import defpackage.mi1;
import defpackage.nb2;
import defpackage.os0;
import defpackage.ps0;
import defpackage.sb0;
import defpackage.ts0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ScrollState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<ScrollState, ?> Saver = SaverKt.Saver(new nb2(2), new cc2(0));
    private MutableIntState _maxValueState;
    private final ScrollState$_scrollIndicatorState$1 _scrollIndicatorState;
    private float accumulator;
    private final State canScrollBackward$delegate;
    private final State canScrollForward$delegate;
    private final MutableInteractionSource internalInteractionSource;
    private final MutableState reverseScrolling$delegate;
    private final ScrollableState scrollableState;
    private final MutableIntState value$delegate;
    private final MutableIntState viewportSize$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
    private final MutableIntState contentSize$delegate = SnapshotIntStateKt.mutableIntStateOf(0);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final Saver<ScrollState, ?> getSaver() {
            return ScrollState.Saver;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.foundation.ScrollState$_scrollIndicatorState$1] */
    public ScrollState(int i) {
        MutableState mutableStateOf$default;
        this.value$delegate = SnapshotIntStateKt.mutableIntStateOf(i);
        final int i2 = 0;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.reverseScrolling$delegate = mutableStateOf$default;
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this._maxValueState = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);
        this.scrollableState = ScrollableStateKt.ScrollableState(new mi1(this, 18));
        this._scrollIndicatorState = new ScrollIndicatorState() { // from class: androidx.compose.foundation.ScrollState$_scrollIndicatorState$1
            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getContentSize() {
                return ScrollState.this.getContentSize$foundation();
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getScrollOffset() {
                boolean reverseScrolling$foundation = ScrollState.this.getReverseScrolling$foundation();
                ScrollState scrollState = ScrollState.this;
                return reverseScrolling$foundation ? scrollState.getMaxValue() - ScrollState.this.getValue() : scrollState.getValue();
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getViewportSize() {
                return ScrollState.this.getViewportSize();
            }
        };
        this.canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new os0(this) { // from class: bc2
            public final /* synthetic */ ScrollState b;

            {
                this.b = this;
            }

            @Override // defpackage.os0
            public final Object invoke() {
                boolean canScrollForward_delegate$lambda$0;
                int i3 = i2;
                ScrollState scrollState = this.b;
                switch (i3) {
                    case 0:
                        canScrollForward_delegate$lambda$0 = ScrollState.canScrollForward_delegate$lambda$0(scrollState);
                        break;
                    default:
                        canScrollForward_delegate$lambda$0 = ScrollState.canScrollBackward_delegate$lambda$0(scrollState);
                        break;
                }
                return Boolean.valueOf(canScrollForward_delegate$lambda$0);
            }
        });
        final int i3 = 1;
        this.canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new os0(this) { // from class: bc2
            public final /* synthetic */ ScrollState b;

            {
                this.b = this;
            }

            @Override // defpackage.os0
            public final Object invoke() {
                boolean canScrollForward_delegate$lambda$0;
                int i32 = i3;
                ScrollState scrollState = this.b;
                switch (i32) {
                    case 0:
                        canScrollForward_delegate$lambda$0 = ScrollState.canScrollForward_delegate$lambda$0(scrollState);
                        break;
                    default:
                        canScrollForward_delegate$lambda$0 = ScrollState.canScrollBackward_delegate$lambda$0(scrollState);
                        break;
                }
                return Boolean.valueOf(canScrollForward_delegate$lambda$0);
            }
        });
    }

    public static final Integer Saver$lambda$0(SaverScope saverScope, ScrollState scrollState) {
        return Integer.valueOf(scrollState.getValue());
    }

    public static final ScrollState Saver$lambda$1(int i) {
        return new ScrollState(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollTo$default(ScrollState scrollState, int i, AnimationSpec animationSpec, a10 a10Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 0.0f, null, 7, null);
        }
        return scrollState.animateScrollTo(i, animationSpec, a10Var);
    }

    public static /* synthetic */ Integer b(SaverScope saverScope, ScrollState scrollState) {
        return Saver$lambda$0(saverScope, scrollState);
    }

    public static final boolean canScrollBackward_delegate$lambda$0(ScrollState scrollState) {
        return scrollState.getValue() > 0;
    }

    public static final boolean canScrollForward_delegate$lambda$0(ScrollState scrollState) {
        return scrollState.getValue() < scrollState.getMaxValue();
    }

    public static /* synthetic */ ScrollState d(int i) {
        return Saver$lambda$1(i);
    }

    public static /* synthetic */ float e(ScrollState scrollState, float f) {
        return scrollableState$lambda$0(scrollState, f);
    }

    public static final float scrollableState$lambda$0(ScrollState scrollState, float f) {
        float value = scrollState.getValue() + f + scrollState.accumulator;
        float n = ea0.n(value, 0.0f, scrollState.getMaxValue());
        boolean z = value == n;
        float value2 = n - scrollState.getValue();
        int round = Math.round(value2);
        scrollState.setValue(scrollState.getValue() + round);
        scrollState.accumulator = value2 - round;
        return !z ? value2 : f;
    }

    private final void setValue(int i) {
        this.value$delegate.setIntValue(i);
    }

    public final Object animateScrollTo(int i, AnimationSpec<Float> animationSpec, a10 a10Var) {
        Object animateScrollBy = ScrollExtensionsKt.animateScrollBy(this, i - getValue(), animationSpec, a10Var);
        return animateScrollBy == e50.a ? animateScrollBy : vy2.a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.scrollableState.dispatchRawDelta(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final int getContentSize$foundation() {
        return this.contentSize$delegate.getIntValue();
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation() {
        return this.internalInteractionSource;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.scrollableState.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.scrollableState.getLastScrolledForward();
    }

    public final int getMaxValue() {
        return this._maxValueState.getIntValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getReverseScrolling$foundation() {
        return ((Boolean) this.reverseScrolling$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public ScrollIndicatorState getScrollIndicatorState() {
        return this._scrollIndicatorState;
    }

    public final int getValue() {
        return this.value$delegate.getIntValue();
    }

    public final int getViewportSize() {
        return this.viewportSize$delegate.getIntValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, ts0 ts0Var, a10 a10Var) {
        Object scroll = this.scrollableState.scroll(mutatePriority, ts0Var, a10Var);
        return scroll == e50.a ? scroll : vy2.a;
    }

    public final Object scrollTo(int i, a10 a10Var) {
        return ScrollExtensionsKt.scrollBy(this, i - getValue(), a10Var);
    }

    public final void setContentSize$foundation(int i) {
        this.contentSize$delegate.setIntValue(i);
    }

    public final void setMaxValue$foundation(int i) {
        this._maxValueState.setIntValue(i);
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ps0 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (getValue() > i) {
                setValue(i);
            }
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public final void setReverseScrolling$foundation(boolean z) {
        this.reverseScrolling$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setViewportSize$foundation(int i) {
        this.viewportSize$delegate.setIntValue(i);
    }
}
