package androidx.compose.animation.core;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.KeyframeBaseEntity;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class KeyframesSpecBaseConfig<T, E extends KeyframeBaseEntity<T>> {
    public static final int $stable = 8;
    private int delayMillis;
    private int durationMillis;
    private final MutableIntObjectMap<E> keyframes;

    private KeyframesSpecBaseConfig() {
        this.durationMillis = 300;
        this.keyframes = IntObjectMapKt.mutableIntObjectMapOf();
    }

    public /* synthetic */ KeyframesSpecBaseConfig(sb0 sb0Var) {
        this();
    }

    public E at(T t, int i) {
        E createEntityFor$animation_core = createEntityFor$animation_core(t);
        this.keyframes.set(i, createEntityFor$animation_core);
        return createEntityFor$animation_core;
    }

    public E atFraction(T t, float f) {
        return at(t, Math.round(this.durationMillis * f));
    }

    public abstract E createEntityFor$animation_core(T t);

    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final MutableIntObjectMap<E> getKeyframes$animation_core() {
        return this.keyframes;
    }

    public final void setDelayMillis(int i) {
        this.delayMillis = i;
    }

    public final void setDurationMillis(int i) {
        this.durationMillis = i;
    }

    public final E using(E e, Easing easing) {
        e.setEasing$animation_core(easing);
        return e;
    }
}
