package androidx.compose.foundation.style;

import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class StyleAnimationsKt {
    private static final void forEachBitOf(long j, ps0 ps0Var) {
        while (j != 0) {
            int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
            ps0Var.invoke(Integer.valueOf(numberOfTrailingZeros));
            j ^= 1 << numberOfTrailingZeros;
        }
    }

    private static final boolean hasAnimationId(long j, int i) {
        return (j & (1 << i)) != 0;
    }

    public static final boolean isNullOrEmpty(StyleAnimations styleAnimations) {
        return styleAnimations == null || styleAnimations.isEmpty();
    }

    public static final long propertySetsToAnimationSet(long j, int i) {
        return j | (i << 50);
    }

    public static final int toObjectsSet(long j) {
        return (int) (j >> 50);
    }

    public static final long toPrimitivesSet(long j) {
        return j & 2251799813685247L;
    }

    private static final long withId(long j, int i) {
        return j | (1 << i);
    }
}
