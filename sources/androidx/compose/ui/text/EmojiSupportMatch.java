package androidx.compose.ui.text;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class EmojiSupportMatch {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Default = m7327constructorimpl(0);
    private static final int None = m7327constructorimpl(1);
    private static final int All = m7327constructorimpl(2);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getAll-_3YsG6Y, reason: not valid java name */
        public final int m7333getAll_3YsG6Y() {
            return EmojiSupportMatch.All;
        }

        /* renamed from: getDefault-_3YsG6Y, reason: not valid java name */
        public final int m7334getDefault_3YsG6Y() {
            return EmojiSupportMatch.Default;
        }

        /* renamed from: getNone-_3YsG6Y, reason: not valid java name */
        public final int m7335getNone_3YsG6Y() {
            return EmojiSupportMatch.None;
        }
    }

    private /* synthetic */ EmojiSupportMatch(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ EmojiSupportMatch m7326boximpl(int i) {
        return new EmojiSupportMatch(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7327constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7328equalsimpl(int i, Object obj) {
        return (obj instanceof EmojiSupportMatch) && i == ((EmojiSupportMatch) obj).m7332unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7329equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7330hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7331toStringimpl(int i) {
        return i == Default ? "EmojiSupportMatch.Default" : i == None ? "EmojiSupportMatch.None" : i == All ? "EmojiSupportMatch.All" : sg3.o(i, "Invalid(value=", ")");
    }

    public boolean equals(Object obj) {
        return m7328equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7330hashCodeimpl(this.value);
    }

    public String toString() {
        return m7331toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7332unboximpl() {
        return this.value;
    }
}
