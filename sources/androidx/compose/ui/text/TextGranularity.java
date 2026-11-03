package androidx.compose.ui.text;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TextGranularity {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Character = m7442constructorimpl(0);
    private static final int Word = m7442constructorimpl(1);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getCharacter-DRrd7Zo, reason: not valid java name */
        public final int m7448getCharacterDRrd7Zo() {
            return TextGranularity.Character;
        }

        /* renamed from: getWord-DRrd7Zo, reason: not valid java name */
        public final int m7449getWordDRrd7Zo() {
            return TextGranularity.Word;
        }
    }

    private /* synthetic */ TextGranularity(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextGranularity m7441boximpl(int i) {
        return new TextGranularity(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m7442constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7443equalsimpl(int i, Object obj) {
        return (obj instanceof TextGranularity) && i == ((TextGranularity) obj).m7447unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7444equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7445hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7446toStringimpl(int i) {
        return sg3.o(i, "TextGranularity(value=", ")");
    }

    public boolean equals(Object obj) {
        return m7443equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7445hashCodeimpl(this.value);
    }

    public String toString() {
        return m7446toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7447unboximpl() {
        return this.value;
    }
}
