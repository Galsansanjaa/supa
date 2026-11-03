package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class a32 {
    public static final a32 d;
    public final /* synthetic */ int a;
    public final int b;
    public final int c;

    static {
        int i = 0;
        d = new a32(i, i, 0);
    }

    public a32(int i) {
        this.a = 1;
        this.b = 2;
        this.c = i;
    }

    public /* synthetic */ a32(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder(a32.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.b);
                sb.append(", length = ");
                return lt.A(sb, "]", this.c);
            default:
                return super.toString();
        }
    }
}
