package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import defpackage.dv1;
import defpackage.j20;
import defpackage.jp0;
import defpackage.os0;
import defpackage.sa1;
import defpackage.ts0;
import defpackage.xl2;
import java.util.Collection;

/* loaded from: classes.dex */
public final class SnapshotStateKt {
    public static final <T extends R, R> State<R> collectAsState(jp0 jp0Var, R r, j20 j20Var, Composer composer, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(jp0Var, r, j20Var, composer, i, i2);
    }

    public static final <T> State<T> collectAsState(xl2 xl2Var, j20 j20Var, Composer composer, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(xl2Var, j20Var, composer, i, i2);
    }

    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        return SnapshotStateKt__DerivedStateKt.derivedStateObservers();
    }

    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, os0 os0Var) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(snapshotMutationPolicy, os0Var);
    }

    public static final <T> State<T> derivedStateOf(os0 os0Var) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(os0Var);
    }

    public static final <T> T getValue(State<? extends T> state, Object obj, sa1 sa1Var) {
        return (T) SnapshotStateKt__SnapshotStateKt.getValue(state, obj, sa1Var);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf();
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf(tArr);
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf();
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(dv1... dv1VarArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf(dv1VarArr);
    }

    public static final <T> MutableState<T> mutableStateOf(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf(t, snapshotMutationPolicy);
    }

    public static /* synthetic */ MutableState mutableStateOf$default(Object obj, SnapshotMutationPolicy snapshotMutationPolicy, int i, Object obj2) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, snapshotMutationPolicy, i, obj2);
    }

    public static final <T> SnapshotStateSet<T> mutableStateSetOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateSetOf();
    }

    public static final <T> SnapshotStateSet<T> mutableStateSetOf(T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateSetOf(tArr);
    }

    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy();
    }

    public static final <R> void observeDerivedStateRecalculations(DerivedStateObserver derivedStateObserver, os0 os0Var) {
        SnapshotStateKt__DerivedStateKt.observeDerivedStateRecalculations(derivedStateObserver, os0Var);
    }

    public static final <T> State<T> produceState(T t, Object obj, Object obj2, Object obj3, ts0 ts0Var, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, obj2, obj3, ts0Var, composer, i);
    }

    public static final <T> State<T> produceState(T t, Object obj, Object obj2, ts0 ts0Var, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, obj2, ts0Var, composer, i);
    }

    public static final <T> State<T> produceState(T t, Object obj, ts0 ts0Var, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, ts0Var, composer, i);
    }

    public static final <T> State<T> produceState(T t, ts0 ts0Var, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, ts0Var, composer, i);
    }

    public static final <T> State<T> produceState(T t, Object[] objArr, ts0 ts0Var, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState((Object) t, objArr, ts0Var, composer, i);
    }

    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    public static final <T> State<T> rememberUpdatedState(T t, Composer composer, int i) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(t, composer, i);
    }

    public static final <T> void setValue(MutableState<T> mutableState, Object obj, sa1 sa1Var, T t) {
        SnapshotStateKt__SnapshotStateKt.setValue(mutableState, obj, sa1Var, t);
    }

    public static final <T> jp0 snapshotFlow(SnapshotFlowManager snapshotFlowManager, os0 os0Var) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(snapshotFlowManager, os0Var);
    }

    public static final <T> jp0 snapshotFlow(os0 os0Var) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(os0Var);
    }

    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy();
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> collection) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateList(collection);
    }

    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(Iterable<? extends dv1> iterable) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateMap(iterable);
    }
}
