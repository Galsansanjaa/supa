package androidx.compose.foundation.gestures.snapping;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FinalSnappingItem {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int ClosestItem = m700constructorimpl(0);
    private static final int NextItem = m700constructorimpl(1);
    private static final int PreviousItem = m700constructorimpl(2);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getClosestItem-bbeMdSM, reason: not valid java name */
        public final int m706getClosestItembbeMdSM() {
            return FinalSnappingItem.ClosestItem;
        }

        /* renamed from: getNextItem-bbeMdSM, reason: not valid java name */
        public final int m707getNextItembbeMdSM() {
            return FinalSnappingItem.NextItem;
        }

        /* renamed from: getPreviousItem-bbeMdSM, reason: not valid java name */
        public final int m708getPreviousItembbeMdSM() {
            return FinalSnappingItem.PreviousItem;
        }
    }

    private /* synthetic */ FinalSnappingItem(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FinalSnappingItem m699boximpl(int i) {
        return new FinalSnappingItem(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m700constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m701equalsimpl(int i, Object obj) {
        return (obj instanceof FinalSnappingItem) && i == ((FinalSnappingItem) obj).m705unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m702equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m703hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m704toStringimpl(int i) {
        return sg3.o(i, "FinalSnappingItem(value=", ")");
    }

    public boolean equals(Object obj) {
        return m701equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m703hashCodeimpl(this.value);
    }

    public String toString() {
        return m704toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m705unboximpl() {
        return this.value;
    }
}
