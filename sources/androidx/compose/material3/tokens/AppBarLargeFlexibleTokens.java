package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AppBarLargeFlexibleTokens {
    public static final int $stable = 0;
    public static final AppBarLargeFlexibleTokens INSTANCE = new AppBarLargeFlexibleTokens();
    private static final float ContainerHeight = Dp.m8049constructorimpl(120.0f);
    private static final TypographyKeyTokens SubtitleFont = TypographyKeyTokens.TitleMedium;
    private static final TypographyKeyTokens TitleFont = TypographyKeyTokens.DisplaySmall;
    private static final float LargeContainerHeight = Dp.m8049constructorimpl(152.0f);

    private AppBarLargeFlexibleTokens() {
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3630getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    /* renamed from: getLargeContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3631getLargeContainerHeightD9Ej5fM() {
        return LargeContainerHeight;
    }

    public final TypographyKeyTokens getSubtitleFont() {
        return SubtitleFont;
    }

    public final TypographyKeyTokens getTitleFont() {
        return TitleFont;
    }
}
