package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class GridItemNode extends Modifier.Node implements ParentDataModifierNode {
    private Alignment alignment;
    private Object areaId;
    private int column;
    private int columnSpan;
    private int row;
    private int rowSpan;

    public GridItemNode(Object obj, int i, int i2, int i3, int i4, Alignment alignment) {
        this.areaId = obj;
        this.row = i;
        this.column = i2;
        this.rowSpan = i3;
        this.columnSpan = i4;
        this.alignment = alignment;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final Object getAreaId() {
        return this.areaId;
    }

    public final int getColumn() {
        return this.column;
    }

    public final int getColumnSpan() {
        return this.columnSpan;
    }

    public final int getRow() {
        return this.row;
    }

    public final int getRowSpan() {
        return this.rowSpan;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public GridItemNode modifyParentData(Density density, Object obj) {
        return this;
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAreaId(Object obj) {
        this.areaId = obj;
    }

    public final void setColumn(int i) {
        this.column = i;
    }

    public final void setColumnSpan(int i) {
        this.columnSpan = i;
    }

    public final void setRow(int i) {
        this.row = i;
    }

    public final void setRowSpan(int i) {
        this.rowSpan = i;
    }
}
