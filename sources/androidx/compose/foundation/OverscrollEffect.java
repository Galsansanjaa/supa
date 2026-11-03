package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import defpackage.a10;
import defpackage.ps0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface OverscrollEffect {
    /* renamed from: applyToFling-BMRW4eQ */
    Object mo298applyToFlingBMRW4eQ(long j, ts0 ts0Var, a10 a10Var);

    /* renamed from: applyToScroll-Rhakbz0 */
    long mo299applyToScrollRhakbz0(long j, int i, ps0 ps0Var);

    Modifier getEffectModifier();

    DelegatableNode getNode();

    boolean isInProgress();
}
