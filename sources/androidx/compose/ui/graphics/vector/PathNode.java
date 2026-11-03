package androidx.compose.ui.graphics.vector;

import defpackage.sb0;
import defpackage.sg3;
import defpackage.yo0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class PathNode {
    public static final int $stable = 0;
    private final boolean isCurve;
    private final boolean isQuad;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class ArcTo extends PathNode {
        public static final int $stable = 0;
        private final float arcStartX;
        private final float arcStartY;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ArcTo(float r4, float r5, float r6, boolean r7, boolean r8, float r9, float r10) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.horizontalEllipseRadius = r4
                r3.verticalEllipseRadius = r5
                r3.theta = r6
                r3.isMoreThanHalf = r7
                r3.isPositiveArc = r8
                r3.arcStartX = r9
                r3.arcStartY = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.ArcTo.<init>(float, float, float, boolean, boolean, float, float):void");
        }

        public static /* synthetic */ ArcTo copy$default(ArcTo arcTo, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = arcTo.horizontalEllipseRadius;
            }
            if ((i & 2) != 0) {
                f2 = arcTo.verticalEllipseRadius;
            }
            if ((i & 4) != 0) {
                f3 = arcTo.theta;
            }
            if ((i & 8) != 0) {
                z = arcTo.isMoreThanHalf;
            }
            if ((i & 16) != 0) {
                z2 = arcTo.isPositiveArc;
            }
            if ((i & 32) != 0) {
                f4 = arcTo.arcStartX;
            }
            if ((i & 64) != 0) {
                f5 = arcTo.arcStartY;
            }
            float f6 = f4;
            float f7 = f5;
            boolean z3 = z2;
            float f8 = f3;
            return arcTo.copy(f, f2, f8, z, z3, f6, f7);
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartX;
        }

        public final float component7() {
            return this.arcStartY;
        }

        public final ArcTo copy(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            return new ArcTo(f, f2, f3, z, z2, f4, f5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArcTo)) {
                return false;
            }
            ArcTo arcTo = (ArcTo) obj;
            return Float.compare(this.horizontalEllipseRadius, arcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, arcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, arcTo.theta) == 0 && this.isMoreThanHalf == arcTo.isMoreThanHalf && this.isPositiveArc == arcTo.isPositiveArc && Float.compare(this.arcStartX, arcTo.arcStartX) == 0 && Float.compare(this.arcStartY, arcTo.arcStartY) == 0;
        }

        public final float getArcStartX() {
            return this.arcStartX;
        }

        public final float getArcStartY() {
            return this.arcStartY;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.arcStartY) + yo0.i(this.arcStartX, (((yo0.i(this.theta, yo0.i(this.verticalEllipseRadius, Float.floatToIntBits(this.horizontalEllipseRadius) * 31, 31), 31) + (this.isMoreThanHalf ? 1231 : 1237)) * 31) + (this.isPositiveArc ? 1231 : 1237)) * 31, 31);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        public String toString() {
            float f = this.horizontalEllipseRadius;
            float f2 = this.verticalEllipseRadius;
            float f3 = this.theta;
            boolean z = this.isMoreThanHalf;
            boolean z2 = this.isPositiveArc;
            float f4 = this.arcStartX;
            float f5 = this.arcStartY;
            StringBuilder v = yo0.v("ArcTo(horizontalEllipseRadius=", f, ", verticalEllipseRadius=", f2, ", theta=");
            v.append(f3);
            v.append(", isMoreThanHalf=");
            v.append(z);
            v.append(", isPositiveArc=");
            v.append(z2);
            v.append(", arcStartX=");
            v.append(f4);
            v.append(", arcStartY=");
            return sg3.s(v, ")", f5);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Close extends PathNode {
        public static final int $stable = 0;
        public static final Close INSTANCE = new Close();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private Close() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.Close.<init>():void");
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class CurveTo extends PathNode {
        public static final int $stable = 0;
        private final float x1;
        private final float x2;
        private final float x3;
        private final float y1;
        private final float y2;
        private final float y3;

        public CurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.x1 = f;
            this.y1 = f2;
            this.x2 = f3;
            this.y2 = f4;
            this.x3 = f5;
            this.y3 = f6;
        }

        public static /* synthetic */ CurveTo copy$default(CurveTo curveTo, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = curveTo.x1;
            }
            if ((i & 2) != 0) {
                f2 = curveTo.y1;
            }
            if ((i & 4) != 0) {
                f3 = curveTo.x2;
            }
            if ((i & 8) != 0) {
                f4 = curveTo.y2;
            }
            if ((i & 16) != 0) {
                f5 = curveTo.x3;
            }
            if ((i & 32) != 0) {
                f6 = curveTo.y3;
            }
            float f7 = f5;
            float f8 = f6;
            return curveTo.copy(f, f2, f3, f4, f7, f8);
        }

        public final float component1() {
            return this.x1;
        }

        public final float component2() {
            return this.y1;
        }

        public final float component3() {
            return this.x2;
        }

        public final float component4() {
            return this.y2;
        }

        public final float component5() {
            return this.x3;
        }

        public final float component6() {
            return this.y3;
        }

        public final CurveTo copy(float f, float f2, float f3, float f4, float f5, float f6) {
            return new CurveTo(f, f2, f3, f4, f5, f6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurveTo)) {
                return false;
            }
            CurveTo curveTo = (CurveTo) obj;
            return Float.compare(this.x1, curveTo.x1) == 0 && Float.compare(this.y1, curveTo.y1) == 0 && Float.compare(this.x2, curveTo.x2) == 0 && Float.compare(this.y2, curveTo.y2) == 0 && Float.compare(this.x3, curveTo.x3) == 0 && Float.compare(this.y3, curveTo.y3) == 0;
        }

        public final float getX1() {
            return this.x1;
        }

        public final float getX2() {
            return this.x2;
        }

        public final float getX3() {
            return this.x3;
        }

        public final float getY1() {
            return this.y1;
        }

        public final float getY2() {
            return this.y2;
        }

        public final float getY3() {
            return this.y3;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.y3) + yo0.i(this.x3, yo0.i(this.y2, yo0.i(this.x2, yo0.i(this.y1, Float.floatToIntBits(this.x1) * 31, 31), 31), 31), 31);
        }

        public String toString() {
            float f = this.x1;
            float f2 = this.y1;
            float f3 = this.x2;
            float f4 = this.y2;
            float f5 = this.x3;
            float f6 = this.y3;
            StringBuilder v = yo0.v("CurveTo(x1=", f, ", y1=", f2, ", x2=");
            v.append(f3);
            v.append(", y2=");
            v.append(f4);
            v.append(", x3=");
            v.append(f5);
            v.append(", y3=");
            v.append(f6);
            v.append(")");
            return v.toString();
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class HorizontalTo extends PathNode {
        public static final int $stable = 0;
        private final float x;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public HorizontalTo(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.x = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.HorizontalTo.<init>(float):void");
        }

        public static /* synthetic */ HorizontalTo copy$default(HorizontalTo horizontalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = horizontalTo.x;
            }
            return horizontalTo.copy(f);
        }

        public final float component1() {
            return this.x;
        }

        public final HorizontalTo copy(float f) {
            return new HorizontalTo(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalTo) && Float.compare(this.x, ((HorizontalTo) obj).x) == 0;
        }

        public final float getX() {
            return this.x;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.x);
        }

        public String toString() {
            return sg3.p("HorizontalTo(x=", this.x, ")");
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class LineTo extends PathNode {
        public static final int $stable = 0;
        private final float x;
        private final float y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public LineTo(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.x = r4
                r3.y = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.LineTo.<init>(float, float):void");
        }

        public static /* synthetic */ LineTo copy$default(LineTo lineTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = lineTo.x;
            }
            if ((i & 2) != 0) {
                f2 = lineTo.y;
            }
            return lineTo.copy(f, f2);
        }

        public final float component1() {
            return this.x;
        }

        public final float component2() {
            return this.y;
        }

        public final LineTo copy(float f, float f2) {
            return new LineTo(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineTo)) {
                return false;
            }
            LineTo lineTo = (LineTo) obj;
            return Float.compare(this.x, lineTo.x) == 0 && Float.compare(this.y, lineTo.y) == 0;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.y) + (Float.floatToIntBits(this.x) * 31);
        }

        public String toString() {
            return sg3.q("LineTo(x=", this.x, ", y=", this.y, ")");
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class MoveTo extends PathNode {
        public static final int $stable = 0;
        private final float x;
        private final float y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MoveTo(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.x = r4
                r3.y = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.MoveTo.<init>(float, float):void");
        }

        public static /* synthetic */ MoveTo copy$default(MoveTo moveTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = moveTo.x;
            }
            if ((i & 2) != 0) {
                f2 = moveTo.y;
            }
            return moveTo.copy(f, f2);
        }

        public final float component1() {
            return this.x;
        }

        public final float component2() {
            return this.y;
        }

        public final MoveTo copy(float f, float f2) {
            return new MoveTo(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoveTo)) {
                return false;
            }
            MoveTo moveTo = (MoveTo) obj;
            return Float.compare(this.x, moveTo.x) == 0 && Float.compare(this.y, moveTo.y) == 0;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.y) + (Float.floatToIntBits(this.x) * 31);
        }

        public String toString() {
            return sg3.q("MoveTo(x=", this.x, ", y=", this.y, ")");
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class QuadTo extends PathNode {
        public static final int $stable = 0;
        private final float x1;
        private final float x2;
        private final float y1;
        private final float y2;

        public QuadTo(float f, float f2, float f3, float f4) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.x1 = f;
            this.y1 = f2;
            this.x2 = f3;
            this.y2 = f4;
        }

        public static /* synthetic */ QuadTo copy$default(QuadTo quadTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = quadTo.x1;
            }
            if ((i & 2) != 0) {
                f2 = quadTo.y1;
            }
            if ((i & 4) != 0) {
                f3 = quadTo.x2;
            }
            if ((i & 8) != 0) {
                f4 = quadTo.y2;
            }
            return quadTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.x1;
        }

        public final float component2() {
            return this.y1;
        }

        public final float component3() {
            return this.x2;
        }

        public final float component4() {
            return this.y2;
        }

        public final QuadTo copy(float f, float f2, float f3, float f4) {
            return new QuadTo(f, f2, f3, f4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuadTo)) {
                return false;
            }
            QuadTo quadTo = (QuadTo) obj;
            return Float.compare(this.x1, quadTo.x1) == 0 && Float.compare(this.y1, quadTo.y1) == 0 && Float.compare(this.x2, quadTo.x2) == 0 && Float.compare(this.y2, quadTo.y2) == 0;
        }

        public final float getX1() {
            return this.x1;
        }

        public final float getX2() {
            return this.x2;
        }

        public final float getY1() {
            return this.y1;
        }

        public final float getY2() {
            return this.y2;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.y2) + yo0.i(this.x2, yo0.i(this.y1, Float.floatToIntBits(this.x1) * 31, 31), 31);
        }

        public String toString() {
            float f = this.x1;
            float f2 = this.y1;
            float f3 = this.x2;
            float f4 = this.y2;
            StringBuilder v = yo0.v("QuadTo(x1=", f, ", y1=", f2, ", x2=");
            v.append(f3);
            v.append(", y2=");
            v.append(f4);
            v.append(")");
            return v.toString();
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class ReflectiveCurveTo extends PathNode {
        public static final int $stable = 0;
        private final float x1;
        private final float x2;
        private final float y1;
        private final float y2;

        public ReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.x1 = f;
            this.y1 = f2;
            this.x2 = f3;
            this.y2 = f4;
        }

        public static /* synthetic */ ReflectiveCurveTo copy$default(ReflectiveCurveTo reflectiveCurveTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = reflectiveCurveTo.x1;
            }
            if ((i & 2) != 0) {
                f2 = reflectiveCurveTo.y1;
            }
            if ((i & 4) != 0) {
                f3 = reflectiveCurveTo.x2;
            }
            if ((i & 8) != 0) {
                f4 = reflectiveCurveTo.y2;
            }
            return reflectiveCurveTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.x1;
        }

        public final float component2() {
            return this.y1;
        }

        public final float component3() {
            return this.x2;
        }

        public final float component4() {
            return this.y2;
        }

        public final ReflectiveCurveTo copy(float f, float f2, float f3, float f4) {
            return new ReflectiveCurveTo(f, f2, f3, f4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveCurveTo)) {
                return false;
            }
            ReflectiveCurveTo reflectiveCurveTo = (ReflectiveCurveTo) obj;
            return Float.compare(this.x1, reflectiveCurveTo.x1) == 0 && Float.compare(this.y1, reflectiveCurveTo.y1) == 0 && Float.compare(this.x2, reflectiveCurveTo.x2) == 0 && Float.compare(this.y2, reflectiveCurveTo.y2) == 0;
        }

        public final float getX1() {
            return this.x1;
        }

        public final float getX2() {
            return this.x2;
        }

        public final float getY1() {
            return this.y1;
        }

        public final float getY2() {
            return this.y2;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.y2) + yo0.i(this.x2, yo0.i(this.y1, Float.floatToIntBits(this.x1) * 31, 31), 31);
        }

        public String toString() {
            float f = this.x1;
            float f2 = this.y1;
            float f3 = this.x2;
            float f4 = this.y2;
            StringBuilder v = yo0.v("ReflectiveCurveTo(x1=", f, ", y1=", f2, ", x2=");
            v.append(f3);
            v.append(", y2=");
            v.append(f4);
            v.append(")");
            return v.toString();
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class ReflectiveQuadTo extends PathNode {
        public static final int $stable = 0;
        private final float x;
        private final float y;

        public ReflectiveQuadTo(float f, float f2) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.x = f;
            this.y = f2;
        }

        public static /* synthetic */ ReflectiveQuadTo copy$default(ReflectiveQuadTo reflectiveQuadTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = reflectiveQuadTo.x;
            }
            if ((i & 2) != 0) {
                f2 = reflectiveQuadTo.y;
            }
            return reflectiveQuadTo.copy(f, f2);
        }

        public final float component1() {
            return this.x;
        }

        public final float component2() {
            return this.y;
        }

        public final ReflectiveQuadTo copy(float f, float f2) {
            return new ReflectiveQuadTo(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveQuadTo)) {
                return false;
            }
            ReflectiveQuadTo reflectiveQuadTo = (ReflectiveQuadTo) obj;
            return Float.compare(this.x, reflectiveQuadTo.x) == 0 && Float.compare(this.y, reflectiveQuadTo.y) == 0;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.y) + (Float.floatToIntBits(this.x) * 31);
        }

        public String toString() {
            return sg3.q("ReflectiveQuadTo(x=", this.x, ", y=", this.y, ")");
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class RelativeArcTo extends PathNode {
        public static final int $stable = 0;
        private final float arcStartDx;
        private final float arcStartDy;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RelativeArcTo(float r4, float r5, float r6, boolean r7, boolean r8, float r9, float r10) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.horizontalEllipseRadius = r4
                r3.verticalEllipseRadius = r5
                r3.theta = r6
                r3.isMoreThanHalf = r7
                r3.isPositiveArc = r8
                r3.arcStartDx = r9
                r3.arcStartDy = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo.<init>(float, float, float, boolean, boolean, float, float):void");
        }

        public static /* synthetic */ RelativeArcTo copy$default(RelativeArcTo relativeArcTo, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeArcTo.horizontalEllipseRadius;
            }
            if ((i & 2) != 0) {
                f2 = relativeArcTo.verticalEllipseRadius;
            }
            if ((i & 4) != 0) {
                f3 = relativeArcTo.theta;
            }
            if ((i & 8) != 0) {
                z = relativeArcTo.isMoreThanHalf;
            }
            if ((i & 16) != 0) {
                z2 = relativeArcTo.isPositiveArc;
            }
            if ((i & 32) != 0) {
                f4 = relativeArcTo.arcStartDx;
            }
            if ((i & 64) != 0) {
                f5 = relativeArcTo.arcStartDy;
            }
            float f6 = f4;
            float f7 = f5;
            boolean z3 = z2;
            float f8 = f3;
            return relativeArcTo.copy(f, f2, f8, z, z3, f6, f7);
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartDx;
        }

        public final float component7() {
            return this.arcStartDy;
        }

        public final RelativeArcTo copy(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            return new RelativeArcTo(f, f2, f3, z, z2, f4, f5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeArcTo)) {
                return false;
            }
            RelativeArcTo relativeArcTo = (RelativeArcTo) obj;
            return Float.compare(this.horizontalEllipseRadius, relativeArcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, relativeArcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, relativeArcTo.theta) == 0 && this.isMoreThanHalf == relativeArcTo.isMoreThanHalf && this.isPositiveArc == relativeArcTo.isPositiveArc && Float.compare(this.arcStartDx, relativeArcTo.arcStartDx) == 0 && Float.compare(this.arcStartDy, relativeArcTo.arcStartDy) == 0;
        }

        public final float getArcStartDx() {
            return this.arcStartDx;
        }

        public final float getArcStartDy() {
            return this.arcStartDy;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.arcStartDy) + yo0.i(this.arcStartDx, (((yo0.i(this.theta, yo0.i(this.verticalEllipseRadius, Float.floatToIntBits(this.horizontalEllipseRadius) * 31, 31), 31) + (this.isMoreThanHalf ? 1231 : 1237)) * 31) + (this.isPositiveArc ? 1231 : 1237)) * 31, 31);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        public String toString() {
            float f = this.horizontalEllipseRadius;
            float f2 = this.verticalEllipseRadius;
            float f3 = this.theta;
            boolean z = this.isMoreThanHalf;
            boolean z2 = this.isPositiveArc;
            float f4 = this.arcStartDx;
            float f5 = this.arcStartDy;
            StringBuilder v = yo0.v("RelativeArcTo(horizontalEllipseRadius=", f, ", verticalEllipseRadius=", f2, ", theta=");
            v.append(f3);
            v.append(", isMoreThanHalf=");
            v.append(z);
            v.append(", isPositiveArc=");
            v.append(z2);
            v.append(", arcStartDx=");
            v.append(f4);
            v.append(", arcStartDy=");
            return sg3.s(v, ")", f5);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class RelativeCurveTo extends PathNode {
        public static final int $stable = 0;
        private final float dx1;
        private final float dx2;
        private final float dx3;
        private final float dy1;
        private final float dy2;
        private final float dy3;

        public RelativeCurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.dx1 = f;
            this.dy1 = f2;
            this.dx2 = f3;
            this.dy2 = f4;
            this.dx3 = f5;
            this.dy3 = f6;
        }

        public static /* synthetic */ RelativeCurveTo copy$default(RelativeCurveTo relativeCurveTo, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeCurveTo.dx1;
            }
            if ((i & 2) != 0) {
                f2 = relativeCurveTo.dy1;
            }
            if ((i & 4) != 0) {
                f3 = relativeCurveTo.dx2;
            }
            if ((i & 8) != 0) {
                f4 = relativeCurveTo.dy2;
            }
            if ((i & 16) != 0) {
                f5 = relativeCurveTo.dx3;
            }
            if ((i & 32) != 0) {
                f6 = relativeCurveTo.dy3;
            }
            float f7 = f5;
            float f8 = f6;
            return relativeCurveTo.copy(f, f2, f3, f4, f7, f8);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final float component5() {
            return this.dx3;
        }

        public final float component6() {
            return this.dy3;
        }

        public final RelativeCurveTo copy(float f, float f2, float f3, float f4, float f5, float f6) {
            return new RelativeCurveTo(f, f2, f3, f4, f5, f6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeCurveTo)) {
                return false;
            }
            RelativeCurveTo relativeCurveTo = (RelativeCurveTo) obj;
            return Float.compare(this.dx1, relativeCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeCurveTo.dy2) == 0 && Float.compare(this.dx3, relativeCurveTo.dx3) == 0 && Float.compare(this.dy3, relativeCurveTo.dy3) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDx3() {
            return this.dx3;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public final float getDy3() {
            return this.dy3;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dy3) + yo0.i(this.dx3, yo0.i(this.dy2, yo0.i(this.dx2, yo0.i(this.dy1, Float.floatToIntBits(this.dx1) * 31, 31), 31), 31), 31);
        }

        public String toString() {
            float f = this.dx1;
            float f2 = this.dy1;
            float f3 = this.dx2;
            float f4 = this.dy2;
            float f5 = this.dx3;
            float f6 = this.dy3;
            StringBuilder v = yo0.v("RelativeCurveTo(dx1=", f, ", dy1=", f2, ", dx2=");
            v.append(f3);
            v.append(", dy2=");
            v.append(f4);
            v.append(", dx3=");
            v.append(f5);
            v.append(", dy3=");
            v.append(f6);
            v.append(")");
            return v.toString();
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class RelativeHorizontalTo extends PathNode {
        public static final int $stable = 0;
        private final float dx;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RelativeHorizontalTo(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.dx = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo.<init>(float):void");
        }

        public static /* synthetic */ RelativeHorizontalTo copy$default(RelativeHorizontalTo relativeHorizontalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeHorizontalTo.dx;
            }
            return relativeHorizontalTo.copy(f);
        }

        public final float component1() {
            return this.dx;
        }

        public final RelativeHorizontalTo copy(float f) {
            return new RelativeHorizontalTo(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeHorizontalTo) && Float.compare(this.dx, ((RelativeHorizontalTo) obj).dx) == 0;
        }

        public final float getDx() {
            return this.dx;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dx);
        }

        public String toString() {
            return sg3.p("RelativeHorizontalTo(dx=", this.dx, ")");
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class RelativeLineTo extends PathNode {
        public static final int $stable = 0;
        private final float dx;
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RelativeLineTo(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.dx = r4
                r3.dy = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo.<init>(float, float):void");
        }

        public static /* synthetic */ RelativeLineTo copy$default(RelativeLineTo relativeLineTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeLineTo.dx;
            }
            if ((i & 2) != 0) {
                f2 = relativeLineTo.dy;
            }
            return relativeLineTo.copy(f, f2);
        }

        public final float component1() {
            return this.dx;
        }

        public final float component2() {
            return this.dy;
        }

        public final RelativeLineTo copy(float f, float f2) {
            return new RelativeLineTo(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeLineTo)) {
                return false;
            }
            RelativeLineTo relativeLineTo = (RelativeLineTo) obj;
            return Float.compare(this.dx, relativeLineTo.dx) == 0 && Float.compare(this.dy, relativeLineTo.dy) == 0;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dy) + (Float.floatToIntBits(this.dx) * 31);
        }

        public String toString() {
            return sg3.q("RelativeLineTo(dx=", this.dx, ", dy=", this.dy, ")");
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class RelativeMoveTo extends PathNode {
        public static final int $stable = 0;
        private final float dx;
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RelativeMoveTo(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.dx = r4
                r3.dy = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo.<init>(float, float):void");
        }

        public static /* synthetic */ RelativeMoveTo copy$default(RelativeMoveTo relativeMoveTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeMoveTo.dx;
            }
            if ((i & 2) != 0) {
                f2 = relativeMoveTo.dy;
            }
            return relativeMoveTo.copy(f, f2);
        }

        public final float component1() {
            return this.dx;
        }

        public final float component2() {
            return this.dy;
        }

        public final RelativeMoveTo copy(float f, float f2) {
            return new RelativeMoveTo(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeMoveTo)) {
                return false;
            }
            RelativeMoveTo relativeMoveTo = (RelativeMoveTo) obj;
            return Float.compare(this.dx, relativeMoveTo.dx) == 0 && Float.compare(this.dy, relativeMoveTo.dy) == 0;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dy) + (Float.floatToIntBits(this.dx) * 31);
        }

        public String toString() {
            return sg3.q("RelativeMoveTo(dx=", this.dx, ", dy=", this.dy, ")");
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class RelativeQuadTo extends PathNode {
        public static final int $stable = 0;
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeQuadTo(float f, float f2, float f3, float f4) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.dx1 = f;
            this.dy1 = f2;
            this.dx2 = f3;
            this.dy2 = f4;
        }

        public static /* synthetic */ RelativeQuadTo copy$default(RelativeQuadTo relativeQuadTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeQuadTo.dx1;
            }
            if ((i & 2) != 0) {
                f2 = relativeQuadTo.dy1;
            }
            if ((i & 4) != 0) {
                f3 = relativeQuadTo.dx2;
            }
            if ((i & 8) != 0) {
                f4 = relativeQuadTo.dy2;
            }
            return relativeQuadTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final RelativeQuadTo copy(float f, float f2, float f3, float f4) {
            return new RelativeQuadTo(f, f2, f3, f4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeQuadTo)) {
                return false;
            }
            RelativeQuadTo relativeQuadTo = (RelativeQuadTo) obj;
            return Float.compare(this.dx1, relativeQuadTo.dx1) == 0 && Float.compare(this.dy1, relativeQuadTo.dy1) == 0 && Float.compare(this.dx2, relativeQuadTo.dx2) == 0 && Float.compare(this.dy2, relativeQuadTo.dy2) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dy2) + yo0.i(this.dx2, yo0.i(this.dy1, Float.floatToIntBits(this.dx1) * 31, 31), 31);
        }

        public String toString() {
            float f = this.dx1;
            float f2 = this.dy1;
            float f3 = this.dx2;
            float f4 = this.dy2;
            StringBuilder v = yo0.v("RelativeQuadTo(dx1=", f, ", dy1=", f2, ", dx2=");
            v.append(f3);
            v.append(", dy2=");
            v.append(f4);
            v.append(")");
            return v.toString();
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class RelativeReflectiveCurveTo extends PathNode {
        public static final int $stable = 0;
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.dx1 = f;
            this.dy1 = f2;
            this.dx2 = f3;
            this.dy2 = f4;
        }

        public static /* synthetic */ RelativeReflectiveCurveTo copy$default(RelativeReflectiveCurveTo relativeReflectiveCurveTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeReflectiveCurveTo.dx1;
            }
            if ((i & 2) != 0) {
                f2 = relativeReflectiveCurveTo.dy1;
            }
            if ((i & 4) != 0) {
                f3 = relativeReflectiveCurveTo.dx2;
            }
            if ((i & 8) != 0) {
                f4 = relativeReflectiveCurveTo.dy2;
            }
            return relativeReflectiveCurveTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final RelativeReflectiveCurveTo copy(float f, float f2, float f3, float f4) {
            return new RelativeReflectiveCurveTo(f, f2, f3, f4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            RelativeReflectiveCurveTo relativeReflectiveCurveTo = (RelativeReflectiveCurveTo) obj;
            return Float.compare(this.dx1, relativeReflectiveCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeReflectiveCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeReflectiveCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeReflectiveCurveTo.dy2) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dy2) + yo0.i(this.dx2, yo0.i(this.dy1, Float.floatToIntBits(this.dx1) * 31, 31), 31);
        }

        public String toString() {
            float f = this.dx1;
            float f2 = this.dy1;
            float f3 = this.dx2;
            float f4 = this.dy2;
            StringBuilder v = yo0.v("RelativeReflectiveCurveTo(dx1=", f, ", dy1=", f2, ", dx2=");
            v.append(f3);
            v.append(", dy2=");
            v.append(f4);
            v.append(")");
            return v.toString();
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class RelativeReflectiveQuadTo extends PathNode {
        public static final int $stable = 0;
        private final float dx;
        private final float dy;

        public RelativeReflectiveQuadTo(float f, float f2) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.dx = f;
            this.dy = f2;
        }

        public static /* synthetic */ RelativeReflectiveQuadTo copy$default(RelativeReflectiveQuadTo relativeReflectiveQuadTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeReflectiveQuadTo.dx;
            }
            if ((i & 2) != 0) {
                f2 = relativeReflectiveQuadTo.dy;
            }
            return relativeReflectiveQuadTo.copy(f, f2);
        }

        public final float component1() {
            return this.dx;
        }

        public final float component2() {
            return this.dy;
        }

        public final RelativeReflectiveQuadTo copy(float f, float f2) {
            return new RelativeReflectiveQuadTo(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            RelativeReflectiveQuadTo relativeReflectiveQuadTo = (RelativeReflectiveQuadTo) obj;
            return Float.compare(this.dx, relativeReflectiveQuadTo.dx) == 0 && Float.compare(this.dy, relativeReflectiveQuadTo.dy) == 0;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dy) + (Float.floatToIntBits(this.dx) * 31);
        }

        public String toString() {
            return sg3.q("RelativeReflectiveQuadTo(dx=", this.dx, ", dy=", this.dy, ")");
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class RelativeVerticalTo extends PathNode {
        public static final int $stable = 0;
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RelativeVerticalTo(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.dy = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo.<init>(float):void");
        }

        public static /* synthetic */ RelativeVerticalTo copy$default(RelativeVerticalTo relativeVerticalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeVerticalTo.dy;
            }
            return relativeVerticalTo.copy(f);
        }

        public final float component1() {
            return this.dy;
        }

        public final RelativeVerticalTo copy(float f) {
            return new RelativeVerticalTo(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeVerticalTo) && Float.compare(this.dy, ((RelativeVerticalTo) obj).dy) == 0;
        }

        public final float getDy() {
            return this.dy;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dy);
        }

        public String toString() {
            return sg3.p("RelativeVerticalTo(dy=", this.dy, ")");
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class VerticalTo extends PathNode {
        public static final int $stable = 0;
        private final float y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public VerticalTo(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.y = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.VerticalTo.<init>(float):void");
        }

        public static /* synthetic */ VerticalTo copy$default(VerticalTo verticalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = verticalTo.y;
            }
            return verticalTo.copy(f);
        }

        public final float component1() {
            return this.y;
        }

        public final VerticalTo copy(float f) {
            return new VerticalTo(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalTo) && Float.compare(this.y, ((VerticalTo) obj).y) == 0;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.y);
        }

        public String toString() {
            return sg3.p("VerticalTo(y=", this.y, ")");
        }
    }

    private PathNode(boolean z, boolean z2) {
        this.isCurve = z;
        this.isQuad = z2;
    }

    public /* synthetic */ PathNode(boolean z, boolean z2, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, null);
    }

    public /* synthetic */ PathNode(boolean z, boolean z2, sb0 sb0Var) {
        this(z, z2);
    }

    public final boolean isCurve() {
        return this.isCurve;
    }

    public final boolean isQuad() {
        return this.isQuad;
    }
}
