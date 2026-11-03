package androidx.compose.material3.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;
    private final Map<T, Float> anchors = new LinkedHashMap();

    public final void at(T t, float f) {
        this.anchors.put(t, Float.valueOf(f));
    }

    public final Map<T, Float> getAnchors$material3() {
        return this.anchors;
    }
}
