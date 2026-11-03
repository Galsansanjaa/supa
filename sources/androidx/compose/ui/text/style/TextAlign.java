package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.nb0;
import defpackage.sb0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TextAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Left = m7933constructorimpl(1);
    private static final int Right = m7933constructorimpl(2);
    private static final int Center = m7933constructorimpl(3);
    private static final int Justify = m7933constructorimpl(4);
    private static final int Start = m7933constructorimpl(5);
    private static final int End = m7933constructorimpl(6);
    private static final int Unspecified = m7933constructorimpl(0);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getCenter-e0LSkKk, reason: not valid java name */
        public final int m7939getCentere0LSkKk() {
            return TextAlign.Center;
        }

        /* renamed from: getEnd-e0LSkKk, reason: not valid java name */
        public final int m7940getEnde0LSkKk() {
            return TextAlign.End;
        }

        /* renamed from: getJustify-e0LSkKk, reason: not valid java name */
        public final int m7941getJustifye0LSkKk() {
            return TextAlign.Justify;
        }

        /* renamed from: getLeft-e0LSkKk, reason: not valid java name */
        public final int m7942getLefte0LSkKk() {
            return TextAlign.Left;
        }

        /* renamed from: getRight-e0LSkKk, reason: not valid java name */
        public final int m7943getRighte0LSkKk() {
            return TextAlign.Right;
        }

        /* renamed from: getStart-e0LSkKk, reason: not valid java name */
        public final int m7944getStarte0LSkKk() {
            return TextAlign.Start;
        }

        /* renamed from: getUnspecified-e0LSkKk, reason: not valid java name */
        public final int m7945getUnspecifiede0LSkKk() {
            return TextAlign.Unspecified;
        }

        /* renamed from: valueOf-IgVj0fw, reason: not valid java name */
        public final int m7946valueOfIgVj0fw(int i) {
            boolean z = false;
            if (i >= 0 && i < 7) {
                z = true;
            }
            if (!z) {
                InlineClassHelperKt.throwIllegalArgumentException("The given value=" + i + " is not recognized by TextAlign.");
            }
            return TextAlign.m7933constructorimpl(i);
        }

        public final List<TextAlign> values() {
            return nb0.D(TextAlign.m7932boximpl(m7942getLefte0LSkKk()), TextAlign.m7932boximpl(m7943getRighte0LSkKk()), TextAlign.m7932boximpl(m7939getCentere0LSkKk()), TextAlign.m7932boximpl(m7941getJustifye0LSkKk()), TextAlign.m7932boximpl(m7944getStarte0LSkKk()), TextAlign.m7932boximpl(m7940getEnde0LSkKk()));
        }
    }

    private /* synthetic */ TextAlign(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextAlign m7932boximpl(int i) {
        return new TextAlign(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7933constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7934equalsimpl(int i, Object obj) {
        return (obj instanceof TextAlign) && i == ((TextAlign) obj).m7938unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7935equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7936hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7937toStringimpl(int i) {
        return m7935equalsimpl0(i, Left) ? "Left" : m7935equalsimpl0(i, Right) ? "Right" : m7935equalsimpl0(i, Center) ? "Center" : m7935equalsimpl0(i, Justify) ? "Justify" : m7935equalsimpl0(i, Start) ? "Start" : m7935equalsimpl0(i, End) ? "End" : m7935equalsimpl0(i, Unspecified) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m7934equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m7936hashCodeimpl(this.value);
    }

    public String toString() {
        return m7937toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7938unboximpl() {
        return this.value;
    }
}
