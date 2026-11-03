package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import defpackage.f31;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@DrawScopeMarker
/* loaded from: classes3.dex */
public interface DrawTransform {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
        public static /* synthetic */ void m5909clipPathmtrdDE$default(DrawTransform drawTransform, Path path, int i, int i2, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
                return;
            }
            if ((i2 & 2) != 0) {
                i = ClipOp.Companion.m5321getIntersectrtfAjoo();
            }
            drawTransform.mo5833clipPathmtrdDE(path, i);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m5911getCenterF1C5BW0(DrawTransform drawTransform) {
            float intBitsToFloat = Float.intBitsToFloat((int) (drawTransform.mo5836getSizeNHjbRc() >> 32)) / 2.0f;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (drawTransform.mo5836getSizeNHjbRc() & 4294967295L)) / 2.0f;
            return Offset.m5082constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
        }

        /* renamed from: rotate-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ void m5912rotateUv8p0NA$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
                return;
            }
            if ((i & 2) != 0) {
                j = drawTransform.mo5835getCenterF1C5BW0();
            }
            drawTransform.mo5837rotateUv8p0NA(f, j);
        }

        /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
        public static /* synthetic */ void m5913scale0AR0LA0$default(DrawTransform drawTransform, float f, float f2, long j, int i, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
                return;
            }
            if ((i & 4) != 0) {
                j = drawTransform.mo5835getCenterF1C5BW0();
            }
            drawTransform.mo5838scale0AR0LA0(f, f2, j);
        }
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo5833clipPathmtrdDE(Path path, int i);

    /* renamed from: clipRect-N_I0leg */
    void mo5834clipRectN_I0leg(float f, float f2, float f3, float f4, int i);

    /* renamed from: getCenter-F1C5BW0 */
    long mo5835getCenterF1C5BW0();

    /* renamed from: getSize-NH-jbRc */
    long mo5836getSizeNHjbRc();

    void inset(float f, float f2, float f3, float f4);

    /* renamed from: rotate-Uv8p0NA */
    void mo5837rotateUv8p0NA(float f, long j);

    /* renamed from: scale-0AR0LA0 */
    void mo5838scale0AR0LA0(float f, float f2, long j);

    /* renamed from: transform-58bKbWc */
    void mo5839transform58bKbWc(float[] fArr);

    void translate(float f, float f2);
}
