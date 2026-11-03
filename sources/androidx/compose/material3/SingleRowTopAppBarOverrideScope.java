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
public final class SingleRowTopAppBarOverrideScope {
    public static final int $stable = 0;
    private final us0 actions;
    private final TopAppBarColors colors;
    private final float expandedHeight;
    private final Modifier modifier;
    private final ts0 navigationIcon;
    private final TopAppBarScrollBehavior scrollBehavior;
    private final ts0 subtitle;
    private final TextStyle subtitleTextStyle;
    private final ts0 title;
    private final Alignment.Horizontal titleHorizontalAlignment;
    private final TextStyle titleTextStyle;
    private final WindowInsets windowInsets;

    private SingleRowTopAppBarOverrideScope(Modifier modifier, ts0 ts0Var, TextStyle textStyle, ts0 ts0Var2, TextStyle textStyle2, Alignment.Horizontal horizontal, ts0 ts0Var3, us0 us0Var, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior) {
        this.modifier = modifier;
        this.title = ts0Var;
        this.titleTextStyle = textStyle;
        this.subtitle = ts0Var2;
        this.subtitleTextStyle = textStyle2;
        this.titleHorizontalAlignment = horizontal;
        this.navigationIcon = ts0Var3;
        this.actions = us0Var;
        this.expandedHeight = f;
        this.windowInsets = windowInsets;
        this.colors = topAppBarColors;
        this.scrollBehavior = topAppBarScrollBehavior;
    }

    public /* synthetic */ SingleRowTopAppBarOverrideScope(Modifier modifier, ts0 ts0Var, TextStyle textStyle, ts0 ts0Var2, TextStyle textStyle2, Alignment.Horizontal horizontal, ts0 ts0Var3, us0 us0Var, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, sb0 sb0Var) {
        this(modifier, ts0Var, textStyle, ts0Var2, textStyle2, horizontal, ts0Var3, us0Var, f, windowInsets, topAppBarColors, topAppBarScrollBehavior);
    }

    public final us0 getActions() {
        return this.actions;
    }

    public final TopAppBarColors getColors() {
        return this.colors;
    }

    /* renamed from: getExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m3013getExpandedHeightD9Ej5fM() {
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

    public final ts0 getSubtitle() {
        return this.subtitle;
    }

    public final TextStyle getSubtitleTextStyle() {
        return this.subtitleTextStyle;
    }

    public final ts0 getTitle() {
        return this.title;
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
