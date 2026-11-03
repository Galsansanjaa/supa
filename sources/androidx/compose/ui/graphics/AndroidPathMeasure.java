package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import defpackage.f31;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AndroidPathMeasure implements PathMeasure {
    public static final int $stable = 8;
    private final android.graphics.PathMeasure internalPathMeasure;
    private float[] positionArray;
    private float[] tangentArray;

    public AndroidPathMeasure(android.graphics.PathMeasure pathMeasure) {
        this.internalPathMeasure = pathMeasure;
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public float getLength() {
        return this.internalPathMeasure.getLength();
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* renamed from: getPosition-tuRUvjQ, reason: not valid java name */
    public long mo5233getPositiontuRUvjQ(float f) {
        float[] fArr = this.positionArray;
        if (fArr == null) {
            fArr = new float[2];
            this.positionArray = fArr;
        }
        float[] fArr2 = this.tangentArray;
        if (fArr2 == null) {
            fArr2 = new float[2];
            this.tangentArray = fArr2;
        }
        if (!this.internalPathMeasure.getPosTan(f, fArr, fArr2)) {
            return Offset.Companion.m5105getUnspecifiedF1C5BW0();
        }
        float[] fArr3 = this.positionArray;
        fArr3.getClass();
        float f2 = fArr3[0];
        float[] fArr4 = this.positionArray;
        fArr4.getClass();
        float f3 = fArr4[1];
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public boolean getSegment(float f, float f2, Path path, boolean z) {
        android.graphics.PathMeasure pathMeasure = this.internalPathMeasure;
        if (path instanceof AndroidPath) {
            return pathMeasure.getSegment(f, f2, ((AndroidPath) path).getInternalPath(), z);
        }
        f31.f("Unable to obtain android.graphics.Path");
        return false;
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* renamed from: getTangent-tuRUvjQ, reason: not valid java name */
    public long mo5234getTangenttuRUvjQ(float f) {
        float[] fArr = this.positionArray;
        if (fArr == null) {
            fArr = new float[2];
            this.positionArray = fArr;
        }
        float[] fArr2 = this.tangentArray;
        if (fArr2 == null) {
            fArr2 = new float[2];
            this.tangentArray = fArr2;
        }
        if (!this.internalPathMeasure.getPosTan(f, fArr, fArr2)) {
            return Offset.Companion.m5105getUnspecifiedF1C5BW0();
        }
        float[] fArr3 = this.tangentArray;
        fArr3.getClass();
        float f2 = fArr3[0];
        float[] fArr4 = this.tangentArray;
        fArr4.getClass();
        float f3 = fArr4[1];
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public void setPath(Path path, boolean z) {
        android.graphics.Path path2;
        android.graphics.PathMeasure pathMeasure = this.internalPathMeasure;
        if (path == null) {
            path2 = null;
        } else {
            if (!(path instanceof AndroidPath)) {
                f31.f("Unable to obtain android.graphics.Path");
                return;
            }
            path2 = ((AndroidPath) path).getInternalPath();
        }
        pathMeasure.setPath(path2, z);
    }
}
