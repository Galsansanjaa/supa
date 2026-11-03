package defpackage;

import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class g {
    public static final Map a = (Map) Stream.CC.of(new Object[]{'A', 0}, new Object[]{'B', 1}, new Object[]{'C', 2}, new Object[]{'D', 3}, new Object[]{'E', 4}, new Object[]{'F', 5}, new Object[]{'G', 6}, new Object[]{'H', 7}, new Object[]{'I', 8}, new Object[]{'J', 9}, new Object[]{'K', 10}, new Object[]{'L', 11}, new Object[]{'M', 12}, new Object[]{'N', 13}, new Object[]{'O', 14}, new Object[]{'P', 15}, new Object[]{'Q', 16}, new Object[]{'R', 17}, new Object[]{'S', 18}, new Object[]{'T', 19}, new Object[]{'U', 20}, new Object[]{'V', 21}, new Object[]{'W', 22}, new Object[]{'X', 23}, new Object[]{'Y', 24}, new Object[]{'Z', 25}, new Object[]{'a', 26}, new Object[]{'b', 27}, new Object[]{'c', 28}, new Object[]{'d', 29}, new Object[]{'e', 30}, new Object[]{'f', 31}, new Object[]{'g', 32}, new Object[]{'h', 33}, new Object[]{'i', 34}, new Object[]{'j', 35}, new Object[]{'k', 36}, new Object[]{'l', 37}, new Object[]{'m', 38}, new Object[]{'n', 39}, new Object[]{'o', 40}, new Object[]{'p', 41}, new Object[]{'q', 42}, new Object[]{'r', 43}, new Object[]{'s', 44}, new Object[]{'t', 45}, new Object[]{'u', 46}, new Object[]{'v', 47}, new Object[]{'w', 48}, new Object[]{'x', 49}, new Object[]{'y', 50}, new Object[]{'z', 51}, new Object[]{'0', 52}, new Object[]{'1', 53}, new Object[]{'2', 54}, new Object[]{'3', 55}, new Object[]{'4', 56}, new Object[]{'5', 57}, new Object[]{'6', 58}, new Object[]{'7', 59}, new Object[]{'8', 60}, new Object[]{'9', 61}, new Object[]{'-', 62}, new Object[]{'_', 63}).collect(Collectors.toMap(new f(0), new f(1)));
    public static final Pattern b = Pattern.compile("^[0-1]*$", 2);
    public static final Pattern c = Pattern.compile("^[A-Za-z0-9\\-_]*$", 2);

    public static String a(String str) {
        if (!c.matcher(str).matches()) {
            throw new RuntimeException("Undecodable Base64URL string");
        }
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 = str2.concat(so0.b(((Integer) a.get(Character.valueOf(str.charAt(i)))).intValue(), 6));
        }
        return str2;
    }

    public final String b(String str) {
        if (!b.matcher(str).matches()) {
            throw new rx(k93.m("Unencodable Base64Url '", str, "'"), 2);
        }
        String c2 = c(str);
        String str2 = "";
        int i = 0;
        while (i <= c2.length() - 6) {
            int i2 = i + 6;
            try {
                str2 = str2 + Character.valueOf("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(so0.a(c2.substring(i, i2))));
                i = i2;
            } catch (pb0 unused) {
                throw new rx(k93.m("Unencodable Base64Url '", c2, "'"), 2);
            }
        }
        return str2;
    }

    public abstract String c(String str);
}
