package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class BadgeTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens Color;
    public static final BadgeTokens INSTANCE = new BadgeTokens();
    private static final ColorSchemeKeyTokens LargeColor;
    private static final ColorSchemeKeyTokens LargeLabelTextColor;
    private static final TypographyKeyTokens LargeLabelTextFont;
    private static final ShapeKeyTokens LargeShape;
    private static final float LargeSize;
    private static final ShapeKeyTokens Shape;
    private static final float Size;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Error;
        Color = colorSchemeKeyTokens;
        LargeColor = colorSchemeKeyTokens;
        LargeLabelTextColor = ColorSchemeKeyTokens.OnError;
        LargeLabelTextFont = TypographyKeyTokens.LabelSmall;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        LargeShape = shapeKeyTokens;
        LargeSize = Dp.m8049constructorimpl(16.0f);
        Shape = shapeKeyTokens;
        Size = Dp.m8049constructorimpl(6.0f);
    }

    private BadgeTokens() {
    }

    public final ColorSchemeKeyTokens getColor() {
        return Color;
    }

    public final ColorSchemeKeyTokens getLargeColor() {
        return LargeColor;
    }

    public final ColorSchemeKeyTokens getLargeLabelTextColor() {
        return LargeLabelTextColor;
    }

    public final TypographyKeyTokens getLargeLabelTextFont() {
        return LargeLabelTextFont;
    }

    public final ShapeKeyTokens getLargeShape() {
        return LargeShape;
    }

    /* renamed from: getLargeSize-D9Ej5fM, reason: not valid java name */
    public final float m3654getLargeSizeD9Ej5fM() {
        return LargeSize;
    }

    public final ShapeKeyTokens getShape() {
        return Shape;
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m3655getSizeD9Ej5fM() {
        return Size;
    }
}
