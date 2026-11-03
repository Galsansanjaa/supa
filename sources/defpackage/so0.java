package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class so0 {
    public static final Pattern a = Pattern.compile("^[0-1]*$", 2);

    public static int a(String str) {
        if (!a.matcher(str).matches()) {
            throw new RuntimeException(k93.m("Undecodable FixedInteger '", str, "'"));
        }
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i + 1;
            if (str.charAt(str.length() - i3) == '1') {
                i2 += 1 << i;
            }
            i = i3;
        }
        return i2;
    }

    public static String b(int i, int i2) {
        String str = "";
        while (i > 0) {
            str = (i & 1) == 1 ? "1".concat(str) : "0".concat(str);
            i >>= 1;
        }
        if (str.length() > i2) {
            throw new rx(lt.x("Numeric value '", i, "' is too large for a bit string length of '", i2, "'"), 2);
        }
        while (str.length() < i2) {
            str = "0".concat(str);
        }
        return str;
    }
}
