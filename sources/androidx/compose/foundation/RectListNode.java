package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import defpackage.ej1;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class RectListNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    public static final int $stable = 8;
    private Rect androidRect;
    private ps0 rect;

    public RectListNode(ps0 ps0Var) {
        this.rect = ps0Var;
    }

    private final Rect calcBounds(LayoutCoordinates layoutCoordinates, androidx.compose.ui.geometry.Rect rect) {
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        long mo6713localPositionOfR5De75A = findRootCoordinates.mo6713localPositionOfR5De75A(layoutCoordinates, rect.m5125getTopLeftF1C5BW0());
        long mo6713localPositionOfR5De75A2 = findRootCoordinates.mo6713localPositionOfR5De75A(layoutCoordinates, rect.m5126getTopRightF1C5BW0());
        long mo6713localPositionOfR5De75A3 = findRootCoordinates.mo6713localPositionOfR5De75A(layoutCoordinates, rect.m5118getBottomLeftF1C5BW0());
        long mo6713localPositionOfR5De75A4 = findRootCoordinates.mo6713localPositionOfR5De75A(layoutCoordinates, rect.m5119getBottomRightF1C5BW0());
        int i = (int) (mo6713localPositionOfR5De75A >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (mo6713localPositionOfR5De75A2 >> 32);
        int i3 = (int) (mo6713localPositionOfR5De75A3 >> 32);
        int i4 = (int) (mo6713localPositionOfR5De75A4 >> 32);
        boolean z = true;
        float[] fArr = {Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)};
        int i5 = 0;
        while (i5 < 3) {
            intBitsToFloat = Math.min(intBitsToFloat, fArr[i5]);
            i5++;
            z = z;
        }
        boolean z2 = z;
        int i6 = (int) (mo6713localPositionOfR5De75A & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i6);
        int i7 = (int) (mo6713localPositionOfR5De75A2 & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i7);
        int i8 = (int) (mo6713localPositionOfR5De75A3 & 4294967295L);
        float intBitsToFloat4 = Float.intBitsToFloat(i8);
        int i9 = (int) (mo6713localPositionOfR5De75A4 & 4294967295L);
        float intBitsToFloat5 = Float.intBitsToFloat(i9);
        float[] fArr2 = new float[3];
        fArr2[0] = intBitsToFloat3;
        fArr2[z2 ? 1 : 0] = intBitsToFloat4;
        fArr2[2] = intBitsToFloat5;
        for (int i10 = 0; i10 < 3; i10++) {
            intBitsToFloat2 = Math.min(intBitsToFloat2, fArr2[i10]);
        }
        float intBitsToFloat6 = Float.intBitsToFloat(i);
        float intBitsToFloat7 = Float.intBitsToFloat(i2);
        float intBitsToFloat8 = Float.intBitsToFloat(i3);
        float intBitsToFloat9 = Float.intBitsToFloat(i4);
        float[] fArr3 = new float[3];
        fArr3[0] = intBitsToFloat7;
        fArr3[z2 ? 1 : 0] = intBitsToFloat8;
        fArr3[2] = intBitsToFloat9;
        for (int i11 = 0; i11 < 3; i11++) {
            intBitsToFloat6 = Math.max(intBitsToFloat6, fArr3[i11]);
        }
        float intBitsToFloat10 = Float.intBitsToFloat(i6);
        float intBitsToFloat11 = Float.intBitsToFloat(i7);
        float intBitsToFloat12 = Float.intBitsToFloat(i8);
        float intBitsToFloat13 = Float.intBitsToFloat(i9);
        float[] fArr4 = new float[3];
        fArr4[0] = intBitsToFloat11;
        fArr4[z2 ? 1 : 0] = intBitsToFloat12;
        fArr4[2] = intBitsToFloat13;
        for (int i12 = 0; i12 < 3; i12++) {
            intBitsToFloat10 = Math.max(intBitsToFloat10, fArr4[i12]);
        }
        return new Rect(ej1.K(intBitsToFloat), ej1.K(intBitsToFloat2), ej1.K(intBitsToFloat6), ej1.K(intBitsToFloat10));
    }

    private final void replaceRect(Rect rect) {
        MutableVector<Rect> currentRects = currentRects();
        Rect rect2 = this.androidRect;
        if (rect2 != null) {
            currentRects.remove(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            currentRects.add(rect);
        }
        updateRects(currentRects);
        this.androidRect = rect;
    }

    public abstract MutableVector<Rect> currentRects();

    public ps0 getRect() {
        return this.rect;
    }

    public final View getView() {
        return DelegatableNode_androidKt.requireView(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        replaceRect(null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        Rect calcBounds;
        if (getRect() == null) {
            androidx.compose.ui.geometry.Rect boundsInRoot = LayoutCoordinatesKt.boundsInRoot(layoutCoordinates);
            calcBounds = new Rect(ej1.K(boundsInRoot.getLeft()), ej1.K(boundsInRoot.getTop()), ej1.K(boundsInRoot.getRight()), ej1.K(boundsInRoot.getBottom()));
        } else {
            ps0 rect = getRect();
            rect.getClass();
            calcBounds = calcBounds(layoutCoordinates, (androidx.compose.ui.geometry.Rect) rect.invoke(layoutCoordinates));
        }
        replaceRect(calcBounds);
    }

    public void setRect(ps0 ps0Var) {
        this.rect = ps0Var;
    }

    public abstract void updateRects(MutableVector<Rect> mutableVector);
}
