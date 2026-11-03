package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LargeIconButtonTokens {
    public static final int $stable = 0;
    private static final ShapeKeyTokens ContainerShapeRound;
    private static final ShapeKeyTokens ContainerShapeSquare;
    private static final float IconSize;
    private static final float NarrowLeadingSpace;
    private static final float NarrowTrailingSpace;
    private static final float OutlinedOutlineWidth;
    private static final ShapeKeyTokens PressedContainerShape;
    private static final ShapeKeyTokens SelectedContainerShapeRound;
    private static final ShapeKeyTokens SelectedContainerShapeSquare;
    private static final float UniformLeadingSpace;
    private static final float UniformTrailingSpace;
    private static final float WideLeadingSpace;
    private static final float WideTrailingSpace;
    public static final LargeIconButtonTokens INSTANCE = new LargeIconButtonTokens();
    private static final float ContainerHeight = Dp.m8049constructorimpl(96.0f);

    static {
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ContainerShapeRound = shapeKeyTokens;
        ShapeKeyTokens shapeKeyTokens2 = ShapeKeyTokens.CornerExtraLarge;
        ContainerShapeSquare = shapeKeyTokens2;
        IconSize = Dp.m8049constructorimpl(32.0f);
        NarrowLeadingSpace = Dp.m8049constructorimpl(16.0f);
        NarrowTrailingSpace = Dp.m8049constructorimpl(16.0f);
        OutlinedOutlineWidth = Dp.m8049constructorimpl(2.0f);
        PressedContainerShape = ShapeKeyTokens.CornerLarge;
        SelectedContainerShapeRound = shapeKeyTokens2;
        SelectedContainerShapeSquare = shapeKeyTokens;
        UniformLeadingSpace = Dp.m8049constructorimpl(32.0f);
        UniformTrailingSpace = Dp.m8049constructorimpl(32.0f);
        WideLeadingSpace = Dp.m8049constructorimpl(48.0f);
        WideTrailingSpace = Dp.m8049constructorimpl(48.0f);
    }

    private LargeIconButtonTokens() {
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m4002getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShapeRound() {
        return ContainerShapeRound;
    }

    public final ShapeKeyTokens getContainerShapeSquare() {
        return ContainerShapeSquare;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4003getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getNarrowLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m4004getNarrowLeadingSpaceD9Ej5fM() {
        return NarrowLeadingSpace;
    }

    /* renamed from: getNarrowTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m4005getNarrowTrailingSpaceD9Ej5fM() {
        return NarrowTrailingSpace;
    }

    /* renamed from: getOutlinedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m4006getOutlinedOutlineWidthD9Ej5fM() {
        return OutlinedOutlineWidth;
    }

    public final ShapeKeyTokens getPressedContainerShape() {
        return PressedContainerShape;
    }

    public final ShapeKeyTokens getSelectedContainerShapeRound() {
        return SelectedContainerShapeRound;
    }

    public final ShapeKeyTokens getSelectedContainerShapeSquare() {
        return SelectedContainerShapeSquare;
    }

    /* renamed from: getUniformLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m4007getUniformLeadingSpaceD9Ej5fM() {
        return UniformLeadingSpace;
    }

    /* renamed from: getUniformTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m4008getUniformTrailingSpaceD9Ej5fM() {
        return UniformTrailingSpace;
    }

    /* renamed from: getWideLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m4009getWideLeadingSpaceD9Ej5fM() {
        return WideLeadingSpace;
    }

    /* renamed from: getWideTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m4010getWideTrailingSpaceD9Ej5fM() {
        return WideTrailingSpace;
    }
}
