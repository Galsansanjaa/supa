package androidx.compose.foundation.style;

import defpackage.os0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface StyleStateScope {
    StyleState getState();

    <T> void state(StyleStateKey<T> styleStateKey, os0 os0Var, ts0 ts0Var);
}
