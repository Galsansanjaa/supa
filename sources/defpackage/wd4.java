package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class wd4 {
    public static final wd4 d = new wd4(true, null, null);
    public boolean a;
    public final Object b;
    public Serializable c;

    public wd4() {
        this.b = new Object();
    }

    public wd4(boolean z, String str, Exception exc) {
        this.a = z;
        this.b = str;
        this.c = exc;
    }

    public static wd4 d(String str) {
        return new wd4(false, str, null);
    }

    public static wd4 e(String str, Exception exc) {
        return new wd4(false, str, exc);
    }

    public String a() {
        return (String) this.b;
    }

    public void b(ya4 ya4Var) {
        synchronized (this.b) {
            try {
                ArrayDeque arrayDeque = (ArrayDeque) this.c;
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.c = arrayDeque;
                }
                arrayDeque.add(ya4Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(zc4 zc4Var) {
        ya4 ya4Var;
        synchronized (this.b) {
            if (((ArrayDeque) this.c) != null && !this.a) {
                this.a = true;
                while (true) {
                    synchronized (this.b) {
                        try {
                            ya4Var = (ya4) ((ArrayDeque) this.c).poll();
                            if (ya4Var == null) {
                                this.a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    ya4Var.a(zc4Var);
                }
            }
        }
    }
}
