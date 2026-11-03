package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Placeable;
import defpackage.sb0;
import defpackage.ts0;
import defpackage.ux0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class HorizontalRuler extends Ruler {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float maxOf$lambda$0(HorizontalRuler[] horizontalRulerArr, Placeable.PlacementScope placementScope, float f) {
            return RulerKt.access$mergeRulerValues(placementScope, true, horizontalRulerArr, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float minOf$lambda$0(HorizontalRuler[] horizontalRulerArr, Placeable.PlacementScope placementScope, float f) {
            return RulerKt.access$mergeRulerValues(placementScope, false, horizontalRulerArr, f);
        }

        public final HorizontalRuler derived(ts0 ts0Var) {
            return new HorizontalRuler(ts0Var, null);
        }

        public final HorizontalRuler maxOf(HorizontalRuler... horizontalRulerArr) {
            return new HorizontalRuler(new ux0(horizontalRulerArr, 1), null);
        }

        public final HorizontalRuler minOf(HorizontalRuler... horizontalRulerArr) {
            return new HorizontalRuler(new ux0(horizontalRulerArr, 0), null);
        }
    }

    public HorizontalRuler() {
        this(null);
    }

    private HorizontalRuler(ts0 ts0Var) {
        super(ts0Var, null);
    }

    public /* synthetic */ HorizontalRuler(ts0 ts0Var, sb0 sb0Var) {
        this(ts0Var);
    }

    @Override // androidx.compose.ui.layout.Ruler
    public float calculateCoordinate$ui(float f, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        return Float.intBitsToFloat((int) (layoutCoordinates2.mo6713localPositionOfR5De75A(layoutCoordinates, Offset.m5082constructorimpl((Float.floatToRawIntBits(((int) (layoutCoordinates.mo6712getSizeYbymL2g() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L))) & 4294967295L));
    }
}
