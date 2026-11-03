package androidx.compose.material3.tokens;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MenuTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens ListItemSelectedLabelTextColor;
    private static final ColorSchemeKeyTokens ListItemSelectedLeadingTrailingIconColor;
    private static final ColorSchemeKeyTokens MenuListItemLeadingIconColor;
    public static final MenuTokens INSTANCE = new MenuTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.SurfaceContainer;
    private static final float ContainerElevation = ElevationTokens.INSTANCE.m3879getLevel2D9Ej5fM();
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerExtraSmall;
    private static final ColorSchemeKeyTokens FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;
    private static final ColorSchemeKeyTokens ListItemSelectedContainerColor = ColorSchemeKeyTokens.SecondaryContainer;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSecondaryContainer;
        ListItemSelectedLabelTextColor = colorSchemeKeyTokens;
        ListItemSelectedLeadingTrailingIconColor = colorSchemeKeyTokens;
        MenuListItemLeadingIconColor = colorSchemeKeyTokens;
    }

    private MenuTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m4050getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return FocusIndicatorColor;
    }

    public final ColorSchemeKeyTokens getListItemSelectedContainerColor() {
        return ListItemSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getListItemSelectedLabelTextColor() {
        return ListItemSelectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemSelectedLeadingTrailingIconColor() {
        return ListItemSelectedLeadingTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getMenuListItemLeadingIconColor() {
        return MenuListItemLeadingIconColor;
    }
}
