package androidx.compose.runtime;

import androidx.collection.ObjectList;
import androidx.collection.ScatterMap;
import androidx.compose.runtime.composer.RememberManager;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class SlotStorage {
    public static final int $stable = 0;

    public abstract void clear(RememberManager rememberManager);

    public abstract void collectCalledByInformation();

    public abstract void collectSourceInformation();

    public abstract void deactivateAll(RememberManager rememberManager);

    public abstract void dispose();

    public abstract void disposeUnusedMovableContent(RememberManager rememberManager, MovableContentState movableContentState);

    public abstract ScatterMap<MovableContentStateReference, MovableContentState> extractNestedStates(Applier<?> applier, ObjectList<MovableContentStateReference> objectList);

    /* renamed from: getSlots */
    public abstract Iterable<Object> mo4652getSlots();

    public abstract boolean groupContainsAnchor(int i, Anchor anchor);

    public abstract boolean inGroup(Anchor anchor, Anchor anchor2);

    public abstract void invalidateAll();

    public abstract List<RecomposeScopeImpl> invalidateGroupsWithKey(int i);

    public abstract boolean isEmpty();

    public abstract boolean ownsRecomposeScope(RecomposeScopeImpl recomposeScopeImpl);

    public abstract String toDebugString();

    public abstract void verifyWellFormed();
}
