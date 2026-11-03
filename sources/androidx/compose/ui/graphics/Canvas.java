package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import defpackage.f31;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface Canvas {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: clipRect-mtrdD-E, reason: not valid java name */
        public static void m5310clipRectmtrdDE(Canvas canvas, Rect rect, int i) {
            canvas.mo5185clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i);
        }

        @Deprecated
        public static void drawArc(Canvas canvas, Rect rect, float f, float f2, boolean z, Paint paint) {
            canvas.drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2, z, paint);
        }

        @Deprecated
        public static void drawArcRad(Canvas canvas, Rect rect, float f, float f2, boolean z, Paint paint) {
            canvas.drawArc(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2), z, paint);
        }

        /* renamed from: drawImageRect-HPBpro0$default, reason: not valid java name */
        public static /* synthetic */ void m5312drawImageRectHPBpro0$default(Canvas canvas, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint, int i, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
                return;
            }
            long m8184getZeronOccac = (i & 2) != 0 ? IntOffset.Companion.m8184getZeronOccac() : j;
            long m8211constructorimpl = (i & 4) != 0 ? IntSize.m8211constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j2;
            canvas.mo5190drawImageRectHPBpro0(imageBitmap, m8184getZeronOccac, m8211constructorimpl, (i & 8) != 0 ? IntOffset.Companion.m8184getZeronOccac() : j3, (i & 16) != 0 ? m8211constructorimpl : j4, paint);
        }

        @Deprecated
        public static void drawOval(Canvas canvas, Rect rect, Paint paint) {
            canvas.drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
        }

        @Deprecated
        public static void drawRect(Canvas canvas, Rect rect, Paint paint) {
            canvas.drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
        }

        public static /* synthetic */ void scale$default(Canvas canvas, float f, float f2, int i, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: scale");
                return;
            }
            if ((i & 2) != 0) {
                f2 = f;
            }
            canvas.scale(f, f2);
        }

        @Deprecated
        public static void skewRad(Canvas canvas, float f, float f2) {
            canvas.skew(DegreesKt.degrees(f), DegreesKt.degrees(f2));
        }
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo5184clipPathmtrdDE(Path path, int i);

    /* renamed from: clipRect-N_I0leg */
    void mo5185clipRectN_I0leg(float f, float f2, float f3, float f4, int i);

    /* renamed from: clipRect-mtrdD-E */
    void mo5186clipRectmtrdDE(Rect rect, int i);

    /* renamed from: concat-58bKbWc */
    void mo5187concat58bKbWc(float[] fArr);

    void disableZ();

    void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint);

    void drawArc(Rect rect, float f, float f2, boolean z, Paint paint);

    void drawArcRad(Rect rect, float f, float f2, boolean z, Paint paint);

    /* renamed from: drawCircle-9KIMszo */
    void mo5188drawCircle9KIMszo(long j, float f, Paint paint);

    /* renamed from: drawImage-d-4ec7I */
    void mo5189drawImaged4ec7I(ImageBitmap imageBitmap, long j, Paint paint);

    /* renamed from: drawImageRect-HPBpro0 */
    void mo5190drawImageRectHPBpro0(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint);

    /* renamed from: drawLine-Wko1d7g */
    void mo5191drawLineWko1d7g(long j, long j2, Paint paint);

    void drawOval(float f, float f2, float f3, float f4, Paint paint);

    void drawOval(Rect rect, Paint paint);

    void drawPath(Path path, Paint paint);

    /* renamed from: drawPoints-O7TthRY */
    void mo5192drawPointsO7TthRY(int i, List<Offset> list, Paint paint);

    /* renamed from: drawRawPoints-O7TthRY */
    void mo5193drawRawPointsO7TthRY(int i, float[] fArr, Paint paint);

    void drawRect(float f, float f2, float f3, float f4, Paint paint);

    void drawRect(Rect rect, Paint paint);

    void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint);

    /* renamed from: drawVertices-TPEHhCM */
    void mo5194drawVerticesTPEHhCM(Vertices vertices, int i, Paint paint);

    void enableZ();

    void restore();

    void rotate(float f);

    void save();

    void saveLayer(Rect rect, Paint paint);

    void scale(float f, float f2);

    void skew(float f, float f2);

    void skewRad(float f, float f2);

    void translate(float f, float f2);
}
