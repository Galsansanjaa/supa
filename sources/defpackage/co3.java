package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class co3 {
    public static final String[] a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    public static final eo3 b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [eo3] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    static {
        ?? obj;
        int i = 0;
        while (true) {
            if (i >= 2) {
                obj = new Object();
                break;
            }
            obj = 0;
            try {
                obj = (eo3) Class.forName(a[i]).asSubclass(eo3.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (obj != 0) {
                break;
            } else {
                i++;
            }
        }
        b = obj;
    }
}
