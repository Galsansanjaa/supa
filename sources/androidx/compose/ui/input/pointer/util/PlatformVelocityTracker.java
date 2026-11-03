package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.PointerInputChange;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface PlatformVelocityTracker {
    /* renamed from: addPointerInputChange-Uv8p0NA */
    void mo6674addPointerInputChangeUv8p0NA(PointerInputChange pointerInputChange, long j);

    /* renamed from: addPosition-Uv8p0NA */
    void mo6675addPositionUv8p0NA(long j, long j2);

    /* renamed from: calculateVelocity-AH228Gc */
    long mo6676calculateVelocityAH228Gc(long j);

    void resetTracking();
}
