package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import defpackage.hd0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class HistoricalChange {
    public static final int $stable = 0;
    private long originalEventPosition;
    private final long panOffset;
    private final long position;
    private final float scaleFactor;
    private final long uptimeMillis;

    private HistoricalChange(long j, long j2) {
        this(j, j2, 1.0f, Offset.Companion.m5106getZeroF1C5BW0(), (sb0) null);
    }

    private HistoricalChange(long j, long j2, float f, long j3) {
        this.uptimeMillis = j;
        this.position = j2;
        this.scaleFactor = f;
        this.panOffset = j3;
        this.originalEventPosition = Offset.Companion.m5106getZeroF1C5BW0();
    }

    public /* synthetic */ HistoricalChange(long j, long j2, float f, long j3, int i, sb0 sb0Var) {
        this(j, j2, (i & 4) != 0 ? 1.0f : f, (i & 8) != 0 ? Offset.Companion.m5106getZeroF1C5BW0() : j3, (sb0) null);
    }

    private HistoricalChange(long j, long j2, float f, long j3, long j4) {
        this(j, j2, f, j3, (sb0) null);
        this.originalEventPosition = j4;
    }

    public /* synthetic */ HistoricalChange(long j, long j2, float f, long j3, long j4, sb0 sb0Var) {
        this(j, j2, f, j3, j4);
    }

    public /* synthetic */ HistoricalChange(long j, long j2, float f, long j3, sb0 sb0Var) {
        this(j, j2, f, j3);
    }

    @hd0
    public /* synthetic */ HistoricalChange(long j, long j2, sb0 sb0Var) {
        this(j, j2);
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui, reason: not valid java name */
    public final long m6489getOriginalEventPositionF1C5BW0$ui() {
        return this.originalEventPosition;
    }

    /* renamed from: getPanOffset-F1C5BW0, reason: not valid java name */
    public final long m6490getPanOffsetF1C5BW0() {
        return this.panOffset;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m6491getPositionF1C5BW0() {
        return this.position;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + Offset.m5098toStringimpl(this.position) + ", scaleFactor=" + this.scaleFactor + ", panOffset=" + Offset.m5098toStringimpl(this.panOffset) + ")";
    }
}
