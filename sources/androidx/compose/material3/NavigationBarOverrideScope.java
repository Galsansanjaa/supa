package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.Modifier;
import defpackage.sb0;
import defpackage.us0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class NavigationBarOverrideScope {
    public static final int $stable = 0;
    private final long containerColor;
    private final us0 content;
    private final long contentColor;
    private final Modifier modifier;
    private final float tonalElevation;
    private final WindowInsets windowInsets;

    private NavigationBarOverrideScope(Modifier modifier, long j, long j2, float f, WindowInsets windowInsets, us0 us0Var) {
        this.modifier = modifier;
        this.containerColor = j;
        this.contentColor = j2;
        this.tonalElevation = f;
        this.windowInsets = windowInsets;
        this.content = us0Var;
    }

    public /* synthetic */ NavigationBarOverrideScope(Modifier modifier, long j, long j2, float f, WindowInsets windowInsets, us0 us0Var, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? Modifier.Companion : modifier, j, j2, f, windowInsets, us0Var, null);
    }

    public /* synthetic */ NavigationBarOverrideScope(Modifier modifier, long j, long j2, float f, WindowInsets windowInsets, us0 us0Var, sb0 sb0Var) {
        this(modifier, j, j2, f, windowInsets, us0Var);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2797getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    public final us0 getContent() {
        return this.content;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m2798getContentColor0d7_KjU() {
        return this.contentColor;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m2799getTonalElevationD9Ej5fM() {
        return this.tonalElevation;
    }

    public final WindowInsets getWindowInsets() {
        return this.windowInsets;
    }
}
