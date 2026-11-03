package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class qf2 extends rf2 {
    public static nf2 U(ps0 ps0Var, Object obj) {
        ps0Var.getClass();
        return obj == null ? qi0.a : new bd0(new wp1(obj, 26), ps0Var);
    }

    public static String V(nf2 nf2Var, String str) {
        nf2Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : nf2Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            od4.f(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static List W(nf2 nf2Var) {
        nf2Var.getClass();
        Iterator it = nf2Var.iterator();
        if (!it.hasNext()) {
            return oi0.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return nb0.C(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
