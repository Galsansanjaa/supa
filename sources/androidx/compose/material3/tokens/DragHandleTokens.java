package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class DragHandleTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens DraggedColor;
    private static final float DraggedElevation;
    private static final float DraggedHeight;
    private static final ShapeKeyTokens DraggedShape;
    private static final float DraggedWidth;
    private static final float Elevation;
    private static final float Height;
    private static final ColorSchemeKeyTokens PressedColor;
    private static final float PressedElevation;
    private static final float PressedHeight;
    private static final ShapeKeyTokens PressedShape;
    private static final float PressedWidth;
    private static final ShapeKeyTokens Shape;
    private static final float Width;
    public static final DragHandleTokens INSTANCE = new DragHandleTokens();
    private static final ColorSchemeKeyTokens Color = ColorSchemeKeyTokens.Outline;
    private static final float ContainerWidth = Dp.m8049constructorimpl(24.0f);

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DraggedColor = colorSchemeKeyTokens;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        DraggedElevation = elevationTokens.m3877getLevel0D9Ej5fM();
        DraggedHeight = Dp.m8049constructorimpl(52.0f);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerMedium;
        DraggedShape = shapeKeyTokens;
        DraggedWidth = Dp.m8049constructorimpl(12.0f);
        Elevation = elevationTokens.m3877getLevel0D9Ej5fM();
        Height = Dp.m8049constructorimpl(48.0f);
        PressedColor = colorSchemeKeyTokens;
        PressedElevation = elevationTokens.m3877getLevel0D9Ej5fM();
        PressedHeight = Dp.m8049constructorimpl(52.0f);
        PressedShape = shapeKeyTokens;
        PressedWidth = Dp.m8049constructorimpl(12.0f);
        Shape = ShapeKeyTokens.CornerFull;
        Width = Dp.m8049constructorimpl(4.0f);
    }

    private DragHandleTokens() {
    }

    public final ColorSchemeKeyTokens getColor() {
        return Color;
    }

    /* renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m3855getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    public final ColorSchemeKeyTokens getDraggedColor() {
        return DraggedColor;
    }

    /* renamed from: getDraggedElevation-D9Ej5fM, reason: not valid java name */
    public final float m3856getDraggedElevationD9Ej5fM() {
        return DraggedElevation;
    }

    /* renamed from: getDraggedHeight-D9Ej5fM, reason: not valid java name */
    public final float m3857getDraggedHeightD9Ej5fM() {
        return DraggedHeight;
    }

    public final ShapeKeyTokens getDraggedShape() {
        return DraggedShape;
    }

    /* renamed from: getDraggedWidth-D9Ej5fM, reason: not valid java name */
    public final float m3858getDraggedWidthD9Ej5fM() {
        return DraggedWidth;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m3859getElevationD9Ej5fM() {
        return Elevation;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m3860getHeightD9Ej5fM() {
        return Height;
    }

    public final ColorSchemeKeyTokens getPressedColor() {
        return PressedColor;
    }

    /* renamed from: getPressedElevation-D9Ej5fM, reason: not valid java name */
    public final float m3861getPressedElevationD9Ej5fM() {
        return PressedElevation;
    }

    /* renamed from: getPressedHeight-D9Ej5fM, reason: not valid java name */
    public final float m3862getPressedHeightD9Ej5fM() {
        return PressedHeight;
    }

    public final ShapeKeyTokens getPressedShape() {
        return PressedShape;
    }

    /* renamed from: getPressedWidth-D9Ej5fM, reason: not valid java name */
    public final float m3863getPressedWidthD9Ej5fM() {
        return PressedWidth;
    }

    public final ShapeKeyTokens getShape() {
        return Shape;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m3864getWidthD9Ej5fM() {
        return Width;
    }
}
