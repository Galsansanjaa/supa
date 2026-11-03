package androidx.compose.runtime;

import defpackage.a10;
import defpackage.hu2;
import defpackage.j20;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MonotonicFrameClockKt {
    public static final MonotonicFrameClock getMonotonicFrameClock(j20 j20Var) {
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) j20Var.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        hu2.h("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static /* synthetic */ void getMonotonicFrameClock$annotations(j20 j20Var) {
    }

    public static final <R> Object withFrameMillis(MonotonicFrameClock monotonicFrameClock, ps0 ps0Var, a10 a10Var) {
        return monotonicFrameClock.withFrameNanos(new MonotonicFrameClockKt$withFrameMillis$2(ps0Var), a10Var);
    }

    public static final <R> Object withFrameMillis(ps0 ps0Var, a10 a10Var) {
        return getMonotonicFrameClock(a10Var.getContext()).withFrameNanos(new MonotonicFrameClockKt$withFrameMillis$2(ps0Var), a10Var);
    }

    public static final <R> Object withFrameNanos(ps0 ps0Var, a10 a10Var) {
        return getMonotonicFrameClock(a10Var.getContext()).withFrameNanos(ps0Var, a10Var);
    }
}
