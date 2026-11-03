package androidx.compose.ui.input.pointer;

import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ProcessResult {
    private final int value;

    private /* synthetic */ ProcessResult(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ProcessResult m6663boximpl(int i) {
        return new ProcessResult(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6664constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6665equalsimpl(int i, Object obj) {
        return (obj instanceof ProcessResult) && i == ((ProcessResult) obj).m6672unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6666equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getAnyChangeConsumed-impl, reason: not valid java name */
    public static final boolean m6667getAnyChangeConsumedimpl(int i) {
        return (i & 4) != 0;
    }

    /* renamed from: getAnyMovementConsumed-impl, reason: not valid java name */
    public static final boolean m6668getAnyMovementConsumedimpl(int i) {
        return (i & 2) != 0;
    }

    /* renamed from: getDispatchedToAPointerInputModifier-impl, reason: not valid java name */
    public static final boolean m6669getDispatchedToAPointerInputModifierimpl(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6670hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6671toStringimpl(int i) {
        return sg3.o(i, "ProcessResult(value=", ")");
    }

    public boolean equals(Object obj) {
        return m6665equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m6670hashCodeimpl(this.value);
    }

    public String toString() {
        return m6671toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6672unboximpl() {
        return this.value;
    }
}
