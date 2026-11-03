package androidx.compose.ui.graphics;

import defpackage.jh2;
import defpackage.sb0;
import defpackage.yo0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class Interval<T> {
    public static final int $stable = 0;
    private final T data;
    private final float end;
    private final float start;

    public Interval(float f, float f2, T t) {
        this.start = f;
        this.end = f2;
        this.data = t;
    }

    public /* synthetic */ Interval(float f, float f2, Object obj, int i, sb0 sb0Var) {
        this(f, f2, (i & 4) != 0 ? null : obj);
    }

    public final boolean contains(float f) {
        return f <= this.end && this.start <= f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Interval interval = (Interval) obj;
            return this.start == interval.start && this.end == interval.end && jh2.k(this.data, interval.data);
        }
        return false;
    }

    public final T getData() {
        return this.data;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getStart() {
        return this.start;
    }

    public int hashCode() {
        int i = yo0.i(this.end, Float.floatToIntBits(this.start) * 31, 31);
        T t = this.data;
        return i + (t != null ? t.hashCode() : 0);
    }

    public final boolean overlaps(float f, float f2) {
        return this.start <= f2 && this.end >= f;
    }

    public final boolean overlaps(Interval<T> interval) {
        return this.start <= interval.end && this.end >= interval.start;
    }

    public String toString() {
        float f = this.start;
        float f2 = this.end;
        T t = this.data;
        StringBuilder v = yo0.v("Interval(start=", f, ", end=", f2, ", data=");
        v.append(t);
        v.append(")");
        return v.toString();
    }
}
