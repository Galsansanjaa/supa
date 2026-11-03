package androidx.compose.ui.graphics;

import defpackage.ej0;
import defpackage.nb0;
import defpackage.sg3;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PathSegment {
    public static final int $stable = 8;
    private final float[] points;
    private final Type type;
    private final float weight;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Type {
        private static final /* synthetic */ ej0 $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Move = new Type("Move", 0);
        public static final Type Line = new Type("Line", 1);
        public static final Type Quadratic = new Type("Quadratic", 2);
        public static final Type Conic = new Type("Conic", 3);
        public static final Type Cubic = new Type("Cubic", 4);
        public static final Type Close = new Type("Close", 5);
        public static final Type Done = new Type("Done", 6);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{Move, Line, Quadratic, Conic, Cubic, Close, Done};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nb0.s($values);
        }

        private Type(String str, int i) {
        }

        public static ej0 getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public PathSegment(Type type, float[] fArr, float f) {
        this.type = type;
        this.points = fArr;
        this.weight = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PathSegment.class == obj.getClass()) {
            PathSegment pathSegment = (PathSegment) obj;
            if (this.type == pathSegment.type && Arrays.equals(this.points, pathSegment.points) && this.weight == pathSegment.weight) {
                return true;
            }
        }
        return false;
    }

    public final float[] getPoints() {
        return this.points;
    }

    public final Type getType() {
        return this.type;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.weight) + ((Arrays.hashCode(this.points) + (this.type.hashCode() * 31)) * 31);
    }

    public String toString() {
        Type type = this.type;
        String arrays = Arrays.toString(this.points);
        arrays.getClass();
        float f = this.weight;
        StringBuilder sb = new StringBuilder("PathSegment(type=");
        sb.append(type);
        sb.append(", points=");
        sb.append(arrays);
        sb.append(", weight=");
        return sg3.s(sb, ")", f);
    }
}
