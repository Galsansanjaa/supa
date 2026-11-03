package androidx.compose.ui.input.rotary;

import defpackage.yo0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class RotaryScrollEvent {
    public static final int $stable = 0;
    private final float horizontalScrollPixels;
    private final int inputDeviceId;
    private final long uptimeMillis;
    private final float verticalScrollPixels;

    public RotaryScrollEvent(float f, float f2, long j, int i) {
        this.verticalScrollPixels = f;
        this.horizontalScrollPixels = f2;
        this.uptimeMillis = j;
        this.inputDeviceId = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RotaryScrollEvent)) {
            return false;
        }
        RotaryScrollEvent rotaryScrollEvent = (RotaryScrollEvent) obj;
        return rotaryScrollEvent.verticalScrollPixels == this.verticalScrollPixels && rotaryScrollEvent.horizontalScrollPixels == this.horizontalScrollPixels && rotaryScrollEvent.uptimeMillis == this.uptimeMillis && rotaryScrollEvent.inputDeviceId == this.inputDeviceId;
    }

    public final float getHorizontalScrollPixels() {
        return this.horizontalScrollPixels;
    }

    public final int getInputDeviceId() {
        return this.inputDeviceId;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final float getVerticalScrollPixels() {
        return this.verticalScrollPixels;
    }

    public int hashCode() {
        int i = yo0.i(this.horizontalScrollPixels, Float.floatToIntBits(this.verticalScrollPixels) * 31, 31);
        long j = this.uptimeMillis;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + this.inputDeviceId;
    }

    public String toString() {
        float f = this.verticalScrollPixels;
        float f2 = this.horizontalScrollPixels;
        long j = this.uptimeMillis;
        int i = this.inputDeviceId;
        StringBuilder v = yo0.v("RotaryScrollEvent(verticalScrollPixels=", f, ",horizontalScrollPixels=", f2, ",uptimeMillis=");
        v.append(j);
        v.append(",deviceId=");
        v.append(i);
        v.append(")");
        return v.toString();
    }
}
