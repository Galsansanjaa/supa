package androidx.room.util;

import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import defpackage.ps0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class RelationUtil {
    public static final int MAX_BIND_PARAMETER_CNT = 999;

    public static final <K, V> void recursiveFetchArrayMap(ArrayMap<K, V> arrayMap, boolean z, ps0 ps0Var) {
        RelationUtil__RelationUtil_androidKt.recursiveFetchArrayMap(arrayMap, z, ps0Var);
    }

    public static final <K, V> void recursiveFetchHashMap(HashMap<K, V> hashMap, boolean z, ps0 ps0Var) {
        RelationUtil__RelationUtil_androidKt.recursiveFetchHashMap(hashMap, z, ps0Var);
    }

    public static final <V> void recursiveFetchLongSparseArray(LongSparseArray<V> longSparseArray, boolean z, ps0 ps0Var) {
        RelationUtil__RelationUtilKt.recursiveFetchLongSparseArray(longSparseArray, z, ps0Var);
    }

    public static final <K, V> void recursiveFetchMap(Map<K, V> map, boolean z, ps0 ps0Var) {
        RelationUtil__RelationUtilKt.recursiveFetchMap(map, z, ps0Var);
    }
}
