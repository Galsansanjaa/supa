package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class op3 implements Cloneable {
    public final qp3 a;
    public qp3 b;

    public op3(qp3 qp3Var) {
        this.a = qp3Var;
        if (qp3Var.e()) {
            v5.m("Default instance must be immutable.");
            throw null;
        }
        this.b = qp3Var.g();
    }

    public static void a(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String sb2 = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(sb2);
            }
            list.remove(size2);
        }
    }

    public static void b(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof fq3) {
            List a = ((fq3) iterable).a();
            fq3 fq3Var = (fq3) list;
            int size = list.size();
            for (Object obj : a) {
                if (obj == null) {
                    int size2 = fq3Var.size() - size;
                    StringBuilder sb = new StringBuilder(String.valueOf(size2).length() + 26);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    int size3 = fq3Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            hu2.q(sb2);
                            return;
                        }
                        fq3Var.remove(size3);
                    }
                } else if (obj instanceof vo3) {
                    fq3Var.l();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    vo3.m(0, bArr.length, bArr);
                    fq3Var.l();
                } else {
                    fq3Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof vq3) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof xq3) {
                xq3 xq3Var = (xq3) list;
                int i = xq3Var.m + size4;
                int length = xq3Var.b.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        xq3Var.b = Arrays.copyOf(xq3Var.b, length);
                    } else {
                        xq3Var.b = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    a(size5, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i2 = 0; i2 < size6; i2++) {
            Object obj3 = list2.get(i2);
            if (obj3 == null) {
                a(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    public final void c() {
        if (this.b.e()) {
            return;
        }
        qp3 g = this.a.g();
        wq3.c.a(g.getClass()).c(g, this.b);
        this.b = g;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final op3 clone() {
        op3 op3Var = (op3) this.a.q(5);
        boolean e = this.b.e();
        qp3 qp3Var = this.b;
        if (e) {
            qp3Var.getClass();
            wq3.c.a(qp3Var.getClass()).f(qp3Var);
            qp3Var.f();
            qp3Var = this.b;
        }
        op3Var.b = qp3Var;
        return op3Var;
    }

    public final qp3 e() {
        boolean e = this.b.e();
        qp3 qp3Var = this.b;
        if (e) {
            qp3Var.getClass();
            wq3.c.a(qp3Var.getClass()).f(qp3Var);
            qp3Var.f();
            qp3Var = this.b;
        }
        qp3Var.getClass();
        if (qp3.o(qp3Var, true)) {
            return qp3Var;
        }
        throw new fr3();
    }

    public final void f(qp3 qp3Var) {
        qp3 qp3Var2 = this.a;
        if (qp3Var2.equals(qp3Var)) {
            return;
        }
        if (!this.b.e()) {
            qp3 g = qp3Var2.g();
            wq3.c.a(g.getClass()).c(g, this.b);
            this.b = g;
        }
        qp3 qp3Var3 = this.b;
        wq3.c.a(qp3Var3.getClass()).c(qp3Var3, qp3Var);
    }

    public final void g(byte[] bArr, int i, ip3 ip3Var) {
        if (!this.b.e()) {
            qp3 g = this.a.g();
            wq3.c.a(g.getClass()).c(g, this.b);
            this.b = g;
        }
        try {
            wq3.c.a(this.b.getClass()).g(this.b, bArr, 0, i, new po3(ip3Var));
        } catch (dq3 e) {
            throw e;
        } catch (IOException e2) {
            ak1.s("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            wo3.c("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
