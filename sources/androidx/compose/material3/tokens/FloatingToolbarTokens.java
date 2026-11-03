package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FloatingToolbarTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens StandardContainerColor;
    private static final ColorSchemeKeyTokens VibrantButtonSelectedContainerColor;
    private static final ColorSchemeKeyTokens VibrantButtonSelectedIconColor;
    private static final ColorSchemeKeyTokens VibrantButtonSelectedTextColor;
    private static final ColorSchemeKeyTokens VibrantButtonUnselectedIconColor;
    private static final ColorSchemeKeyTokens VibrantButtonUnselectedTextColor;
    private static final ColorSchemeKeyTokens VibrantContainerColor;
    public static final FloatingToolbarTokens INSTANCE = new FloatingToolbarTokens();
    private static final float ContainerBetweenSpace = Dp.m8049constructorimpl(4.0f);
    private static final float ContainerExternalPadding = Dp.m8049constructorimpl(16.0f);
    private static final float ContainerHeight = Dp.m8049constructorimpl(64.0f);
    private static final float ContainerLeadingSpace = Dp.m8049constructorimpl(8.0f);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerFull;
    private static final float ContainerTrailingSpace = Dp.m8049constructorimpl(8.0f);

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.SurfaceContainer;
        StandardContainerColor = colorSchemeKeyTokens;
        VibrantButtonSelectedContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        VibrantButtonSelectedIconColor = colorSchemeKeyTokens2;
        VibrantButtonSelectedTextColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnPrimaryContainer;
        VibrantButtonUnselectedIconColor = colorSchemeKeyTokens3;
        VibrantButtonUnselectedTextColor = colorSchemeKeyTokens3;
        VibrantContainerColor = ColorSchemeKeyTokens.PrimaryContainer;
    }

    private FloatingToolbarTokens() {
    }

    /* renamed from: getContainerBetweenSpace-D9Ej5fM, reason: not valid java name */
    public final float m3989getContainerBetweenSpaceD9Ej5fM() {
        return ContainerBetweenSpace;
    }

    /* renamed from: getContainerExternalPadding-D9Ej5fM, reason: not valid java name */
    public final float m3990getContainerExternalPaddingD9Ej5fM() {
        return ContainerExternalPadding;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3991getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    /* renamed from: getContainerLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3992getContainerLeadingSpaceD9Ej5fM() {
        return ContainerLeadingSpace;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getContainerTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3993getContainerTrailingSpaceD9Ej5fM() {
        return ContainerTrailingSpace;
    }

    public final ColorSchemeKeyTokens getStandardContainerColor() {
        return StandardContainerColor;
    }

    public final ColorSchemeKeyTokens getVibrantButtonSelectedContainerColor() {
        return VibrantButtonSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getVibrantButtonSelectedIconColor() {
        return VibrantButtonSelectedIconColor;
    }

    public final ColorSchemeKeyTokens getVibrantButtonSelectedTextColor() {
        return VibrantButtonSelectedTextColor;
    }

    public final ColorSchemeKeyTokens getVibrantButtonUnselectedIconColor() {
        return VibrantButtonUnselectedIconColor;
    }

    public final ColorSchemeKeyTokens getVibrantButtonUnselectedTextColor() {
        return VibrantButtonUnselectedTextColor;
    }

    public final ColorSchemeKeyTokens getVibrantContainerColor() {
        return VibrantContainerColor;
    }
}
