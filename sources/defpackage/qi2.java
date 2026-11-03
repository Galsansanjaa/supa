package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class qi2 extends Thread {
    public int a;
    public ri2 b;

    public final void a() {
        Field declaredField;
        ri2 ri2Var = this.b;
        try {
            Class<?> cls = ri2Var.e.getClass();
            try {
                declaredField = cls.getDeclaredField("pid");
            } catch (NoSuchFieldException unused) {
                declaredField = cls.getDeclaredField("id");
            }
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(ri2Var.e)).intValue();
            ri2Var.h.write("(echo -17 > /proc/" + intValue + "/oom_adj) &> /dev/null\n");
            ri2Var.h.write("(echo -17 > /proc/$$/oom_adj) &> /dev/null\n");
            ri2Var.h.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ri2 ri2Var = this.b;
        try {
            ri2Var.h.write("echo Started\n");
            ri2Var.h.flush();
            while (true) {
                String readLine = ri2Var.f.readLine();
                if (readLine == null) {
                    throw new EOFException();
                }
                if (!"".equals(readLine)) {
                    if ("Started".equals(readLine)) {
                        this.a = 1;
                        a();
                        return;
                    }
                    ri2Var.d = "unknown error occurred.";
                }
            }
        } catch (IOException e) {
            this.a = -42;
            if (e.getMessage() != null) {
                ri2Var.d = e.getMessage();
            } else {
                ri2Var.d = "RootAccess denied?.";
            }
        }
    }
}
