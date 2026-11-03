package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Closeable;
import java.util.UUID;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class tc4 implements Closeable {
    public final tc4 a = null;
    public final UUID b;
    public final String m;
    public final String n;
    public Thread o;

    public tc4(String str, UUID uuid, String str2, jd4 jd4Var) {
        this.n = str;
        this.b = uuid;
        this.m = str2;
        jd4Var.getClass();
        this.o = Thread.currentThread();
    }

    public static String a(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        jd4 b = wc4.b();
        tc4 tc4Var = b.b;
        String str = this.n;
        if (tc4Var == null) {
            throw new IllegalStateException(sg3.t(new StringBuilder(str.length() + TypedValues.TYPE_TARGET), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == tc4Var) {
            wc4.a(b, tc4Var.a);
            this.o = null;
            return;
        }
        String str2 = tc4Var.n;
        StringBuilder sb = new StringBuilder(str.length() + 79 + str2.length() + 1);
        lt.L(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
        sb.append(".");
        throw new IllegalStateException(sb.toString());
    }

    public abstract fd4 d();

    public abstract fd4 e();

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b3, code lost:
    
        r4 = r4.d;
        r10 = java.lang.Integer.valueOf(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bd, code lost:
    
        if (r4.containsKey(r10) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bf, code lost:
    
        ((defpackage.hd4) r1.g).d.put(r10, new defpackage.hd4(r8, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cd, code lost:
    
        if (r15 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00cf, code lost:
    
        r15.c = (defpackage.hd4) r1.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e1, code lost:
    
        if (r15 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e3, code lost:
    
        r15.c = (defpackage.hd4) r1.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e9, code lost:
    
        r1.b = r8;
        r1.c++;
        r1.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f1, code lost:
    
        if (r1.e(r13, r14, r15, (r15 + r14) - r13) != false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d6 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, wh0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc4.toString():java.lang.String");
    }
}
