package androidx.profileinstaller;

import androidx.compose.foundation.style.StylePropertiesKt;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class ProfileVersion {
    public static final int MIN_SUPPORTED_SDK = 24;
    static final byte[] V015_S = {StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LineBreakId, 53, 0};
    static final byte[] V010_P = {StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LineBreakId, StylePropertiesKt.LetterSpacingId, 0};
    static final byte[] V009_O_MR1 = {StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, 57, 0};
    static final byte[] V005_O = {StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, 53, 0};
    static final byte[] V001_N = {StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LineBreakId, 0};
    static final byte[] METADATA_V001_N = {StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LineBreakId, 0};
    static final byte[] METADATA_V002 = {StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, 50, 0};

    private ProfileVersion() {
    }

    public static String dexKeySeparator(byte[] bArr) {
        return (Arrays.equals(bArr, V001_N) || Arrays.equals(bArr, V005_O)) ? ":" : "!";
    }
}
