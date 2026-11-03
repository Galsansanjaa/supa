package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.ContentScale;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ScaleToBoundsImpl implements SharedTransitionScope.ResizeMode {
    public static final int $stable = 0;
    private final Alignment alignment;
    private final ContentScale contentScale;

    public ScaleToBoundsImpl(ContentScale contentScale, Alignment alignment) {
        this.contentScale = contentScale;
        this.alignment = alignment;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }
}
