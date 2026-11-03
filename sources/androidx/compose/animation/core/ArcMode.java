package androidx.compose.animation.core;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ArcMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int ArcAbove = m234constructorimpl(5);
    private static final int ArcBelow = m234constructorimpl(4);
    private static final int ArcLinear = m234constructorimpl(0);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getArcAbove--9T-Mq4, reason: not valid java name */
        public final int m240getArcAbove9TMq4() {
            return ArcMode.ArcAbove;
        }

        /* renamed from: getArcBelow--9T-Mq4, reason: not valid java name */
        public final int m241getArcBelow9TMq4() {
            return ArcMode.ArcBelow;
        }

        /* renamed from: getArcLinear--9T-Mq4, reason: not valid java name */
        public final int m242getArcLinear9TMq4() {
            return ArcMode.ArcLinear;
        }
    }

    private /* synthetic */ ArcMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ArcMode m233boximpl(int i) {
        return new ArcMode(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m234constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m235equalsimpl(int i, Object obj) {
        return (obj instanceof ArcMode) && i == ((ArcMode) obj).m239unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m236equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m237hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m238toStringimpl(int i) {
        return sg3.o(i, "ArcMode(value=", ")");
    }

    public boolean equals(Object obj) {
        return m235equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m237hashCodeimpl(this.value);
    }

    public String toString() {
        return m238toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m239unboximpl() {
        return this.value;
    }
}
