package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class xo0 {
    public static final Pattern a = Pattern.compile("^[0-1]*$", 2);

    public static String a(String str) {
        if (!a.matcher(str).matches() || str.length() % 6 != 0) {
            throw new RuntimeException(k93.m("Undecodable FixedString '", str, "'"));
        }
        String str2 = "";
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 6;
            int a2 = so0.a(str.substring(i, i2));
            if (a2 == 63) {
                str2 = str2.concat(" ");
            } else {
                str2 = str2 + ((char) (a2 + 65));
            }
            i = i2;
        }
        return str2.trim();
    }

    public static String b(String str) {
        while (str.length() < 2) {
            str = str.concat(" ");
        }
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == ' ') {
                str2 = str2.concat(so0.b(63, 6));
            } else {
                if (charAt < 'A') {
                    throw new rx(k93.m("Unencodable FixedString '", str, "'"), 2);
                }
                str2 = str2.concat(so0.b(str.charAt(i) - 'A', 6));
            }
        }
        return str2;
    }
}
