package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ShaderKt {
    public static final void transform(Shader shader, ps0 ps0Var) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        ps0Var.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
