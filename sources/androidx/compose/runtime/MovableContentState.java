package androidx.compose.runtime;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MovableContentState {
    public static final int $stable = 0;
    private final SlotStorage slotStorage;

    public MovableContentState(SlotStorage slotStorage) {
        this.slotStorage = slotStorage;
    }

    public final void dispose$runtime() {
        this.slotStorage.dispose();
    }

    public final SlotStorage getSlotStorage$runtime() {
        return this.slotStorage;
    }
}
