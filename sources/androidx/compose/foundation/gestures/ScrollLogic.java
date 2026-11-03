package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.a10;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface ScrollLogic {
    /* renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    Object mo620doFlingAnimationQWom1Mo(long j, a10 a10Var);

    boolean isFlinging();

    /* renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    long mo621performRawScrollMKHz9U(long j);

    Object scroll(MutatePriority mutatePriority, ts0 ts0Var, a10 a10Var);

    boolean shouldScrollImmediately();
}
