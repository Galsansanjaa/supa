package androidx.compose.runtime.retain;

import androidx.compose.runtime.RememberObserver;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class RetainedValueHolder<T> implements RememberObserver {
    public static final int $stable = 8;
    private boolean isNewlyRetained;
    private final Object key;
    private RetainedValuesStore owner;
    private final T value;

    public RetainedValueHolder(Object obj, T t, RetainedValuesStore retainedValuesStore, boolean z) {
        this.key = obj;
        this.value = t;
        this.isNewlyRetained = z;
        this.owner = retainedValuesStore;
        if (!(t instanceof RememberObserver) || (t instanceof RetainObserver)) {
            return;
        }
        v5.l(t, "Retained a value that implements RememberObserver but not RetainObserver. To receive the correct callbacks, the retained value '", "' must also implement RetainObserver.");
        throw null;
    }

    public final Object getKey() {
        return this.key;
    }

    public final RetainedValuesStore getOwner() {
        return this.owner;
    }

    public final T getValue() {
        return this.value;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        T t = this.value;
        if (t instanceof RetainObserver) {
            ((RetainObserver) t).onUnused();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        T t = this.value;
        if (t instanceof RetainObserver) {
            ((RetainObserver) t).onExitedComposition();
        }
        this.owner.saveExitingValue(this.key, this.value);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        T t = this.value;
        if (t instanceof RetainObserver) {
            if (this.isNewlyRetained) {
                this.isNewlyRetained = false;
                ((RetainObserver) t).onRetained();
            }
            ((RetainObserver) this.value).onEnteredComposition();
        }
    }

    public final void readoptUnder$runtime_retain(RetainedValuesStore retainedValuesStore) {
        this.owner = retainedValuesStore;
    }
}
