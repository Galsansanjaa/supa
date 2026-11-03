package androidx.compose.foundation.gestures;

import defpackage.nb0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;
    private final List<T> keys = new ArrayList();
    private float[] positions;

    public DraggableAnchorsConfig() {
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = Float.NaN;
        }
        this.positions = fArr;
    }

    private final void expandPositions() {
        this.positions = Arrays.copyOf(this.positions, this.keys.size() + 2);
    }

    public final void at(T t, float f) {
        this.keys.add(t);
        if (this.positions.length < this.keys.size()) {
            expandPositions();
        }
        this.positions[this.keys.size() - 1] = f;
    }

    public final List<T> buildKeys$foundation() {
        return this.keys;
    }

    public final float[] buildPositions$foundation() {
        float[] fArr = this.positions;
        int size = this.keys.size();
        fArr.getClass();
        nb0.n(size, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, 0, size);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public final List<T> getKeys$foundation() {
        return this.keys;
    }

    public final float[] getPositions$foundation() {
        return this.positions;
    }

    public final void setPositions$foundation(float[] fArr) {
        this.positions = fArr;
    }
}
