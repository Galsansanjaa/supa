package androidx.compose.runtime.saveable;

import defpackage.ps0;
import defpackage.re1;
import defpackage.ts0;
import defpackage.ux2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ListSaverKt {
    public static final <Original, Saveable> Saver<Original, Object> listSaver(ts0 ts0Var, ps0 ps0Var) {
        re1 re1Var = new re1(0, ts0Var);
        ps0Var.getClass();
        ux2.m(1, ps0Var);
        return SaverKt.Saver(re1Var, ps0Var);
    }

    public static final Object listSaver$lambda$0(ts0 ts0Var, SaverScope saverScope, Object obj) {
        List list = (List) ts0Var.invoke(saverScope, obj);
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            if (obj2 != null && !saverScope.canBeSaved(obj2)) {
                throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj2).toString());
            }
        }
        if (list2.isEmpty()) {
            return null;
        }
        return new ArrayList(list2);
    }
}
