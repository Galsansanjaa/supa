package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface DrawContext {
    Canvas getCanvas();

    Density getDensity();

    GraphicsLayer getGraphicsLayer();

    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc */
    long mo5831getSizeNHjbRc();

    DrawTransform getTransform();

    void setCanvas(Canvas canvas);

    void setDensity(Density density);

    void setGraphicsLayer(GraphicsLayer graphicsLayer);

    void setLayoutDirection(LayoutDirection layoutDirection);

    /* renamed from: setSize-uvyYCjk */
    void mo5832setSizeuvyYCjk(long j);
}
