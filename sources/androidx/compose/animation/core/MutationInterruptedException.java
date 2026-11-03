package androidx.compose.animation.core;

import androidx.compose.animation.core.internal.PlatformOptimizedCancellationException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MutationInterruptedException extends PlatformOptimizedCancellationException {
    public static final int $stable = 8;

    public MutationInterruptedException() {
        super("Mutation interrupted");
    }
}
