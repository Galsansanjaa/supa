package androidx.compose.ui.graphics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class MeshGradientScopeImpl implements MeshGradientScope {
    private final float[] bottomBezierOffsets;
    private final int[] colors;
    private final int columns;
    private final float[] leftBezierOffsets;
    private final int numberOfPoints;
    private final float[] positions;
    private final float[] rightBezierOffsets;
    private final int rows;
    private final float[] topBezierOffsets;

    public MeshGradientScopeImpl(int i, int i2) {
        this.rows = i;
        this.columns = i2;
        int columns = (getColumns() + 1) * (getRows() + 1);
        this.numberOfPoints = columns;
        this.positions = new float[columns * 2];
        this.colors = new int[columns];
        int i3 = columns * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr[i4] = Float.NaN;
        }
        this.leftBezierOffsets = fArr;
        int i5 = this.numberOfPoints * 2;
        float[] fArr2 = new float[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            fArr2[i6] = Float.NaN;
        }
        this.rightBezierOffsets = fArr2;
        int i7 = this.numberOfPoints * 2;
        float[] fArr3 = new float[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            fArr3[i8] = Float.NaN;
        }
        this.topBezierOffsets = fArr3;
        int i9 = this.numberOfPoints * 2;
        float[] fArr4 = new float[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            fArr4[i10] = Float.NaN;
        }
        this.bottomBezierOffsets = fArr4;
    }

    public final float[] getBottomBezierOffsets() {
        return this.bottomBezierOffsets;
    }

    public final int[] getColors() {
        return this.colors;
    }

    @Override // androidx.compose.ui.graphics.MeshGradientScope
    public int getColumns() {
        return this.columns;
    }

    public final float[] getLeftBezierOffsets() {
        return this.leftBezierOffsets;
    }

    public final int getNumberOfPoints() {
        return this.numberOfPoints;
    }

    public final float[] getPositions() {
        return this.positions;
    }

    public final float[] getRightBezierOffsets() {
        return this.rightBezierOffsets;
    }

    @Override // androidx.compose.ui.graphics.MeshGradientScope
    public int getRows() {
        return this.rows;
    }

    public final float[] getTopBezierOffsets() {
        return this.topBezierOffsets;
    }

    @Override // androidx.compose.ui.graphics.MeshGradientScope
    /* renamed from: setVertex-6uS4IUQ */
    public void mo5602setVertex6uS4IUQ(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6) {
        boolean z = false;
        if (!(i >= 0 && i <= getRows())) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("row (" + i + ") must be in range 0.." + getRows());
        }
        if (i2 >= 0 && i2 <= getColumns()) {
            z = true;
        }
        if (!z) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("column (" + i2 + ") must be in range 0.." + getColumns());
        }
        int columns = (((getColumns() + 1) * i) + i2) * 2;
        MeshGradientConfigKt.m5597setOffset0AR0LA0(this.positions, columns, j);
        this.colors[((getColumns() + 1) * i) + i2] = ColorKt.m5386toArgb8_81llA(j2);
        MeshGradientConfigKt.m5597setOffset0AR0LA0(this.leftBezierOffsets, columns, j3);
        MeshGradientConfigKt.m5597setOffset0AR0LA0(this.rightBezierOffsets, columns, j5);
        MeshGradientConfigKt.m5597setOffset0AR0LA0(this.topBezierOffsets, columns, j4);
        MeshGradientConfigKt.m5597setOffset0AR0LA0(this.bottomBezierOffsets, columns, j6);
    }
}
