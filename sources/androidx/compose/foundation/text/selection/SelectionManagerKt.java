package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$1;
import androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$2;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import defpackage.dv1;
import defpackage.ea0;
import defpackage.hu2;
import defpackage.kw;
import defpackage.nb0;
import defpackage.os0;
import defpackage.ps0;
import defpackage.qk0;
import defpackage.vy2;
import defpackage.we2;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SelectionManagerKt {
    private static final Rect invertedInfiniteRect = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: access$extendedToInclude-Uv8p0NA */
    public static final /* synthetic */ Rect m2154access$extendedToIncludeUv8p0NA(Rect rect, long j) {
        return m2158extendedToIncludeUv8p0NA(rect, j);
    }

    public static final /* synthetic */ List access$firstAndLast(List list) {
        return firstAndLast(list);
    }

    public static final /* synthetic */ Rect access$getInvertedInfiniteRect$p() {
        return invertedInfiniteRect;
    }

    /* renamed from: access$nearestPointTo-Uv8p0NA */
    public static final /* synthetic */ long m2155access$nearestPointToUv8p0NA(LayoutCoordinates layoutCoordinates, long j) {
        return m2160nearestPointToUv8p0NA(layoutCoordinates, j);
    }

    public static final /* synthetic */ Rect access$union(Rect rect, Rect rect2) {
        return union(rect, rect2);
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c */
    public static final long m2156calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager selectionManager, long j) {
        Selection selection = selectionManager.getSelection();
        if (selection == null) {
            return Offset.Companion.m5105getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = selectionManager.getDraggingHandle();
        int i = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i == -1) {
            return Offset.Companion.m5105getUnspecifiedF1C5BW0();
        }
        if (i == 1) {
            return m2159getMagnifierCenterJVtK1S4(selectionManager, j, selection.getStart());
        }
        if (i == 2) {
            return m2159getMagnifierCenterJVtK1S4(selectionManager, j, selection.getEnd());
        }
        if (i != 3) {
            hu2.e();
            return 0L;
        }
        hu2.h("SelectionContainer does not support cursor");
        return 0L;
    }

    /* renamed from: containsInclusive-Uv8p0NA */
    public static final boolean m2157containsInclusiveUv8p0NA(Rect rect, long j) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (left > intBitsToFloat || intBitsToFloat > right) {
            return false;
        }
        float top = rect.getTop();
        float bottom = rect.getBottom();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return top <= intBitsToFloat2 && intBitsToFloat2 <= bottom;
    }

    public static final ps0 contextMenuBuilder(SelectionManager selectionManager, ContextMenuState contextMenuState) {
        return new qk0(27, selectionManager, contextMenuState);
    }

    public static final vy2 contextMenuBuilder$lambda$0(SelectionManager selectionManager, ContextMenuState contextMenuState, ContextMenuScope contextMenuScope) {
        contextMenuBuilder$lambda$0$selectionItem(contextMenuScope, contextMenuState, TextContextMenuItems.Copy, selectionManager.isNonEmptySelection$foundation(), new we2(selectionManager, 7));
        contextMenuBuilder$lambda$0$selectionItem(contextMenuScope, contextMenuState, TextContextMenuItems.SelectAll, !selectionManager.isEntireContainerSelected$foundation(), new we2(selectionManager, 8));
        vy2 vy2Var = vy2.a;
        nb0.D(vy2Var, vy2Var);
        return vy2Var;
    }

    public static final vy2 contextMenuBuilder$lambda$0$0(SelectionManager selectionManager) {
        selectionManager.copy$foundation();
        return vy2.a;
    }

    public static final vy2 contextMenuBuilder$lambda$0$1(SelectionManager selectionManager) {
        selectionManager.selectAll$foundation();
        return vy2.a;
    }

    private static final void contextMenuBuilder$lambda$0$selectionItem(ContextMenuScope contextMenuScope, ContextMenuState contextMenuState, TextContextMenuItems textContextMenuItems, boolean z, os0 os0Var) {
        if (z) {
            ContextMenuScope.item$default(contextMenuScope, new CommonContextMenuAreaKt$TextItem$1(textContextMenuItems), null, false, null, new CommonContextMenuAreaKt$TextItem$2(os0Var, contextMenuState), 14, null);
        }
    }

    /* renamed from: extendedToInclude-Uv8p0NA */
    public static final Rect m2158extendedToIncludeUv8p0NA(Rect rect, long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new Rect(Math.min(rect.getLeft(), Float.intBitsToFloat(i)), Math.min(rect.getTop(), Float.intBitsToFloat(i2)), Math.max(rect.getRight(), Float.intBitsToFloat(i)), Math.max(rect.getBottom(), Float.intBitsToFloat(i2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> firstAndLast(List<? extends T> list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : nb0.D(kw.p0(list), kw.x0(list));
    }

    /* renamed from: getMagnifierCenter-JVtK1S4 */
    private static final long m2159getMagnifierCenterJVtK1S4(SelectionManager selectionManager, long j, Selection.AnchorInfo anchorInfo) {
        LayoutCoordinates containerLayoutCoordinates;
        LayoutCoordinates layoutCoordinates;
        int offset;
        float n;
        Selectable anchorSelectable$foundation = selectionManager.getAnchorSelectable$foundation(anchorInfo);
        if (anchorSelectable$foundation != null && (containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates()) != null && (layoutCoordinates = anchorSelectable$foundation.getLayoutCoordinates()) != null && (offset = anchorInfo.getOffset()) <= anchorSelectable$foundation.getLastVisibleOffset()) {
            Offset m2144getCurrentDragPosition_m7T9E = selectionManager.m2144getCurrentDragPosition_m7T9E();
            m2144getCurrentDragPosition_m7T9E.getClass();
            float intBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates.mo6713localPositionOfR5De75A(containerLayoutCoordinates, m2144getCurrentDragPosition_m7T9E.m5100unboximpl()) >> 32));
            long mo2108getRangeOfLineContainingjx7JFs = anchorSelectable$foundation.mo2108getRangeOfLineContainingjx7JFs(offset);
            if (TextRange.m7480getCollapsedimpl(mo2108getRangeOfLineContainingjx7JFs)) {
                n = anchorSelectable$foundation.getLineLeft(offset);
            } else {
                float lineLeft = anchorSelectable$foundation.getLineLeft(TextRange.m7486getStartimpl(mo2108getRangeOfLineContainingjx7JFs));
                float lineRight = anchorSelectable$foundation.getLineRight(TextRange.m7481getEndimpl(mo2108getRangeOfLineContainingjx7JFs) - 1);
                n = ea0.n(intBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
            }
            if (n == -1.0f) {
                return Offset.Companion.m5105getUnspecifiedF1C5BW0();
            }
            if (!IntSize.m8214equalsimpl0(j, IntSize.Companion.m8221getZeroYbymL2g()) && Math.abs(intBitsToFloat - n) > ((int) (j >> 32)) / 2) {
                return Offset.Companion.m5105getUnspecifiedF1C5BW0();
            }
            return anchorSelectable$foundation.getCenterYForOffset(offset) == -1.0f ? Offset.Companion.m5105getUnspecifiedF1C5BW0() : containerLayoutCoordinates.mo6713localPositionOfR5De75A(layoutCoordinates, Offset.m5082constructorimpl((Float.floatToRawIntBits(n) << 32) | (4294967295L & Float.floatToRawIntBits(r9))));
        }
        return Offset.Companion.m5105getUnspecifiedF1C5BW0();
    }

    public static final Rect getSelectedRegionRect(List<? extends dv1> list, LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        int[] iArr;
        List<? extends dv1> list2 = list;
        if (list2.isEmpty()) {
            return invertedInfiniteRect;
        }
        Rect rect = invertedInfiniteRect;
        float component1 = rect.component1();
        float component2 = rect.component2();
        float component3 = rect.component3();
        float component4 = rect.component4();
        int size = list2.size();
        char c = 0;
        int i = 0;
        while (i < size) {
            dv1 dv1Var = list2.get(i);
            Selectable selectable = (Selectable) dv1Var.a;
            Selection selection = (Selection) dv1Var.b;
            int offset = selection.getStart().getOffset();
            int offset2 = selection.getEnd().getOffset();
            if (offset != offset2 && (layoutCoordinates2 = selectable.getLayoutCoordinates()) != null) {
                int min = Math.min(offset, offset2);
                int max = Math.max(offset, offset2) - 1;
                if (min == max) {
                    iArr = new int[1];
                    iArr[c] = min;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[c] = min;
                    iArr2[1] = max;
                    iArr = iArr2;
                }
                Rect rect2 = invertedInfiniteRect;
                float component12 = rect2.component1();
                float component22 = rect2.component2();
                float component32 = rect2.component3();
                float component42 = rect2.component4();
                int length = iArr.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2;
                    Rect boundingBox = selectable.getBoundingBox(iArr[i3]);
                    component12 = Math.min(component12, boundingBox.getLeft());
                    component22 = Math.min(component22, boundingBox.getTop());
                    component32 = Math.max(component32, boundingBox.getRight());
                    component42 = Math.max(component42, boundingBox.getBottom());
                    i2 = i3 + 1;
                }
                long m5082constructorimpl = Offset.m5082constructorimpl((Float.floatToRawIntBits(component12) << 32) | (Float.floatToRawIntBits(component22) & 4294967295L));
                long m5082constructorimpl2 = Offset.m5082constructorimpl((Float.floatToRawIntBits(component42) & 4294967295L) | (Float.floatToRawIntBits(component32) << 32));
                long mo6713localPositionOfR5De75A = layoutCoordinates.mo6713localPositionOfR5De75A(layoutCoordinates2, m5082constructorimpl);
                long mo6713localPositionOfR5De75A2 = layoutCoordinates.mo6713localPositionOfR5De75A(layoutCoordinates2, m5082constructorimpl2);
                component1 = Math.min(component1, Float.intBitsToFloat((int) (mo6713localPositionOfR5De75A >> 32)));
                component2 = Math.min(component2, Float.intBitsToFloat((int) (mo6713localPositionOfR5De75A & 4294967295L)));
                component3 = Math.max(component3, Float.intBitsToFloat((int) (mo6713localPositionOfR5De75A2 >> 32)));
                component4 = Math.max(component4, Float.intBitsToFloat((int) (mo6713localPositionOfR5De75A2 & 4294967295L)));
            }
            i++;
            list2 = list;
            c = 0;
        }
        return new Rect(component1, component2, component3, component4);
    }

    public static final Selection merge(Selection selection, Selection selection2) {
        Selection merge;
        return (selection == null || (merge = selection.merge(selection2)) == null) ? selection2 : merge;
    }

    /* renamed from: nearestPointTo-Uv8p0NA */
    public static final long m2160nearestPointToUv8p0NA(LayoutCoordinates layoutCoordinates, long j) {
        float n = ea0.n(Float.intBitsToFloat((int) (j >> 32)), 0.0f, (int) (layoutCoordinates.mo6712getSizeYbymL2g() >> 32));
        float n2 = ea0.n(Float.intBitsToFloat((int) (j & 4294967295L)), 0.0f, (int) (layoutCoordinates.mo6712getSizeYbymL2g() & 4294967295L));
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(n) << 32) | (Float.floatToRawIntBits(n2) & 4294967295L));
    }

    public static final Rect union(Rect rect, Rect rect2) {
        return new Rect(Math.min(rect.getLeft(), rect2.getLeft()), Math.min(rect.getTop(), rect2.getTop()), Math.max(rect.getRight(), rect2.getRight()), Math.max(rect.getBottom(), rect2.getBottom()));
    }

    public static final Rect visibleBounds(LayoutCoordinates layoutCoordinates) {
        Rect boundsInWindow$default = LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates, false, 1, null);
        return RectKt.m5128Rect0a9Yr6o(layoutCoordinates.mo6721windowToLocalMKHz9U(boundsInWindow$default.m5125getTopLeftF1C5BW0()), layoutCoordinates.mo6721windowToLocalMKHz9U(boundsInWindow$default.m5119getBottomRightF1C5BW0()));
    }
}
