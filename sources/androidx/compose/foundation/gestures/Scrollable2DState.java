package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.a10;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface Scrollable2DState {
    /* renamed from: canScroll-k-4lQ0M */
    boolean mo513canScrollk4lQ0M(long j);

    /* renamed from: dispatchRawDelta-MK-Hz9U */
    long mo514dispatchRawDeltaMKHz9U(long j);

    boolean isScrollInProgress();

    Object scroll(MutatePriority mutatePriority, ts0 ts0Var, a10 a10Var);
}
