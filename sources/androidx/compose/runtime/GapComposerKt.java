package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.KeyInfo;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import defpackage.jh2;
import defpackage.lt;
import defpackage.ps0;
import defpackage.r4;
import defpackage.vy2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class GapComposerKt {
    private static final Comparator<Invalidation> InvalidationLocationAscending = new Object();
    public static final int nodeKey = 125;
    public static final int rootKey = 100;

    public static final int InvalidationLocationAscending$lambda$0(Invalidation invalidation, Invalidation invalidation2) {
        return jh2.s(invalidation.getLocation(), invalidation2.getLocation());
    }

    public static final /* synthetic */ boolean access$asBool(int i) {
        return asBool(i);
    }

    public static final /* synthetic */ int access$asInt(boolean z) {
        return asInt(z);
    }

    public static final /* synthetic */ List access$collectNodesFrom(SlotTable slotTable, GapAnchor gapAnchor) {
        return collectNodesFrom(slotTable, gapAnchor);
    }

    public static final /* synthetic */ int access$findInsertLocation(List list, int i) {
        return findInsertLocation(list, i);
    }

    public static final /* synthetic */ Invalidation access$firstInRange(List list, int i, int i2) {
        return firstInRange(list, i, i2);
    }

    public static final /* synthetic */ Comparator access$getInvalidationLocationAscending$p() {
        return InvalidationLocationAscending;
    }

    public static final /* synthetic */ Object access$getKey(Object obj, Object obj2, Object obj3) {
        return getKey(obj, obj2, obj3);
    }

    public static final /* synthetic */ void access$insertIfMissing(List list, int i, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        insertIfMissing(list, i, recomposeScopeImpl, obj);
    }

    public static final /* synthetic */ int access$nearestCommonRootOf(SlotReader slotReader, int i, int i2, int i3) {
        return nearestCommonRootOf(slotReader, i, i2, i3);
    }

    public static final /* synthetic */ Invalidation access$removeLocation(List list, int i) {
        return removeLocation(list, i);
    }

    public static final /* synthetic */ void access$removeRange(List list, int i, int i2) {
        removeRange(list, i, i2);
    }

    public static final boolean asBool(int i) {
        return i != 0;
    }

    public static final GapRememberObserverHolder asGapRememberObserverHolder(RememberObserverHolder rememberObserverHolder) {
        GapRememberObserverHolder gapRememberObserverHolder = rememberObserverHolder instanceof GapRememberObserverHolder ? (GapRememberObserverHolder) rememberObserverHolder : null;
        if (gapRememberObserverHolder != null) {
            return gapRememberObserverHolder;
        }
        throw lt.s("Inconsistent composition");
    }

    public static final ReusableGapRememberObserverHolder asGapRememberObserverHolder(ReusableGapRememberObserverHolder reusableGapRememberObserverHolder) {
        if (reusableGapRememberObserverHolder == null) {
            reusableGapRememberObserverHolder = null;
        }
        if (reusableGapRememberObserverHolder != null) {
            return reusableGapRememberObserverHolder;
        }
        throw lt.s("Inconsistent composition");
    }

    public static final int asInt(boolean z) {
        return z ? 1 : 0;
    }

    public static final List<Object> collectNodesFrom(SlotTable slotTable, GapAnchor gapAnchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader openReader = slotTable.openReader();
        try {
            collectNodesFrom$lambda$0$collectFromGroup(openReader, arrayList, slotTable.anchorIndex(gapAnchor));
            return arrayList;
        } finally {
            openReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$0$collectFromGroup(SlotReader slotReader, List<Object> list, int i) {
        if (slotReader.isNode(i)) {
            list.add(slotReader.node(i));
            return;
        }
        int i2 = i + 1;
        int groupSize = slotReader.groupSize(i) + i;
        while (i2 < groupSize) {
            collectNodesFrom$lambda$0$collectFromGroup(slotReader, list, i2);
            i2 += slotReader.groupSize(i2);
        }
    }

    public static final void deactivateCurrentGroup(SlotWriter slotWriter, RememberManager rememberManager) {
        slotWriter.forAllDataInRememberOrder(slotWriter.getCurrentGroup(), new r4(5, rememberManager, slotWriter));
    }

    public static final vy2 deactivateCurrentGroup$lambda$0(RememberManager rememberManager, SlotWriter slotWriter, int i, Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            rememberManager.deactivating((ComposeNodeLifecycleCallback) obj);
        } else if (!(obj instanceof ReusableRememberObserverHolder)) {
            if (obj instanceof RememberObserverHolder) {
                removeData(slotWriter, i, obj);
                rememberManager.forgetting((RememberObserverHolder) obj);
            } else if (obj instanceof RecomposeScopeImpl) {
                removeData(slotWriter, i, obj);
                ((RecomposeScopeImpl) obj).release();
            }
        }
        return vy2.a;
    }

    private static final int distanceFrom(SlotReader slotReader, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = slotReader.parent(i);
            i3++;
        }
        return i3;
    }

    public static final int findInsertLocation(List<Invalidation> list, int i) {
        int findLocation = findLocation(list, i);
        return findLocation < 0 ? -(findLocation + 1) : findLocation;
    }

    private static final int findLocation(List<Invalidation> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int s = jh2.s(list.get(i3).getLocation(), i);
            if (s < 0) {
                i2 = i3 + 1;
            } else {
                if (s <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final Invalidation firstInRange(List<Invalidation> list, int i, int i2) {
        int findInsertLocation = findInsertLocation(list, i);
        if (findInsertLocation >= list.size()) {
            return null;
        }
        Invalidation invalidation = list.get(findInsertLocation);
        if (invalidation.getLocation() < i2) {
            return invalidation;
        }
        return null;
    }

    private static final void forEachInRange(List<Invalidation> list, int i, int i2, ps0 ps0Var) {
        for (int findInsertLocation = findInsertLocation(list, i); findInsertLocation < list.size(); findInsertLocation++) {
            Invalidation invalidation = list.get(findInsertLocation);
            if (invalidation.getLocation() >= i2) {
                return;
            }
            ps0Var.invoke(invalidation);
        }
    }

    public static final Object getJoinedKey(KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : Integer.valueOf(keyInfo.getKey());
    }

    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if (jh2.k(joinedKey.getLeft(), obj2) && jh2.k(joinedKey.getRight(), obj3)) {
            return obj;
        }
        Object key = getKey(joinedKey.getLeft(), obj2, obj3);
        return key == null ? getKey(joinedKey.getRight(), obj2, obj3) : key;
    }

    public static final void insertIfMissing(List<Invalidation> list, int i, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int findLocation = findLocation(list, i);
        if (findLocation < 0) {
            int i2 = -(findLocation + 1);
            if (!(obj instanceof DerivedState)) {
                obj = null;
            }
            list.add(i2, new Invalidation(recomposeScopeImpl, i, obj));
            return;
        }
        Invalidation invalidation = list.get(findLocation);
        if (!(obj instanceof DerivedState)) {
            invalidation.setInstances(null);
            return;
        }
        Object instances = invalidation.getInstances();
        if (instances == null) {
            invalidation.setInstances(obj);
        } else if (instances instanceof MutableScatterSet) {
            ((MutableScatterSet) instances).add(obj);
        } else {
            invalidation.setInstances(ScatterSetKt.mutableScatterSetOf(instances, obj));
        }
    }

    public static final <K, V> MutableScatterMap<Object, Object> multiMap(int i) {
        return MultiValueMap.m4517constructorimpl(new MutableScatterMap(i));
    }

    public static final int nearestCommonRootOf(SlotReader slotReader, int i, int i2, int i3) {
        if (i != i2) {
            if (i == i3 || i2 == i3) {
                return i3;
            }
            if (slotReader.parent(i) == i2) {
                return i2;
            }
            if (slotReader.parent(i2) != i) {
                if (slotReader.parent(i) == slotReader.parent(i2)) {
                    return slotReader.parent(i);
                }
                int distanceFrom = distanceFrom(slotReader, i, i3);
                int distanceFrom2 = distanceFrom(slotReader, i2, i3);
                int i4 = distanceFrom - distanceFrom2;
                for (int i5 = 0; i5 < i4; i5++) {
                    i = slotReader.parent(i);
                }
                int i6 = distanceFrom2 - distanceFrom;
                for (int i7 = 0; i7 < i6; i7++) {
                    i2 = slotReader.parent(i2);
                }
                while (i != i2) {
                    i = slotReader.parent(i);
                    i2 = slotReader.parent(i2);
                }
                return i;
            }
        }
        return i;
    }

    private static final void removeData(SlotWriter slotWriter, int i, Object obj) {
        Object clear = slotWriter.clear(i);
        if (obj == clear) {
            return;
        }
        ComposerKt.composeImmediateRuntimeError("Slot table is out of sync (expected " + obj + ", got " + clear + ")");
    }

    public static final Invalidation removeLocation(List<Invalidation> list, int i) {
        int findLocation = findLocation(list, i);
        if (findLocation >= 0) {
            return list.remove(findLocation);
        }
        return null;
    }

    public static final void removeRange(List<Invalidation> list, int i, int i2) {
        int findInsertLocation = findInsertLocation(list, i);
        while (findInsertLocation < list.size() && list.get(findInsertLocation).getLocation() < i2) {
            list.remove(findInsertLocation);
        }
    }
}
