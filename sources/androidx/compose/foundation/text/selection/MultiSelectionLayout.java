package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMap;
import androidx.collection.LongObjectMap;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import defpackage.hu2;
import defpackage.ps0;
import defpackage.vg1;
import defpackage.vs0;
import defpackage.wa2;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MultiSelectionLayout implements SelectionLayout {
    private LongObjectMap<SelectableInfo> _infoBySelectableId;
    private final int endSlot;
    private final List<SelectableInfo> infoList;
    private final boolean isStartHandle;
    private final Selection previousSelection;
    private final LongIntMap selectableIdToInfoListIndex;
    private final int startSlot;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CrossStatus.values().length];
            try {
                iArr[CrossStatus.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CrossStatus.NOT_CROSSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CrossStatus.CROSSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MultiSelectionLayout(LongIntMap longIntMap, List<SelectableInfo> list, int i, int i2, boolean z, Selection selection) {
        this.selectableIdToInfoListIndex = longIntMap;
        this.infoList = list;
        this.startSlot = i;
        this.endSlot = i2;
        this.isStartHandle = z;
        this.previousSelection = selection;
        if (list.size() > 1) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection createSubSelections$lambda$1(Selection selection, SelectableInfo selectableInfo, boolean z) {
        return selection.getHandlesCrossed() ? selectableInfo.makeSingleLayoutSelection(selectableInfo.getTextLength(), 0) : selectableInfo.makeSingleLayoutSelection(0, selectableInfo.getTextLength());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection createSubSelections$lambda$2(Selection selection, SelectableInfo selectableInfo, boolean z, int i, boolean z2) {
        boolean handlesCrossed = selection.getHandlesCrossed();
        return z ? handlesCrossed ? selectableInfo.makeSingleLayoutSelection(i, 0) : selectableInfo.makeSingleLayoutSelection(i, selectableInfo.getTextLength()) : handlesCrossed ? selectableInfo.makeSingleLayoutSelection(selectableInfo.getTextLength(), i) : selectableInfo.makeSingleLayoutSelection(0, i);
    }

    private final LongObjectMap<SelectableInfo> getInfoBySelectableId() {
        LongObjectMap<SelectableInfo> longObjectMap = this._infoBySelectableId;
        LongObjectMap<SelectableInfo> longObjectMap2 = longObjectMap;
        if (longObjectMap == null) {
            MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
            List<SelectableInfo> list = this.infoList;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                SelectableInfo selectableInfo = list.get(i);
                mutableLongObjectMap.put(selectableInfo.getSelectableId(), selectableInfo);
            }
            this._infoBySelectableId = mutableLongObjectMap;
            longObjectMap2 = mutableLongObjectMap;
        }
        return longObjectMap2;
    }

    private final int getInfoListIndexBySelectableId(long j) {
        try {
            return this.selectableIdToInfoListIndex.get(j);
        } catch (NoSuchElementException e) {
            throw new IllegalStateException(vg1.A(j, "Invalid selectableId: "), e);
        }
    }

    private final boolean shouldAnyInfoRecomputeSelection(MultiSelectionLayout multiSelectionLayout) {
        if (getSize() != multiSelectionLayout.getSize()) {
            return true;
        }
        int size = this.infoList.size();
        for (int i = 0; i < size; i++) {
            if (this.infoList.get(i).shouldRecomputeSelection(multiSelectionLayout.infoList.get(i))) {
                return true;
            }
        }
        return false;
    }

    private final int slotToIndex(int i, boolean z) {
        return (i - (!z ? 1 : 0)) / 2;
    }

    private final int startOrEndSlotToIndex(int i, boolean z) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[getCrossStatus().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    hu2.e();
                    return 0;
                }
                if (z) {
                    z = false;
                }
            }
            return slotToIndex(i, z);
        }
        z = true;
        return slotToIndex(i, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ps0] */
    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public LongObjectMap<Selection> createSubSelections(final Selection selection) {
        return SelectionLayoutKt.createSubSelections(selection, this.infoList, new Object(), new b(selection, 0), new vs0() { // from class: androidx.compose.foundation.text.selection.c
            @Override // defpackage.vs0
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                Selection createSubSelections$lambda$2;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                int intValue = ((Integer) obj3).intValue();
                boolean booleanValue2 = ((Boolean) obj4).booleanValue();
                createSubSelections$lambda$2 = MultiSelectionLayout.createSubSelections$lambda$2(Selection.this, (SelectableInfo) obj, booleanValue, intValue, booleanValue2);
                return createSubSelections$lambda$2;
            }
        });
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public void forEachMiddleInfo(ps0 ps0Var) {
        int infoListIndexBySelectableId = getInfoListIndexBySelectableId(getFirstInfo().getSelectableId());
        int infoListIndexBySelectableId2 = getInfoListIndexBySelectableId(getLastInfo().getSelectableId());
        int i = infoListIndexBySelectableId + 1;
        if (i >= infoListIndexBySelectableId2) {
            return;
        }
        while (i < infoListIndexBySelectableId2) {
            ps0Var.invoke(this.infoList.get(i));
            i++;
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public CrossStatus getCrossStatus() {
        return getStartSlot() < getEndSlot() ? CrossStatus.NOT_CROSSED : getStartSlot() > getEndSlot() ? CrossStatus.CROSSED : this.infoList.get(getStartSlot() / 2).getRawCrossStatus();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getCurrentInfo() {
        return isStartHandle() ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getEndInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getEndSlot(), false));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getFirstInfo() {
        return getCrossStatus() == CrossStatus.CROSSED ? getEndInfo() : getStartInfo();
    }

    public final List<SelectableInfo> getInfoList() {
        return this.infoList;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getLastInfo() {
        return getCrossStatus() == CrossStatus.CROSSED ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    public final LongIntMap getSelectableIdToInfoListIndex() {
        return this.selectableIdToInfoListIndex;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getSize() {
        return this.infoList.size();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getStartInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getStartSlot(), true));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getStartSlot() {
        return this.startSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo infoForSelectable(long j) {
        return getInfoBySelectableId().get(j);
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean isStartHandle() {
        return this.isStartHandle;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean shouldRecomputeSelection(SelectionLayout selectionLayout) {
        if (getPreviousSelection() == null || selectionLayout == null || !(selectionLayout instanceof MultiSelectionLayout)) {
            return true;
        }
        MultiSelectionLayout multiSelectionLayout = (MultiSelectionLayout) selectionLayout;
        return (isStartHandle() == multiSelectionLayout.isStartHandle() && getStartSlot() == multiSelectionLayout.getStartSlot() && getEndSlot() == multiSelectionLayout.getEndSlot() && !shouldAnyInfoRecomputeSelection(multiSelectionLayout)) ? false : true;
    }

    public String toString() {
        boolean isStartHandle = isStartHandle();
        boolean z = true;
        float startSlot = (getStartSlot() + 1) / 2.0f;
        float endSlot = (getEndSlot() + 1) / 2.0f;
        CrossStatus crossStatus = getCrossStatus();
        StringBuilder sb = new StringBuilder("[\n\t");
        List<SelectableInfo> list = this.infoList;
        int size = list.size();
        int i = 0;
        while (i < size) {
            SelectableInfo selectableInfo = list.get(i);
            if (z) {
                z = false;
            } else {
                sb.append(",\n\t");
            }
            i++;
            sb.append(i + " -> " + selectableInfo);
        }
        sb.append("\n]");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb3.append(isStartHandle);
        sb3.append(", startPosition=");
        sb3.append(startSlot);
        sb3.append(", endPosition=");
        sb3.append(endSlot);
        sb3.append(", crossed=");
        sb3.append(crossStatus);
        sb3.append(", infos=");
        return wa2.v(sb3, sb2, ")");
    }
}
