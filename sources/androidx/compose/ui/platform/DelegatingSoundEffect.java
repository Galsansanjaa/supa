package androidx.compose.ui.platform;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class DelegatingSoundEffect implements SoundEffect {
    public static final int $stable = 8;
    private final SoundEffect delegate;
    private final boolean isEnabled;

    public DelegatingSoundEffect(SoundEffect soundEffect, boolean z) {
        this.delegate = soundEffect;
        this.isEnabled = z;
    }

    public final SoundEffect getDelegate() {
        return this.delegate;
    }

    @Override // androidx.compose.ui.platform.SoundEffect
    public void playClickSound() {
        if (this.isEnabled) {
            this.delegate.playClickSound();
        }
    }
}
