package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import defpackage.f31;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface TransformScope {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        /* renamed from: transformBy-d-4ec7I$default, reason: not valid java name */
        public static /* synthetic */ void m677transformByd4ec7I$default(TransformScope transformScope, float f, long j, float f2, int i, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
                return;
            }
            if ((i & 1) != 0) {
                f = 1.0f;
            }
            if ((i & 2) != 0) {
                j = Offset.Companion.m5106getZeroF1C5BW0();
            }
            if ((i & 4) != 0) {
                f2 = 0.0f;
            }
            transformScope.mo516transformByd4ec7I(f, j, f2);
        }

        @Deprecated
        /* renamed from: transformByWithCentroid-IEwrmTk, reason: not valid java name */
        public static void m678transformByWithCentroidIEwrmTk(TransformScope transformScope, long j, float f, long j2, float f2) {
            transformScope.mo516transformByd4ec7I(f, j2, f2);
        }
    }

    /* renamed from: transformBy-d-4ec7I */
    void mo516transformByd4ec7I(float f, long j, float f2);

    /* renamed from: transformByWithCentroid-IEwrmTk */
    void mo517transformByWithCentroidIEwrmTk(long j, float f, long j2, float f2);
}
