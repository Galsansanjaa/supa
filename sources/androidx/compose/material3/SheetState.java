package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import defpackage.a10;
import defpackage.cc2;
import defpackage.e50;
import defpackage.g8;
import defpackage.hd0;
import defpackage.hu2;
import defpackage.mi2;
import defpackage.nb2;
import defpackage.os0;
import defpackage.ps0;
import defpackage.s4;
import defpackage.sb0;
import defpackage.v5;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SheetState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private AnimationSpec<Float> anchoredDraggableMotionSpec;
    private AnchoredDraggableState<SheetValue> anchoredDraggableState;
    private final ps0 confirmValueChange;
    private FiniteAnimationSpec<Float> hideMotionSpec;
    private FiniteAnimationSpec<Float> showMotionSpec;
    private final boolean skipHiddenState;
    private final boolean skipPartiallyExpanded;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public static final SheetValue Saver$lambda$0(SaverScope saverScope, SheetState sheetState) {
            return sheetState.getCurrentValue();
        }

        public static final SheetState Saver$lambda$1(boolean z, os0 os0Var, os0 os0Var2, ps0 ps0Var, boolean z2, SheetValue sheetValue) {
            return new SheetState(z, os0Var, os0Var2, sheetValue, ps0Var, z2);
        }

        public static final float Saver$lambda$3(Density density) {
            return density.mo473toPx0680j_4(BottomSheetDefaults.INSTANCE.m2266getPositionalThresholdD9Ej5fM$material3());
        }

        public static final float Saver$lambda$5(Density density) {
            return density.mo473toPx0680j_4(BottomSheetDefaults.INSTANCE.m2269getVelocityThresholdD9Ej5fM$material3());
        }

        public final Saver<SheetState, SheetValue> Saver(final boolean z, final os0 os0Var, final os0 os0Var2, final ps0 ps0Var, final boolean z2) {
            return SaverKt.Saver(new nb2(29), new ps0() { // from class: ni2
                @Override // defpackage.ps0
                public final Object invoke(Object obj) {
                    SheetState Saver$lambda$1;
                    Saver$lambda$1 = SheetState.Companion.Saver$lambda$1(z, os0Var, os0Var2, ps0Var, z2, (SheetValue) obj);
                    return Saver$lambda$1;
                }
            });
        }

        @hd0
        public final /* synthetic */ Saver Saver(boolean z, ps0 ps0Var, Density density, boolean z2) {
            return Saver(z, new s4(density, 4), new s4(density, 5), ps0Var, z2);
        }
    }

    @hd0
    public /* synthetic */ SheetState(boolean z, Density density, SheetValue sheetValue, ps0 ps0Var, boolean z2) {
        this(z, new s4(density, 2), new s4(density, 3), sheetValue, ps0Var, z2);
    }

    public /* synthetic */ SheetState(boolean z, Density density, SheetValue sheetValue, ps0 ps0Var, boolean z2, int i, sb0 sb0Var) {
        this(z, density, (i & 4) != 0 ? SheetValue.Hidden : sheetValue, (i & 8) != 0 ? new cc2(12) : ps0Var, (i & 16) != 0 ? false : z2);
    }

    public SheetState(boolean z, os0 os0Var, os0 os0Var2, SheetValue sheetValue, ps0 ps0Var, boolean z2) {
        AnimationSpec<Float> animationSpec;
        this.skipPartiallyExpanded = z;
        this.confirmValueChange = ps0Var;
        this.skipHiddenState = z2;
        if (z && sheetValue == SheetValue.PartiallyExpanded) {
            v5.m("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        if (z2 && sheetValue == SheetValue.Hidden) {
            v5.m("The initial value must not be set to Hidden if skipHiddenState is set to true.");
            throw null;
        }
        animationSpec = SheetDefaultsKt.BottomSheetAnimationSpec;
        this.anchoredDraggableMotionSpec = animationSpec;
        this.anchoredDraggableState = new AnchoredDraggableState<>(sheetValue, new g8(os0Var, 11), os0Var2, new mi2(this, 0), ps0Var);
        this.showMotionSpec = AnimationSpecKt.snap$default(0, 1, null);
        this.hideMotionSpec = AnimationSpecKt.snap$default(0, 1, null);
    }

    public /* synthetic */ SheetState(boolean z, os0 os0Var, os0 os0Var2, SheetValue sheetValue, ps0 ps0Var, boolean z2, int i, sb0 sb0Var) {
        this(z, os0Var, os0Var2, (i & 8) != 0 ? SheetValue.Hidden : sheetValue, (i & 16) != 0 ? new cc2(11) : ps0Var, (i & 32) != 0 ? false : z2);
    }

    public static final boolean _init_$lambda$0(SheetValue sheetValue) {
        return true;
    }

    public static final float _init_$lambda$11(Density density) {
        return density.mo473toPx0680j_4(BottomSheetDefaults.INSTANCE.m2269getVelocityThresholdD9Ej5fM$material3());
    }

    public static final boolean _init_$lambda$7(SheetValue sheetValue) {
        return true;
    }

    public static final float _init_$lambda$9(Density density) {
        return density.mo473toPx0680j_4(BottomSheetDefaults.INSTANCE.m2266getPositionalThresholdD9Ej5fM$material3());
    }

    public static /* synthetic */ boolean a(SheetValue sheetValue) {
        return _init_$lambda$0(sheetValue);
    }

    public static final float anchoredDraggableState$lambda$5(os0 os0Var, float f) {
        return ((Number) os0Var.invoke()).floatValue();
    }

    public static /* synthetic */ Object animateTo$material3$default(SheetState sheetState, SheetValue sheetValue, FiniteAnimationSpec finiteAnimationSpec, float f, a10 a10Var, int i, Object obj) {
        if ((i & 4) != 0) {
            f = sheetState.anchoredDraggableState.getLastVelocity();
        }
        return sheetState.animateTo$material3(sheetValue, finiteAnimationSpec, f, a10Var);
    }

    public static /* synthetic */ boolean e(SheetValue sheetValue) {
        return _init_$lambda$7(sheetValue);
    }

    public final Object animateTo$material3(SheetValue sheetValue, FiniteAnimationSpec<Float> finiteAnimationSpec, float f, a10 a10Var) {
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.anchoredDraggableState, sheetValue, null, new SheetState$animateTo$2(this, f, finiteAnimationSpec, null), a10Var, 2, null);
        return anchoredDrag$default == e50.a ? anchoredDrag$default : vy2.a;
    }

    public final Object expand(a10 a10Var) {
        Object animateTo$material3$default;
        ps0 ps0Var = this.confirmValueChange;
        SheetValue sheetValue = SheetValue.Expanded;
        return (((Boolean) ps0Var.invoke(sheetValue)).booleanValue() && (animateTo$material3$default = animateTo$material3$default(this, sheetValue, this.showMotionSpec, 0.0f, a10Var, 4, null)) == e50.a) ? animateTo$material3$default : vy2.a;
    }

    public final AnimationSpec<Float> getAnchoredDraggableMotionSpec$material3() {
        return this.anchoredDraggableMotionSpec;
    }

    public final AnchoredDraggableState<SheetValue> getAnchoredDraggableState$material3() {
        return this.anchoredDraggableState;
    }

    public final ps0 getConfirmValueChange$material3() {
        return this.confirmValueChange;
    }

    public final SheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final boolean getHasExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.Expanded);
    }

    public final boolean getHasPartiallyExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.PartiallyExpanded);
    }

    public final FiniteAnimationSpec<Float> getHideMotionSpec$material3() {
        return this.hideMotionSpec;
    }

    public final float getOffset$material3() {
        return this.anchoredDraggableState.getOffset();
    }

    public final FiniteAnimationSpec<Float> getShowMotionSpec$material3() {
        return this.showMotionSpec;
    }

    public final boolean getSkipHiddenState$material3() {
        return this.skipHiddenState;
    }

    public final boolean getSkipPartiallyExpanded$material3() {
        return this.skipPartiallyExpanded;
    }

    public final SheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final Object hide(a10 a10Var) {
        Object animateTo$material3$default;
        if (this.skipHiddenState) {
            hu2.h("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
            return null;
        }
        ps0 ps0Var = this.confirmValueChange;
        SheetValue sheetValue = SheetValue.Hidden;
        return (((Boolean) ps0Var.invoke(sheetValue)).booleanValue() && (animateTo$material3$default = animateTo$material3$default(this, sheetValue, this.hideMotionSpec, 0.0f, a10Var, 4, null)) == e50.a) ? animateTo$material3$default : vy2.a;
    }

    public final boolean isAnimationRunning() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final boolean isVisible() {
        return this.anchoredDraggableState.getCurrentValue() != SheetValue.Hidden;
    }

    public final Object partialExpand(a10 a10Var) {
        Object animateTo$material3$default;
        if (this.skipPartiallyExpanded) {
            hu2.h("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        ps0 ps0Var = this.confirmValueChange;
        SheetValue sheetValue = SheetValue.PartiallyExpanded;
        return (((Boolean) ps0Var.invoke(sheetValue)).booleanValue() && (animateTo$material3$default = animateTo$material3$default(this, sheetValue, this.hideMotionSpec, 0.0f, a10Var, 4, null)) == e50.a) ? animateTo$material3$default : vy2.a;
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setAnchoredDraggableMotionSpec$material3(AnimationSpec<Float> animationSpec) {
        this.anchoredDraggableMotionSpec = animationSpec;
    }

    public final void setAnchoredDraggableState$material3(AnchoredDraggableState<SheetValue> anchoredDraggableState) {
        this.anchoredDraggableState = anchoredDraggableState;
    }

    public final void setHideMotionSpec$material3(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.hideMotionSpec = finiteAnimationSpec;
    }

    public final void setShowMotionSpec$material3(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.showMotionSpec = finiteAnimationSpec;
    }

    public final Object settle$material3(float f, a10 a10Var) {
        Object obj = this.anchoredDraggableState.settle(f, a10Var);
        return obj == e50.a ? obj : vy2.a;
    }

    public final Object show(a10 a10Var) {
        Object animateTo$material3$default;
        SheetValue sheetValue = getHasPartiallyExpandedState() ? SheetValue.PartiallyExpanded : SheetValue.Expanded;
        return (((Boolean) this.confirmValueChange.invoke(sheetValue)).booleanValue() && (animateTo$material3$default = animateTo$material3$default(this, sheetValue, this.showMotionSpec, 0.0f, a10Var, 4, null)) == e50.a) ? animateTo$material3$default : vy2.a;
    }

    public final Object snapTo$material3(SheetValue sheetValue, a10 a10Var) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, sheetValue, a10Var);
        return snapTo == e50.a ? snapTo : vy2.a;
    }
}
