package androidx.compose.runtime;

import defpackage.dv1;
import defpackage.os0;
import defpackage.ts0;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface ControlledComposition extends Composition {
    void abandonChanges();

    void applyChanges();

    void applyLateChanges();

    void changesApplied();

    void composeContent(ts0 ts0Var);

    <R> R delegateInvalidations(ControlledComposition controlledComposition, int i, os0 os0Var);

    void disposeUnusedMovableContent(MovableContentState movableContentState);

    ShouldPauseCallback getAndSetShouldPauseCallback(ShouldPauseCallback shouldPauseCallback);

    boolean getHasPendingChanges();

    void insertMovableContent(List<dv1> list);

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(Set<? extends Object> set);

    void prepareCompose(os0 os0Var);

    boolean recompose();

    void recordModificationsOf(Set<? extends Object> set);

    void recordReadOf(Object obj);

    void recordWriteOf(Object obj);

    void verifyConsistent();
}
