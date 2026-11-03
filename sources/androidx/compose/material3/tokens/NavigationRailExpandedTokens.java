package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class NavigationRailExpandedTokens {
    public static final int $stable = 0;
    private static final float ContainerElevation;
    private static final ShapeKeyTokens ContainerShape;
    private static final float ContainerWidthMaximum;
    private static final float ContainerWidthMinimum;
    public static final NavigationRailExpandedTokens INSTANCE = new NavigationRailExpandedTokens();
    private static final ColorSchemeKeyTokens ModalContainerColor;
    private static final float ModalContainerElevation;
    private static final ShapeKeyTokens ModalContainerShape;
    private static final float TopSpace;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m3877getLevel0D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerNone;
        ContainerWidthMaximum = Dp.m8049constructorimpl(360.0f);
        ContainerWidthMinimum = Dp.m8049constructorimpl(220.0f);
        ModalContainerElevation = elevationTokens.m3879getLevel2D9Ej5fM();
        ModalContainerShape = ShapeKeyTokens.CornerLarge;
        TopSpace = Dp.m8049constructorimpl(44.0f);
        ModalContainerColor = ColorSchemeKeyTokens.SurfaceContainer;
    }

    private NavigationRailExpandedTokens() {
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m4082getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getContainerWidthMaximum-D9Ej5fM, reason: not valid java name */
    public final float m4083getContainerWidthMaximumD9Ej5fM() {
        return ContainerWidthMaximum;
    }

    /* renamed from: getContainerWidthMinimum-D9Ej5fM, reason: not valid java name */
    public final float m4084getContainerWidthMinimumD9Ej5fM() {
        return ContainerWidthMinimum;
    }

    public final ColorSchemeKeyTokens getModalContainerColor() {
        return ModalContainerColor;
    }

    /* renamed from: getModalContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m4085getModalContainerElevationD9Ej5fM() {
        return ModalContainerElevation;
    }

    public final ShapeKeyTokens getModalContainerShape() {
        return ModalContainerShape;
    }

    /* renamed from: getTopSpace-D9Ej5fM, reason: not valid java name */
    public final float m4086getTopSpaceD9Ej5fM() {
        return TopSpace;
    }
}
