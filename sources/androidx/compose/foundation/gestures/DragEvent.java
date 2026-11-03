package androidx.compose.foundation.gestures;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class DragEvent {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DragCancelled extends DragEvent {
        public static final int $stable = 0;
        public static final DragCancelled INSTANCE = new DragCancelled();

        private DragCancelled() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DragDelta extends DragEvent {
        public static final int $stable = 0;
        private final long delta;
        private final boolean isIndirectPointerEvent;

        private DragDelta(long j, boolean z) {
            super(null);
            this.delta = j;
            this.isIndirectPointerEvent = z;
        }

        public /* synthetic */ DragDelta(long j, boolean z, sb0 sb0Var) {
            this(j, z);
        }

        /* renamed from: getDelta-F1C5BW0, reason: not valid java name */
        public final long m526getDeltaF1C5BW0() {
            return this.delta;
        }

        public final boolean isIndirectPointerEvent() {
            return this.isIndirectPointerEvent;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DragStarted extends DragEvent {
        public static final int $stable = 0;
        private final long startPoint;

        private DragStarted(long j) {
            super(null);
            this.startPoint = j;
        }

        public /* synthetic */ DragStarted(long j, sb0 sb0Var) {
            this(j);
        }

        /* renamed from: getStartPoint-F1C5BW0, reason: not valid java name */
        public final long m527getStartPointF1C5BW0() {
            return this.startPoint;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DragStopped extends DragEvent {
        public static final int $stable = 0;
        private final boolean isIndirectPointerEvent;
        private final long velocity;

        private DragStopped(long j, boolean z) {
            super(null);
            this.velocity = j;
            this.isIndirectPointerEvent = z;
        }

        public /* synthetic */ DragStopped(long j, boolean z, sb0 sb0Var) {
            this(j, z);
        }

        /* renamed from: getVelocity-9UxMQ8M, reason: not valid java name */
        public final long m528getVelocity9UxMQ8M() {
            return this.velocity;
        }

        public final boolean isIndirectPointerEvent() {
            return this.isIndirectPointerEvent;
        }
    }

    private DragEvent() {
    }

    public /* synthetic */ DragEvent(sb0 sb0Var) {
        this();
    }
}
