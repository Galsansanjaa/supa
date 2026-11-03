package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import defpackage.z72;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface TextInclusionStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final TextInclusionStrategy AnyOverlap = new z72(16);
        private static final TextInclusionStrategy ContainsAll = new z72(17);
        private static final TextInclusionStrategy ContainsCenter = new z72(18);

        private Companion() {
        }

        public static final boolean ContainsAll$lambda$0(Rect rect, Rect rect2) {
            return !rect2.isEmpty() && rect.getLeft() >= rect2.getLeft() && rect.getRight() <= rect2.getRight() && rect.getTop() >= rect2.getTop() && rect.getBottom() <= rect2.getBottom();
        }

        public static final boolean ContainsCenter$lambda$0(Rect rect, Rect rect2) {
            return rect2.m5116containsk4lQ0M(rect.m5120getCenterF1C5BW0());
        }

        public static /* synthetic */ boolean a(Rect rect, Rect rect2) {
            return ContainsAll$lambda$0(rect, rect2);
        }

        public static /* synthetic */ boolean b(Rect rect, Rect rect2) {
            return ContainsCenter$lambda$0(rect, rect2);
        }

        public static /* synthetic */ boolean c(Rect rect, Rect rect2) {
            return rect.overlaps(rect2);
        }

        public final TextInclusionStrategy getAnyOverlap() {
            return AnyOverlap;
        }

        public final TextInclusionStrategy getContainsAll() {
            return ContainsAll;
        }

        public final TextInclusionStrategy getContainsCenter() {
            return ContainsCenter;
        }
    }

    boolean isIncluded(Rect rect, Rect rect2);
}
