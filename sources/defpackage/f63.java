package defpackage;

import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class f63 {
    public static final byte[] a;
    public static final String[] b = new String[0];
    public static final d42 c;
    public static final Charset d;
    public static final TimeZone e;
    public static final xd1 f;
    public static final Pattern g;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tq, dr] */
    static {
        byte[] bArr = new byte[0];
        a = bArr;
        ?? obj = new Object();
        obj.write(bArr, 0, 0);
        c = new d42(0L, obj, 1);
        nr.d("efbbbf");
        nr.d("feff");
        nr.d("fffe");
        nr.d("0000ffff");
        nr.d("ffff0000");
        d = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-32BE");
        Charset.forName("UTF-32LE");
        e = DesugarTimeZone.getTimeZone("GMT");
        f = new xd1(14);
        g = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static AssertionError a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, tq] */
    public static String b(String str) {
        int i = -1;
        if (str.contains(":")) {
            InetAddress f2 = (str.startsWith("[") && str.endsWith("]")) ? f(1, str.length() - 1, str) : f(0, str.length(), str);
            if (f2 != null) {
                byte[] address = f2.getAddress();
                if (address.length != 16) {
                    qq.e(k93.m("Invalid IPv6 address: '", str, "'"));
                    return null;
                }
                int i2 = 0;
                int i3 = 0;
                while (i2 < address.length) {
                    int i4 = i2;
                    while (i4 < 16 && address[i4] == 0 && address[i4 + 1] == 0) {
                        i4 += 2;
                    }
                    int i5 = i4 - i2;
                    if (i5 > i3 && i5 >= 4) {
                        i = i2;
                        i3 = i5;
                    }
                    i2 = i4 + 2;
                }
                ?? obj = new Object();
                while (r2 < address.length) {
                    if (r2 == i) {
                        obj.A(58);
                        r2 += i3;
                        if (r2 == 16) {
                            obj.A(58);
                        }
                    } else {
                        if (r2 > 0) {
                            obj.A(58);
                        }
                        obj.C(((address[r2] & 255) << 8) | (address[r2 + 1] & 255));
                        r2 += 2;
                    }
                }
                return obj.v(obj.b, ru.a);
            }
        } else {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    while (r2 < lowerCase.length()) {
                        char charAt = lowerCase.charAt(r2);
                        r2 = (charAt > 31 && charAt < 127 && " #%/:?@[\\]".indexOf(charAt) == -1) ? r2 + 1 : 0;
                    }
                    return lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!n(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static int e(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return c2 - '7';
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.InetAddress f(int r16, int r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f63.f(int, int, java.lang.String):java.net.InetAddress");
    }

    public static int g(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int h(String str, int i, int i2, char c2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String j(jz0 jz0Var, boolean z) {
        String str = jz0Var.d;
        int i = jz0Var.e;
        boolean contains = str.contains(":");
        String str2 = jz0Var.d;
        if (contains) {
            str2 = k93.m("[", str2, "]");
        }
        if (!z && i == jz0.b(jz0Var.a)) {
            return str2;
        }
        return str2 + ":" + i;
    }

    public static List k(List list) {
        return DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    public static List l(Object... objArr) {
        return DesugarCollections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static String[] m(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean n(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean o(Comparator comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, tq] */
    public static boolean p(uk2 uk2Var, int i) {
        long nanoTime = System.nanoTime();
        long c2 = uk2Var.b().e() ? uk2Var.b().c() - nanoTime : Long.MAX_VALUE;
        uk2Var.b().d(Math.min(c2, TimeUnit.MILLISECONDS.toNanos(i)) + nanoTime);
        try {
            ?? obj = new Object();
            while (uk2Var.r(obj, 8192L) != -1) {
                obj.skip(obj.b);
            }
            if (c2 == Long.MAX_VALUE) {
                uk2Var.b().a();
                return true;
            }
            uk2Var.b().d(nanoTime + c2);
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                uk2Var.b().a();
                return false;
            }
            uk2Var.b().d(nanoTime + c2);
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                uk2Var.b().a();
            } else {
                uk2Var.b().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static int q(int i, int i2, String str) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int r(int i, int i2, String str) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }
}
