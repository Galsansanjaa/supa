package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class o52 extends r52 {
    public static final o52 b = new o52(0);
    public static final o52 c = new o52(1);
    public static final o52 d = new o52(2);
    public final /* synthetic */ int a;

    public /* synthetic */ o52(int i) {
        this.a = i;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AlreadyRegistered";
            case 1:
                return "ConnectionError";
            default:
                return "Success";
        }
    }
}
