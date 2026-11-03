package androidx.compose.ui.graphics.layer;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CompositingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Auto = m5923constructorimpl(0);
    private static final int Offscreen = m5923constructorimpl(1);
    private static final int ModulateAlpha = m5923constructorimpl(2);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getAuto-ke2Ky5w, reason: not valid java name */
        public final int m5929getAutoke2Ky5w() {
            return CompositingStrategy.Auto;
        }

        /* renamed from: getModulateAlpha-ke2Ky5w, reason: not valid java name */
        public final int m5930getModulateAlphake2Ky5w() {
            return CompositingStrategy.ModulateAlpha;
        }

        /* renamed from: getOffscreen-ke2Ky5w, reason: not valid java name */
        public final int m5931getOffscreenke2Ky5w() {
            return CompositingStrategy.Offscreen;
        }
    }

    private /* synthetic */ CompositingStrategy(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CompositingStrategy m5922boximpl(int i) {
        return new CompositingStrategy(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5923constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5924equalsimpl(int i, Object obj) {
        return (obj instanceof CompositingStrategy) && i == ((CompositingStrategy) obj).m5928unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5925equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5926hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5927toStringimpl(int i) {
        return sg3.o(i, "CompositingStrategy(value=", ")");
    }

    public boolean equals(Object obj) {
        return m5924equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5926hashCodeimpl(this.value);
    }

    public String toString() {
        return m5927toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5928unboximpl() {
        return this.value;
    }
}
