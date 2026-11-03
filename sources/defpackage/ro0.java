package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class ro0 {
    public static final Pattern a = Pattern.compile("^[0-1]*$", 2);

    public static ArrayList a(String str) {
        if (!a.matcher(str).matches()) {
            throw new RuntimeException(k93.m("Undecodable FixedBitfield '", str, "'"));
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 1;
            arrayList.add(Boolean.valueOf(dn3.v(str.substring(i, i2))));
            i = i2;
        }
        return arrayList;
    }

    public static String b(int i, List list) {
        if (list.size() > i) {
            throw new rx("Too many values '" + list.size() + "'", 2);
        }
        String str = "";
        for (int i2 = 0; i2 < list.size(); i2++) {
            str = str.concat(dn3.w((Boolean) list.get(i2)));
        }
        while (str.length() < i) {
            str = str.concat("0");
        }
        return str;
    }
}
