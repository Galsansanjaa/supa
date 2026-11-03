package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class b54 {
    public static final b54 c = new b54(100);
    public final EnumMap a;
    public final int b;

    public b54(int i) {
        EnumMap enumMap = new EnumMap(a54.class);
        this.a = enumMap;
        a54 a54Var = a54.AD_STORAGE;
        x44 x44Var = x44.UNINITIALIZED;
        enumMap.put((EnumMap) a54Var, (a54) x44Var);
        enumMap.put((EnumMap) a54.ANALYTICS_STORAGE, (a54) x44Var);
        this.b = i;
    }

    public b54(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(a54.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }

    public static String a(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static b54 b(int i, Bundle bundle) {
        if (bundle == null) {
            return new b54(i);
        }
        EnumMap enumMap = new EnumMap(a54.class);
        for (a54 a54Var : y44.STORAGE.a) {
            enumMap.put((EnumMap) a54Var, (a54) d(bundle.getString(a54Var.a)));
        }
        return new b54(enumMap, i);
    }

    public static b54 c(int i, String str) {
        EnumMap enumMap = new EnumMap(a54.class);
        a54[] a54VarArr = y44.STORAGE.a;
        for (int i2 = 0; i2 < a54VarArr.length; i2++) {
            String str2 = str == null ? "" : str;
            a54 a54Var = a54VarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put((EnumMap) a54Var, (a54) e(str2.charAt(i3)));
            } else {
                enumMap.put((EnumMap) a54Var, (a54) x44.UNINITIALIZED);
            }
        }
        return new b54(enumMap, i);
    }

    public static x44 d(String str) {
        x44 x44Var = x44.UNINITIALIZED;
        return str == null ? x44Var : str.equals("granted") ? x44.GRANTED : str.equals("denied") ? x44.DENIED : x44Var;
    }

    public static x44 e(char c2) {
        return c2 != '+' ? c2 != '0' ? c2 != '1' ? x44.UNINITIALIZED : x44.GRANTED : x44.DENIED : x44.POLICY;
    }

    public static char h(x44 x44Var) {
        if (x44Var == null) {
            return '-';
        }
        int ordinal = x44Var.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b54) {
            b54 b54Var = (b54) obj;
            a54[] a54VarArr = y44.STORAGE.a;
            int length = a54VarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    a54 a54Var = a54VarArr[i];
                    if (this.a.get(a54Var) != b54Var.a.get(a54Var)) {
                        break;
                    }
                    i++;
                } else if (this.b == b54Var.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (a54 a54Var : y44.STORAGE.a) {
            x44 x44Var = (x44) this.a.get(a54Var);
            char c2 = '-';
            if (x44Var != null && (ordinal = x44Var.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c2 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c2 = '1';
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (a54 a54Var : y44.STORAGE.a) {
            sb.append(h((x44) this.a.get(a54Var)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.a.values().iterator();
        int i = this.b * 17;
        while (it.hasNext()) {
            i = (i * 31) + ((x44) it.next()).hashCode();
        }
        return i;
    }

    public final boolean i(a54 a54Var) {
        return ((x44) this.a.get(a54Var)) != x44.DENIED;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.b54 j(defpackage.b54 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<a54> r1 = defpackage.a54.class
            r0.<init>(r1)
            y44 r1 = defpackage.y44.STORAGE
            a54[] r1 = r1.a
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L48
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.a
            java.lang.Object r5 = r5.get(r4)
            x44 r5 = (defpackage.x44) r5
            java.util.EnumMap r6 = r9.a
            java.lang.Object r6 = r6.get(r4)
            x44 r6 = (defpackage.x44) r6
            if (r5 != 0) goto L24
            goto L31
        L24:
            if (r6 == 0) goto L40
            x44 r7 = defpackage.x44.UNINITIALIZED
            if (r5 != r7) goto L2b
            goto L31
        L2b:
            if (r6 == r7) goto L40
            x44 r7 = defpackage.x44.POLICY
            if (r5 != r7) goto L33
        L31:
            r5 = r6
            goto L40
        L33:
            if (r6 == r7) goto L40
            x44 r7 = defpackage.x44.DENIED
            if (r5 == r7) goto L3f
            if (r6 != r7) goto L3c
            goto L3f
        L3c:
            x44 r5 = defpackage.x44.GRANTED
            goto L40
        L3f:
            r5 = r7
        L40:
            if (r5 == 0) goto L45
            r0.put(r4, r5)
        L45:
            int r3 = r3 + 1
            goto Ld
        L48:
            b54 r8 = new b54
            r9 = 100
            r8.<init>(r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b54.j(b54):b54");
    }

    public final b54 k(b54 b54Var) {
        EnumMap enumMap = new EnumMap(a54.class);
        for (a54 a54Var : y44.STORAGE.a) {
            x44 x44Var = (x44) this.a.get(a54Var);
            if (x44Var == x44.UNINITIALIZED) {
                x44Var = (x44) b54Var.a.get(a54Var);
            }
            if (x44Var != null) {
                enumMap.put((EnumMap) a54Var, (a54) x44Var);
            }
        }
        return new b54(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (a54 a54Var : y44.STORAGE.a) {
            sb.append(",");
            sb.append(a54Var.a);
            sb.append("=");
            x44 x44Var = (x44) this.a.get(a54Var);
            if (x44Var == null) {
                x44Var = x44.UNINITIALIZED;
            }
            sb.append(x44Var);
        }
        return sb.toString();
    }
}
