package androidx.compose.foundation.pager;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface PageSize {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Fill implements PageSize {
        public static final int $stable = 0;
        public static final Fill INSTANCE = new Fill();

        private Fill() {
        }

        @Override // androidx.compose.foundation.pager.PageSize
        public int calculateMainAxisPageSize(Density density, int i, int i2) {
            return i;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Fixed implements PageSize {
        public static final int $stable = 0;
        private final float pageSize;

        private Fixed(float f) {
            this.pageSize = f;
        }

        public /* synthetic */ Fixed(float f, sb0 sb0Var) {
            this(f);
        }

        @Override // androidx.compose.foundation.pager.PageSize
        public int calculateMainAxisPageSize(Density density, int i, int i2) {
            return density.mo467roundToPx0680j_4(this.pageSize);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Fixed) {
                return Dp.m8054equalsimpl0(this.pageSize, ((Fixed) obj).pageSize);
            }
            return false;
        }

        /* renamed from: getPageSize-D9Ej5fM, reason: not valid java name */
        public final float m1315getPageSizeD9Ej5fM() {
            return this.pageSize;
        }

        public int hashCode() {
            return Dp.m8055hashCodeimpl(this.pageSize);
        }
    }

    int calculateMainAxisPageSize(Density density, int i, int i2);
}
