package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class fi1 extends t61 {
    public static Object O(Object obj, Map map) {
        map.getClass();
        if (map instanceof ei1) {
            return ((ei1) map).d();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int P(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map Q(dv1... dv1VarArr) {
        if (dv1VarArr.length <= 0) {
            return pi0.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P(dv1VarArr.length));
        S(linkedHashMap, dv1VarArr);
        return linkedHashMap;
    }

    public static void R(Map map, Iterable iterable) {
        map.getClass();
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            dv1 dv1Var = (dv1) it.next();
            map.put(dv1Var.a, dv1Var.b);
        }
    }

    public static void S(Map map, dv1[] dv1VarArr) {
        map.getClass();
        dv1VarArr.getClass();
        for (dv1 dv1Var : dv1VarArr) {
            map.put(dv1Var.a, dv1Var.b);
        }
    }

    public static Map T(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(P(collection.size()));
                    R(linkedHashMap, iterable);
                    return linkedHashMap;
                }
                dv1 dv1Var = (dv1) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                dv1Var.getClass();
                Map singletonMap = Collections.singletonMap(dv1Var.a, dv1Var.b);
                singletonMap.getClass();
                return singletonMap;
            }
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            R(linkedHashMap2, iterable);
            int size2 = linkedHashMap2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashMap2;
                }
                Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                Map singletonMap2 = Collections.singletonMap(entry.getKey(), entry.getValue());
                singletonMap2.getClass();
                return singletonMap2;
            }
        }
        return pi0.a;
    }

    public static Map U(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return pi0.a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static Map V(dv1[] dv1VarArr) {
        dv1VarArr.getClass();
        int length = dv1VarArr.length;
        if (length == 0) {
            return pi0.a;
        }
        if (length != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(P(dv1VarArr.length));
            S(linkedHashMap, dv1VarArr);
            return linkedHashMap;
        }
        dv1 dv1Var = dv1VarArr[0];
        dv1Var.getClass();
        Map singletonMap = Collections.singletonMap(dv1Var.a, dv1Var.b);
        singletonMap.getClass();
        return singletonMap;
    }
}
