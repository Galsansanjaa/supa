package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import defpackage.ts0;
import defpackage.y40;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class NonTouchScrollingLogic {
    public static final int $stable = 8;
    private Density density;
    private boolean isScrolling;
    private final ts0 onScrollStopped;
    private final ScrollingLogic scrollingLogic;
    private final DifferentialVelocityTracker velocityTracker = new DifferentialVelocityTracker();

    public NonTouchScrollingLogic(ScrollingLogic scrollingLogic, ts0 ts0Var, Density density) {
        this.scrollingLogic = scrollingLogic;
        this.onScrollStopped = ts0Var;
        this.density = density;
    }

    public final void consume$foundation(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            changes.get(i).consume();
        }
    }

    public final Density getDensity() {
        return this.density;
    }

    public final ts0 getOnScrollStopped() {
        return this.onScrollStopped;
    }

    public final ScrollingLogic getScrollingLogic() {
        return this.scrollingLogic;
    }

    public final DifferentialVelocityTracker getVelocityTracker$foundation() {
        return this.velocityTracker;
    }

    public final boolean isConsumed$foundation(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (changes.get(i).isConsumed()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isScrolling$foundation() {
        return this.isScrolling;
    }

    /* renamed from: onPointerEvent-H0pRuoY */
    public abstract void mo596onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j);

    public final void setDensity(Density density) {
        this.density = density;
    }

    public final void setScrolling$foundation(boolean z) {
        this.isScrolling = z;
    }

    public abstract void startReceivingEvents(y40 y40Var);

    public final void updateDensity(Density density) {
        this.density = density;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object userScroll$foundation(defpackage.ts0 r5, defpackage.a10 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$1 r0 = (androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$1 r0 = new androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.ta3.H(r6)
            goto L4a
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            return r2
        L2c:
            defpackage.ta3.H(r6)
            r4.isScrolling = r3
            androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$2 r6 = new androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$2
            r6.<init>(r4, r5, r2)
            r0.label = r3
            kn2 r5 = new kn2
            j20 r1 = r0.getContext()
            r5.<init>(r0, r1)
            java.lang.Object r5 = defpackage.ea0.H(r5, r3, r5, r6)
            e50 r6 = defpackage.e50.a
            if (r5 != r6) goto L4a
            return r6
        L4a:
            r5 = 0
            r4.isScrolling = r5
            vy2 r4 = defpackage.vy2.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.NonTouchScrollingLogic.userScroll$foundation(ts0, a10):java.lang.Object");
    }
}
