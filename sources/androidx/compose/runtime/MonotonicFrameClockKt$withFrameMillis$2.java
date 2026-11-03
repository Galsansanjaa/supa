package androidx.compose.runtime;

import androidx.compose.animation.core.AnimationKt;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MonotonicFrameClockKt$withFrameMillis$2 implements ps0 {
    final /* synthetic */ ps0 $onFrame;

    public MonotonicFrameClockKt$withFrameMillis$2(ps0 ps0Var) {
        this.$onFrame = ps0Var;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [R, java.lang.Object] */
    public final R invoke(long j) {
        return this.$onFrame.invoke(Long.valueOf(j / AnimationKt.MillisToNanos));
    }

    @Override // defpackage.ps0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }
}
