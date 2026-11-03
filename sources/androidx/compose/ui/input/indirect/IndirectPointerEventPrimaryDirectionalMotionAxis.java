package androidx.compose.ui.input.indirect;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class IndirectPointerEventPrimaryDirectionalMotionAxis {
    public static final Companion Companion = new Companion(null);
    private static final int None = m6093constructorimpl(0);
    private static final int X = m6093constructorimpl(1);
    private static final int Y = m6093constructorimpl(2);
    private final int value;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getNone-nZO2Niw, reason: not valid java name */
        public final int m6099getNonenZO2Niw() {
            return IndirectPointerEventPrimaryDirectionalMotionAxis.None;
        }

        /* renamed from: getX-nZO2Niw, reason: not valid java name */
        public final int m6100getXnZO2Niw() {
            return IndirectPointerEventPrimaryDirectionalMotionAxis.X;
        }

        /* renamed from: getY-nZO2Niw, reason: not valid java name */
        public final int m6101getYnZO2Niw() {
            return IndirectPointerEventPrimaryDirectionalMotionAxis.Y;
        }
    }

    private /* synthetic */ IndirectPointerEventPrimaryDirectionalMotionAxis(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IndirectPointerEventPrimaryDirectionalMotionAxis m6092boximpl(int i) {
        return new IndirectPointerEventPrimaryDirectionalMotionAxis(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m6093constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6094equalsimpl(int i, Object obj) {
        return (obj instanceof IndirectPointerEventPrimaryDirectionalMotionAxis) && i == ((IndirectPointerEventPrimaryDirectionalMotionAxis) obj).m6098unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6095equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6096hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6097toStringimpl(int i) {
        return sg3.o(i, "IndirectPointerEventPrimaryDirectionalMotionAxis(value=", ")");
    }

    public boolean equals(Object obj) {
        return m6094equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6096hashCodeimpl(this.value);
    }

    public String toString() {
        return m6097toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6098unboximpl() {
        return this.value;
    }
}
