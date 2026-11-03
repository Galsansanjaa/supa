package defpackage;

import androidx.credentials.provider.CredentialEntry;
import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class x91 implements Closeable, Flushable {
    public static final Pattern v = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] w = new String[128];
    public static final String[] x;
    public final Writer a;
    public int[] b;
    public int m;
    public sr0 n;
    public String o;
    public String p;
    public boolean q;
    public int r;
    public boolean s;
    public String t;
    public boolean u;

    static {
        for (int i = 0; i <= 31; i++) {
            w[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = w;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        x = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public x91(Writer writer) {
        int[] iArr = new int[32];
        this.b = iArr;
        this.m = 0;
        if (iArr.length == 0) {
            iArr = Arrays.copyOf(iArr, 0);
            this.b = iArr;
        }
        int i = this.m;
        this.m = i + 1;
        iArr[i] = 6;
        this.r = 2;
        this.u = true;
        Objects.requireNonNull(writer, "out == null");
        this.a = writer;
        w(sr0.d);
    }

    public void A(Number number) {
        if (number == null) {
            q();
            return;
        }
        D();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                if (this.r != 1) {
                    v5.m("Numeric values must be finite, but was ".concat(obj));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !v.matcher(obj).matches()) {
                i70.m("String created by ", cls, " is not a valid JSON number: ", obj);
                return;
            }
        }
        a();
        this.a.append((CharSequence) obj);
    }

    public void B(String str) {
        if (str == null) {
            q();
            return;
        }
        D();
        a();
        y(str);
    }

    public void C(boolean z) {
        D();
        a();
        this.a.write(z ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING);
    }

    public final void D() {
        if (this.t != null) {
            int v2 = v();
            if (v2 == 5) {
                this.a.write(this.p);
            } else if (v2 != 3) {
                hu2.h("Nesting problem.");
                return;
            }
            n();
            this.b[this.m - 1] = 4;
            y(this.t);
            this.t = null;
        }
    }

    public final void a() {
        int v2 = v();
        if (v2 == 1) {
            this.b[this.m - 1] = 2;
            n();
            return;
        }
        Writer writer = this.a;
        if (v2 == 2) {
            writer.append((CharSequence) this.p);
            n();
            return;
        }
        if (v2 == 4) {
            writer.append((CharSequence) this.o);
            this.b[this.m - 1] = 5;
            return;
        }
        if (v2 != 6) {
            if (v2 != 7) {
                hu2.h("Nesting problem.");
                return;
            } else if (this.r != 1) {
                hu2.h("JSON must have only one top-level value.");
                return;
            }
        }
        this.b[this.m - 1] = 7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
        int i = this.m;
        if (i > 1 || (i == 1 && this.b[i - 1] != 7)) {
            hu2.p("Incomplete document");
        } else {
            this.m = 0;
        }
    }

    public void d() {
        D();
        a();
        int i = this.m;
        int[] iArr = this.b;
        if (i == iArr.length) {
            iArr = Arrays.copyOf(iArr, i * 2);
            this.b = iArr;
        }
        int i2 = this.m;
        this.m = i2 + 1;
        iArr[i2] = 1;
        this.a.write(91);
    }

    public void e() {
        D();
        a();
        int i = this.m;
        int[] iArr = this.b;
        if (i == iArr.length) {
            iArr = Arrays.copyOf(iArr, i * 2);
            this.b = iArr;
        }
        int i2 = this.m;
        this.m = i2 + 1;
        iArr[i2] = 3;
        this.a.write(123);
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.m != 0) {
            this.a.flush();
        } else {
            hu2.h("JsonWriter is closed.");
        }
    }

    public final void g(char c, int i, int i2) {
        int v2 = v();
        if (v2 != i2 && v2 != i) {
            hu2.h("Nesting problem.");
            return;
        }
        if (this.t != null) {
            ak1.n(this.t, "Dangling name: ");
            return;
        }
        this.m--;
        if (v2 == i2) {
            n();
        }
        this.a.write(c);
    }

    public void j() {
        g(']', 1, 2);
    }

    public void l() {
        g('}', 3, 5);
    }

    public void m(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.t != null) {
            hu2.h("Already wrote a name, expecting a value.");
            return;
        }
        int v2 = v();
        if (v2 == 3 || v2 == 5) {
            this.t = str;
        } else {
            hu2.h("Please begin an object before writing a name.");
        }
    }

    public final void n() {
        if (this.q) {
            return;
        }
        String str = this.n.a;
        Writer writer = this.a;
        writer.write(str);
        int i = this.m;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.n.b);
        }
    }

    public x91 q() {
        if (this.t != null) {
            if (!this.u) {
                this.t = null;
                return this;
            }
            D();
        }
        a();
        this.a.write("null");
        return this;
    }

    public final int v() {
        int i = this.m;
        if (i != 0) {
            return this.b[i - 1];
        }
        hu2.h("JsonWriter is closed.");
        return 0;
    }

    public final void w(sr0 sr0Var) {
        Objects.requireNonNull(sr0Var);
        this.n = sr0Var;
        this.p = ",";
        if (sr0Var.c) {
            this.o = ": ";
            if (sr0Var.a.isEmpty()) {
                this.p = ", ";
            }
        } else {
            this.o = ":";
        }
        this.q = this.n.a.isEmpty() && this.n.b.isEmpty();
    }

    public final void x(int i) {
        if (i == 0) {
            throw null;
        }
        this.r = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = r7.s
            if (r0 == 0) goto L7
            java.lang.String[] r0 = defpackage.x91.x
            goto L9
        L7:
            java.lang.String[] r0 = defpackage.x91.w
        L9:
            java.io.Writer r7 = r7.a
            r1 = 34
            r7.write(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r2) goto L41
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L3e
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L3e
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L39
            int r6 = r3 - r4
            r7.write(r8, r4, r6)
        L39:
            r7.write(r5)
            int r4 = r3 + 1
        L3e:
            int r3 = r3 + 1
            goto L16
        L41:
            if (r4 >= r2) goto L47
            int r2 = r2 - r4
            r7.write(r8, r4, r2)
        L47:
            r7.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x91.y(java.lang.String):void");
    }

    public void z(long j) {
        D();
        a();
        this.a.write(Long.toString(j));
    }
}
