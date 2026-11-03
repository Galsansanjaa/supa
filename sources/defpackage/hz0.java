package defpackage;

import androidx.collection.SieveCacheKt;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class hz0 {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }

    public static long a(u72 u72Var) {
        String a2 = u72Var.p.a("Content-Length");
        if (a2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static boolean b(u72 u72Var) {
        if (u72Var.a.b.equals("HEAD")) {
            return false;
        }
        int i = u72Var.m;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && a(u72Var) == -1 && !"chunked".equalsIgnoreCase(u72Var.d("Transfer-Encoding"))) ? false : true;
    }

    public static int c(int i, String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > SieveCacheKt.NodeLinkMask) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0186, code lost:
    
        r17 = r2;
        r34 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x018c, code lost:
    
        if (r20 != Long.MIN_VALUE) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018e, code lost:
    
        r19 = Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b5, code lost:
    
        r0 = r36.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b9, code lost:
    
        if (r15 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01bb, code lost:
    
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f1, code lost:
    
        if (r0.length() == r15.length()) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f3, code lost:
    
        r3 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.h;
        r3.getClass();
        r6 = java.net.IDN.toUnicode(r15).split("\\.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0208, code lost:
    
        if (r3.a.get() != false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0212, code lost:
    
        if (r3.a.compareAndSet(false, true) == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0214, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0325, code lost:
    
        if (r0 != null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0327, code lost:
    
        r9 = 0;
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0381, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x022d, code lost:
    
        if (r9 == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x023c, code lost:
    
        r3.b.await();
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0337, code lost:
    
        if (r13 == null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x033f, code lost:
    
        if (r13.startsWith(androidx.credentials.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) != false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0342, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0374, code lost:
    
        r16 = new defpackage.e10(r5, r17, r19, r15, r13, r14, r24, r25, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0346, code lost:
    
        r0 = r36.i;
        r2 = r0.indexOf(47, r36.a.length() + 3);
        r0 = r0.substring(r2, defpackage.f63.g(r2, r0.length(), r0, "?#"));
        r2 = r0.lastIndexOf(47);
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0369, code lost:
    
        if (r2 == 0) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x036b, code lost:
    
        r0 = r0.substring(0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x036f, code lost:
    
        r13 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0371, code lost:
    
        r0 = androidx.credentials.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x01c1, code lost:
    
        if (r0.equals(r15) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x01c8, code lost:
    
        if (r0.endsWith(r15) == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x01db, code lost:
    
        if (r0.charAt((r0.length() - r15.length()) - 1) != '.') goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x01e7, code lost:
    
        if (defpackage.f63.g.matcher(r0).matches() != false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0193, code lost:
    
        if (r20 == (-1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x019c, code lost:
    
        if (r20 > 9223372036854775L) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x019e, code lost:
    
        r29 = r20 * 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x01a2, code lost:
    
        r29 = r10 + r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x01a6, code lost:
    
        if (r29 < r10) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01aa, code lost:
    
        if (r29 <= 253402300799999L) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01ad, code lost:
    
        r19 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x01b0, code lost:
    
        r19 = 253402300799999L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x01b3, code lost:
    
        r19 = r27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(defpackage.jw0 r35, defpackage.jz0 r36, defpackage.fw0 r37) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz0.d(jw0, jz0, fw0):void");
    }

    public static int e(int i, String str, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static Set f(fw0 fw0Var) {
        Set set = Collections.EMPTY_SET;
        int d = fw0Var.d();
        for (int i = 0; i < d; i++) {
            if ("Vary".equalsIgnoreCase(fw0Var.b(i))) {
                String e = fw0Var.e(i);
                if (set.isEmpty()) {
                    set = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : e.split(",")) {
                    set.add(str.trim());
                }
            }
        }
        return set;
    }
}
