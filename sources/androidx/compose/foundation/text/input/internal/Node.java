package androidx.compose.foundation.text.input.internal;

import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class Node {
    private final int index;

    private /* synthetic */ Node(int i) {
        this.index = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Node m1900boximpl(int i) {
        return new Node(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1901constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1902equalsimpl(int i, Object obj) {
        return (obj instanceof Node) && i == ((Node) obj).m1906unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1903equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1904hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1905toStringimpl(int i) {
        return sg3.o(i, "Node(index=", ")");
    }

    public boolean equals(Object obj) {
        return m1902equalsimpl(this.index, obj);
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return m1904hashCodeimpl(this.index);
    }

    public String toString() {
        return m1905toStringimpl(this.index);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1906unboximpl() {
        return this.index;
    }
}
