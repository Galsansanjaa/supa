package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.PathIterator;
import defpackage.ej0;
import defpackage.f31;
import defpackage.hd0;
import defpackage.nb0;
import defpackage.sv1;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface Path {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* renamed from: combine-xh6zSI8, reason: not valid java name */
        public final Path m5616combinexh6zSI8(int i, Path path, Path path2) {
            Path Path = AndroidPath_androidKt.Path();
            if (Path.mo5227opN5in7k0(path, path2, i)) {
                return Path;
            }
            v5.m("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
            return null;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void addOval$default(Path path, Rect rect, Direction direction, int i, Object obj) {
            int i2 = sv1.a;
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: addOval");
                return;
            }
            if ((i & 2) != 0) {
                direction = Direction.CounterClockwise;
            }
            path.addOval(rect, direction);
        }

        @Deprecated
        public static Path and(Path path, Path path2) {
            int i = sv1.a;
            Path Path = AndroidPath_androidKt.Path();
            Path.mo5227opN5in7k0(path, path2, PathOperation.Companion.m5638getIntersectb3I0S0c());
            return Path;
        }

        @Deprecated
        public static void arcToRad(Path path, Rect rect, float f, float f2, boolean z) {
            int i = sv1.a;
            path.arcTo(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2), z);
        }

        @Deprecated
        public static PathIterator iterator(Path path) {
            int i = sv1.a;
            return AndroidPathIterator_androidKt.PathIterator$default(path, null, 0.0f, 6, null);
        }

        @Deprecated
        public static PathIterator iterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f) {
            int i = sv1.a;
            return AndroidPathIterator_androidKt.PathIterator(path, conicEvaluation, f);
        }

        public static /* synthetic */ PathIterator iterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f, int i, Object obj) {
            int i2 = sv1.a;
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: iterator");
                return null;
            }
            if ((i & 2) != 0) {
                f = 0.25f;
            }
            return path.iterator(conicEvaluation, f);
        }

        @Deprecated
        public static Path minus(Path path, Path path2) {
            int i = sv1.a;
            Path Path = AndroidPath_androidKt.Path();
            Path.mo5227opN5in7k0(path, path2, PathOperation.Companion.m5637getDifferenceb3I0S0c());
            return Path;
        }

        @Deprecated
        public static Path or(Path path, Path path2) {
            int i = sv1.a;
            return path.plus(path2);
        }

        @Deprecated
        public static Path plus(Path path, Path path2) {
            int i = sv1.a;
            Path Path = AndroidPath_androidKt.Path();
            Path.mo5227opN5in7k0(path, path2, PathOperation.Companion.m5640getUnionb3I0S0c());
            return Path;
        }

        @Deprecated
        public static void quadraticTo(Path path, float f, float f2, float f3, float f4) {
            int i = sv1.a;
            path.quadraticBezierTo(f, f2, f3, f4);
        }

        @Deprecated
        public static void relativeQuadraticTo(Path path, float f, float f2, float f3, float f4) {
            int i = sv1.a;
            path.relativeQuadraticBezierTo(f, f2, f3, f4);
        }

        @Deprecated
        public static void rewind(Path path) {
            int i = sv1.a;
            path.reset();
        }

        @Deprecated
        /* renamed from: transform-58bKbWc, reason: not valid java name */
        public static void m5618transform58bKbWc(Path path, float[] fArr) {
            int i = sv1.a;
        }

        @Deprecated
        public static Path xor(Path path, Path path2) {
            int i = sv1.a;
            Path Path = AndroidPath_androidKt.Path();
            Path.mo5227opN5in7k0(path, path2, PathOperation.Companion.m5641getXorb3I0S0c());
            return Path;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Direction {
        private static final /* synthetic */ ej0 $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction CounterClockwise = new Direction("CounterClockwise", 0);
        public static final Direction Clockwise = new Direction("Clockwise", 1);

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{CounterClockwise, Clockwise};
        }

        static {
            Direction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nb0.s($values);
        }

        private Direction(String str, int i) {
        }

        public static ej0 getEntries() {
            return $ENTRIES;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    void addArc(Rect rect, float f, float f2);

    void addArcRad(Rect rect, float f, float f2);

    @hd0
    /* synthetic */ void addOval(Rect rect);

    void addOval(Rect rect, Direction direction);

    /* renamed from: addPath-Uv8p0NA */
    void mo5225addPathUv8p0NA(Path path, long j);

    @hd0
    /* synthetic */ void addRect(Rect rect);

    void addRect(Rect rect, Direction direction);

    @hd0
    /* synthetic */ void addRoundRect(RoundRect roundRect);

    void addRoundRect(RoundRect roundRect, Direction direction);

    Path and(Path path);

    void arcTo(Rect rect, float f, float f2, boolean z);

    void arcToRad(Rect rect, float f, float f2, boolean z);

    void close();

    void cubicTo(float f, float f2, float f3, float f4, float f5, float f6);

    Rect getBounds();

    /* renamed from: getFillType-Rg-k1Os */
    int mo5226getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    PathIterator iterator();

    PathIterator iterator(PathIterator.ConicEvaluation conicEvaluation, float f);

    void lineTo(float f, float f2);

    Path minus(Path path);

    void moveTo(float f, float f2);

    /* renamed from: op-N5in7k0 */
    boolean mo5227opN5in7k0(Path path, Path path2, int i);

    Path or(Path path);

    Path plus(Path path);

    @hd0
    void quadraticBezierTo(float f, float f2, float f3, float f4);

    void quadraticTo(float f, float f2, float f3, float f4);

    void relativeCubicTo(float f, float f2, float f3, float f4, float f5, float f6);

    void relativeLineTo(float f, float f2);

    void relativeMoveTo(float f, float f2);

    @hd0
    void relativeQuadraticBezierTo(float f, float f2, float f3, float f4);

    void relativeQuadraticTo(float f, float f2, float f3, float f4);

    void reset();

    void rewind();

    /* renamed from: setFillType-oQ8Xj4U */
    void mo5228setFillTypeoQ8Xj4U(int i);

    /* renamed from: transform-58bKbWc */
    void mo5229transform58bKbWc(float[] fArr);

    /* renamed from: translate-k-4lQ0M */
    void mo5230translatek4lQ0M(long j);

    Path xor(Path path);
}
