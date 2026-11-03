package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class hz1 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(gz1.a, 0);
        hashMap.put(gz1.b, 1);
        hashMap.put(gz1.m, 2);
        for (gz1 gz1Var : hashMap.keySet()) {
            a.append(((Integer) b.get(gz1Var)).intValue(), gz1Var);
        }
    }

    public static int a(gz1 gz1Var) {
        Integer num = (Integer) b.get(gz1Var);
        if (num != null) {
            return num.intValue();
        }
        v5.r(gz1Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static gz1 b(int i) {
        gz1 gz1Var = (gz1) a.get(i);
        if (gz1Var != null) {
            return gz1Var;
        }
        v5.m(lt.w(i, "Unknown Priority for value "));
        return null;
    }
}
