package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class NavigationBarTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens ItemInactiveIconColor;
    private static final ColorSchemeKeyTokens ItemInactiveLabelTextColor;
    private static final TypographyKeyTokens LabelTextFont;
    private static final ShapeKeyTokens NavShape;
    private static final float TallContainerHeight;
    public static final NavigationBarTokens INSTANCE = new NavigationBarTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.SurfaceContainer;
    private static final float ContainerElevation = ElevationTokens.INSTANCE.m3879getLevel2D9Ej5fM();
    private static final float ContainerHeight = Dp.m8049constructorimpl(64.0f);
    private static final ColorSchemeKeyTokens ItemActiveIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens ItemActiveIndicatorColor = ColorSchemeKeyTokens.SecondaryContainer;
    private static final float ItemActiveIndicatorIconLabelSpace = Dp.m8049constructorimpl(4.0f);
    private static final ShapeKeyTokens ItemActiveIndicatorShape = ShapeKeyTokens.CornerFull;
    private static final ColorSchemeKeyTokens ItemActiveLabelTextColor = ColorSchemeKeyTokens.Secondary;
    private static final float ItemBetweenSpace = Dp.m8049constructorimpl(0.0f);

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurfaceVariant;
        ItemInactiveIconColor = colorSchemeKeyTokens;
        ItemInactiveLabelTextColor = colorSchemeKeyTokens;
        NavShape = ShapeKeyTokens.CornerNone;
        TallContainerHeight = Dp.m8049constructorimpl(80.0f);
        LabelTextFont = TypographyKeyTokens.LabelMedium;
    }

    private NavigationBarTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m4055getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m4056getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ColorSchemeKeyTokens getItemActiveIconColor() {
        return ItemActiveIconColor;
    }

    public final ColorSchemeKeyTokens getItemActiveIndicatorColor() {
        return ItemActiveIndicatorColor;
    }

    /* renamed from: getItemActiveIndicatorIconLabelSpace-D9Ej5fM, reason: not valid java name */
    public final float m4057getItemActiveIndicatorIconLabelSpaceD9Ej5fM() {
        return ItemActiveIndicatorIconLabelSpace;
    }

    public final ShapeKeyTokens getItemActiveIndicatorShape() {
        return ItemActiveIndicatorShape;
    }

    public final ColorSchemeKeyTokens getItemActiveLabelTextColor() {
        return ItemActiveLabelTextColor;
    }

    /* renamed from: getItemBetweenSpace-D9Ej5fM, reason: not valid java name */
    public final float m4058getItemBetweenSpaceD9Ej5fM() {
        return ItemBetweenSpace;
    }

    public final ColorSchemeKeyTokens getItemInactiveIconColor() {
        return ItemInactiveIconColor;
    }

    public final ColorSchemeKeyTokens getItemInactiveLabelTextColor() {
        return ItemInactiveLabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    public final ShapeKeyTokens getNavShape() {
        return NavShape;
    }

    /* renamed from: getTallContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m4059getTallContainerHeightD9Ej5fM() {
        return TallContainerHeight;
    }
}
