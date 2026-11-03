package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.MotionReferencePlacementDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ea0;
import defpackage.f31;
import defpackage.lt;
import defpackage.ps0;
import defpackage.vg1;
import defpackage.yo0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private int width;
    private long measuredSize = IntSize.m8211constructorimpl(0);
    private long measurementConstraints = PlaceableKt.access$getDefaultConstraints$p();
    private long apparentToRealOffset = IntOffset.Companion.m8184getZeronOccac();

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    @PlacementScopeMarker
    /* loaded from: classes3.dex */
    public static abstract class PlacementScope implements Density {
        public static final int $stable = 0;
        private boolean motionFrameOfReferencePlacement;

        public static final /* synthetic */ void access$handleMotionFrameOfReferencePlacement(PlacementScope placementScope, Placeable placeable) {
            placementScope.handleMotionFrameOfReferencePlacement(placeable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMotionFrameOfReferencePlacement(Placeable placeable) {
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).updatePlacedUnderMotionFrameOfReference(this.motionFrameOfReferencePlacement);
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: place");
                return;
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.place(placeable, i, i2, f);
        }

        /* renamed from: place-70tqf50$default */
        public static /* synthetic */ void m6757place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: place-70tqf50");
                return;
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m6763place70tqf50(placeable, j, f);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: placeRelative");
                return;
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelative(placeable, i, i2, f);
        }

        /* renamed from: placeRelative-70tqf50$default */
        public static /* synthetic */ void m6758placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
                return;
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m6768placeRelative70tqf50(placeable, j, f);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, ps0 ps0Var, int i3, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
                return;
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                ps0Var = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, f2, ps0Var);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f, int i3, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
                return;
            }
            if ((i3 & 8) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, graphicsLayer, f);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default */
        public static /* synthetic */ void m6759placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, ps0 ps0Var, int i, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
                return;
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                ps0Var = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m6769placeRelativeWithLayeraW9wM(placeable, j, f2, ps0Var);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default */
        public static /* synthetic */ void m6760placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, GraphicsLayer graphicsLayer, float f, int i, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
                return;
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            placementScope.m6770placeRelativeWithLayeraW9wM(placeable, j, graphicsLayer, f);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, ps0 ps0Var, int i3, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: placeWithLayer");
                return;
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                ps0Var = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i, i2, f2, ps0Var);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f, int i3, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: placeWithLayer");
                return;
            }
            if ((i3 & 8) != 0) {
                f = 0.0f;
            }
            placementScope.placeWithLayer(placeable, i, i2, graphicsLayer, f);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default */
        public static /* synthetic */ void m6761placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, ps0 ps0Var, int i, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
                return;
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                ps0Var = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m6771placeWithLayeraW9wM(placeable, j, f2, ps0Var);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default */
        public static /* synthetic */ void m6762placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, GraphicsLayer graphicsLayer, float f, int i, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
                return;
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            placementScope.m6772placeWithLayeraW9wM(placeable, j, graphicsLayer, f);
        }

        public float current(Ruler ruler, float f) {
            return f;
        }

        public LayoutCoordinates getCoordinates() {
            return null;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return 1.0f;
        }

        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(Placeable placeable, int i, int i2, float f) {
            placeable.mo6711placeAtf8xVGno(vg1.v(this, placeable, placeable, IntOffset.m8167constructorimpl((i2 & 4294967295L) | (i << 32))), f, (ps0) null);
        }

        /* renamed from: place-70tqf50 */
        public final void m6763place70tqf50(Placeable placeable, long j, float f) {
            placeable.mo6711placeAtf8xVGno(vg1.v(this, placeable, placeable, j), f, (ps0) null);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui */
        public final void m6764placeApparentToRealOffsetaW9wM$ui(Placeable placeable, long j, float f, GraphicsLayer graphicsLayer) {
            placeable.mo6754placeAtf8xVGno(vg1.v(this, placeable, placeable, j), f, graphicsLayer);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui */
        public final void m6765placeApparentToRealOffsetaW9wM$ui(Placeable placeable, long j, float f, ps0 ps0Var) {
            placeable.mo6711placeAtf8xVGno(vg1.v(this, placeable, placeable, j), f, ps0Var);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui */
        public final void m6766placeAutoMirroredaW9wM$ui(Placeable placeable, long j, float f, GraphicsLayer graphicsLayer) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6754placeAtf8xVGno(vg1.v(this, placeable, placeable, j), f, graphicsLayer);
                return;
            }
            placeable.mo6754placeAtf8xVGno(vg1.v(this, placeable, placeable, IntOffset.m8167constructorimpl((IntOffset.m8174getYimpl(j) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m8173getXimpl(j)) << 32))), f, graphicsLayer);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui */
        public final void m6767placeAutoMirroredaW9wM$ui(Placeable placeable, long j, float f, ps0 ps0Var) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6711placeAtf8xVGno(vg1.v(this, placeable, placeable, j), f, ps0Var);
                return;
            }
            placeable.mo6711placeAtf8xVGno(vg1.v(this, placeable, placeable, IntOffset.m8167constructorimpl((IntOffset.m8174getYimpl(j) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m8173getXimpl(j)) << 32))), f, ps0Var);
        }

        public final void placeRelative(Placeable placeable, int i, int i2, float f) {
            long m8167constructorimpl = IntOffset.m8167constructorimpl((i << 32) | (i2 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6711placeAtf8xVGno(vg1.v(this, placeable, placeable, m8167constructorimpl), f, (ps0) null);
            } else {
                placeable.mo6711placeAtf8xVGno(vg1.v(this, placeable, placeable, IntOffset.m8167constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m8173getXimpl(m8167constructorimpl)) << 32) | (IntOffset.m8174getYimpl(m8167constructorimpl) & 4294967295L))), f, (ps0) null);
            }
        }

        /* renamed from: placeRelative-70tqf50 */
        public final void m6768placeRelative70tqf50(Placeable placeable, long j, float f) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6711placeAtf8xVGno(vg1.v(this, placeable, placeable, j), f, (ps0) null);
                return;
            }
            placeable.mo6711placeAtf8xVGno(vg1.v(this, placeable, placeable, IntOffset.m8167constructorimpl((IntOffset.m8174getYimpl(j) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m8173getXimpl(j)) << 32))), f, (ps0) null);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i, int i2, float f, ps0 ps0Var) {
            long m8167constructorimpl = IntOffset.m8167constructorimpl((i << 32) | (i2 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6711placeAtf8xVGno(vg1.v(this, placeable, placeable, m8167constructorimpl), f, ps0Var);
            } else {
                placeable.mo6711placeAtf8xVGno(vg1.v(this, placeable, placeable, IntOffset.m8167constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m8173getXimpl(m8167constructorimpl)) << 32) | (IntOffset.m8174getYimpl(m8167constructorimpl) & 4294967295L))), f, ps0Var);
            }
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f) {
            long m8167constructorimpl = IntOffset.m8167constructorimpl((i << 32) | (i2 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6754placeAtf8xVGno(vg1.v(this, placeable, placeable, m8167constructorimpl), f, graphicsLayer);
            } else {
                placeable.mo6754placeAtf8xVGno(vg1.v(this, placeable, placeable, IntOffset.m8167constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m8173getXimpl(m8167constructorimpl)) << 32) | (IntOffset.m8174getYimpl(m8167constructorimpl) & 4294967295L))), f, graphicsLayer);
            }
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM */
        public final void m6769placeRelativeWithLayeraW9wM(Placeable placeable, long j, float f, ps0 ps0Var) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6711placeAtf8xVGno(vg1.v(this, placeable, placeable, j), f, ps0Var);
                return;
            }
            placeable.mo6711placeAtf8xVGno(vg1.v(this, placeable, placeable, IntOffset.m8167constructorimpl((IntOffset.m8174getYimpl(j) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m8173getXimpl(j)) << 32))), f, ps0Var);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM */
        public final void m6770placeRelativeWithLayeraW9wM(Placeable placeable, long j, GraphicsLayer graphicsLayer, float f) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6754placeAtf8xVGno(vg1.v(this, placeable, placeable, j), f, graphicsLayer);
                return;
            }
            placeable.mo6754placeAtf8xVGno(vg1.v(this, placeable, placeable, IntOffset.m8167constructorimpl((IntOffset.m8174getYimpl(j) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m8173getXimpl(j)) << 32))), f, graphicsLayer);
        }

        public final void placeWithLayer(Placeable placeable, int i, int i2, float f, ps0 ps0Var) {
            placeable.mo6711placeAtf8xVGno(vg1.v(this, placeable, placeable, IntOffset.m8167constructorimpl((i2 & 4294967295L) | (i << 32))), f, ps0Var);
        }

        public final void placeWithLayer(Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f) {
            placeable.mo6754placeAtf8xVGno(vg1.v(this, placeable, placeable, IntOffset.m8167constructorimpl((i2 & 4294967295L) | (i << 32))), f, graphicsLayer);
        }

        /* renamed from: placeWithLayer-aW-9-wM */
        public final void m6771placeWithLayeraW9wM(Placeable placeable, long j, float f, ps0 ps0Var) {
            placeable.mo6711placeAtf8xVGno(vg1.v(this, placeable, placeable, j), f, ps0Var);
        }

        /* renamed from: placeWithLayer-aW-9-wM */
        public final void m6772placeWithLayeraW9wM(Placeable placeable, long j, GraphicsLayer graphicsLayer, float f) {
            placeable.mo6754placeAtf8xVGno(vg1.v(this, placeable, placeable, j), f, graphicsLayer);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public final int mo466roundToPxR2X_6o(long j) {
            return Math.round(mo472toPxR2X_6o(j));
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public final /* synthetic */ int mo467roundToPx0680j_4(float f) {
            return lt.b(this, f);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public final /* synthetic */ float mo468toDpGaN1DYA(long j) {
            return yo0.b(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public final float mo469toDpu2uoSUM(float f) {
            return Dp.m8049constructorimpl(f / getDensity());
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public final float mo470toDpu2uoSUM(int i) {
            return Dp.m8049constructorimpl(i / getDensity());
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public final /* synthetic */ long mo471toDpSizekrfVVM(long j) {
            return lt.f(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public final /* synthetic */ float mo472toPxR2X_6o(long j) {
            return lt.g(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public final float mo473toPx0680j_4(float f) {
            return getDensity() * f;
        }

        @Override // androidx.compose.ui.unit.Density
        public final /* synthetic */ Rect toRect(DpRect dpRect) {
            return lt.h(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public final /* synthetic */ long mo474toSizeXkaWNTQ(long j) {
            return lt.i(this, j);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public final /* synthetic */ long mo475toSp0xMU5do(float f) {
            return yo0.c(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public final long mo476toSpkPz2Gy4(float f) {
            return mo475toSp0xMU5do(mo469toDpu2uoSUM(f));
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public final long mo477toSpkPz2Gy4(int i) {
            return mo475toSp0xMU5do(mo470toDpu2uoSUM(i));
        }

        public final void withMotionFrameOfReferencePlacement(ps0 ps0Var) {
            this.motionFrameOfReferencePlacement = true;
            ps0Var.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }
    }

    public Placeable() {
        long j;
        j = PlaceableKt.DefaultConstraints;
        this.measurementConstraints = j;
        this.apparentToRealOffset = IntOffset.Companion.m8184getZeronOccac();
    }

    /* renamed from: access$getApparentToRealOffset-nOcc-ac */
    public static final /* synthetic */ long m6748access$getApparentToRealOffsetnOccac(Placeable placeable) {
        return placeable.apparentToRealOffset;
    }

    private final void onMeasuredSizeChanged() {
        this.width = ea0.o((int) (this.measuredSize >> 32), Constraints.m8016getMinWidthimpl(this.measurementConstraints), Constraints.m8014getMaxWidthimpl(this.measurementConstraints));
        this.height = ea0.o((int) (this.measuredSize & 4294967295L), Constraints.m8015getMinHeightimpl(this.measurementConstraints), Constraints.m8013getMaxHeightimpl(this.measurementConstraints));
        int i = this.width;
        long j = this.measuredSize;
        this.apparentToRealOffset = IntOffset.m8167constructorimpl((((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2)));
    }

    /* renamed from: getApparentToRealOffset-nOcc-ac */
    public final long m6751getApparentToRealOffsetnOccac() {
        return this.apparentToRealOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return (int) (this.measuredSize & 4294967295L);
    }

    /* renamed from: getMeasuredSize-YbymL2g */
    public final long m6752getMeasuredSizeYbymL2g() {
        return this.measuredSize;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return (int) (this.measuredSize >> 32);
    }

    /* renamed from: getMeasurementConstraints-msEJaDk */
    public final long m6753getMeasurementConstraintsmsEJaDk() {
        return this.measurementConstraints;
    }

    @Override // androidx.compose.ui.layout.Measured
    public Object getParentData() {
        return null;
    }

    public final int getWidth() {
        return this.width;
    }

    /* renamed from: placeAt-f8xVGno */
    public void mo6754placeAtf8xVGno(long j, float f, GraphicsLayer graphicsLayer) {
        mo6711placeAtf8xVGno(j, f, (ps0) null);
    }

    /* renamed from: placeAt-f8xVGno */
    public abstract void mo6711placeAtf8xVGno(long j, float f, ps0 ps0Var);

    /* renamed from: setMeasuredSize-ozmzZPI */
    public final void m6755setMeasuredSizeozmzZPI(long j) {
        if (IntSize.m8214equalsimpl0(this.measuredSize, j)) {
            return;
        }
        this.measuredSize = j;
        onMeasuredSizeChanged();
    }

    /* renamed from: setMeasurementConstraints-BRTryo0 */
    public final void m6756setMeasurementConstraintsBRTryo0(long j) {
        if (Constraints.m8007equalsimpl0(this.measurementConstraints, j)) {
            return;
        }
        this.measurementConstraints = j;
        onMeasuredSizeChanged();
    }
}
