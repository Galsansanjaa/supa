package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.Modifier;
import defpackage.sb0;
import defpackage.us0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class NavigationRailOverrideScope {
    public static final int $stable = 0;
    private final long containerColor;
    private final us0 content;
    private final long contentColor;
    private final us0 header;
    private final Modifier modifier;
    private final WindowInsets windowInsets;

    private NavigationRailOverrideScope(Modifier modifier, long j, long j2, us0 us0Var, WindowInsets windowInsets, us0 us0Var2) {
        this.modifier = modifier;
        this.containerColor = j;
        this.contentColor = j2;
        this.header = us0Var;
        this.windowInsets = windowInsets;
        this.content = us0Var2;
    }

    public /* synthetic */ NavigationRailOverrideScope(Modifier modifier, long j, long j2, us0 us0Var, WindowInsets windowInsets, us0 us0Var2, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? Modifier.Companion : modifier, j, j2, us0Var, windowInsets, us0Var2, null);
    }

    public /* synthetic */ NavigationRailOverrideScope(Modifier modifier, long j, long j2, us0 us0Var, WindowInsets windowInsets, us0 us0Var2, sb0 sb0Var) {
        this(modifier, j, j2, us0Var, windowInsets, us0Var2);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2861getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    public final us0 getContent() {
        return this.content;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m2862getContentColor0d7_KjU() {
        return this.contentColor;
    }

    public final us0 getHeader() {
        return this.header;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final WindowInsets getWindowInsets() {
        return this.windowInsets;
    }
}
