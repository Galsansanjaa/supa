package androidx.compose.runtime.tooling;

import androidx.compose.runtime.RecomposeScope;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface CompositionObserver {
    void onBeginComposition(ObservableComposition observableComposition);

    void onEndComposition(ObservableComposition observableComposition);

    void onReadInScope(RecomposeScope recomposeScope, Object obj);

    void onScopeDisposed(RecomposeScope recomposeScope);

    void onScopeEnter(RecomposeScope recomposeScope);

    void onScopeExit(RecomposeScope recomposeScope);

    void onScopeInvalidated(RecomposeScope recomposeScope, Object obj);
}
