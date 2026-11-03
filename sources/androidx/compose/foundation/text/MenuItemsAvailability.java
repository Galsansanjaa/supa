package androidx.compose.foundation.text;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MenuItemsAvailability {
    private static final int AUTO_FILL = 16;
    private static final int COPY = 1;
    private static final int CUT = 4;
    private static final int NONE = 0;
    private static final int PASTE = 2;
    private static final int SELECT_ALL = 8;
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m1615constructorimpl(0);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getNone-JKCFgKw, reason: not valid java name */
        public final int m1627getNoneJKCFgKw() {
            return MenuItemsAvailability.None;
        }
    }

    private /* synthetic */ MenuItemsAvailability(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MenuItemsAvailability m1614boximpl(int i) {
        return new MenuItemsAvailability(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m1615constructorimpl(int i) {
        return i;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1616constructorimpl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return m1615constructorimpl((z ? 1 : 0) | (z2 ? 2 : 0) | (z3 ? 4 : 0) | (z4 ? 8 : 0) | (z5 ? 16 : 0));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1617equalsimpl(int i, Object obj) {
        return (obj instanceof MenuItemsAvailability) && i == ((MenuItemsAvailability) obj).m1626unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1618equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getCanAutofill-impl, reason: not valid java name */
    public static final boolean m1619getCanAutofillimpl(int i) {
        return (i & 16) == 16;
    }

    /* renamed from: getCanCopy-impl, reason: not valid java name */
    public static final boolean m1620getCanCopyimpl(int i) {
        return (i & 1) == 1;
    }

    /* renamed from: getCanCut-impl, reason: not valid java name */
    public static final boolean m1621getCanCutimpl(int i) {
        return (i & 4) == 4;
    }

    /* renamed from: getCanPaste-impl, reason: not valid java name */
    public static final boolean m1622getCanPasteimpl(int i) {
        return (i & 2) == 2;
    }

    /* renamed from: getCanSelectAll-impl, reason: not valid java name */
    public static final boolean m1623getCanSelectAllimpl(int i) {
        return (i & 8) == 8;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1624hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1625toStringimpl(int i) {
        return sg3.o(i, "MenuItemsAvailability(value=", ")");
    }

    public boolean equals(Object obj) {
        return m1617equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1624hashCodeimpl(this.value);
    }

    public String toString() {
        return m1625toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1626unboximpl() {
        return this.value;
    }
}
