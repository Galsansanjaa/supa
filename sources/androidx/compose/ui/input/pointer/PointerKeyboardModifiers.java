package androidx.compose.ui.input.pointer;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PointerKeyboardModifiers {
    private final int packedValue;

    private /* synthetic */ PointerKeyboardModifiers(int i) {
        this.packedValue = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerKeyboardModifiers m6641boximpl(int i) {
        return new PointerKeyboardModifiers(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6642constructorimpl(int i) {
        return i;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m6643constructorimpl$default(int i, int i2, sb0 sb0Var) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m6642constructorimpl(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6644equalsimpl(int i, Object obj) {
        return (obj instanceof PointerKeyboardModifiers) && i == ((PointerKeyboardModifiers) obj).m6648unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6645equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6646hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6647toStringimpl(int i) {
        return sg3.o(i, "PointerKeyboardModifiers(packedValue=", ")");
    }

    public boolean equals(Object obj) {
        return m6644equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6646hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m6647toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6648unboximpl() {
        return this.packedValue;
    }
}
