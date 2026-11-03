package androidx.compose.foundation.gestures.snapping;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SnapPositionKt {
    public static final float calculateDistanceToDesiredSnapPosition(int i, int i2, int i3, int i4, int i5, int i6, SnapPosition snapPosition, int i7) {
        return i5 - snapPosition.position(i, i4, i2, i3, i6, i7);
    }
}
