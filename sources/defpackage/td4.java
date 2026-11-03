package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class td4 extends fe4 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td4(String str, Class cls, boolean z, boolean z2, int i) {
        super(str, cls, z, z2);
        this.f = i;
    }

    @Override // defpackage.fe4
    public void a(Iterator it, te4 te4Var) {
        switch (this.f) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean hasNext = it.hasNext();
                    String str = this.a;
                    if (!hasNext) {
                        te4Var.a(next, str);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("[");
                    sb.append(next);
                    do {
                        sb.append(',');
                        sb.append(it.next());
                    } while (it.hasNext());
                    sb.append(']');
                    te4Var.a(sb.toString(), str);
                    return;
                }
                return;
            default:
                super.a(it, te4Var);
                return;
        }
    }

    @Override // defpackage.fe4
    public void b(Object obj, te4 te4Var) {
        switch (this.f) {
            case 1:
                un3 un3Var = (un3) obj;
                if (un3Var == null) {
                    return;
                }
                sn3 sn3Var = un3Var.a.m;
                sn3Var.getClass();
                int i = 0;
                while (true) {
                    if (!(i < sn3Var.d() - sn3Var.c())) {
                        return;
                    }
                    if (i >= sn3Var.d() - sn3Var.c()) {
                        f31.b();
                        return;
                    }
                    tn3 tn3Var = sn3Var.b;
                    int c = sn3Var.c() + i;
                    i++;
                    Map.Entry entry = (Map.Entry) tn3Var.a[c];
                    if (((Set) entry.getValue()).isEmpty()) {
                        te4Var.a(null, (String) entry.getKey());
                    } else {
                        Iterator it = ((Set) entry.getValue()).iterator();
                        while (it.hasNext()) {
                            te4Var.a(it.next(), (String) entry.getKey());
                        }
                    }
                }
            default:
                super.b(obj, te4Var);
                return;
        }
    }
}
