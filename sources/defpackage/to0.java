package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class to0 {
    public static final Pattern a = Pattern.compile("^[0-1]*$", 2);

    public static ArrayList a(int i, String str) {
        if (!a.matcher(str).matches()) {
            throw new RuntimeException(k93.m("Undecodable FixedIntegerList '", str, "'"));
        }
        int i2 = 2 * i;
        if (str.length() > i2) {
            throw new RuntimeException(k93.m("Undecodable FixedIntegerList '", str, "'"));
        }
        if (str.length() % 2 != 0) {
            throw new RuntimeException(k93.m("Undecodable FixedIntegerList '", str, "'"));
        }
        while (str.length() < i2) {
            str = str.concat("0");
        }
        if (str.length() > i2) {
            str = str.substring(0, i2);
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < str.length()) {
            int i4 = i3 + 2;
            arrayList.add(Integer.valueOf(so0.a(str.substring(i3, i4))));
            i3 = i4;
        }
        while (arrayList.size() < i) {
            arrayList.add(0);
        }
        return arrayList;
    }

    public static String b(int i, List list) {
        if (list.size() > i) {
            throw new rx("Too many values '" + list.size() + "'", 2);
        }
        String str = "";
        for (int i2 = 0; i2 < list.size(); i2++) {
            str = str.concat(so0.b(((Integer) list.get(i2)).intValue(), 2));
        }
        while (str.length() < 2 * i) {
            str = str.concat("0");
        }
        return str;
    }
}
