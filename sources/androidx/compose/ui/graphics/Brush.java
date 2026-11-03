package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import defpackage.dv1;
import defpackage.sb0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class Brush {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long intrinsicSize;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m5285horizontalGradient8A3gB4$default(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m5726getClamp3opZhB0();
            }
            return companion.m5296horizontalGradient8A3gB4((List<Color>) list, f, f2, i);
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m5286horizontalGradient8A3gB4$default(Companion companion, dv1[] dv1VarArr, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m5726getClamp3opZhB0();
            }
            return companion.m5297horizontalGradient8A3gB4(dv1VarArr, f, f2, i);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m5287linearGradientmHitzGk$default(Companion companion, List list, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m5106getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = Offset.Companion.m5104getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m5726getClamp3opZhB0();
            }
            return companion.m5298linearGradientmHitzGk((List<Color>) list, j3, j4, i);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m5288linearGradientmHitzGk$default(Companion companion, dv1[] dv1VarArr, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m5106getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = Offset.Companion.m5104getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m5726getClamp3opZhB0();
            }
            return companion.m5299linearGradientmHitzGk(dv1VarArr, j3, j4, i);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m5289radialGradientP_VxKs$default(Companion companion, List list, long j, float f, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m5105getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m5726getClamp3opZhB0();
            }
            return companion.m5300radialGradientP_VxKs((List<Color>) list, j2, f2, i);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m5290radialGradientP_VxKs$default(Companion companion, dv1[] dv1VarArr, long j, float f, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m5105getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m5726getClamp3opZhB0();
            }
            return companion.m5301radialGradientP_VxKs(dv1VarArr, j2, f2, i);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m5291sweepGradientUv8p0NA$default(Companion companion, List list, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = Offset.Companion.m5105getUnspecifiedF1C5BW0();
            }
            return companion.m5302sweepGradientUv8p0NA((List<Color>) list, j);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m5292sweepGradientUv8p0NA$default(Companion companion, dv1[] dv1VarArr, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = Offset.Companion.m5105getUnspecifiedF1C5BW0();
            }
            return companion.m5303sweepGradientUv8p0NA(dv1VarArr, j);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m5293verticalGradient8A3gB4$default(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m5726getClamp3opZhB0();
            }
            return companion.m5304verticalGradient8A3gB4((List<Color>) list, f, f2, i);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m5294verticalGradient8A3gB4$default(Companion companion, dv1[] dv1VarArr, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m5726getClamp3opZhB0();
            }
            return companion.m5305verticalGradient8A3gB4(dv1VarArr, f, f2, i);
        }

        /* renamed from: composite-7EN7VTw, reason: not valid java name */
        public final Brush m5295composite7EN7VTw(Brush brush, Brush brush2, int i) {
            return new CompositeShaderBrush(BrushKt.toShaderBrush(brush), BrushKt.toShaderBrush(brush2), i, null);
        }

        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m5296horizontalGradient8A3gB4(List<Color> list, float f, float f2, int i) {
            return m5298linearGradientmHitzGk(list, Offset.m5082constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m5082constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), i);
        }

        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m5297horizontalGradient8A3gB4(dv1[] dv1VarArr, float f, float f2, int i) {
            return m5299linearGradientmHitzGk((dv1[]) Arrays.copyOf(dv1VarArr, dv1VarArr.length), Offset.m5082constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m5082constructorimpl((Float.floatToRawIntBits(f2) << 32) | (4294967295L & Float.floatToRawIntBits(0.0f))), i);
        }

        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m5298linearGradientmHitzGk(List<Color> list, long j, long j2, int i) {
            return new LinearGradient(list, null, j, j2, i, null);
        }

        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m5299linearGradientmHitzGk(dv1[] dv1VarArr, long j, long j2, int i) {
            ArrayList arrayList = new ArrayList(dv1VarArr.length);
            for (dv1 dv1Var : dv1VarArr) {
                arrayList.add(Color.m5322boximpl(((Color) dv1Var.b).m5342unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(dv1VarArr.length);
            for (dv1 dv1Var2 : dv1VarArr) {
                arrayList2.add(Float.valueOf(((Number) dv1Var2.a).floatValue()));
            }
            return new LinearGradient(arrayList, arrayList2, j, j2, i, null);
        }

        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m5300radialGradientP_VxKs(List<Color> list, long j, float f, int i) {
            return new RadialGradient(list, null, j, f, i, null);
        }

        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m5301radialGradientP_VxKs(dv1[] dv1VarArr, long j, float f, int i) {
            ArrayList arrayList = new ArrayList(dv1VarArr.length);
            for (dv1 dv1Var : dv1VarArr) {
                arrayList.add(Color.m5322boximpl(((Color) dv1Var.b).m5342unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(dv1VarArr.length);
            for (dv1 dv1Var2 : dv1VarArr) {
                arrayList2.add(Float.valueOf(((Number) dv1Var2.a).floatValue()));
            }
            return new RadialGradient(arrayList, arrayList2, j, f, i, null);
        }

        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m5302sweepGradientUv8p0NA(List<Color> list, long j) {
            return new SweepGradient(j, list, null, null);
        }

        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m5303sweepGradientUv8p0NA(dv1[] dv1VarArr, long j) {
            ArrayList arrayList = new ArrayList(dv1VarArr.length);
            for (dv1 dv1Var : dv1VarArr) {
                arrayList.add(Color.m5322boximpl(((Color) dv1Var.b).m5342unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(dv1VarArr.length);
            for (dv1 dv1Var2 : dv1VarArr) {
                arrayList2.add(Float.valueOf(((Number) dv1Var2.a).floatValue()));
            }
            return new SweepGradient(j, arrayList, arrayList2, null);
        }

        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m5304verticalGradient8A3gB4(List<Color> list, float f, float f2, int i) {
            return m5298linearGradientmHitzGk(list, Offset.m5082constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), Offset.m5082constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), i);
        }

        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m5305verticalGradient8A3gB4(dv1[] dv1VarArr, float f, float f2, int i) {
            return m5299linearGradientmHitzGk((dv1[]) Arrays.copyOf(dv1VarArr, dv1VarArr.length), Offset.m5082constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), Offset.m5082constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), i);
        }
    }

    private Brush() {
        this.intrinsicSize = Size.Companion.m5167getUnspecifiedNHjbRc();
    }

    public /* synthetic */ Brush(sb0 sb0Var) {
        this();
    }

    /* renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public abstract void mo5283applyToPq9zytI(long j, Paint paint, float f);

    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo5284getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }
}
