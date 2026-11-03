package androidx.compose.foundation.text.input;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextObfuscationMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Visible = m1761constructorimpl(0);
    private static final int RevealLastTyped = m1761constructorimpl(1);
    private static final int Hidden = m1761constructorimpl(2);
    private static final int System = m1761constructorimpl(3);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getHidden-vTwcZD0, reason: not valid java name */
        public final int m1767getHiddenvTwcZD0() {
            return TextObfuscationMode.Hidden;
        }

        /* renamed from: getRevealLastTyped-vTwcZD0, reason: not valid java name */
        public final int m1768getRevealLastTypedvTwcZD0() {
            return TextObfuscationMode.RevealLastTyped;
        }

        /* renamed from: getSystem-vTwcZD0, reason: not valid java name */
        public final int m1769getSystemvTwcZD0() {
            return TextObfuscationMode.System;
        }

        /* renamed from: getVisible-vTwcZD0, reason: not valid java name */
        public final int m1770getVisiblevTwcZD0() {
            return TextObfuscationMode.Visible;
        }
    }

    private /* synthetic */ TextObfuscationMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextObfuscationMode m1760boximpl(int i) {
        return new TextObfuscationMode(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1761constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1762equalsimpl(int i, Object obj) {
        return (obj instanceof TextObfuscationMode) && i == ((TextObfuscationMode) obj).m1766unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1763equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1764hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1765toStringimpl(int i) {
        return sg3.o(i, "TextObfuscationMode(value=", ")");
    }

    public boolean equals(Object obj) {
        return m1762equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1764hashCodeimpl(this.value);
    }

    public String toString() {
        return m1765toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1766unboximpl() {
        return this.value;
    }
}
