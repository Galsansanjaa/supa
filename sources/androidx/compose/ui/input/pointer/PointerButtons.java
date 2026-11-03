package androidx.compose.ui.input.pointer;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PointerButtons {
    private final int packedValue;

    private /* synthetic */ PointerButtons(int i) {
        this.packedValue = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerButtons m6513boximpl(int i) {
        return new PointerButtons(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6514constructorimpl(int i) {
        return i;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m6515constructorimpl$default(int i, int i2, sb0 sb0Var) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m6514constructorimpl(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6516equalsimpl(int i, Object obj) {
        return (obj instanceof PointerButtons) && i == ((PointerButtons) obj).m6520unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6517equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6518hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6519toStringimpl(int i) {
        return sg3.o(i, "PointerButtons(packedValue=", ")");
    }

    public boolean equals(Object obj) {
        return m6516equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6518hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m6519toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6520unboximpl() {
        return this.packedValue;
    }
}
