package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CalculateMatrixToWindowApi29 {
    public static final CalculateMatrixToWindowApi29 INSTANCE = new CalculateMatrixToWindowApi29();

    private CalculateMatrixToWindowApi29() {
    }

    /* renamed from: calculateMatrixToWindow-V2T6pWw, reason: not valid java name */
    public final void m7155calculateMatrixToWindowV2T6pWw(View view, float[] fArr, Matrix matrix, int[] iArr) {
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        AndroidMatrixConversions_androidKt.m5206setFromtUYjHk(fArr, matrix);
    }
}
