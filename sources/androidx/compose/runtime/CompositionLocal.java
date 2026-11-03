package androidx.compose.runtime;

import defpackage.os0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class CompositionLocal<T> {
    public static final int $stable = 0;
    private final ValueHolder<T> defaultValueHolder;

    private CompositionLocal(os0 os0Var) {
        this.defaultValueHolder = new LazyValueHolder(os0Var);
    }

    public /* synthetic */ CompositionLocal(os0 os0Var, sb0 sb0Var) {
        this(os0Var);
    }

    public static /* synthetic */ void getCurrent$annotations(Composer composer, int i) {
    }

    public final T getCurrent(Composer composer, int i) {
        return (T) composer.consume(this);
    }

    public ValueHolder<T> getDefaultValueHolder$runtime() {
        return this.defaultValueHolder;
    }

    public abstract ValueHolder<T> updatedStateOf$runtime(ProvidedValue<T> providedValue, ValueHolder<T> valueHolder);
}
