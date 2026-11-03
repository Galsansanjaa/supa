package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import defpackage.sb0;
import defpackage.ts0;
import defpackage.us0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TwoRowsTopAppBarOverrideScope {
    public static final int $stable = 0;
    private final us0 actions;
    private final float collapsedHeight;
    private final TopAppBarColors colors;
    private final float expandedHeight;
    private final Modifier modifier;
    private final ts0 navigationIcon;
    private final TopAppBarScrollBehavior scrollBehavior;
    private final ts0 smallSubtitle;
    private final TextStyle smallSubtitleTextStyle;
    private final ts0 smallTitle;
    private final TextStyle smallTitleTextStyle;
    private final ts0 subtitle;
    private final TextStyle subtitleTextStyle;
    private final ts0 title;
    private final float titleBottomPadding;
    private final Alignment.Horizontal titleHorizontalAlignment;
    private final TextStyle titleTextStyle;
    private final WindowInsets windowInsets;

    private TwoRowsTopAppBarOverrideScope(Modifier modifier, ts0 ts0Var, TextStyle textStyle, float f, ts0 ts0Var2, TextStyle textStyle2, ts0 ts0Var3, TextStyle textStyle3, ts0 ts0Var4, TextStyle textStyle4, Alignment.Horizontal horizontal, ts0 ts0Var5, us0 us0Var, float f2, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior) {
        this.modifier = modifier;
        this.title = ts0Var;
        this.titleTextStyle = textStyle;
        this.titleBottomPadding = f;
        this.smallTitle = ts0Var2;
        this.smallTitleTextStyle = textStyle2;
        this.subtitle = ts0Var3;
        this.subtitleTextStyle = textStyle3;
        this.smallSubtitle = ts0Var4;
        this.smallSubtitleTextStyle = textStyle4;
        this.titleHorizontalAlignment = horizontal;
        this.navigationIcon = ts0Var5;
        this.actions = us0Var;
        this.collapsedHeight = f2;
        this.expandedHeight = f3;
        this.windowInsets = windowInsets;
        this.colors = topAppBarColors;
        this.scrollBehavior = topAppBarScrollBehavior;
    }

    public /* synthetic */ TwoRowsTopAppBarOverrideScope(Modifier modifier, ts0 ts0Var, TextStyle textStyle, float f, ts0 ts0Var2, TextStyle textStyle2, ts0 ts0Var3, TextStyle textStyle3, ts0 ts0Var4, TextStyle textStyle4, Alignment.Horizontal horizontal, ts0 ts0Var5, us0 us0Var, float f2, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, sb0 sb0Var) {
        this(modifier, ts0Var, textStyle, f, ts0Var2, textStyle2, ts0Var3, textStyle3, ts0Var4, textStyle4, horizontal, ts0Var5, us0Var, f2, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior);
    }

    public final us0 getActions() {
        return this.actions;
    }

    /* renamed from: getCollapsedHeight-D9Ej5fM, reason: not valid java name */
    public final float m3453getCollapsedHeightD9Ej5fM() {
        return this.collapsedHeight;
    }

    public final TopAppBarColors getColors() {
        return this.colors;
    }

    /* renamed from: getExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m3454getExpandedHeightD9Ej5fM() {
        return this.expandedHeight;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final ts0 getNavigationIcon() {
        return this.navigationIcon;
    }

    public final TopAppBarScrollBehavior getScrollBehavior() {
        return this.scrollBehavior;
    }

    public final ts0 getSmallSubtitle() {
        return this.smallSubtitle;
    }

    public final TextStyle getSmallSubtitleTextStyle() {
        return this.smallSubtitleTextStyle;
    }

    public final ts0 getSmallTitle() {
        return this.smallTitle;
    }

    public final TextStyle getSmallTitleTextStyle() {
        return this.smallTitleTextStyle;
    }

    public final ts0 getSubtitle() {
        return this.subtitle;
    }

    public final TextStyle getSubtitleTextStyle() {
        return this.subtitleTextStyle;
    }

    public final ts0 getTitle() {
        return this.title;
    }

    /* renamed from: getTitleBottomPadding-D9Ej5fM, reason: not valid java name */
    public final float m3455getTitleBottomPaddingD9Ej5fM() {
        return this.titleBottomPadding;
    }

    public final Alignment.Horizontal getTitleHorizontalAlignment() {
        return this.titleHorizontalAlignment;
    }

    public final TextStyle getTitleTextStyle() {
        return this.titleTextStyle;
    }

    public final WindowInsets getWindowInsets() {
        return this.windowInsets;
    }
}
