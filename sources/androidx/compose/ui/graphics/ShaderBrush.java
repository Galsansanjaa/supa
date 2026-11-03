package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import defpackage.jh2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class ShaderBrush extends Brush {
    public static final int $stable = 0;
    private long createdSize;
    private TransformShader internalTransformShader;
    private float[] transform;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.Companion.m5167getUnspecifiedNHjbRc();
    }

    private final TransformShader obtainTransformShader() {
        TransformShader transformShader = this.internalTransformShader;
        if (transformShader != null) {
            return transformShader;
        }
        TransformShader transformShader2 = new TransformShader();
        this.internalTransformShader = transformShader2;
        return transformShader2;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo5283applyToPq9zytI(long j, Paint paint, float f) {
        TransformShader transformShader = this.internalTransformShader;
        if (transformShader == null || !Size.m5155equalsimpl0(this.createdSize, j)) {
            if (Size.m5161isEmptyimpl(j)) {
                this.internalTransformShader = null;
                this.createdSize = Size.Companion.m5167getUnspecifiedNHjbRc();
                transformShader = null;
            } else {
                transformShader = obtainTransformShader();
                float[] fArr = this.transform;
                if (fArr != null) {
                    transformShader.m5745transformQ8lPUPs(fArr);
                }
                transformShader.setShader(mo5307createShaderuvyYCjk(j));
                this.internalTransformShader = transformShader;
                this.createdSize = j;
            }
        }
        long mo5208getColor0d7_KjU = paint.mo5208getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m5333equalsimpl0(mo5208getColor0d7_KjU, companion.m5358getBlack0d7_KjU())) {
            paint.mo5214setColor8_81llA(companion.m5358getBlack0d7_KjU());
        }
        if (!jh2.k(paint.getShader(), transformShader != null ? transformShader.getShader() : null)) {
            paint.setShader(transformShader != null ? transformShader.getShader() : null);
        }
        if (paint.getAlpha() == f) {
            return;
        }
        paint.setAlpha(f);
    }

    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo5307createShaderuvyYCjk(long j);

    /* renamed from: getTransform-3i98HWw, reason: not valid java name */
    public final float[] m5660getTransform3i98HWw() {
        return this.transform;
    }

    /* renamed from: setTransform-Q8lPUPs, reason: not valid java name */
    public final void m5661setTransformQ8lPUPs(float[] fArr) {
        this.transform = fArr;
        TransformShader transformShader = this.internalTransformShader;
        if (transformShader != null) {
            transformShader.m5745transformQ8lPUPs(fArr);
        }
    }
}
