package androidx.compose.animation.core;

import defpackage.hu2;
import defpackage.sb0;
import defpackage.vg1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class StartOffset {
    private final long value;

    private /* synthetic */ StartOffset(long j) {
        this.value = j;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ StartOffset m258boximpl(long j) {
        return new StartOffset(j);
    }

    /* renamed from: constructor-impl */
    public static long m259constructorimpl(int i, int i2) {
        return m260constructorimpl(i * i2);
    }

    /* renamed from: constructor-impl */
    private static long m260constructorimpl(long j) {
        return j;
    }

    /* renamed from: constructor-impl$default */
    public static /* synthetic */ long m261constructorimpl$default(int i, int i2, int i3, sb0 sb0Var) {
        if ((i3 & 2) != 0) {
            i2 = StartOffsetType.Companion.m276getDelayEo1U57Q();
        }
        return m259constructorimpl(i, i2);
    }

    /* renamed from: equals-impl */
    public static boolean m262equalsimpl(long j, Object obj) {
        return (obj instanceof StartOffset) && j == ((StartOffset) obj).m268unboximpl();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m263equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getOffsetMillis-impl */
    public static final int m264getOffsetMillisimpl(long j) {
        return Math.abs((int) j);
    }

    /* renamed from: getOffsetType-Eo1U57Q */
    public static final int m265getOffsetTypeEo1U57Q(long j) {
        boolean z = j > 0;
        if (z) {
            return StartOffsetType.Companion.m277getFastForwardEo1U57Q();
        }
        if (!z) {
            return StartOffsetType.Companion.m276getDelayEo1U57Q();
        }
        hu2.e();
        return 0;
    }

    /* renamed from: hashCode-impl */
    public static int m266hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: toString-impl */
    public static String m267toStringimpl(long j) {
        return vg1.B(j, "StartOffset(value=", ")");
    }

    public boolean equals(Object obj) {
        return m262equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m266hashCodeimpl(this.value);
    }

    public String toString() {
        return m267toStringimpl(this.value);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ long m268unboximpl() {
        return this.value;
    }
}
