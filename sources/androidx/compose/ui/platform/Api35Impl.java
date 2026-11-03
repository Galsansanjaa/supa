package androidx.compose.ui.platform;

import android.view.View;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class Api35Impl {
    public static final Api35Impl INSTANCE = new Api35Impl();

    private Api35Impl() {
    }

    public static final void setRequestedFrameRate(View view, float f) {
        view.setRequestedFrameRate(f);
    }
}
