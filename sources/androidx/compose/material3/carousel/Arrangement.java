package androidx.compose.material3.carousel;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class Arrangement {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final float MediumItemFlexPercentage = 0.1f;
    private final int largeCount;
    private final float largeSize;
    private final int mediumCount;
    private final float mediumSize;
    private final int priority;
    private final int smallCount;
    private final float smallSize;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        private final float calculateLargeSize(float f, int i, float f2, int i2, int i3) {
            float f3 = i;
            float f4 = i2 / 2.0f;
            return (f - ((f3 + f4) * f2)) / (i3 + f4);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final androidx.compose.material3.carousel.Arrangement fit(int r9, float r10, float r11, int r12, float r13, float r14, float r15, int r16, float r17, int r18, float r19) {
            /*
                r8 = this;
                r4 = r16
                r5 = r18
                int r0 = r5 + r4
                int r0 = r0 + r12
                int r0 = r0 + (-1)
                float r0 = (float) r0
                float r0 = r0 * r11
                float r1 = r10 - r0
                float r10 = defpackage.ea0.n(r13, r14, r15)
                float r11 = (float) r5
                float r0 = r19 * r11
                float r6 = (float) r4
                float r2 = r17 * r6
                float r2 = r2 + r0
                float r0 = (float) r12
                float r3 = r10 * r0
                float r3 = r3 + r2
                float r2 = r1 - r3
                r7 = 0
                if (r12 <= 0) goto L2e
                int r3 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r3 <= 0) goto L2e
                float r2 = r2 / r0
                float r0 = r15 - r10
                float r0 = java.lang.Math.min(r2, r0)
            L2c:
                float r10 = r10 + r0
                goto L3c
            L2e:
                if (r12 <= 0) goto L3c
                int r3 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r3 >= 0) goto L3c
                float r2 = r2 / r0
                float r0 = r14 - r10
                float r0 = java.lang.Math.max(r2, r0)
                goto L2c
            L3c:
                if (r12 <= 0) goto L42
                r3 = r10
            L3f:
                r0 = r8
                r2 = r12
                goto L44
            L42:
                r3 = r7
                goto L3f
            L44:
                float r8 = r0.calculateLargeSize(r1, r2, r3, r4, r5)
                r2 = r3
                float r3 = r8 + r2
                r10 = 1073741824(0x40000000, float:2.0)
                float r3 = r3 / r10
                if (r16 <= 0) goto L6e
                int r10 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
                if (r10 != 0) goto L55
                goto L6e
            L55:
                float r10 = r19 - r8
                float r10 = r10 * r11
                r0 = 1036831949(0x3dcccccd, float:0.1)
                float r0 = r0 * r3
                float r0 = r0 * r6
                float r1 = java.lang.Math.abs(r10)
                float r0 = java.lang.Math.min(r1, r0)
                int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r10 <= 0) goto L71
                float r10 = r0 / r6
                float r3 = r3 - r10
                float r0 = r0 / r11
                float r8 = r8 + r0
            L6e:
                r6 = r8
                r4 = r3
                goto L77
            L71:
                float r10 = r0 / r6
                float r3 = r3 + r10
                float r0 = r0 / r11
                float r8 = r8 - r0
                goto L6e
            L77:
                androidx.compose.material3.carousel.Arrangement r0 = new androidx.compose.material3.carousel.Arrangement
                r1 = r9
                r3 = r12
                r5 = r16
                r7 = r18
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.Arrangement.Companion.fit(int, float, float, int, float, float, float, int, float, int, float):androidx.compose.material3.carousel.Arrangement");
        }

        public final Arrangement findLowestCostArrangement(float f, float f2, float f3, float f4, float f5, int[] iArr, float f6, int[] iArr2, float f7, int[] iArr3) {
            int[] iArr4 = iArr;
            int length = iArr3.length;
            Arrangement arrangement = null;
            int i = 1;
            int i2 = 0;
            while (i2 < length) {
                int i3 = iArr3[i2];
                int length2 = iArr2.length;
                int i4 = 0;
                while (i4 < length2) {
                    int i5 = iArr2[i4];
                    int length3 = iArr4.length;
                    int i6 = 0;
                    while (i6 < length3) {
                        int i7 = i4;
                        int i8 = iArr4[i6];
                        Arrangement arrangement2 = arrangement;
                        int i9 = i2;
                        int i10 = length2;
                        int i11 = length3;
                        int i12 = i6;
                        Arrangement fit = fit(i, f, f2, i8, f3, f4, f5, i5, f6, i3, f7);
                        if (arrangement2 != null && fit.cost(f7) >= arrangement2.cost(f7)) {
                            arrangement = arrangement2;
                        } else {
                            if (fit.cost(f7) == 0.0f) {
                                return fit;
                            }
                            arrangement = fit;
                        }
                        i++;
                        i6 = i12 + 1;
                        iArr4 = iArr;
                        i2 = i9;
                        length2 = i10;
                        i4 = i7;
                        length3 = i11;
                    }
                    i4++;
                    iArr4 = iArr;
                }
                i2++;
                iArr4 = iArr;
            }
            return arrangement;
        }
    }

    public Arrangement(int i, float f, int i2, float f2, int i3, float f3, int i4) {
        this.priority = i;
        this.smallSize = f;
        this.smallCount = i2;
        this.mediumSize = f2;
        this.mediumCount = i3;
        this.largeSize = f3;
        this.largeCount = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float cost(float f) {
        if (isValid()) {
            return Math.abs(f - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    private final boolean isValid() {
        int i = this.largeCount;
        if (i <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f = this.largeSize;
        float f2 = this.mediumSize;
        return f > f2 && f2 > this.smallSize;
    }

    public final int getLargeCount() {
        return this.largeCount;
    }

    public final float getLargeSize() {
        return this.largeSize;
    }

    public final int getMediumCount() {
        return this.mediumCount;
    }

    public final float getMediumSize() {
        return this.mediumSize;
    }

    public final int getSmallCount() {
        return this.smallCount;
    }

    public final float getSmallSize() {
        return this.smallSize;
    }

    public final int itemCount() {
        return this.largeCount + this.mediumCount + this.smallCount;
    }
}
