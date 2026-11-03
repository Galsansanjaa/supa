package androidx.compose.foundation.text;

import android.R;
import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ContextMenuIcons {
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getActionModeCopyDrawable-3I4p1mQ, reason: not valid java name */
        public final int m1518getActionModeCopyDrawable3I4p1mQ() {
            return ContextMenuIcons.m1512constructorimpl(R.attr.actionModeCopyDrawable);
        }

        /* renamed from: getActionModeCutDrawable-3I4p1mQ, reason: not valid java name */
        public final int m1519getActionModeCutDrawable3I4p1mQ() {
            return ContextMenuIcons.m1512constructorimpl(R.attr.actionModeCutDrawable);
        }

        /* renamed from: getActionModePasteDrawable-3I4p1mQ, reason: not valid java name */
        public final int m1520getActionModePasteDrawable3I4p1mQ() {
            return ContextMenuIcons.m1512constructorimpl(R.attr.actionModePasteDrawable);
        }

        /* renamed from: getActionModeSelectAllDrawable-3I4p1mQ, reason: not valid java name */
        public final int m1521getActionModeSelectAllDrawable3I4p1mQ() {
            return ContextMenuIcons.m1512constructorimpl(R.attr.actionModeSelectAllDrawable);
        }

        /* renamed from: getID_NULL-3I4p1mQ, reason: not valid java name */
        public final int m1522getID_NULL3I4p1mQ() {
            return ContextMenuIcons.m1512constructorimpl(0);
        }
    }

    private /* synthetic */ ContextMenuIcons(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ContextMenuIcons m1511boximpl(int i) {
        return new ContextMenuIcons(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1512constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1513equalsimpl(int i, Object obj) {
        return (obj instanceof ContextMenuIcons) && i == ((ContextMenuIcons) obj).m1517unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1514equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1515hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1516toStringimpl(int i) {
        return sg3.o(i, "ContextMenuIcons(value=", ")");
    }

    public boolean equals(Object obj) {
        return m1513equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1515hashCodeimpl(this.value);
    }

    public String toString() {
        return m1516toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1517unboximpl() {
        return this.value;
    }
}
