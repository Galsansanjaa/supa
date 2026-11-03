package androidx.compose.material3.pulltorefresh;

import defpackage.a10;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface PullToRefreshState {
    Object animateToHidden(a10 a10Var);

    Object animateToThreshold(a10 a10Var);

    float getDistanceFraction();

    boolean isAnimating();

    Object snapTo(float f, a10 a10Var);
}
