package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface ScrollConfig {
    /* renamed from: calculateMouseWheelScroll-8xgXZGE */
    long mo494calculateMouseWheelScroll8xgXZGE(Density density, PointerEvent pointerEvent, long j);

    boolean isPreciseWheelScroll(PointerEvent pointerEvent);

    boolean isSmoothScrollingEnabled();
}
