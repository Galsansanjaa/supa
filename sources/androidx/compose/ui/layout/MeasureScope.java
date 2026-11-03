package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.DpRect;
import defpackage.f31;
import defpackage.lt;
import defpackage.pi0;
import defpackage.ps0;
import defpackage.ts0;
import defpackage.vg1;
import defpackage.yo0;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@MeasureScopeMarker
/* loaded from: classes3.dex */
public interface MeasureScope extends IntrinsicMeasureScope {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isLookingAhead(MeasureScope measureScope) {
            return false;
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i, int i2, Map<AlignmentLine, Integer> map, ps0 ps0Var) {
            return measureScope.layout(i, i2, map, null, ps0Var);
        }

        @Deprecated
        public static MeasureResult layout(final MeasureScope measureScope, final int i, final int i2, final Map<AlignmentLine, Integer> map, final ps0 ps0Var, final ps0 ps0Var2) {
            if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
                InlineClassHelperKt.throwIllegalStateException("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new MeasureResult(i, i2, map, ps0Var, measureScope, ps0Var2) { // from class: androidx.compose.ui.layout.MeasureScope$layout$1
                final /* synthetic */ ps0 $placementBlock;
                final /* synthetic */ int $width;
                private final Map<AlignmentLine, Integer> alignmentLines;
                private final int height;
                private final ps0 rulers;
                final /* synthetic */ MeasureScope this$0;
                private final int width;

                {
                    this.$width = i;
                    this.this$0 = measureScope;
                    this.$placementBlock = ps0Var2;
                    this.width = i;
                    this.height = i2;
                    this.alignmentLines = map;
                    this.rulers = ps0Var;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return this.alignmentLines;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return this.height;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final ts0 getRulerProvider() {
                    return null;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public ps0 getRulers() {
                    return this.rulers;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return this.width;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final ps0 isRulerProvided() {
                    return null;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    MeasureScope measureScope2 = this.this$0;
                    boolean z = measureScope2 instanceof LookaheadCapablePlaceable;
                    ps0 ps0Var3 = this.$placementBlock;
                    if (z) {
                        ps0Var3.invoke(((LookaheadCapablePlaceable) measureScope2).getPlacementScope());
                    } else {
                        ps0Var3.invoke(new SimplePlacementScope(this.$width, this.this$0.getLayoutDirection(), this.this$0.getDensity(), this.this$0.getFontScale()));
                    }
                }
            };
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i, int i2, ps0 ps0Var, ts0 ts0Var, Map<AlignmentLine, Integer> map, ps0 ps0Var2) {
            return vg1.f(measureScope, i, i2, ps0Var, ts0Var, map, ps0Var2);
        }

        public static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i, int i2, ps0 ps0Var, ts0 ts0Var, Map map, ps0 ps0Var2, int i3, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: layout");
                return null;
            }
            if ((i3 & 16) != 0) {
                map = pi0.a;
            }
            return measureScope.layout(i, i2, ps0Var, ts0Var, map, ps0Var2);
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m6735roundToPxR2X_6o(MeasureScope measureScope, long j) {
            return lt.a(measureScope, j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m6736roundToPx0680j_4(MeasureScope measureScope, float f) {
            return lt.b(measureScope, f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m6737toDpGaN1DYA(MeasureScope measureScope, long j) {
            return yo0.b(measureScope, j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6738toDpu2uoSUM(MeasureScope measureScope, float f) {
            return lt.d(measureScope, f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6739toDpu2uoSUM(MeasureScope measureScope, int i) {
            return lt.e(measureScope, i);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m6740toDpSizekrfVVM(MeasureScope measureScope, long j) {
            return lt.f(measureScope, j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m6741toPxR2X_6o(MeasureScope measureScope, long j) {
            return lt.g(measureScope, j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m6742toPx0680j_4(MeasureScope measureScope, float f) {
            return measureScope.getDensity() * f;
        }

        @Deprecated
        public static Rect toRect(MeasureScope measureScope, DpRect dpRect) {
            return lt.h(measureScope, dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m6743toSizeXkaWNTQ(MeasureScope measureScope, long j) {
            return lt.i(measureScope, j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m6744toSp0xMU5do(MeasureScope measureScope, float f) {
            return yo0.c(measureScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6745toSpkPz2Gy4(MeasureScope measureScope, float f) {
            return lt.j(measureScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6746toSpkPz2Gy4(MeasureScope measureScope, int i) {
            return lt.k(measureScope, i);
        }
    }

    MeasureResult layout(int i, int i2, Map<AlignmentLine, Integer> map, ps0 ps0Var);

    MeasureResult layout(int i, int i2, Map<AlignmentLine, Integer> map, ps0 ps0Var, ps0 ps0Var2);

    MeasureResult layout(int i, int i2, ps0 ps0Var, ts0 ts0Var, Map<AlignmentLine, Integer> map, ps0 ps0Var2);
}
