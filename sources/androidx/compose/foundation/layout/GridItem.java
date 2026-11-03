package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class GridItem {
    private final Alignment alignment;
    private int column;
    private int columnSpan;
    private final Measurable measurable;
    private int offsetX;
    private int offsetY;
    private Placeable placeable;
    private int row;
    private int rowSpan;

    public GridItem(Measurable measurable, int i, int i2, int i3, int i4, Alignment alignment, Placeable placeable, int i5, int i6) {
        this.measurable = measurable;
        this.row = i;
        this.column = i2;
        this.rowSpan = i3;
        this.columnSpan = i4;
        this.alignment = alignment;
        this.placeable = placeable;
        this.offsetX = i5;
        this.offsetY = i6;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GridItem(androidx.compose.ui.layout.Measurable r13, int r14, int r15, int r16, int r17, androidx.compose.ui.Alignment r18, androidx.compose.ui.layout.Placeable r19, int r20, int r21, int r22, defpackage.sb0 r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 64
            if (r1 == 0) goto L9
            r1 = 0
            r9 = r1
            goto Lb
        L9:
            r9 = r19
        Lb:
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L12
            r10 = r2
            goto L14
        L12:
            r10 = r20
        L14:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L24
            r11 = r2
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r2 = r12
            goto L30
        L24:
            r11 = r21
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
        L30:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.GridItem.<init>(androidx.compose.ui.layout.Measurable, int, int, int, int, androidx.compose.ui.Alignment, androidx.compose.ui.layout.Placeable, int, int, int, sb0):void");
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final int getColumn() {
        return this.column;
    }

    public final int getColumnSpan() {
        return this.columnSpan;
    }

    public final Measurable getMeasurable() {
        return this.measurable;
    }

    public final int getOffsetX() {
        return this.offsetX;
    }

    public final int getOffsetY() {
        return this.offsetY;
    }

    public final Placeable getPlaceable() {
        return this.placeable;
    }

    public final int getRow() {
        return this.row;
    }

    public final int getRowSpan() {
        return this.rowSpan;
    }

    public final void setColumn(int i) {
        this.column = i;
    }

    public final void setColumnSpan(int i) {
        this.columnSpan = i;
    }

    public final void setOffsetX(int i) {
        this.offsetX = i;
    }

    public final void setOffsetY(int i) {
        this.offsetY = i;
    }

    public final void setPlaceable(Placeable placeable) {
        this.placeable = placeable;
    }

    public final void setRow(int i) {
        this.row = i;
    }

    public final void setRowSpan(int i) {
        this.rowSpan = i;
    }
}
