package androidx.compose.ui.input.indirect;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerId;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class IndirectPointerInputChange {
    public static final int $stable = 8;
    private final long id;
    private boolean isConsumed;
    private final long position;
    private final boolean pressed;
    private final float pressure;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long uptimeMillis;

    private IndirectPointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.id = j;
        this.uptimeMillis = j2;
        this.position = j3;
        this.pressed = z;
        this.pressure = f;
        this.previousUptimeMillis = j4;
        this.previousPosition = j5;
        this.previousPressed = z2;
    }

    public /* synthetic */ IndirectPointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, sb0 sb0Var) {
        this(j, j2, j3, z, f, j4, j5, z2);
    }

    public final void consume() {
        this.isConsumed = true;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m6113getIdJ3iCeTQ() {
        return this.id;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m6114getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name */
    public final long m6115getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean isConsumed() {
        return this.isConsumed;
    }

    public String toString() {
        return "IndirectPointerInputChange(id=" + PointerId.m6572toStringimpl(this.id) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + Offset.m5098toStringimpl(this.position) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + Offset.m5098toStringimpl(this.previousPosition) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + this.isConsumed + ")";
    }
}
