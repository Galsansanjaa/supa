package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.MatrixKt;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class LayerMatrixCache<T> {
    public static final int $stable = 8;
    private Matrix androidMatrixCache;
    private final ts0 getMatrix;
    private boolean isDirty;
    private boolean isInverseDirty;
    private float[] matrixCache = androidx.compose.ui.graphics.Matrix.m5566constructorimpl$default(null, 1, null);
    private float[] inverseMatrixCache = androidx.compose.ui.graphics.Matrix.m5566constructorimpl$default(null, 1, null);
    private boolean isInverseValid = true;
    private boolean isIdentity = true;

    public LayerMatrixCache(ts0 ts0Var) {
        this.getMatrix = ts0Var;
    }

    /* renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m7193calculateInverseMatrixbWbORWo(T t) {
        float[] fArr = this.inverseMatrixCache;
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.m7191invertToJiSxe2E(m7194calculateMatrixGrdbGEg(t), fArr);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArr;
        }
        return null;
    }

    /* renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m7194calculateMatrixGrdbGEg(T t) {
        float[] fArr = this.matrixCache;
        if (!this.isDirty) {
            return fArr;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(t, matrix);
        AndroidMatrixConversions_androidKt.m5206setFromtUYjHk(fArr, matrix);
        this.isDirty = false;
        this.isIdentity = MatrixKt.m5591isIdentity58bKbWc(fArr);
        return fArr;
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    public final void map(T t, MutableRect mutableRect) {
        float[] m7194calculateMatrixGrdbGEg = m7194calculateMatrixGrdbGEg(t);
        if (this.isIdentity) {
            return;
        }
        androidx.compose.ui.graphics.Matrix.m5574mapimpl(m7194calculateMatrixGrdbGEg, mutableRect);
    }

    /* renamed from: map-R5De75A, reason: not valid java name */
    public final long m7195mapR5De75A(T t, long j) {
        return !this.isIdentity ? androidx.compose.ui.graphics.Matrix.m5572mapMKHz9U(m7194calculateMatrixGrdbGEg(t), j) : j;
    }

    public final void mapInverse(T t, MutableRect mutableRect) {
        float[] m7193calculateInverseMatrixbWbORWo = m7193calculateInverseMatrixbWbORWo(t);
        if (m7193calculateInverseMatrixbWbORWo == null) {
            mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            if (this.isIdentity) {
                return;
            }
            androidx.compose.ui.graphics.Matrix.m5574mapimpl(m7193calculateInverseMatrixbWbORWo, mutableRect);
        }
    }

    /* renamed from: mapInverse-R5De75A, reason: not valid java name */
    public final long m7196mapInverseR5De75A(T t, long j) {
        float[] m7193calculateInverseMatrixbWbORWo = m7193calculateInverseMatrixbWbORWo(t);
        return m7193calculateInverseMatrixbWbORWo == null ? Offset.Companion.m5104getInfiniteF1C5BW0() : !this.isIdentity ? androidx.compose.ui.graphics.Matrix.m5572mapMKHz9U(m7193calculateInverseMatrixbWbORWo, j) : j;
    }

    public final void reset() {
        this.isDirty = false;
        this.isInverseDirty = false;
        this.isIdentity = true;
        this.isInverseValid = true;
        androidx.compose.ui.graphics.Matrix.m5575resetimpl(this.matrixCache);
        androidx.compose.ui.graphics.Matrix.m5575resetimpl(this.inverseMatrixCache);
    }
}
