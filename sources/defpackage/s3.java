package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class s3 {
    public final /* synthetic */ int a;
    public final String b;
    public final boolean c;

    public /* synthetic */ s3(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String str = this.b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.c);
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
