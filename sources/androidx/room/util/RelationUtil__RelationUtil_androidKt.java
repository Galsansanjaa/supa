package androidx.room.util;

import androidx.collection.ArrayMap;
import defpackage.ps0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class RelationUtil__RelationUtil_androidKt {
    public static final <K, V> void recursiveFetchArrayMap(ArrayMap<K, V> arrayMap, boolean z, ps0 ps0Var) {
        arrayMap.getClass();
        ps0Var.getClass();
        ArrayMap arrayMap2 = new ArrayMap(999);
        int size = arrayMap.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (z) {
                arrayMap2.put(arrayMap.keyAt(i), arrayMap.valueAt(i));
            } else {
                arrayMap2.put(arrayMap.keyAt(i), null);
            }
            i++;
            i2++;
            if (i2 == 999) {
                ps0Var.invoke(arrayMap2);
                if (!z) {
                    arrayMap.putAll((Map) arrayMap2);
                }
                arrayMap2.clear();
                i2 = 0;
            }
        }
        if (i2 > 0) {
            ps0Var.invoke(arrayMap2);
            if (z) {
                return;
            }
            arrayMap.putAll((Map) arrayMap2);
        }
    }

    public static final <K, V> void recursiveFetchHashMap(HashMap<K, V> hashMap, boolean z, ps0 ps0Var) {
        int i;
        hashMap.getClass();
        ps0Var.getClass();
        HashMap hashMap2 = new HashMap(999);
        loop0: while (true) {
            i = 0;
            for (K k : hashMap.keySet()) {
                k.getClass();
                if (z) {
                    hashMap2.put(k, hashMap.get(k));
                } else {
                    hashMap2.put(k, null);
                }
                i++;
                if (i == 999) {
                    ps0Var.invoke(hashMap2);
                    if (!z) {
                        hashMap.putAll(hashMap2);
                    }
                    hashMap2.clear();
                }
            }
            break loop0;
        }
        if (i > 0) {
            ps0Var.invoke(hashMap2);
            if (z) {
                return;
            }
            hashMap.putAll(hashMap2);
        }
    }
}
