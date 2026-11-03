package androidx.compose.material3;

import defpackage.jh2;
import defpackage.us0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FadeInFadeOutAnimationItem<T> {
    private final T key;
    private final us0 transition;

    public FadeInFadeOutAnimationItem(T t, us0 us0Var) {
        this.key = t;
        this.transition = us0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FadeInFadeOutAnimationItem copy$default(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem, Object obj, us0 us0Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = fadeInFadeOutAnimationItem.key;
        }
        if ((i & 2) != 0) {
            us0Var = fadeInFadeOutAnimationItem.transition;
        }
        return fadeInFadeOutAnimationItem.copy(obj, us0Var);
    }

    public final T component1() {
        return this.key;
    }

    public final us0 component2() {
        return this.transition;
    }

    public final FadeInFadeOutAnimationItem<T> copy(T t, us0 us0Var) {
        return new FadeInFadeOutAnimationItem<>(t, us0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
        return jh2.k(this.key, fadeInFadeOutAnimationItem.key) && jh2.k(this.transition, fadeInFadeOutAnimationItem.transition);
    }

    public final T getKey() {
        return this.key;
    }

    public final us0 getTransition() {
        return this.transition;
    }

    public int hashCode() {
        T t = this.key;
        return this.transition.hashCode() + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }
}
