package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Placeable;
import defpackage.sb0;
import defpackage.ts0;
import defpackage.w63;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class VerticalRuler extends Ruler {
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
        public static final float maxOf$lambda$0(VerticalRuler[] verticalRulerArr, Placeable.PlacementScope placementScope, float f) {
            return RulerKt.access$mergeRulerValues(placementScope, true, verticalRulerArr, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float minOf$lambda$0(VerticalRuler[] verticalRulerArr, Placeable.PlacementScope placementScope, float f) {
            return RulerKt.access$mergeRulerValues(placementScope, false, verticalRulerArr, f);
        }

        public final VerticalRuler derived(ts0 ts0Var) {
            return new VerticalRuler(ts0Var, null);
        }

        public final VerticalRuler maxOf(VerticalRuler... verticalRulerArr) {
            return derived(new w63(verticalRulerArr, 1));
        }

        public final VerticalRuler minOf(VerticalRuler... verticalRulerArr) {
            return derived(new w63(verticalRulerArr, 0));
        }
    }

    public VerticalRuler() {
        this(null);
    }

    private VerticalRuler(ts0 ts0Var) {
        super(ts0Var, null);
    }

    public /* synthetic */ VerticalRuler(ts0 ts0Var, sb0 sb0Var) {
        this(ts0Var);
    }

    @Override // androidx.compose.ui.layout.Ruler
    public float calculateCoordinate$ui(float f, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        float mo6712getSizeYbymL2g = ((int) (layoutCoordinates.mo6712getSizeYbymL2g() & 4294967295L)) / 2.0f;
        return Float.intBitsToFloat((int) (layoutCoordinates2.mo6713localPositionOfR5De75A(layoutCoordinates, Offset.m5082constructorimpl((Float.floatToRawIntBits(mo6712getSizeYbymL2g) & 4294967295L) | (Float.floatToRawIntBits(f) << 32))) >> 32));
    }
}
