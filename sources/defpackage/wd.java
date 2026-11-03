package defpackage;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class wd extends nb0 {
    public static Object A0(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g61, i61] */
    public static i61 B0(int[] iArr) {
        return new g61(0, iArr.length - 1, 1);
    }

    public static int C0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static int D0(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static Object E0(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int F0(Object obj, Object[] objArr) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String G0(byte[] bArr, String str, ps0 ps0Var, int i) {
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            ps0Var = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (ps0Var != null) {
                sb.append((CharSequence) ps0Var.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String H0(Object[] objArr, String str, int i) {
        if ((i & 2) != 0) {
            str = "";
        }
        String str2 = (i & 4) == 0 ? ")" : "";
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) ", ");
            }
            od4.f(sb, obj, null);
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public static int I0(Object obj, Object[] objArr) {
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static Float J0(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static int K0(int[] iArr) {
        if (iArr.length == 0) {
            f31.b();
            return 0;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public static byte[] L0(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    public static char M0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            hu2.n("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        v5.m("Array has more than one element.");
        return (char) 0;
    }

    public static List N0(Object[] objArr, i61 i61Var) {
        objArr.getClass();
        i61Var.getClass();
        if (i61Var.isEmpty()) {
            return oi0.a;
        }
        List asList = Arrays.asList(p0(objArr, i61Var.a, i61Var.b + 1));
        asList.getClass();
        return asList;
    }

    public static final void O0(Object[] objArr, AbstractSet abstractSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    public static List P0(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return oi0.a;
        }
        if (length == 1) {
            return nb0.C(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static List Q0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new pd(objArr, false)) : nb0.C(objArr[0]) : oi0.a;
    }

    public static Set R0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return ri0.a;
        }
        if (length == 1) {
            return jh2.S(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(fi1.P(objArr.length));
        O0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static List Z(Object[] objArr) {
        objArr.getClass();
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static boolean a0(int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (i == iArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    public static boolean b0(Object obj, Object[] objArr) {
        objArr.getClass();
        return F0(obj, objArr) >= 0;
    }

    public static boolean c0(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!c0((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof wx2) && (obj2 instanceof wx2)) {
                            if (!Arrays.equals(((wx2) obj).a, ((wx2) obj2).a)) {
                            }
                        } else if ((obj instanceof ly2) && (obj2 instanceof ly2)) {
                            if (!Arrays.equals(((ly2) obj).a, ((ly2) obj2).a)) {
                            }
                        } else if ((obj instanceof by2) && (obj2 instanceof by2)) {
                            if (!Arrays.equals(((by2) obj).a, ((by2) obj2).a)) {
                            }
                        } else if ((obj instanceof gy2) && (obj2 instanceof gy2)) {
                            if (!Arrays.equals(((gy2) obj).a, ((gy2) obj2).a)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final void d0(Object[] objArr, StringBuilder sb, ArrayList arrayList) {
        if (arrayList.contains(objArr)) {
            sb.append("[...]");
            return;
        }
        arrayList.add(objArr);
        sb.append('[');
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            Object obj = objArr[i];
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof Object[]) {
                d0((Object[]) obj, sb, arrayList);
            } else if (obj instanceof byte[]) {
                String arrays = Arrays.toString((byte[]) obj);
                arrays.getClass();
                sb.append(arrays);
            } else if (obj instanceof short[]) {
                String arrays2 = Arrays.toString((short[]) obj);
                arrays2.getClass();
                sb.append(arrays2);
            } else if (obj instanceof int[]) {
                String arrays3 = Arrays.toString((int[]) obj);
                arrays3.getClass();
                sb.append(arrays3);
            } else if (obj instanceof long[]) {
                String arrays4 = Arrays.toString((long[]) obj);
                arrays4.getClass();
                sb.append(arrays4);
            } else if (obj instanceof float[]) {
                String arrays5 = Arrays.toString((float[]) obj);
                arrays5.getClass();
                sb.append(arrays5);
            } else if (obj instanceof double[]) {
                String arrays6 = Arrays.toString((double[]) obj);
                arrays6.getClass();
                sb.append(arrays6);
            } else if (obj instanceof char[]) {
                String arrays7 = Arrays.toString((char[]) obj);
                arrays7.getClass();
                sb.append(arrays7);
            } else if (obj instanceof boolean[]) {
                String arrays8 = Arrays.toString((boolean[]) obj);
                arrays8.getClass();
                sb.append(arrays8);
            } else if (obj instanceof wx2) {
                sb.append(kw.w0((wx2) obj, ", ", "[", "]", null, 56));
            } else if (obj instanceof ly2) {
                sb.append(kw.w0((ly2) obj, ", ", "[", "]", null, 56));
            } else if (obj instanceof by2) {
                sb.append(kw.w0((by2) obj, ", ", "[", "]", null, 56));
            } else if (obj instanceof gy2) {
                sb.append(kw.w0((gy2) obj, ", ", "[", "]", null, 56));
            } else {
                sb.append(obj.toString());
            }
        }
        sb.append(']');
        arrayList.remove(arrayList.size() - 1);
    }

    public static void e0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void f0(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void g0(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        cArr.getClass();
        cArr2.getClass();
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    public static void h0(double[] dArr, double[] dArr2, int i, int i2, int i3) {
        dArr.getClass();
        dArr2.getClass();
        System.arraycopy(dArr, i2, dArr2, i, i3 - i2);
    }

    public static void i0(float[] fArr, int i, float[] fArr2, int i2, int i3) {
        fArr.getClass();
        fArr2.getClass();
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
    }

    public static void j0(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void k0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void l0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        e0(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void m0(float[] fArr, int i, int i2, float[] fArr2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        i0(fArr, i, fArr2, 0, (i2 & 8) != 0 ? fArr.length : 6);
    }

    public static /* synthetic */ void n0(long[] jArr, long[] jArr2, int i) {
        j0(jArr, jArr2, i, 0, jArr.length);
    }

    public static /* synthetic */ void o0(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        k0(objArr, objArr2, i, i2, i3);
    }

    public static Object[] p0(Object[] objArr, int i, int i2) {
        objArr.getClass();
        nb0.n(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static List q0(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0) {
            qq.j(sg3.o(i, "Requested element count ", " is less than zero."));
            return null;
        }
        int length = objArr.length - i;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            qq.j(sg3.o(length, "Requested element count ", " is less than zero."));
            return null;
        }
        if (length == 0) {
            return oi0.a;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return Q0(objArr);
        }
        if (length == 1) {
            return nb0.C(objArr[length2 - 1]);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = length2 - length; i2 < length2; i2++) {
            arrayList.add(objArr[i2]);
        }
        return arrayList;
    }

    public static void r0(Object obj, Object[] objArr, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void t0(float[] fArr, float f) {
        int length = fArr.length;
        fArr.getClass();
        Arrays.fill(fArr, 0, length, f);
    }

    public static void u0(int[] iArr, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = iArr.length;
        }
        iArr.getClass();
        Arrays.fill(iArr, 0, i2, i);
    }

    public static void v0(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList w0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int x0(int[] iArr) {
        if (iArr.length != 0) {
            return iArr[0];
        }
        hu2.n("Array is empty.");
        return 0;
    }

    public static Object y0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        hu2.n("Array is empty.");
        return null;
    }

    public static Float z0(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }
}
