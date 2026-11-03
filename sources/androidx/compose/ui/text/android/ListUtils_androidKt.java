package androidx.compose.ui.text.android;

import defpackage.oi0;
import defpackage.ps0;
import defpackage.ts0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ListUtils_androidKt {
    public static final <T> void fastForEach(List<? extends T> list, ps0 ps0Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ps0Var.invoke(list.get(i));
        }
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c, ps0 ps0Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.add(ps0Var.invoke(list.get(i)));
        }
        return c;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, ts0 ts0Var) {
        if (list.size() <= 1) {
            return oi0.a;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        T t = list.get(0);
        int size = list.size() - 1;
        while (i < size) {
            i++;
            T t2 = list.get(i);
            arrayList.add(ts0Var.invoke(t, t2));
            t = t2;
        }
        return arrayList;
    }
}
