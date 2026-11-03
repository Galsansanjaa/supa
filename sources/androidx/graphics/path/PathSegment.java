package androidx.graphics.path;

import android.graphics.PointF;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PathSegment {
    private final PointF[] points;
    private final Type type;
    private final float weight;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public enum Type {
        Move,
        Line,
        Quadratic,
        Conic,
        Cubic,
        Close,
        Done
    }

    public PathSegment(Type type, PointF[] pointFArr, float f) {
        type.getClass();
        pointFArr.getClass();
        this.type = type;
        this.points = pointFArr;
        this.weight = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PathSegment.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        PathSegment pathSegment = (PathSegment) obj;
        return this.type == pathSegment.type && Arrays.equals(this.points, pathSegment.points) && this.weight == pathSegment.weight;
    }

    public final PointF[] getPoints() {
        return this.points;
    }

    public final Type getType() {
        return this.type;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.weight) + (((this.type.hashCode() * 31) + Arrays.hashCode(this.points)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PathSegment(type=");
        sb.append(this.type);
        sb.append(", points=");
        String arrays = Arrays.toString(this.points);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(')');
        return sb.toString();
    }
}
