package defpackage;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class um2 extends bn2 {
    public static String A0(int i, String str) {
        CharSequence charSequence;
        str.getClass();
        if (i < 0) {
            v5.m(sg3.o(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static String B0(int i, String str) {
        CharSequence charSequence;
        str.getClass();
        if (i < 0) {
            v5.m(sg3.o(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static final boolean C0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!xu3.k(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder D0(String str, int i, int i2, CharSequence charSequence) {
        str.getClass();
        charSequence.getClass();
        if (i2 < i) {
            lh0.f(lt.x("End index (", i2, ") is less than start index (", i, ")."));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str, 0, i);
        sb.append(charSequence);
        sb.append((CharSequence) str, i2, str.length());
        return sb;
    }

    public static final List E0(String str, CharSequence charSequence) {
        int r0 = r0(charSequence, str, 0, false);
        if (r0 == -1) {
            return nb0.C(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int i = 0;
        do {
            arrayList.add(charSequence.subSequence(i, r0).toString());
            i = str.length() + r0;
            r0 = r0(charSequence, str, i, false);
        } while (r0 != -1);
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }

    public static List F0(CharSequence charSequence, String[] strArr) {
        charSequence.getClass();
        int i = 1;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return E0(str, charSequence);
            }
        }
        List asList = Arrays.asList(strArr);
        asList.getClass();
        xd xdVar = new xd(new bd0(charSequence, new kb1(asList, i)), 6);
        ArrayList arrayList = new ArrayList(lw.Z(xdVar, 10));
        Iterator it = xdVar.iterator();
        while (true) {
            ad0 ad0Var = (ad0) it;
            if (!ad0Var.hasNext()) {
                return arrayList;
            }
            i61 i61Var = (i61) ad0Var.next();
            i61Var.getClass();
            arrayList.add(charSequence.subSequence(i61Var.a, i61Var.b + 1).toString());
        }
    }

    public static String G0(String str, i61 i61Var) {
        str.getClass();
        i61Var.getClass();
        return str.substring(i61Var.a, i61Var.b + 1);
    }

    public static String H0(String str, String str2) {
        int u0 = u0(str, str2, 0, false, 6);
        return u0 == -1 ? str : str.substring(str2.length() + u0, str.length());
    }

    public static String I0(String str) {
        int u0 = u0(str, "~", 0, false, 6);
        return u0 == -1 ? str : str.substring(0, u0);
    }

    public static String J0(String str, char c) {
        int t0 = t0(c, 0, 6, str);
        return t0 == -1 ? str : str.substring(0, t0);
    }

    public static CharSequence K0(int i, CharSequence charSequence) {
        if (i < 0) {
            qq.j(sg3.o(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    public static String L0(String str) {
        int length = str.length();
        if (127 <= length) {
            length = 127;
        }
        return str.substring(0, length);
    }

    public static void M0(CharSequence charSequence, PersistentCollection.Builder builder) {
        charSequence.getClass();
        builder.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            builder.add(Character.valueOf(charSequence.charAt(i)));
        }
    }

    public static CharSequence N0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean p = xu3.p(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!p) {
                    break;
                }
                length--;
            } else if (p) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static boolean l0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (u0(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (s0(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean m0(CharSequence charSequence, char c) {
        charSequence.getClass();
        return t0(c, 0, 2, charSequence) >= 0;
    }

    public static String o0(int i, String str) {
        str.getClass();
        if (i < 0) {
            qq.j(sg3.o(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static boolean p0(String str, CharSequence charSequence) {
        return charSequence instanceof String ? bn2.b0((String) charSequence, str, false) : C0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int q0(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static final int r0(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? s0(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int s0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        g61 g61Var;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int q0 = q0(charSequence);
            if (i3 > q0) {
                i3 = q0;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            g61Var = new g61(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            g61Var = new g61(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = g61Var.m;
        int i6 = g61Var.b;
        int i7 = g61Var.a;
        if (z3 && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    String str2 = (String) charSequence;
                    int length2 = str.length();
                    if (!(!z ? str.regionMatches(0, str2, i8, length2) : str.regionMatches(z, 0, str2, i8, length2))) {
                        if (i8 == i6) {
                            break;
                        }
                        i8 += i5;
                    } else {
                        return i8;
                    }
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!C0(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    public static int t0(char c, int i, int i2, CharSequence charSequence) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(wd.M0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (!xu3.k(cArr[0], charSequence.charAt(i), false)) {
            if (i == length) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public static /* synthetic */ int u0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return r0(charSequence, str, i, z);
    }

    public static boolean v0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!xu3.p(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char w0(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        hu2.n("Char sequence is empty.");
        return (char) 0;
    }

    public static int x0(CharSequence charSequence, char c) {
        int q0 = q0(charSequence);
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, q0);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(wd.M0(cArr), q0);
        }
        int length = charSequence.length() - 1;
        if (q0 > length) {
            q0 = length;
        }
        while (-1 < q0) {
            if (xu3.k(cArr[0], charSequence.charAt(q0), false)) {
                return q0;
            }
            q0--;
        }
        return -1;
    }

    public static int y0(String str, CharSequence charSequence, int i) {
        int q0 = (i & 2) != 0 ? q0(charSequence) : 0;
        charSequence.getClass();
        str.getClass();
        return !(charSequence instanceof String) ? s0(charSequence, str, q0, 0, false, true) : ((String) charSequence).lastIndexOf(str, q0);
    }

    public static List z0(CharSequence charSequence) {
        md1 md1Var = new md1(charSequence);
        if (!md1Var.hasNext()) {
            return oi0.a;
        }
        Object next = md1Var.next();
        if (!md1Var.hasNext()) {
            return nb0.C(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (md1Var.hasNext()) {
            arrayList.add(md1Var.next());
        }
        return arrayList;
    }
}
