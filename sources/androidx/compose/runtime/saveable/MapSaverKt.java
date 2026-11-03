package androidx.compose.runtime.saveable;

import defpackage.hu2;
import defpackage.ps0;
import defpackage.re1;
import defpackage.ts0;
import defpackage.y4;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MapSaverKt {
    public static final <T> Saver<T, Object> mapSaver(ts0 ts0Var, ps0 ps0Var) {
        return ListSaverKt.listSaver(new re1(1, ts0Var), new y4(ps0Var, 7));
    }

    public static final List mapSaver$lambda$0(ts0 ts0Var, SaverScope saverScope, Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) ts0Var.invoke(saverScope, obj)).entrySet()) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }

    public static final Object mapSaver$lambda$1(ps0 ps0Var, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.size() % 2 != 0) {
            hu2.h("non-zero remainder");
            return null;
        }
        for (int i = 0; i < list.size(); i += 2) {
            Object obj = list.get(i);
            obj.getClass();
            linkedHashMap.put((String) obj, list.get(i + 1));
        }
        return ps0Var.invoke(linkedHashMap);
    }
}
