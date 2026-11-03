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
public final class ScrollingLogic2D implements ScrollLogic {
    public static final int $stable = 8;
    private FlingBehavior flingBehavior;
    private boolean isFlinging;
    private final os0 isScrollableNodeAttached;
    private int latestScrollSource = NestedScrollSource.Companion.m6472getUserInputWNlRxjI();
    private NestedScrollDispatcher nestedScrollDispatcher;
    private final ScrollingLogic2D$nestedScrollScope$1 nestedScrollScope;
    private Scroll2DScope outerStateScope;
    private OverscrollEffect overscrollEffect;
    private final ps0 performScrollForOverscroll;
    private Scrollable2DState scrollableState;

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.foundation.gestures.ScrollingLogic2D$nestedScrollScope$1] */
    public ScrollingLogic2D(Scrollable2DState scrollable2DState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, NestedScrollDispatcher nestedScrollDispatcher, os0 os0Var) {
        Scroll2DScope scroll2DScope;
        this.scrollableState = scrollable2DState;
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.isScrollableNodeAttached = os0Var;
        scroll2DScope = Scrollable2DKt.NoOpScrollScope;
        this.outerStateScope = scroll2DScope;
        this.nestedScrollScope = new NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic2D$nestedScrollScope$1
            @Override // androidx.compose.foundation.gestures.NestedScrollScope
            /* renamed from: scrollBy-OzD1aCk */
            public long mo601scrollByOzD1aCk(long j, int i) {
                Scroll2DScope scroll2DScope2;
                long m658performScroll3eAAhYA;
                scroll2DScope2 = ScrollingLogic2D.this.outerStateScope;
                m658performScroll3eAAhYA = ScrollingLogic2D.this.m658performScroll3eAAhYA(scroll2DScope2, j, i);
                return m658performScroll3eAAhYA;
            }

            @Override // androidx.compose.foundation.gestures.NestedScrollScope
            /* renamed from: scrollByWithOverscroll-OzD1aCk */
            public long mo602scrollByWithOverscrollOzD1aCk(long j, int i) {
                OverscrollEffect overscrollEffect2;
                Scroll2DScope scroll2DScope2;
                long m658performScroll3eAAhYA;
                int i2;
                ps0 ps0Var;
                ScrollingLogic2D.this.latestScrollSource = i;
                overscrollEffect2 = ScrollingLogic2D.this.overscrollEffect;
                if (overscrollEffect2 == null || !ScrollingLogic2D.this.m661shouldDispatchOverscrollk4lQ0M(j)) {
                    scroll2DScope2 = ScrollingLogic2D.this.outerStateScope;
                    m658performScroll3eAAhYA = ScrollingLogic2D.this.m658performScroll3eAAhYA(scroll2DScope2, j, i);
                    return m658performScroll3eAAhYA;
                }
                i2 = ScrollingLogic2D.this.latestScrollSource;
                ps0Var = ScrollingLogic2D.this.performScrollForOverscroll;
                return overscrollEffect2.mo299applyToScrollRhakbz0(j, i2, ps0Var);
            }
        };
        this.performScrollForOverscroll = new mi1(this, 20);
    }

    public static /* synthetic */ Offset a(ScrollingLogic2D scrollingLogic2D, Offset offset) {
        return performScrollForOverscroll$lambda$0(scrollingLogic2D, offset);
    }

    /* renamed from: dispatchRawDelta-MK-Hz9U */
    private final long m657dispatchRawDeltaMKHz9U(long j) {
        return this.scrollableState.mo514dispatchRawDeltaMKHz9U(j);
    }

    public static final long doFlingAnimation_QWom1Mo$toDecomposedOffset(float f, long j) {
        float m625getAngleRadTH1AsA0;
        float m625getAngleRadTH1AsA02;
        float m625getAngleRadTH1AsA03;
        m625getAngleRadTH1AsA0 = Scrollable2DKt.m625getAngleRadTH1AsA0(j);
        if (Float.isNaN(m625getAngleRadTH1AsA0)) {
            return Offset.m5082constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(f)));
        }
        m625getAngleRadTH1AsA02 = Scrollable2DKt.m625getAngleRadTH1AsA0(j);
        float signum = Math.signum(Velocity.m8283getXimpl(j)) * Math.abs(((float) Math.cos(m625getAngleRadTH1AsA02)) * f);
        m625getAngleRadTH1AsA03 = Scrollable2DKt.m625getAngleRadTH1AsA0(j);
        float signum2 = Math.signum(Velocity.m8284getYimpl(j)) * Math.abs(((float) Math.sin(m625getAngleRadTH1AsA03)) * f);
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(signum2) & 4294967295L) | (Float.floatToRawIntBits(signum) << 32));
    }

    public static final long doFlingAnimation_QWom1Mo$toDecomposedVelocity(float f, long j) {
        float m625getAngleRadTH1AsA0;
        float m625getAngleRadTH1AsA02;
        float m625getAngleRadTH1AsA03;
        m625getAngleRadTH1AsA0 = Scrollable2DKt.m625getAngleRadTH1AsA0(j);
        if (Float.isNaN(m625getAngleRadTH1AsA0)) {
            return VelocityKt.Velocity(0.0f, f);
        }
        m625getAngleRadTH1AsA02 = Scrollable2DKt.m625getAngleRadTH1AsA0(j);
        float signum = Math.signum(Velocity.m8283getXimpl(j)) * Math.abs(((float) Math.cos(m625getAngleRadTH1AsA02)) * f);
        m625getAngleRadTH1AsA03 = Scrollable2DKt.m625getAngleRadTH1AsA0(j);
        return VelocityKt.Velocity(signum, Math.signum(Velocity.m8284getYimpl(j)) * Math.abs(((float) Math.sin(m625getAngleRadTH1AsA03)) * f));
    }

    public static final float doFlingAnimation_QWom1Mo$toMagnitudeFloat(long j) {
        return (float) Math.sqrt(((float) Math.pow(Float.intBitsToFloat((int) (j >> 32)), 2.0d)) + ((float) Math.pow(Float.intBitsToFloat((int) (j & 4294967295L)), 2.0d)));
    }

    /* renamed from: performScroll-3eAAhYA */
    public final long m658performScroll3eAAhYA(Scroll2DScope scroll2DScope, long j, int i) {
        long m6456dispatchPreScrollOzD1aCk = this.nestedScrollDispatcher.m6456dispatchPreScrollOzD1aCk(j, i);
        long m5094minusMKHz9U = Offset.m5094minusMKHz9U(j, m6456dispatchPreScrollOzD1aCk);
        long mo515scrollByMKHz9U = scroll2DScope.mo515scrollByMKHz9U(m5094minusMKHz9U);
        return Offset.m5095plusMKHz9U(Offset.m5095plusMKHz9U(m6456dispatchPreScrollOzD1aCk, mo515scrollByMKHz9U), this.nestedScrollDispatcher.m6454dispatchPostScrollDzOQY0M(mo515scrollByMKHz9U, Offset.m5094minusMKHz9U(m5094minusMKHz9U, mo515scrollByMKHz9U), i));
    }

    public static final Offset performScrollForOverscroll$lambda$0(ScrollingLogic2D scrollingLogic2D, Offset offset) {
        return Offset.m5079boximpl(scrollingLogic2D.m658performScroll3eAAhYA(scrollingLogic2D.outerStateScope, offset.m5100unboximpl(), scrollingLogic2D.latestScrollSource));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r8v0, types: [y42, java.lang.Object] */
    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* renamed from: doFlingAnimation-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo620doFlingAnimationQWom1Mo(long r11, defpackage.a10 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$1
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
            y42 r8 = new y42
            r8.<init>()
            r8.a = r11
            r10.isFlinging = r3
            androidx.compose.foundation.MutatePriority r13 = androidx.compose.foundation.MutatePriority.Default     // Catch: java.lang.Throwable -> L66
            androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2 r4 = new androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2     // Catch: java.lang.Throwable -> L66
            r9 = 0
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L63
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L63
            r0.label = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r10 = r5.scroll(r13, r4, r0)     // Catch: java.lang.Throwable -> L63
            e50 r11 = defpackage.e50.a
            if (r10 != r11) goto L59
            return r11
        L59:
            r11 = r8
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic2D.mo620doFlingAnimationQWom1Mo(long, a10):java.lang.Object");
    }

    public final Scrollable2DState getScrollableState() {
        return this.scrollableState;
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    public boolean isFlinging() {
        return this.isFlinging;
    }

    /* renamed from: onScrollStopped-sF-c-tU */
    public final Object m659onScrollStoppedsFctU(long j, a10 a10Var) {
        ScrollingLogic2D$onScrollStopped$performFling$1 scrollingLogic2D$onScrollStopped$performFling$1 = new ScrollingLogic2D$onScrollStopped$performFling$1(this, null);
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        e50 e50Var = e50.a;
        vy2 vy2Var = vy2.a;
        if (overscrollEffect == null || !m660shouldDispatchOverscrollTH1AsA0(j)) {
            Object invoke = scrollingLogic2D$onScrollStopped$performFling$1.invoke(Velocity.m8274boximpl(j), a10Var);
            return invoke == e50Var ? invoke : vy2Var;
        }
        Object mo298applyToFlingBMRW4eQ = overscrollEffect.mo298applyToFlingBMRW4eQ(j, scrollingLogic2D$onScrollStopped$performFling$1, a10Var);
        return mo298applyToFlingBMRW4eQ == e50Var ? mo298applyToFlingBMRW4eQ : vy2Var;
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* renamed from: performRawScroll-MK-Hz9U */
    public long mo621performRawScrollMKHz9U(long j) {
        return this.scrollableState.isScrollInProgress() ? Offset.Companion.m5106getZeroF1C5BW0() : m657dispatchRawDeltaMKHz9U(j);
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    public Object scroll(MutatePriority mutatePriority, ts0 ts0Var, a10 a10Var) {
        Object scroll = this.scrollableState.scroll(mutatePriority, new ScrollingLogic2D$scroll$2(this, ts0Var, null), a10Var);
        return scroll == e50.a ? scroll : vy2.a;
    }

    public final void setScrollableState(Scrollable2DState scrollable2DState) {
        this.scrollableState = scrollable2DState;
    }

    /* renamed from: shouldDispatchOverscroll-TH1AsA0 */
    public final boolean m660shouldDispatchOverscrollTH1AsA0(long j) {
        Scrollable2DState scrollable2DState = this.scrollableState;
        float m8283getXimpl = Velocity.m8283getXimpl(j);
        float m8284getYimpl = Velocity.m8284getYimpl(j);
        return scrollable2DState.mo513canScrollk4lQ0M(Offset.m5082constructorimpl((Float.floatToRawIntBits(m8284getYimpl) & 4294967295L) | (Float.floatToRawIntBits(m8283getXimpl) << 32)));
    }

    /* renamed from: shouldDispatchOverscroll-k-4lQ0M */
    public final boolean m661shouldDispatchOverscrollk4lQ0M(long j) {
        return this.scrollableState.mo513canScrollk4lQ0M(j);
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    public boolean shouldScrollImmediately() {
        if (this.scrollableState.isScrollInProgress()) {
            return true;
        }
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return overscrollEffect != null ? overscrollEffect.isInProgress() : false;
    }

    public final boolean update(Scrollable2DState scrollable2DState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, NestedScrollDispatcher nestedScrollDispatcher) {
        boolean z;
        if (jh2.k(this.scrollableState, scrollable2DState)) {
            z = false;
        } else {
            this.scrollableState = scrollable2DState;
            z = true;
        }
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z;
    }
}
