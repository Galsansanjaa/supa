package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.tooling.CompositionData;
import defpackage.j20;
import defpackage.os0;
import defpackage.ts0;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class CompositionContext {
    public static final int $stable = 0;

    public abstract void composeInitial$runtime(ControlledComposition controlledComposition, ts0 ts0Var);

    public abstract ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, ts0 ts0Var);

    public abstract void deletedMovableContent$runtime(MovableContentStateReference movableContentStateReference);

    public void doneComposing$runtime() {
    }

    public abstract boolean getCollectingCallByInformation$runtime();

    public abstract boolean getCollectingParameterInformation$runtime();

    public abstract boolean getCollectingSourceInformation$runtime();

    public abstract long getCompositeKeyHashCode$runtime();

    public abstract Composition getComposition$runtime();

    public PersistentCompositionLocalMap getCompositionLocalScope$runtime() {
        return CompositionContextKt.access$getEmptyPersistentCompositionLocalMap$p();
    }

    public abstract j20 getEffectCoroutineContext();

    public CompositionObserverHolder getObserverHolder$runtime() {
        return null;
    }

    public abstract boolean getStackTraceEnabled$runtime();

    public abstract void insertMovableContent$runtime(MovableContentStateReference movableContentStateReference);

    public abstract void invalidate$runtime(ControlledComposition controlledComposition);

    public abstract void invalidateScope$runtime(RecomposeScopeImpl recomposeScopeImpl);

    public abstract void movableContentStateReleased$runtime(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState, Applier<?> applier);

    public MovableContentState movableContentStateResolve$runtime(MovableContentStateReference movableContentStateReference) {
        return null;
    }

    public abstract ScatterSet<RecomposeScopeImpl> recomposePaused$runtime(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, ScatterSet<RecomposeScopeImpl> scatterSet);

    public void recordInspectionTable$runtime(Set<CompositionData> set) {
    }

    public void registerComposer$runtime(Composer composer) {
    }

    public abstract void registerComposition$runtime(ControlledComposition controlledComposition);

    public abstract void reportPausedScope$runtime(RecomposeScopeImpl recomposeScopeImpl);

    public abstract void reportRemovedComposition$runtime(ControlledComposition controlledComposition);

    public abstract CancellationHandle scheduleFrameEndCallback(os0 os0Var);

    public void startComposing$runtime() {
    }

    public void unregisterComposer$runtime(Composer composer) {
    }

    public abstract void unregisterComposition$runtime(ControlledComposition controlledComposition);
}
