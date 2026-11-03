package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class vm2 extends od4 {
    public static String V(String str) {
        return qf2.V(new bd0(new yd(str, 5), new gf("    ", 23), 3), "\n");
    }

    public static String W(String str) {
        Comparable comparable;
        List z0 = um2.z0(str);
        List list = z0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!um2.v0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(lw.Z(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (!xu3.p(str2.charAt(i3))) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                i3 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i3));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        z0.size();
        int size2 = z0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            int i4 = i + 1;
            if (i < 0) {
                nb0.O();
                throw null;
            }
            String str3 = (String) obj3;
            String o0 = ((i == 0 || i == size2) && um2.v0(str3)) ? null : um2.o0(intValue, str3);
            if (o0 != null) {
                arrayList3.add(o0);
            }
            i = i4;
        }
        StringBuilder sb = new StringBuilder(length2);
        kw.v0(arrayList3, sb, null, 124);
        return sb.toString();
    }

    public static String X(String str) {
        if (um2.v0("|")) {
            v5.m("marginPrefix must be non-blank string.");
            return null;
        }
        List z0 = um2.z0(str);
        int length = str.length();
        z0.size();
        int size = z0.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : z0) {
            int i2 = i + 1;
            if (i < 0) {
                nb0.O();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && um2.v0(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!xu3.p(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String substring = (i3 != -1 && str2.startsWith("|", i3)) ? str2.substring("|".length() + i3) : null;
                if (substring != null) {
                    str2 = substring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        kw.v0(arrayList, sb, null, 124);
        return sb.toString();
    }
}
