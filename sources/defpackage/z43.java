package defpackage;

import com.uptodown.UptodownApp;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class z43 {
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public long f;
    public String g;
    public ArrayList h;
    public String i;

    public final String a() {
        String str = this.c;
        if (str == null) {
            return null;
        }
        e13 e13Var = UptodownApp.J;
        return wa2.s(str, UptodownApp.L, ":webp");
    }

    public final String toString() {
        long j = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        StringBuilder sb = new StringBuilder("UserListItem(programId=");
        sb.append(j);
        sb.append(", name=");
        sb.append(str);
        lt.L(sb, ", icon=", str2, ", packagename=", str3);
        sb.append(")");
        return sb.toString();
    }
}
