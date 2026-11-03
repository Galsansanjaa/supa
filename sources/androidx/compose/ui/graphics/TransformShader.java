package androidx.compose.ui.graphics;

import android.graphics.Shader;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TransformShader {
    public static final int $stable = 8;
    private android.graphics.Matrix aMatrix;
    private Shader shader;

    private final android.graphics.Matrix obtainMatrix() {
        android.graphics.Matrix matrix = this.aMatrix;
        if (matrix != null) {
            return matrix;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        this.aMatrix = matrix2;
        return matrix2;
    }

    public final Shader getShader() {
        return this.shader;
    }

    public final void setShader(Shader shader) {
        android.graphics.Matrix matrix = this.aMatrix;
        if (matrix != null && shader != null) {
            shader.setLocalMatrix(matrix);
        }
        this.shader = shader;
    }

    /* renamed from: transform-Q8lPUPs, reason: not valid java name */
    public final void m5745transformQ8lPUPs(float[] fArr) {
        android.graphics.Matrix matrix;
        if (fArr == null) {
            matrix = null;
            this.aMatrix = null;
        } else {
            android.graphics.Matrix obtainMatrix = obtainMatrix();
            AndroidMatrixConversions_androidKt.m5205setFromEL8BTi8(obtainMatrix, fArr);
            matrix = obtainMatrix;
        }
        Shader shader = this.shader;
        if (shader != null) {
            shader.setLocalMatrix(matrix);
        }
    }
}
