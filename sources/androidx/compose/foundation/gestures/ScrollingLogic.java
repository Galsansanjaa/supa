package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import defpackage.a10;
import defpackage.e50;
import defpackage.jh2;
import defpackage.mi1;
import defpackage.os0;
import defpackage.ps0;
import defpackage.ts0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ScrollingLogic implements ScrollLogic {
    public static final int $stable = 8;
    private FlingBehavior flingBehavior;
    private boolean isFlinging;
    private final os0 isScrollableNodeAttached;
    private NestedScrollDispatcher nestedScrollDispatcher;
    private OnScrollChangedDispatcher onScrollChangedDispatcher;
    private Orientation orientation;
    private OverscrollEffect overscrollEffect;
    private boolean reverseDirection;
    private ScrollableState scrollableState;
    private int latestScrollSource = NestedScrollSource.Companion.m6472getUserInputWNlRxjI();
    private ScrollScope outerStateScope = ScrollableKt.access$getNoOpScrollScope$p();
    private final ScrollingLogic$nestedScrollScope$1 nestedScrollScope = new NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1
        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* renamed from: scrollBy-OzD1aCk */
        public long mo601scrollByOzD1aCk(long j, int i) {
            ScrollScope scrollScope;
            long m644performScroll3eAAhYA;
            scrollScope = ScrollingLogic.this.outerStateScope;
            m644performScroll3eAAhYA = ScrollingLogic.this.m644performScroll3eAAhYA(scrollScope, j, i);
            return m644performScroll3eAAhYA;
        }

        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* renamed from: scrollByWithOverscroll-OzD1aCk */
        public long mo602scrollByWithOverscrollOzD1aCk(long j, int i) {
            OverscrollEffect overscrollEffect;
            ScrollScope scrollScope;
            long m644performScroll3eAAhYA;
            boolean shouldDispatchOverscroll;
            int i2;
            ps0 ps0Var;
            ScrollingLogic.this.latestScrollSource = i;
            overscrollEffect = ScrollingLogic.this.overscrollEffect;
            if (overscrollEffect != null) {
                shouldDispatchOverscroll = ScrollingLogic.this.getShouldDispatchOverscroll();
                if (shouldDispatchOverscroll) {
                    i2 = ScrollingLogic.this.latestScrollSource;
                    ps0Var = ScrollingLogic.this.performScrollForOverscroll;
                    return overscrollEffect.mo299applyToScrollRhakbz0(j, i2, ps0Var);
                }
            }
            scrollScope = ScrollingLogic.this.outerStateScope;
            m644performScroll3eAAhYA = ScrollingLogic.this.m644performScroll3eAAhYA(scrollScope, j, i);
            return m644performScroll3eAAhYA;
        }
    };
    private final ps0 performScrollForOverscroll = new mi1(this, 19);

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1] */
    public ScrollingLogic(ScrollableState scrollableState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, Orientation orientation, boolean z, NestedScrollDispatcher nestedScrollDispatcher, OnScrollChangedDispatcher onScrollChangedDispatcher, os0 os0Var) {
        ScrollScope scrollScope;
        this.scrollableState = scrollableState;
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        this.orientation = orientation;
        this.reverseDirection = z;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.onScrollChangedDispatcher = onScrollChangedDispatcher;
        this.isScrollableNodeAttached = os0Var;
        scrollScope = ScrollableKt.NoOpScrollScope;
        this.outerStateScope = scrollScope;
        this.nestedScrollScope = new NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1
            @Override // androidx.compose.foundation.gestures.NestedScrollScope
            /* renamed from: scrollBy-OzD1aCk */
            public long mo601scrollByOzD1aCk(long j, int i) {
                ScrollScope scrollScope2;
                long m644performScroll3eAAhYA;
                scrollScope2 = ScrollingLogic.this.outerStateScope;
                m644performScroll3eAAhYA = ScrollingLogic.this.m644performScroll3eAAhYA(scrollScope2, j, i);
                return m644performScroll3eAAhYA;
            }

            @Override // androidx.compose.foundation.gestures.NestedScrollScope
            /* renamed from: scrollByWithOverscroll-OzD1aCk */
            public long mo602scrollByWithOverscrollOzD1aCk(long j, int i) {
                OverscrollEffect overscrollEffect2;
                ScrollScope scrollScope2;
                long m644performScroll3eAAhYA;
                boolean shouldDispatchOverscroll;
                int i2;
                ps0 ps0Var;
                ScrollingLogic.this.latestScrollSource = i;
                overscrollEffect2 = ScrollingLogic.this.overscrollEffect;
                if (overscrollEffect2 != null) {
                    shouldDispatchOverscroll = ScrollingLogic.this.getShouldDispatchOverscroll();
                    if (shouldDispatchOverscroll) {
                        i2 = ScrollingLogic.this.latestScrollSource;
                        ps0Var = ScrollingLogic.this.performScrollForOverscroll;
                        return overscrollEffect2.mo299applyToScrollRhakbz0(j, i2, ps0Var);
                    }
                }
                scrollScope2 = ScrollingLogic.this.outerStateScope;
                m644performScroll3eAAhYA = ScrollingLogic.this.m644performScroll3eAAhYA(scrollScope2, j, i);
                return m644performScroll3eAAhYA;
            }
        };
        this.performScrollForOverscroll = new mi1(this, 19);
    }

    public static /* synthetic */ Offset a(ScrollingLogic scrollingLogic, Offset offset) {
        return performScrollForOverscroll$lambda$0(scrollingLogic, offset);
    }

    /* renamed from: dispatchRawDelta-MK-Hz9U */
    private final long m643dispatchRawDeltaMKHz9U(long j) {
        return m652toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m651toFloatk4lQ0M(j)))));
    }

    public final boolean getShouldDispatchOverscroll() {
        OverscrollEffect overscrollEffect;
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward() || ((overscrollEffect = this.overscrollEffect) != null && overscrollEffect.isInProgress());
    }

    /* renamed from: performScroll-3eAAhYA */
    public final long m644performScroll3eAAhYA(ScrollScope scrollScope, long j, int i) {
        long m6456dispatchPreScrollOzD1aCk = this.nestedScrollDispatcher.m6456dispatchPreScrollOzD1aCk(j, i);
        long m5094minusMKHz9U = Offset.m5094minusMKHz9U(j, m6456dispatchPreScrollOzD1aCk);
        long m649reverseIfNeededMKHz9U = m649reverseIfNeededMKHz9U(m652toOffsettuRUvjQ(scrollScope.scrollBy(m651toFloatk4lQ0M(m649reverseIfNeededMKHz9U(m650singleAxisOffsetMKHz9U(m5094minusMKHz9U))))));
        this.onScrollChangedDispatcher.mo604dispatchScrollDeltaInfok4lQ0M(m649reverseIfNeededMKHz9U);
        return Offset.m5095plusMKHz9U(Offset.m5095plusMKHz9U(m6456dispatchPreScrollOzD1aCk, m649reverseIfNeededMKHz9U), this.nestedScrollDispatcher.m6454dispatchPostScrollDzOQY0M(m649reverseIfNeededMKHz9U, Offset.m5094minusMKHz9U(m5094minusMKHz9U, m649reverseIfNeededMKHz9U), i));
    }

    public static final Offset performScrollForOverscroll$lambda$0(ScrollingLogic scrollingLogic, Offset offset) {
        return Offset.m5079boximpl(scrollingLogic.m644performScroll3eAAhYA(scrollingLogic.outerStateScope, offset.m5100unboximpl(), scrollingLogic.latestScrollSource));
    }

    /* renamed from: singleAxisVelocity-AH228Gc */
    private final long m645singleAxisVelocityAH228Gc(long j) {
        return this.orientation == Orientation.Horizontal ? Velocity.m8279copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null) : Velocity.m8279copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: toFloat-TH1AsA0 */
    public final float m646toFloatTH1AsA0(long j) {
        return this.orientation == Orientation.Horizontal ? Velocity.m8283getXimpl(j) : Velocity.m8284getYimpl(j);
    }

    /* renamed from: update-QWom1Mo */
    public final long m647updateQWom1Mo(long j, float f) {
        return this.orientation == Orientation.Horizontal ? Velocity.m8279copyOhffZ5M$default(j, f, 0.0f, 2, null) : Velocity.m8279copyOhffZ5M$default(j, 0.0f, f, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r6v0, types: [y42, java.lang.Object] */
    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* renamed from: doFlingAnimation-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo620doFlingAnimationQWom1Mo(long r11, defpackage.a10 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 != r3) goto L2f
            java.lang.Object r11 = r0.L$0
            y42 r11 = (defpackage.y42) r11
            defpackage.ta3.H(r13)     // Catch: java.lang.Throwable -> L2b
            r5 = r10
            goto L5a
        L2b:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto L69
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r10)
            r10 = 0
            return r10
        L36:
            defpackage.ta3.H(r13)
            y42 r6 = new y42
            r6.<init>()
            r6.a = r11
            r10.isFlinging = r3
            androidx.compose.foundation.MutatePriority r13 = androidx.compose.foundation.MutatePriority.Default     // Catch: java.lang.Throwable -> L66
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r4 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2     // Catch: java.lang.Throwable -> L66
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L63
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L63
            r0.label = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r10 = r5.scroll(r13, r4, r0)     // Catch: java.lang.Throwable -> L63
            e50 r11 = defpackage.e50.a
            if (r10 != r11) goto L59
            return r11
        L59:
            r11 = r6
        L5a:
            r5.isFlinging = r2
            long r10 = r11.a
            androidx.compose.ui.unit.Velocity r10 = androidx.compose.ui.unit.Velocity.m8274boximpl(r10)
            return r10
        L63:
            r0 = move-exception
        L64:
            r11 = r0
            goto L69
        L66:
            r0 = move-exception
            r5 = r10
            goto L64
        L69:
            r5.isFlinging = r2
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.mo620doFlingAnimationQWom1Mo(long, a10):java.lang.Object");
    }

    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    public boolean isFlinging() {
        return this.isFlinging;
    }

    public final boolean isVertical() {
        return this.orientation == Orientation.Vertical;
    }

    /* renamed from: onScrollStopped-BMRW4eQ */
    public final Object m648onScrollStoppedBMRW4eQ(long j, boolean z, a10 a10Var) {
        boolean shouldBeTriggeredByMouseWheel;
        vy2 vy2Var = vy2.a;
        if (z) {
            shouldBeTriggeredByMouseWheel = ScrollableKt.getShouldBeTriggeredByMouseWheel(this.flingBehavior);
            if (!shouldBeTriggeredByMouseWheel) {
                return vy2Var;
            }
        }
        long m645singleAxisVelocityAH228Gc = m645singleAxisVelocityAH228Gc(j);
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        e50 e50Var = e50.a;
        if (overscrollEffect == null || !getShouldDispatchOverscroll()) {
            Object invoke = scrollingLogic$onScrollStopped$performFling$1.invoke(Velocity.m8274boximpl(m645singleAxisVelocityAH228Gc), a10Var);
            return invoke == e50Var ? invoke : vy2Var;
        }
        Object mo298applyToFlingBMRW4eQ = overscrollEffect.mo298applyToFlingBMRW4eQ(m645singleAxisVelocityAH228Gc, scrollingLogic$onScrollStopped$performFling$1, a10Var);
        return mo298applyToFlingBMRW4eQ == e50Var ? mo298applyToFlingBMRW4eQ : vy2Var;
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* renamed from: performRawScroll-MK-Hz9U */
    public long mo621performRawScrollMKHz9U(long j) {
        return this.scrollableState.isScrollInProgress() ? Offset.Companion.m5106getZeroF1C5BW0() : m643dispatchRawDeltaMKHz9U(j);
    }

    public final float reverseIfNeeded(float f) {
        return this.reverseDirection ? f * (-1.0f) : f;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U */
    public final long m649reverseIfNeededMKHz9U(long j) {
        return this.reverseDirection ? Offset.m5097timestuRUvjQ(j, -1.0f) : j;
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    public Object scroll(MutatePriority mutatePriority, ts0 ts0Var, a10 a10Var) {
        Object scroll = this.scrollableState.scroll(mutatePriority, new ScrollingLogic$scroll$2(this, ts0Var, null), a10Var);
        return scroll == e50.a ? scroll : vy2.a;
    }

    public final void setScrollableState(ScrollableState scrollableState) {
        this.scrollableState = scrollableState;
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    public boolean shouldScrollImmediately() {
        if (this.scrollableState.isScrollInProgress()) {
            return true;
        }
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return overscrollEffect != null ? overscrollEffect.isInProgress() : false;
    }

    /* renamed from: singleAxisOffset-MK-Hz9U */
    public final long m650singleAxisOffsetMKHz9U(long j) {
        return this.orientation == Orientation.Horizontal ? Offset.m5084copydBAh8RU$default(j, 0.0f, 0.0f, 1, null) : Offset.m5084copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: toFloat-k-4lQ0M */
    public final float m651toFloatk4lQ0M(long j) {
        return Float.intBitsToFloat(this.orientation == Orientation.Horizontal ? (int) (j >> 32) : (int) (j & 4294967295L));
    }

    /* renamed from: toOffset-tuRUvjQ */
    public final long m652toOffsettuRUvjQ(float f) {
        if (f == 0.0f) {
            return Offset.Companion.m5106getZeroF1C5BW0();
        }
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m5082constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
    }

    /* renamed from: toSingleAxisDeltaFromAngle-k-4lQ0M */
    public final float m653toSingleAxisDeltaFromAnglek4lQ0M(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double atan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        Orientation orientation = this.orientation;
        if (atan2 >= 0.7853981633974483d) {
            if (orientation == Orientation.Vertical) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (orientation == Orientation.Horizontal) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }

    /* renamed from: toVelocity-adjELrA */
    public final long m654toVelocityadjELrA(float f) {
        return f == 0.0f ? Velocity.Companion.m8294getZero9UxMQ8M() : this.orientation == Orientation.Horizontal ? VelocityKt.Velocity(f, 0.0f) : VelocityKt.Velocity(0.0f, f);
    }

    public final boolean update(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, FlingBehavior flingBehavior, NestedScrollDispatcher nestedScrollDispatcher) {
        boolean z2;
        boolean z3 = true;
        if (jh2.k(this.scrollableState, scrollableState)) {
            z2 = false;
        } else {
            this.scrollableState = scrollableState;
            z2 = true;
        }
        this.overscrollEffect = overscrollEffect;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z2 = true;
        }
        if (this.reverseDirection != z) {
            this.reverseDirection = z;
        } else {
            z3 = z2;
        }
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z3;
    }
}
