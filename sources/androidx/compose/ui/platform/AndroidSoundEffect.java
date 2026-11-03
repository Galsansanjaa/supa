package androidx.compose.ui.platform;

import android.view.View;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AndroidSoundEffect implements SoundEffect {
    public static final int $stable = 8;
    private final View view;

    public AndroidSoundEffect(View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.platform.SoundEffect
    public void playClickSound() {
        this.view.playSoundEffect(0);
    }
}
