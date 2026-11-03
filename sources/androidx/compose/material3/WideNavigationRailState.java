package androidx.compose.material3;

import defpackage.a10;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface WideNavigationRailState {
    Object collapse(a10 a10Var);

    Object expand(a10 a10Var);

    WideNavigationRailValue getCurrentValue();

    WideNavigationRailValue getTargetValue();

    boolean isAnimating();

    Object snapTo(WideNavigationRailValue wideNavigationRailValue, a10 a10Var);

    Object toggle(a10 a10Var);
}
