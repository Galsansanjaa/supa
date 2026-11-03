package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CalculateMatrixToWindowApi21 {
    public static final CalculateMatrixToWindowApi21 INSTANCE = new CalculateMatrixToWindowApi21();

    private CalculateMatrixToWindowApi21() {
    }

    /* renamed from: preConcat-SB1oJJI, reason: not valid java name */
    private final void m7152preConcatSB1oJJI(float[] fArr, Matrix matrix, float[] fArr2) {
        AndroidMatrixConversions_androidKt.m5206setFromtUYjHk(fArr2, matrix);
        AndroidComposeView_androidKt.m7140preTransformJiSxe2E(fArr, fArr2);
    }

    /* renamed from: transformMatrixToWindow-qGEkDyk, reason: not valid java name */
    private final void m7153transformMatrixToWindowqGEkDyk(View view, float[] fArr, float[] fArr2, int[] iArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            m7153transformMatrixToWindowqGEkDyk((View) parent, fArr, fArr2, iArr);
            AndroidComposeView_androidKt.m7141preTranslatecG2Xzmc(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            AndroidComposeView_androidKt.m7141preTranslatecG2Xzmc(fArr, view.getLeft(), view.getTop(), fArr2);
        } else {
            view.getLocationInWindow(iArr);
            AndroidComposeView_androidKt.m7141preTranslatecG2Xzmc(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            AndroidComposeView_androidKt.m7141preTranslatecG2Xzmc(fArr, iArr[0], iArr[1], fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        m7152preConcatSB1oJJI(fArr, matrix, fArr2);
    }

    /* renamed from: calculateMatrixToWindow-qGEkDyk, reason: not valid java name */
    public final void m7154calculateMatrixToWindowqGEkDyk(View view, float[] fArr, float[] fArr2, int[] iArr) {
        androidx.compose.ui.graphics.Matrix.m5575resetimpl(fArr);
        m7153transformMatrixToWindowqGEkDyk(view, fArr, fArr2, iArr);
    }
}
