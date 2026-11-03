package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.Modifier;
import defpackage.sb0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ShortNavigationBarOverrideScope {
    public static final int $stable = 0;
    private final int arrangement;
    private final long containerColor;
    private final ts0 content;
    private final long contentColor;
    private final Modifier modifier;
    private final WindowInsets windowInsets;

    private ShortNavigationBarOverrideScope(Modifier modifier, long j, long j2, WindowInsets windowInsets, int i, ts0 ts0Var) {
        this.modifier = modifier;
        this.containerColor = j;
        this.contentColor = j2;
        this.windowInsets = windowInsets;
        this.arrangement = i;
        this.content = ts0Var;
    }

    public /* synthetic */ ShortNavigationBarOverrideScope(Modifier modifier, long j, long j2, WindowInsets windowInsets, int i, ts0 ts0Var, sb0 sb0Var) {
        this(modifier, j, j2, windowInsets, i, ts0Var);
    }

    /* renamed from: getArrangement-LnnQw40, reason: not valid java name */
    public final int m3010getArrangementLnnQw40() {
        return this.arrangement;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m3011getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    public final ts0 getContent() {
        return this.content;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m3012getContentColor0d7_KjU() {
        return this.contentColor;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final WindowInsets getWindowInsets() {
        return this.windowInsets;
    }
}
