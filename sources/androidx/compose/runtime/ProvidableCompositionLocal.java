package androidx.compose.runtime;

import defpackage.os0;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    public static final int $stable = 0;

    public ProvidableCompositionLocal(os0 os0Var) {
        super(os0Var, null);
    }

    private final ValueHolder<T> valueHolderOf(ProvidedValue<T> providedValue) {
        if (!providedValue.isDynamic$runtime()) {
            return providedValue.getCompute$runtime() != null ? new ComputedValueHolder(providedValue.getCompute$runtime()) : providedValue.getState$runtime() != null ? new DynamicValueHolder(providedValue.getState$runtime()) : new StaticValueHolder(providedValue.getEffectiveValue$runtime());
        }
        MutableState<T> state$runtime = providedValue.getState$runtime();
        if (state$runtime == null) {
            T value = providedValue.getValue();
            SnapshotMutationPolicy<T> mutationPolicy$runtime = providedValue.getMutationPolicy$runtime();
            if (mutationPolicy$runtime == null) {
                mutationPolicy$runtime = SnapshotStateKt.structuralEqualityPolicy();
            }
            state$runtime = SnapshotStateKt.mutableStateOf(value, mutationPolicy$runtime);
        }
        return new DynamicValueHolder(state$runtime);
    }

    public abstract ProvidedValue<T> defaultProvidedValue$runtime(T t);

    public final ProvidedValue<T> provides(T t) {
        return defaultProvidedValue$runtime(t);
    }

    public final ProvidedValue<T> providesComputed(ps0 ps0Var) {
        return new ProvidedValue<>(this, null, false, null, null, ps0Var, false);
    }

    public final ProvidedValue<T> providesDefault(T t) {
        return defaultProvidedValue$runtime(t).ifNotAlreadyProvided$runtime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r0 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r0 == r2) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionLocal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.ValueHolder<T> updatedStateOf$runtime(androidx.compose.runtime.ProvidedValue<T> r4, androidx.compose.runtime.ValueHolder<T> r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof androidx.compose.runtime.DynamicValueHolder
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r4.isDynamic$runtime()
            if (r0 == 0) goto L47
            r1 = r5
            androidx.compose.runtime.DynamicValueHolder r1 = (androidx.compose.runtime.DynamicValueHolder) r1
            androidx.compose.runtime.MutableState r5 = r1.getState()
            java.lang.Object r0 = r4.getEffectiveValue$runtime()
            r5.setValue(r0)
            goto L47
        L1a:
            boolean r0 = r5 instanceof androidx.compose.runtime.StaticValueHolder
            if (r0 == 0) goto L36
            boolean r0 = r4.isStatic$runtime()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r4.getEffectiveValue$runtime()
            androidx.compose.runtime.StaticValueHolder r5 = (androidx.compose.runtime.StaticValueHolder) r5
            java.lang.Object r2 = r5.getValue()
            boolean r0 = defpackage.jh2.k(r0, r2)
            if (r0 == 0) goto L47
        L34:
            r1 = r5
            goto L47
        L36:
            boolean r0 = r5 instanceof androidx.compose.runtime.ComputedValueHolder
            if (r0 == 0) goto L47
            ps0 r0 = r4.getCompute$runtime()
            androidx.compose.runtime.ComputedValueHolder r5 = (androidx.compose.runtime.ComputedValueHolder) r5
            ps0 r2 = r5.getCompute()
            if (r0 != r2) goto L47
            goto L34
        L47:
            if (r1 != 0) goto L4e
            androidx.compose.runtime.ValueHolder r3 = r3.valueHolderOf(r4)
            return r3
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProvidableCompositionLocal.updatedStateOf$runtime(androidx.compose.runtime.ProvidedValue, androidx.compose.runtime.ValueHolder):androidx.compose.runtime.ValueHolder");
    }
}
