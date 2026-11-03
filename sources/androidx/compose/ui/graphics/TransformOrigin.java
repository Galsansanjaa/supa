package androidx.compose.ui.graphics;

import defpackage.sb0;
import defpackage.vg1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TransformOrigin {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Center = TransformOriginKt.TransformOrigin(0.5f, 0.5f);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getCenter-SzJe1aQ, reason: not valid java name */
        public final long m5744getCenterSzJe1aQ() {
            return TransformOrigin.Center;
        }
    }

    private /* synthetic */ TransformOrigin(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TransformOrigin m5731boximpl(long j) {
        return new TransformOrigin(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m5732component1impl(long j) {
        return m5739getPivotFractionXimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m5733component2impl(long j) {
        return m5740getPivotFractionYimpl(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5734constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-zey9I6w, reason: not valid java name */
    public static final long m5735copyzey9I6w(long j, float f, float f2) {
        return TransformOriginKt.TransformOrigin(f, f2);
    }

    /* renamed from: copy-zey9I6w$default, reason: not valid java name */
    public static /* synthetic */ long m5736copyzey9I6w$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m5739getPivotFractionXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m5740getPivotFractionYimpl(j);
        }
        return m5735copyzey9I6w(j, f, f2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5737equalsimpl(long j, Object obj) {
        return (obj instanceof TransformOrigin) && j == ((TransformOrigin) obj).m5743unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5738equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getPivotFractionX-impl, reason: not valid java name */
    public static final float m5739getPivotFractionXimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getPivotFractionY-impl, reason: not valid java name */
    public static final float m5740getPivotFractionYimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5741hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5742toStringimpl(long j) {
        return vg1.B(j, "TransformOrigin(packedValue=", ")");
    }

    public boolean equals(Object obj) {
        return m5737equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5741hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m5742toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5743unboximpl() {
        return this.packedValue;
    }
}
