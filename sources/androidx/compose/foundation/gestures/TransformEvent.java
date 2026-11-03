package androidx.compose.foundation.gestures;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
abstract class TransformEvent {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class TransformDelta extends TransformEvent {
        public static final int $stable = 0;
        private final long centroid;
        private final long panChange;
        private final float rotationChange;
        private final float zoomChange;

        private TransformDelta(long j, float f, long j2, float f2) {
            super(null);
            this.centroid = j;
            this.zoomChange = f;
            this.panChange = j2;
            this.rotationChange = f2;
        }

        public /* synthetic */ TransformDelta(long j, float f, long j2, float f2, sb0 sb0Var) {
            this(j, f, j2, f2);
        }

        /* renamed from: getCentroid-F1C5BW0, reason: not valid java name */
        public final long m674getCentroidF1C5BW0() {
            return this.centroid;
        }

        /* renamed from: getPanChange-F1C5BW0, reason: not valid java name */
        public final long m675getPanChangeF1C5BW0() {
            return this.panChange;
        }

        public final float getRotationChange() {
            return this.rotationChange;
        }

        public final float getZoomChange() {
            return this.zoomChange;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class TransformStarted extends TransformEvent {
        public static final int $stable = 0;
        public static final TransformStarted INSTANCE = new TransformStarted();

        private TransformStarted() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class TransformStopped extends TransformEvent {
        public static final int $stable = 0;
        public static final TransformStopped INSTANCE = new TransformStopped();

        private TransformStopped() {
            super(null);
        }
    }

    private TransformEvent() {
    }

    public /* synthetic */ TransformEvent(sb0 sb0Var) {
        this();
    }
}
