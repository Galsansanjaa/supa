package androidx.compose.ui;

import androidx.compose.ui.internal.PlatformOptimizedCancellationException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ModifierNodeDetachedCancellationException extends PlatformOptimizedCancellationException {
    public static final int $stable = 8;

    public ModifierNodeDetachedCancellationException() {
        super("The Modifier.Node was detached");
    }
}
