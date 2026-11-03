package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TextDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Ltr = m7950constructorimpl(1);
    private static final int Rtl = m7950constructorimpl(2);
    private static final int Content = m7950constructorimpl(3);
    private static final int ContentOrLtr = m7950constructorimpl(4);
    private static final int ContentOrRtl = m7950constructorimpl(5);
    private static final int Unspecified = m7950constructorimpl(0);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getContent-s_7X-co, reason: not valid java name */
        public final int m7956getContents_7Xco() {
            return TextDirection.Content;
        }

        /* renamed from: getContentOrLtr-s_7X-co, reason: not valid java name */
        public final int m7957getContentOrLtrs_7Xco() {
            return TextDirection.ContentOrLtr;
        }

        /* renamed from: getContentOrRtl-s_7X-co, reason: not valid java name */
        public final int m7958getContentOrRtls_7Xco() {
            return TextDirection.ContentOrRtl;
        }

        /* renamed from: getLtr-s_7X-co, reason: not valid java name */
        public final int m7959getLtrs_7Xco() {
            return TextDirection.Ltr;
        }

        /* renamed from: getRtl-s_7X-co, reason: not valid java name */
        public final int m7960getRtls_7Xco() {
            return TextDirection.Rtl;
        }

        /* renamed from: getUnspecified-s_7X-co, reason: not valid java name */
        public final int m7961getUnspecifieds_7Xco() {
            return TextDirection.Unspecified;
        }

        /* renamed from: valueOf-E8nx0Ws, reason: not valid java name */
        public final int m7962valueOfE8nx0Ws(int i) {
            boolean z = false;
            if (i >= 0 && i < 6) {
                z = true;
            }
            if (!z) {
                InlineClassHelperKt.throwIllegalArgumentException("The given value=" + i + " is not recognized by TextDirection.");
            }
            return TextDirection.m7950constructorimpl(i);
        }
    }

    private /* synthetic */ TextDirection(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextDirection m7949boximpl(int i) {
        return new TextDirection(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7950constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7951equalsimpl(int i, Object obj) {
        return (obj instanceof TextDirection) && i == ((TextDirection) obj).m7955unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7952equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7953hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7954toStringimpl(int i) {
        return m7952equalsimpl0(i, Ltr) ? "Ltr" : m7952equalsimpl0(i, Rtl) ? "Rtl" : m7952equalsimpl0(i, Content) ? "Content" : m7952equalsimpl0(i, ContentOrLtr) ? "ContentOrLtr" : m7952equalsimpl0(i, ContentOrRtl) ? "ContentOrRtl" : m7952equalsimpl0(i, Unspecified) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m7951equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m7953hashCodeimpl(this.value);
    }

    public String toString() {
        return m7954toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7955unboximpl() {
        return this.value;
    }
}
