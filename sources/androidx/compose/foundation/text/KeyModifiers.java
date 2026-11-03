package androidx.compose.foundation.text;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class KeyModifiers {
    private static final int ALT_FLAG = 1;
    private static final int Alt;
    private static final int AltMeta;
    private static final int AltShift;
    private static final int CTRL_FLAG = 2;
    private static final int Ctrl;
    private static final int CtrlAlt;
    private static final int CtrlMeta;
    private static final int CtrlShift;
    private static final int META_FLAG = 4;
    private static final int Meta;
    private static final int SHIFT_FLAG = 8;
    private static final int Shift;
    private static final int ShiftMeta;
    private final int flags;
    public static final Companion Companion = new Companion(null);
    private static final int None = m1543constructorimpl(0);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getAlt-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m1563getAltAuQ4EfA$annotations() {
        }

        /* renamed from: getAltMeta-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m1564getAltMetaAuQ4EfA$annotations() {
        }

        /* renamed from: getAltShift-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m1565getAltShiftAuQ4EfA$annotations() {
        }

        /* renamed from: getCtrl-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m1566getCtrlAuQ4EfA$annotations() {
        }

        /* renamed from: getCtrlAlt-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m1567getCtrlAltAuQ4EfA$annotations() {
        }

        /* renamed from: getCtrlMeta-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m1568getCtrlMetaAuQ4EfA$annotations() {
        }

        /* renamed from: getCtrlShift-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m1569getCtrlShiftAuQ4EfA$annotations() {
        }

        /* renamed from: getMeta-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m1570getMetaAuQ4EfA$annotations() {
        }

        /* renamed from: getNone-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m1571getNoneAuQ4EfA$annotations() {
        }

        /* renamed from: getShift-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m1572getShiftAuQ4EfA$annotations() {
        }

        /* renamed from: getShiftMeta-AuQ4EfA$annotations, reason: not valid java name */
        public static /* synthetic */ void m1573getShiftMetaAuQ4EfA$annotations() {
        }

        /* renamed from: getAlt-AuQ4EfA, reason: not valid java name */
        public final int m1574getAltAuQ4EfA() {
            return KeyModifiers.Alt;
        }

        /* renamed from: getAltMeta-AuQ4EfA, reason: not valid java name */
        public final int m1575getAltMetaAuQ4EfA() {
            return KeyModifiers.AltMeta;
        }

        /* renamed from: getAltShift-AuQ4EfA, reason: not valid java name */
        public final int m1576getAltShiftAuQ4EfA() {
            return KeyModifiers.AltShift;
        }

        /* renamed from: getCtrl-AuQ4EfA, reason: not valid java name */
        public final int m1577getCtrlAuQ4EfA() {
            return KeyModifiers.Ctrl;
        }

        /* renamed from: getCtrlAlt-AuQ4EfA, reason: not valid java name */
        public final int m1578getCtrlAltAuQ4EfA() {
            return KeyModifiers.CtrlAlt;
        }

        /* renamed from: getCtrlMeta-AuQ4EfA, reason: not valid java name */
        public final int m1579getCtrlMetaAuQ4EfA() {
            return KeyModifiers.CtrlMeta;
        }

        /* renamed from: getCtrlShift-AuQ4EfA, reason: not valid java name */
        public final int m1580getCtrlShiftAuQ4EfA() {
            return KeyModifiers.CtrlShift;
        }

        /* renamed from: getMeta-AuQ4EfA, reason: not valid java name */
        public final int m1581getMetaAuQ4EfA() {
            return KeyModifiers.Meta;
        }

        /* renamed from: getNone-AuQ4EfA, reason: not valid java name */
        public final int m1582getNoneAuQ4EfA() {
            return KeyModifiers.None;
        }

        /* renamed from: getShift-AuQ4EfA, reason: not valid java name */
        public final int m1583getShiftAuQ4EfA() {
            return KeyModifiers.Shift;
        }

        /* renamed from: getShiftMeta-AuQ4EfA, reason: not valid java name */
        public final int m1584getShiftMetaAuQ4EfA() {
            return KeyModifiers.ShiftMeta;
        }
    }

    static {
        int m1543constructorimpl = m1543constructorimpl(1);
        Alt = m1543constructorimpl;
        int m1543constructorimpl2 = m1543constructorimpl(2);
        Ctrl = m1543constructorimpl2;
        int m1543constructorimpl3 = m1543constructorimpl(4);
        Meta = m1543constructorimpl3;
        int m1543constructorimpl4 = m1543constructorimpl(8);
        Shift = m1543constructorimpl4;
        AltShift = m1560plus1uj4btU(m1543constructorimpl, m1543constructorimpl4);
        CtrlShift = m1560plus1uj4btU(m1543constructorimpl2, m1543constructorimpl4);
        ShiftMeta = m1560plus1uj4btU(m1543constructorimpl3, m1543constructorimpl4);
        CtrlAlt = m1560plus1uj4btU(m1543constructorimpl2, m1543constructorimpl);
        CtrlMeta = m1560plus1uj4btU(m1543constructorimpl2, m1543constructorimpl3);
        AltMeta = m1560plus1uj4btU(m1543constructorimpl3, m1543constructorimpl4);
    }

    private /* synthetic */ KeyModifiers(int i) {
        this.flags = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyModifiers m1542boximpl(int i) {
        return new KeyModifiers(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m1543constructorimpl(int i) {
        return i;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1544constructorimpl(boolean z, boolean z2, boolean z3, boolean z4) {
        return m1543constructorimpl((z ? 1 : 0) | (z2 ? 2 : 0) | (z3 ? 4 : 0) | (z4 ? 8 : 0));
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m1545constructorimpl$default(boolean z, boolean z2, boolean z3, boolean z4, int i, sb0 sb0Var) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            z4 = false;
        }
        return m1544constructorimpl(z, z2, z3, z4);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1546equalsimpl(int i, Object obj) {
        return (obj instanceof KeyModifiers) && i == ((KeyModifiers) obj).m1562unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1547equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getAlt-AuQ4EfA, reason: not valid java name */
    public static final int m1548getAltAuQ4EfA() {
        return Companion.m1574getAltAuQ4EfA();
    }

    /* renamed from: getAltMeta-AuQ4EfA, reason: not valid java name */
    public static final int m1549getAltMetaAuQ4EfA() {
        return Companion.m1575getAltMetaAuQ4EfA();
    }

    /* renamed from: getAltShift-AuQ4EfA, reason: not valid java name */
    public static final int m1550getAltShiftAuQ4EfA() {
        return Companion.m1576getAltShiftAuQ4EfA();
    }

    /* renamed from: getCtrl-AuQ4EfA, reason: not valid java name */
    public static final int m1551getCtrlAuQ4EfA() {
        return Companion.m1577getCtrlAuQ4EfA();
    }

    /* renamed from: getCtrlAlt-AuQ4EfA, reason: not valid java name */
    public static final int m1552getCtrlAltAuQ4EfA() {
        return Companion.m1578getCtrlAltAuQ4EfA();
    }

    /* renamed from: getCtrlMeta-AuQ4EfA, reason: not valid java name */
    public static final int m1553getCtrlMetaAuQ4EfA() {
        return Companion.m1579getCtrlMetaAuQ4EfA();
    }

    /* renamed from: getCtrlShift-AuQ4EfA, reason: not valid java name */
    public static final int m1554getCtrlShiftAuQ4EfA() {
        return Companion.m1580getCtrlShiftAuQ4EfA();
    }

    /* renamed from: getMeta-AuQ4EfA, reason: not valid java name */
    public static final int m1555getMetaAuQ4EfA() {
        return Companion.m1581getMetaAuQ4EfA();
    }

    /* renamed from: getNone-AuQ4EfA, reason: not valid java name */
    public static final int m1556getNoneAuQ4EfA() {
        return Companion.m1582getNoneAuQ4EfA();
    }

    /* renamed from: getShift-AuQ4EfA, reason: not valid java name */
    public static final int m1557getShiftAuQ4EfA() {
        return Companion.m1583getShiftAuQ4EfA();
    }

    /* renamed from: getShiftMeta-AuQ4EfA, reason: not valid java name */
    public static final int m1558getShiftMetaAuQ4EfA() {
        return Companion.m1584getShiftMetaAuQ4EfA();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1559hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: plus-1uj4btU, reason: not valid java name */
    public static final int m1560plus1uj4btU(int i, int i2) {
        return m1543constructorimpl(i | i2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1561toStringimpl(int i) {
        return sg3.o(i, "KeyModifiers(flags=", ")");
    }

    public boolean equals(Object obj) {
        return m1546equalsimpl(this.flags, obj);
    }

    public int hashCode() {
        return m1559hashCodeimpl(this.flags);
    }

    public String toString() {
        return m1561toStringimpl(this.flags);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1562unboximpl() {
        return this.flags;
    }
}
