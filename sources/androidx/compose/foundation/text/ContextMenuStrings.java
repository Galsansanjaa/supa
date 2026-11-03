package androidx.compose.foundation.text;

import android.os.Build;
import androidx.compose.foundation.R;
import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ContextMenuStrings {
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

        /* renamed from: getAutofill-9Hzcbyc, reason: not valid java name */
        public final int m1530getAutofill9Hzcbyc() {
            return ContextMenuStrings.m1524constructorimpl(Build.VERSION.SDK_INT <= 26 ? R.string.androidx_compose_foundation_autofill : android.R.string.autofill);
        }

        /* renamed from: getCopy-9Hzcbyc, reason: not valid java name */
        public final int m1531getCopy9Hzcbyc() {
            return ContextMenuStrings.m1524constructorimpl(android.R.string.copy);
        }

        /* renamed from: getCut-9Hzcbyc, reason: not valid java name */
        public final int m1532getCut9Hzcbyc() {
            return ContextMenuStrings.m1524constructorimpl(android.R.string.cut);
        }

        /* renamed from: getPaste-9Hzcbyc, reason: not valid java name */
        public final int m1533getPaste9Hzcbyc() {
            return ContextMenuStrings.m1524constructorimpl(android.R.string.paste);
        }

        /* renamed from: getSelectAll-9Hzcbyc, reason: not valid java name */
        public final int m1534getSelectAll9Hzcbyc() {
            return ContextMenuStrings.m1524constructorimpl(android.R.string.selectAll);
        }
    }

    private /* synthetic */ ContextMenuStrings(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ContextMenuStrings m1523boximpl(int i) {
        return new ContextMenuStrings(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1524constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1525equalsimpl(int i, Object obj) {
        return (obj instanceof ContextMenuStrings) && i == ((ContextMenuStrings) obj).m1529unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1526equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1527hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1528toStringimpl(int i) {
        return sg3.o(i, "ContextMenuStrings(value=", ")");
    }

    public boolean equals(Object obj) {
        return m1525equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1527hashCodeimpl(this.value);
    }

    public String toString() {
        return m1528toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1529unboximpl() {
        return this.value;
    }
}
