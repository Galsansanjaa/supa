package androidx.compose.runtime.composer;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class GroupKind {
    public static final Companion Companion = new Companion(null);
    private static final int Group = m4562constructorimpl(0);
    private static final int Node = m4562constructorimpl(1);
    private static final int ReusableNode = m4562constructorimpl(2);
    private final int value;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getGroup-9udXigM, reason: not valid java name */
        public final int m4570getGroup9udXigM() {
            return GroupKind.Group;
        }

        /* renamed from: getNode-9udXigM, reason: not valid java name */
        public final int m4571getNode9udXigM() {
            return GroupKind.Node;
        }

        /* renamed from: getReusableNode-9udXigM, reason: not valid java name */
        public final int m4572getReusableNode9udXigM() {
            return GroupKind.ReusableNode;
        }
    }

    private /* synthetic */ GroupKind(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GroupKind m4561boximpl(int i) {
        return new GroupKind(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4562constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4563equalsimpl(int i, Object obj) {
        return (obj instanceof GroupKind) && i == ((GroupKind) obj).m4569unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4564equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4565hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: isNode-impl, reason: not valid java name */
    public static final boolean m4566isNodeimpl(int i) {
        return i != Companion.m4570getGroup9udXigM();
    }

    /* renamed from: isReusable-impl, reason: not valid java name */
    public static final boolean m4567isReusableimpl(int i) {
        return i != Companion.m4571getNode9udXigM();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4568toStringimpl(int i) {
        return sg3.o(i, "GroupKind(value=", ")");
    }

    public boolean equals(Object obj) {
        return m4563equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m4565hashCodeimpl(this.value);
    }

    public String toString() {
        return m4568toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4569unboximpl() {
        return this.value;
    }
}
