package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import defpackage.ej1;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class PagerWrapperFlingBehavior implements FlingBehavior {
    private final TargetedFlingBehavior originalFlingBehavior;
    private final PagerState pagerState;

    public PagerWrapperFlingBehavior(TargetedFlingBehavior targetedFlingBehavior, PagerState pagerState) {
        this.originalFlingBehavior = targetedFlingBehavior;
        this.pagerState = pagerState;
    }

    public static final vy2 performFling$lambda$0$0(PagerWrapperFlingBehavior pagerWrapperFlingBehavior, ScrollScope scrollScope, float f) {
        pagerWrapperFlingBehavior.pagerState.updateTargetPage(scrollScope, pagerWrapperFlingBehavior.pagerState.getCurrentPage() + ej1.K(pagerWrapperFlingBehavior.pagerState.getPageSizeWithSpacing$foundation() != 0 ? f / pagerWrapperFlingBehavior.pagerState.getPageSizeWithSpacing$foundation() : 0.0f));
        return vy2.a;
    }

    public final TargetedFlingBehavior getOriginalFlingBehavior() {
        return this.originalFlingBehavior;
    }

    public final PagerState getPagerState() {
        return this.pagerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object performFling(androidx.compose.foundation.gestures.ScrollScope r6, float r7, defpackage.a10 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.ta3.H(r8)
            goto L41
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r5)
            return r2
        L2c:
            defpackage.ta3.H(r8)
            androidx.compose.foundation.gestures.TargetedFlingBehavior r8 = r5.originalFlingBehavior
            androidx.compose.foundation.pager.d r1 = new androidx.compose.foundation.pager.d
            r1.<init>(r3, r5, r6)
            r0.label = r3
            java.lang.Object r8 = r8.performFling(r6, r7, r1, r0)
            e50 r6 = defpackage.e50.a
            if (r8 != r6) goto L41
            return r6
        L41:
            java.lang.Number r8 = (java.lang.Number) r8
            float r6 = r8.floatValue()
            androidx.compose.foundation.pager.PagerState r7 = r5.pagerState
            float r7 = r7.getCurrentPageOffsetFraction()
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L53
            goto L72
        L53:
            androidx.compose.foundation.pager.PagerState r7 = r5.pagerState
            float r7 = r7.getCurrentPageOffsetFraction()
            float r7 = java.lang.Math.abs(r7)
            double r0 = (double) r7
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 >= 0) goto L72
            androidx.compose.foundation.pager.PagerState r5 = r5.pagerState
            int r7 = r5.getCurrentPage()
            r0 = 2
            androidx.compose.foundation.pager.PagerState.requestScrollToPage$default(r5, r7, r8, r0, r2)
            goto L7d
        L72:
            androidx.compose.foundation.pager.PagerState r5 = r5.pagerState
            float r5 = r5.getCurrentPageOffsetFraction()
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r5)
        L7d:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerWrapperFlingBehavior.performFling(androidx.compose.foundation.gestures.ScrollScope, float, a10):java.lang.Object");
    }
}
