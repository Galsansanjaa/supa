package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class VisibleKt {
    public static final Modifier visible(Modifier modifier, boolean z) {
        return modifier.then(new VisibilityElement(z));
    }
}
