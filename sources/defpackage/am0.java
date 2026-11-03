package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class am0 {
    public static final Pattern a = Pattern.compile("^[0-1]*$", 2);

    public static int a(String str) {
        if (str.length() > 24) {
            throw new RuntimeException("FibonacciInteger too long");
        }
        if (!a.matcher(str).matches() || str.length() < 2 || str.indexOf("11") != str.length() - 2) {
            throw new RuntimeException(k93.m("Undecodable FibonacciInteger '", str, "'"));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < str.length() - 1; i++) {
            if (i == 0) {
                arrayList.add(1);
            } else if (i == 1) {
                arrayList.add(2);
            } else {
                arrayList.add(Integer.valueOf(((Integer) arrayList.get(i - 2)).intValue() + ((Integer) arrayList.get(i - 1)).intValue()));
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < str.length() - 1; i3++) {
            if (str.charAt(i3) == '1') {
                i2 = ((Integer) arrayList.get(i3)).intValue() + i2;
            }
        }
        return i2;
    }

    public static String b(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 1) {
            arrayList.add(1);
            int i2 = 2;
            if (i >= 2) {
                arrayList.add(2);
                while (true) {
                    int i3 = i2 - 1;
                    int i4 = i2 - 2;
                    if (i < ((Integer) arrayList.get(i4)).intValue() + ((Integer) arrayList.get(i3)).intValue()) {
                        break;
                    }
                    arrayList.add(Integer.valueOf(((Integer) arrayList.get(i4)).intValue() + ((Integer) arrayList.get(i3)).intValue()));
                    i2++;
                }
            }
        }
        String str = "1";
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            int intValue = ((Integer) arrayList.get(size)).intValue();
            if (i >= intValue) {
                str = "1".concat(str);
                i -= intValue;
            } else {
                str = "0".concat(str);
            }
        }
        return str;
    }
}
