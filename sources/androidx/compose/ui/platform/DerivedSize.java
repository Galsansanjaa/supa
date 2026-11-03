package androidx.compose.ui.platform;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class DerivedSize {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final DerivedSize Zero = new DerivedSize(IntSize.Companion.m8221getZeroYbymL2g(), DpSize.Companion.m8157getZeroMYxV2XQ(), null);
    private final long dpSize;
    private final long pxSize;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: fromDpSize-itqla9I, reason: not valid java name */
        public final DerivedSize m7167fromDpSizeitqla9I(long j, Density density) {
            return new DerivedSize(IntSizeKt.m8227toIntSizeuvyYCjk(density.mo474toSizeXkaWNTQ(j)), j, null);
        }

        /* renamed from: fromPxSize-viCIZxY, reason: not valid java name */
        public final DerivedSize m7168fromPxSizeviCIZxY(long j, Density density) {
            return new DerivedSize(j, density.mo471toDpSizekrfVVM(IntSizeKt.m8228toSizeozmzZPI(j)), null);
        }

        public final DerivedSize getZero() {
            return DerivedSize.Zero;
        }
    }

    private DerivedSize(long j, long j2) {
        this.pxSize = j;
        this.dpSize = j2;
    }

    public /* synthetic */ DerivedSize(long j, long j2, sb0 sb0Var) {
        this(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedSize)) {
            return false;
        }
        DerivedSize derivedSize = (DerivedSize) obj;
        return IntSize.m8214equalsimpl0(this.pxSize, derivedSize.pxSize) && DpSize.m8144equalsimpl0(this.dpSize, derivedSize.dpSize);
    }

    /* renamed from: getDpSize-MYxV2XQ, reason: not valid java name */
    public final long m7165getDpSizeMYxV2XQ() {
        return this.dpSize;
    }

    /* renamed from: getPxSize-YbymL2g, reason: not valid java name */
    public final long m7166getPxSizeYbymL2g() {
        return this.pxSize;
    }

    public int hashCode() {
        return DpSize.m8149hashCodeimpl(this.dpSize) + (IntSize.m8217hashCodeimpl(this.pxSize) * 31);
    }
}
