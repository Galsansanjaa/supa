package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import defpackage.cl1;
import defpackage.h20;
import defpackage.i20;
import defpackage.j20;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class PausableMonotonicFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private final MonotonicFrameClock frameClock;
    private final Latch latch = new Latch();

    public PausableMonotonicFrameClock(MonotonicFrameClock monotonicFrameClock) {
        this.frameClock = monotonicFrameClock;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.j20
    public /* bridge */ <R> R fold(R r, ts0 ts0Var) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, ts0Var);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.j20
    public /* bridge */ <E extends h20> E get(i20 i20Var) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, i20Var);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.h20
    public final i20 getKey() {
        int i = cl1.a;
        return MonotonicFrameClock.Key;
    }

    public final boolean isPaused() {
        return !this.latch.isOpen();
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.j20
    public /* bridge */ j20 minusKey(i20 i20Var) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, i20Var);
    }

    public final void pause() {
        this.latch.closeLatch();
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.j20
    public /* bridge */ j20 plus(j20 j20Var) {
        return MonotonicFrameClock.DefaultImpls.plus(this, j20Var);
    }

    public final void resume() {
        this.latch.openLatch();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r8.await(r0) == r5) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object withFrameNanos(defpackage.ps0 r7, defpackage.a10 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = (androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = new androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            e50 r5 = defpackage.e50.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.ta3.H(r8)
            return r8
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r6)
            return r2
        L31:
            java.lang.Object r7 = r0.L$0
            ps0 r7 = (defpackage.ps0) r7
            defpackage.ta3.H(r8)
            goto L49
        L39:
            defpackage.ta3.H(r8)
            androidx.compose.runtime.Latch r8 = r6.latch
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.await(r0)
            if (r8 != r5) goto L49
            goto L55
        L49:
            androidx.compose.runtime.MonotonicFrameClock r6 = r6.frameClock
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.withFrameNanos(r7, r0)
            if (r6 != r5) goto L56
        L55:
            return r5
        L56:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.withFrameNanos(ps0, a10):java.lang.Object");
    }
}
