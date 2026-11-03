package androidx.collection;

import defpackage.dv1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ArrayMapKt {
    public static final <K, V> ArrayMap<K, V> arrayMapOf() {
        return new ArrayMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> ArrayMap<K, V> arrayMapOf(dv1... dv1VarArr) {
        dv1VarArr.getClass();
        ArrayMap<K, V> arrayMap = (ArrayMap<K, V>) new ArrayMap(dv1VarArr.length);
        for (dv1 dv1Var : dv1VarArr) {
            arrayMap.put(dv1Var.a, dv1Var.b);
        }
        return arrayMap;
    }
}
