package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.DegreesKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class DrawTransformKt {
    public static final void inset(DrawTransform drawTransform, float f) {
        drawTransform.inset(f, f, f, f);
    }

    public static final void inset(DrawTransform drawTransform, float f, float f2) {
        drawTransform.inset(f, f2, f, f2);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawTransform.inset(f, f2, f, f2);
    }

    /* renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m5914rotateRad0AR0LA0(DrawTransform drawTransform, float f, long j) {
        drawTransform.mo5837rotateUv8p0NA(DegreesKt.degrees(f), j);
    }

    /* renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m5915rotateRad0AR0LA0$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawTransform.mo5835getCenterF1C5BW0();
        }
        drawTransform.mo5837rotateUv8p0NA(DegreesKt.degrees(f), j);
    }

    /* renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m5916scale0AR0LA0(DrawTransform drawTransform, float f, long j) {
        drawTransform.mo5838scale0AR0LA0(f, f, j);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m5917scale0AR0LA0$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawTransform.mo5835getCenterF1C5BW0();
        }
        drawTransform.mo5838scale0AR0LA0(f, f, j);
    }
}
