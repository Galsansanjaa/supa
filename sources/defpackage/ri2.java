package defpackage;

import androidx.compose.ui.autofill.AutofillUtils_androidKt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ri2 {
    public static ri2 s;
    public final int a;
    public final int b;
    public final int c;
    public final Process e;
    public final BufferedReader f;
    public final BufferedReader g;
    public final OutputStreamWriter h;
    public String d = "";
    public final ArrayList i = new ArrayList();
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public final int m = AutofillUtils_androidKt.MAX_AUTOFILL_TEXT_LENGTH;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public boolean r = false;

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Thread, qi2] */
    public ri2(int i) {
        String str;
        this.a = 25000;
        this.b = 0;
        this.c = 1;
        oi2 oi2Var = new oi2(this, 0);
        oi2 oi2Var2 = new oi2(this, 1);
        dn3.L("Starting shell: su");
        switch (1) {
            case 1:
                str = "normal";
                break;
            case 2:
                str = "u:r:shell:s0";
                break;
            case 3:
                str = "u:r:system_server:s0";
                break;
            case 4:
                str = "u:r:system_app:s0";
                break;
            case 5:
                str = "u:r:platform_app:s0";
                break;
            case 6:
                str = "u:r:untrusted_app:s0";
                break;
            case 7:
                str = "u:r:recovery:s0";
                break;
            default:
                throw null;
        }
        dn3.L("Context: ".concat(str));
        dn3.L("Timeout: " + i);
        this.b = 2;
        i = i <= 0 ? 25000 : i;
        this.a = i;
        this.c = 1;
        Process exec = Runtime.getRuntime().exec("su");
        this.e = exec;
        this.f = new BufferedReader(new InputStreamReader(exec.getInputStream(), "UTF-8"));
        this.g = new BufferedReader(new InputStreamReader(exec.getErrorStream(), "UTF-8"));
        this.h = new OutputStreamWriter(exec.getOutputStream(), "UTF-8");
        ?? thread = new Thread();
        thread.a = -911;
        thread.b = this;
        thread.start();
        try {
            thread.join(i);
            int i2 = thread.a;
            if (i2 == -911) {
                try {
                    exec.destroy();
                } catch (Exception unused) {
                }
                b(this.f);
                b(this.g);
                c(this.h);
                throw new TimeoutException(this.d);
            }
            if (i2 == -42) {
                try {
                    exec.destroy();
                } catch (Exception unused2) {
                }
                b(this.f);
                b(this.g);
                c(this.h);
                throw new Exception("Root Access Denied");
            }
            Thread thread2 = new Thread(oi2Var, "Shell Input");
            thread2.setPriority(5);
            thread2.start();
            Thread thread3 = new Thread(oi2Var2, "Shell Output");
            thread3.setPriority(5);
            thread3.start();
        } catch (InterruptedException unused3) {
            thread.interrupt();
            Thread.currentThread().interrupt();
            throw new TimeoutException();
        }
    }

    public static void b(BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void c(OutputStreamWriter outputStreamWriter) {
        if (outputStreamWriter != null) {
            try {
                outputStreamWriter.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void d() {
        dn3.L("Request to close root shell!");
        ri2 ri2Var = s;
        if (ri2Var == null) {
            return;
        }
        dn3.L("Request to close shell!");
        int i = 0;
        while (ri2Var.k) {
            dn3.L("Waiting on shell to finish executing before closing...");
            i++;
            if (i > 10000) {
                break;
            }
        }
        synchronized (ri2Var.i) {
            ri2Var.j = true;
            new pi2(ri2Var, 0).start();
        }
        dn3.L("Shell Closed!");
        if (ri2Var == s) {
            s = null;
        }
    }

    public static ri2 e(int i) {
        int i2;
        ri2 ri2Var = s;
        if (ri2Var == null) {
            dn3.L("Starting Root Shell!");
            int i3 = 0;
            while (s == null) {
                try {
                    dn3.L("Trying to open Root Shell, attempt #" + i3);
                    s = new ri2(i);
                } catch (ba2 e) {
                    i2 = i3 + 1;
                    if (i3 >= 3) {
                        dn3.L("RootDeniedException, could not start shell");
                        throw e;
                    }
                    i3 = i2;
                } catch (IOException e2) {
                    i2 = i3 + 1;
                    if (i3 >= 3) {
                        dn3.L("IOException, could not start shell");
                        throw e2;
                    }
                    i3 = i2;
                } catch (TimeoutException e3) {
                    i2 = i3 + 1;
                    if (i3 >= 3) {
                        dn3.L("TimeoutException, could not start shell");
                        throw e3;
                    }
                    i3 = i2;
                }
            }
        } else if (ri2Var.c != 1) {
            try {
                dn3.L("Context is different than open shell, switching context... " + wa2.B(s.c) + " VS " + wa2.B(1));
                s.f();
            } catch (ba2 | IOException | TimeoutException unused) {
            }
        } else {
            dn3.L("Using Existing Root Shell!");
        }
        return s;
    }

    public final void a() {
        this.r = true;
        int i = this.m;
        int abs = Math.abs(i - (i / 4));
        dn3.L("Cleaning up: " + abs);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= abs) {
                this.n = arrayList.size() - 1;
                this.o = arrayList.size() - 1;
                this.r = false;
                return;
            }
            arrayList.remove(0);
            i2++;
        }
    }

    public final void f() {
        if (this.b != 2) {
            dn3.L("Can only switch context on a root shell!");
            return;
        }
        try {
            dn3.L("Request to close root shell!");
            ri2 ri2Var = s;
            if (ri2Var != null) {
                dn3.L("Request to close shell!");
                int i = 0;
                while (ri2Var.k) {
                    dn3.L("Waiting on shell to finish executing before closing...");
                    i++;
                    if (i > 10000) {
                        break;
                    }
                }
                synchronized (ri2Var.i) {
                    ri2Var.j = true;
                    new pi2(ri2Var, 0).start();
                }
                dn3.L("Shell Closed!");
                if (ri2Var == s) {
                    s = null;
                }
            }
        } catch (Exception unused) {
            dn3.L("Problem closing shell while trying to switch context...");
        }
        e(this.a);
    }
}
