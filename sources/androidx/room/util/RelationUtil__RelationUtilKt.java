package androidx.room.util;

import androidx.collection.LongSparseArray;
import defpackage.ps0;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
final /* synthetic */ class RelationUtil__RelationUtilKt {
    public static final <V> void recursiveFetchLongSparseArray(LongSparseArray<V> longSparseArray, boolean z, ps0 ps0Var) {
        longSparseArray.getClass();
        ps0Var.getClass();
        LongSparseArray<? extends V> longSparseArray2 = new LongSparseArray<>(999);
        int size = longSparseArray.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (z) {
                longSparseArray2.put(longSparseArray.keyAt(i), longSparseArray.valueAt(i));
            } else {
                longSparseArray2.put(longSparseArray.keyAt(i), null);
            }
            i++;
            i2++;
            if (i2 == 999) {
                ps0Var.invoke(longSparseArray2);
                if (!z) {
                    longSparseArray.putAll(longSparseArray2);
                }
                longSparseArray2.clear();
                i2 = 0;
            }
        }
        if (i2 > 0) {
            ps0Var.invoke(longSparseArray2);
            if (z) {
                return;
            }
            longSparseArray.putAll(longSparseArray2);
        }
    }

    public static final <K, V> void recursiveFetchMap(Map<K, V> map, boolean z, ps0 ps0Var) {
        int i;
        map.getClass();
        ps0Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        loop0: while (true) {
            i = 0;
            for (K k : map.keySet()) {
                if (z) {
                    linkedHashMap.put(k, map.get(k));
                } else {
                    linkedHashMap.put(k, null);
                }
                i++;
                if (i == 999) {
                    ps0Var.invoke(linkedHashMap);
                    if (!z) {
                        map.putAll(linkedHashMap);
                    }
                    linkedHashMap.clear();
                }
            }
            break loop0;
        }
        if (i > 0) {
            ps0Var.invoke(linkedHashMap);
            if (z) {
                return;
            }
            map.putAll(linkedHashMap);
        }
    }
}
