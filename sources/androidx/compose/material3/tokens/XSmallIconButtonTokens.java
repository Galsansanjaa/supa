package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class XSmallIconButtonTokens {
    public static final int $stable = 0;
    private static final ShapeKeyTokens ContainerShapeRound;
    private static final ShapeKeyTokens ContainerShapeSquare;
    private static final float DefaultLeadingSpace;
    private static final float DefaultTrailingSpace;
    private static final float IconSize;
    private static final float NarrowLeadingSpace;
    private static final float NarrowTrailingSpace;
    private static final float OutlinedOutlineWidth;
    private static final ShapeKeyTokens PressedContainerShape;
    private static final ShapeKeyTokens SelectedContainerShapeRound;
    private static final ShapeKeyTokens SelectedContainerShapeSquare;
    private static final float WideLeadingSpace;
    private static final float WideTrailingSpace;
    public static final XSmallIconButtonTokens INSTANCE = new XSmallIconButtonTokens();
    private static final float ContainerHeight = Dp.m8049constructorimpl(32.0f);

    static {
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ContainerShapeRound = shapeKeyTokens;
        ShapeKeyTokens shapeKeyTokens2 = ShapeKeyTokens.CornerMedium;
        ContainerShapeSquare = shapeKeyTokens2;
        DefaultLeadingSpace = Dp.m8049constructorimpl(6.0f);
        DefaultTrailingSpace = Dp.m8049constructorimpl(6.0f);
        IconSize = Dp.m8049constructorimpl(20.0f);
        NarrowLeadingSpace = Dp.m8049constructorimpl(4.0f);
        NarrowTrailingSpace = Dp.m8049constructorimpl(4.0f);
        OutlinedOutlineWidth = Dp.m8049constructorimpl(1.0f);
        PressedContainerShape = ShapeKeyTokens.CornerSmall;
        SelectedContainerShapeRound = shapeKeyTokens2;
        SelectedContainerShapeSquare = shapeKeyTokens;
        WideLeadingSpace = Dp.m8049constructorimpl(10.0f);
        WideTrailingSpace = Dp.m8049constructorimpl(10.0f);
    }

    private XSmallIconButtonTokens() {
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m4447getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShapeRound() {
        return ContainerShapeRound;
    }

    public final ShapeKeyTokens getContainerShapeSquare() {
        return ContainerShapeSquare;
    }

    /* renamed from: getDefaultLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m4448getDefaultLeadingSpaceD9Ej5fM() {
        return DefaultLeadingSpace;
    }

    /* renamed from: getDefaultTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m4449getDefaultTrailingSpaceD9Ej5fM() {
        return DefaultTrailingSpace;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4450getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getNarrowLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m4451getNarrowLeadingSpaceD9Ej5fM() {
        return NarrowLeadingSpace;
    }

    /* renamed from: getNarrowTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m4452getNarrowTrailingSpaceD9Ej5fM() {
        return NarrowTrailingSpace;
    }

    /* renamed from: getOutlinedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m4453getOutlinedOutlineWidthD9Ej5fM() {
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

    /* renamed from: getWideLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m4454getWideLeadingSpaceD9Ej5fM() {
        return WideLeadingSpace;
    }

    /* renamed from: getWideTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m4455getWideTrailingSpaceD9Ej5fM() {
        return WideTrailingSpace;
    }
}
