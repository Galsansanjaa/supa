package androidx.compose.runtime;

import androidx.compose.runtime.composer.DebugStringFormattable;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class Changes extends DebugStringFormattable {
    public static final int $stable = 0;

    public abstract void clear();

    public abstract void execute(SlotStorage slotStorage, Applier<?> applier, RememberManager rememberManager, CompositionErrorContextImpl compositionErrorContextImpl);

    public abstract boolean isEmpty();

    public final boolean isNotEmpty() {
        return !isEmpty();
    }
}
