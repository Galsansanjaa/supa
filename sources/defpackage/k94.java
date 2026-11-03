package defpackage;

import android.content.Context;
import java.util.logging.Level;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class k94 implements mn2 {
    public final String a;
    public final we1 b;
    public volatile int m = -1;
    public s83 n;

    public k94(String str, we1 we1Var) {
        this.a = str;
        this.b = we1Var;
    }

    public abstract Object a();

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:10:0x0012, B:12:0x0017, B:14:0x0027, B:15:0x0033, B:16:0x0040, B:18:0x004c, B:20:0x005e, B:22:0x006c, B:28:0x008d, B:30:0x00a3, B:32:0x00ad, B:33:0x00b9, B:34:0x00bd, B:36:0x00c5, B:38:0x00d3, B:40:0x00db, B:41:0x00f5, B:54:0x0108, B:57:0x0110, B:43:0x011b, B:47:0x0126, B:49:0x012c, B:50:0x0131, B:60:0x0095, B:61:0x0081, B:62:0x0079, B:64:0x0133), top: B:9:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:10:0x0012, B:12:0x0017, B:14:0x0027, B:15:0x0033, B:16:0x0040, B:18:0x004c, B:20:0x005e, B:22:0x006c, B:28:0x008d, B:30:0x00a3, B:32:0x00ad, B:33:0x00b9, B:34:0x00bd, B:36:0x00c5, B:38:0x00d3, B:40:0x00db, B:41:0x00f5, B:54:0x0108, B:57:0x0110, B:43:0x011b, B:47:0x0126, B:49:0x012c, B:50:0x0131, B:60:0x0095, B:61:0x0081, B:62:0x0079, B:64:0x0133), top: B:9:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:10:0x0012, B:12:0x0017, B:14:0x0027, B:15:0x0033, B:16:0x0040, B:18:0x004c, B:20:0x005e, B:22:0x006c, B:28:0x008d, B:30:0x00a3, B:32:0x00ad, B:33:0x00b9, B:34:0x00bd, B:36:0x00c5, B:38:0x00d3, B:40:0x00db, B:41:0x00f5, B:54:0x0108, B:57:0x0110, B:43:0x011b, B:47:0x0126, B:49:0x012c, B:50:0x0131, B:60:0x0095, B:61:0x0081, B:62:0x0079, B:64:0x0133), top: B:9:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.o64 r10) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k94.b(o64):java.lang.Object");
    }

    public abstract Object c(String str);

    public abstract Object d(Object obj);

    public abstract Object e();

    public abstract void f(Object obj);

    @Override // defpackage.mn2
    public final Object get() {
        o64 o64Var;
        if (t61.n == null) {
            Object obj = o64.j;
            t61.n = new bv0(6);
        }
        Context context = (Context) o64.k.get();
        if (context == null) {
            t61.M();
            hu2.h("Must call PhenotypeContext.setContext() first");
            return null;
        }
        o64 o64Var2 = o64.l;
        if (o64Var2 == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                applicationContext.getClass();
                Context applicationContext2 = applicationContext.getApplicationContext();
                applicationContext2.getClass();
                Class<?> cls = applicationContext2.getClass();
                new StringBuilder(String.valueOf(cls).length() + 72);
                cls.toString();
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
            } catch (IllegalStateException unused) {
                synchronized (o64.j) {
                    try {
                        if (o64.l != null) {
                            o64Var = o64.l;
                        } else {
                            o64Var = (o64) new j40(applicationContext, 1).get();
                            o64.l = o64Var;
                            m60.S(Level.CONFIG, o64Var.a(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                        o64Var2 = o64Var;
                    } finally {
                    }
                }
            }
        }
        Object b = b(o64Var2);
        b.getClass();
        return b;
    }
}
