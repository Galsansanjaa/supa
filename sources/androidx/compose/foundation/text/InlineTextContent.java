package androidx.compose.foundation.text;

import androidx.compose.ui.text.Placeholder;
import defpackage.us0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class InlineTextContent {
    public static final int $stable = 0;
    private final us0 children;
    private final Placeholder placeholder;

    public InlineTextContent(Placeholder placeholder, us0 us0Var) {
        this.placeholder = placeholder;
        this.children = us0Var;
    }

    public final us0 getChildren() {
        return this.children;
    }

    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}
