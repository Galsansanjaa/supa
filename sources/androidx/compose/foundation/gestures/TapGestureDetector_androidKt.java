package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEvent;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TapGestureDetector_androidKt {
    public static final boolean firstDownRefersToPrimaryMouseButtonOnly() {
        return false;
    }

    public static final boolean isDeepPress(PointerEvent pointerEvent) {
        return pointerEvent.getClassification() == 2;
    }
}
