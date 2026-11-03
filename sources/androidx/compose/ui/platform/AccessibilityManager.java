package androidx.compose.ui.platform;

import defpackage.f31;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface AccessibilityManager {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ long calculateRecommendedTimeoutMillis$default(AccessibilityManager accessibilityManager, long j, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: calculateRecommendedTimeoutMillis");
                return 0L;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            if ((i & 8) != 0) {
                z3 = false;
            }
            return accessibilityManager.calculateRecommendedTimeoutMillis(j, z, z2, z3);
        }
    }

    long calculateRecommendedTimeoutMillis(long j, boolean z, boolean z2, boolean z3);
}
