package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class wn3 extends xn3 {
    public final vn3 c;

    public wn3(se4 se4Var, int i, vn3 vn3Var) {
        super(se4Var, i);
        this.c = vn3Var;
        StringBuilder sb = new StringBuilder("%");
        se4Var.d(sb);
        sb.append(true != se4Var.c() ? 't' : 'T');
        sb.append(vn3Var.a);
    }

    @Override // defpackage.xn3
    public final void a(id4 id4Var, Object obj) {
        char c = this.c.a;
        StringBuilder sb = (StringBuilder) id4Var.g;
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(c).length() + 2);
            sb2.append("%t");
            sb2.append(c);
            id4.f(sb, obj, sb2.toString());
            return;
        }
        StringBuilder sb3 = new StringBuilder("%");
        se4 se4Var = this.b;
        se4Var.d(sb3);
        sb3.append(true != se4Var.c() ? 't' : 'T');
        sb3.append(c);
        sb.append(String.format(ue4.a, sb3.toString(), obj));
    }
}
