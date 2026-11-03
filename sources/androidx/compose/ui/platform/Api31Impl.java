package androidx.compose.ui.platform;

import android.view.SoundEffectConstants;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class Api31Impl {
    public static final Api31Impl INSTANCE = new Api31Impl();

    private Api31Impl() {
    }

    public final int getConstantForFocusDirection(int i, boolean z) {
        return SoundEffectConstants.getConstantForFocusDirection(i, z);
    }
}
