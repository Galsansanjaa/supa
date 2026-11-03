package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class rx extends RuntimeException {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rx(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rx(String str, int i) {
        super(str);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rx(Throwable th, int i) {
        super(th);
        this.a = i;
    }

    private final synchronized Throwable a() {
        return this;
    }

    public static rx b(int i, int i2, String str, String str2) {
        return new rx(d(i, i2, str, str2), 7);
    }

    public static rx c(int i, String str, String str2) {
        return new rx(d(i, i + 1, str, str2), 7);
    }

    public static String d(int i, int i2, String str, String str2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder v = sg3.v(str, ": ");
        if (i > 8) {
            v.append("...");
            v.append((CharSequence) str2, i - 5, i);
        } else {
            v.append((CharSequence) str2, 0, i);
        }
        v.append('[');
        v.append(str2.substring(i, i2));
        v.append(']');
        if (str2.length() - i2 > 8) {
            v.append((CharSequence) str2, i2, i2 + 5);
            v.append("...");
        } else {
            v.append((CharSequence) str2, i2, str2.length());
        }
        return v.toString();
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.a) {
            case 7:
                a();
                return this;
            default:
                return super.fillInStackTrace();
        }
    }
}
