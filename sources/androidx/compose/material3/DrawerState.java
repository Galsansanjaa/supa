package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import defpackage.a10;
import defpackage.e50;
import defpackage.hd0;
import defpackage.kf0;
import defpackage.mh0;
import defpackage.ps0;
import defpackage.sb0;
import defpackage.ua0;
import defpackage.vy2;
import defpackage.y4;
import defpackage.z72;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class DrawerState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private FiniteAnimationSpec<Float> anchoredDraggableMotionSpec;
    private final AnchoredDraggableState<DrawerValue> anchoredDraggableState;
    private FiniteAnimationSpec<Float> closeDrawerMotionSpec;
    private final ps0 confirmStateChange;
    private final MutableState density$delegate;
    private final State<Float> offset;
    private FiniteAnimationSpec<Float> openDrawerMotionSpec;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public static final DrawerValue Saver$lambda$0(SaverScope saverScope, DrawerState drawerState) {
            return drawerState.getCurrentValue();
        }

        public static final DrawerState Saver$lambda$1(ps0 ps0Var, DrawerValue drawerValue) {
            return new DrawerState(drawerValue, ps0Var);
        }

        public static /* synthetic */ DrawerState a(ps0 ps0Var, DrawerValue drawerValue) {
            return Saver$lambda$1(ps0Var, drawerValue);
        }

        public static /* synthetic */ DrawerValue b(SaverScope saverScope, DrawerState drawerState) {
            return Saver$lambda$0(saverScope, drawerState);
        }

        public final Saver<DrawerState, DrawerValue> Saver(ps0 ps0Var) {
            return SaverKt.Saver(new mh0(0), new y4(ps0Var, 3));
        }
    }

    public DrawerState(DrawerValue drawerValue, ps0 ps0Var) {
        TweenSpec tweenSpec;
        MutableState mutableStateOf$default;
        this.confirmStateChange = ps0Var;
        tweenSpec = NavigationDrawerKt.AnchoredDraggableDefaultAnimationSpec;
        this.anchoredDraggableMotionSpec = tweenSpec;
        this.anchoredDraggableState = AnchoredDraggableKt.AnchoredDraggableState(drawerValue, new ua0(21), new kf0(this, 1), tweenSpec, AnchoredDraggableDefaults.INSTANCE.getDecayAnimationSpec(), ps0Var);
        this.offset = new State<Float>() { // from class: androidx.compose.material3.DrawerState$offset$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.runtime.State
            public Float getValue() {
                return Float.valueOf(DrawerState.this.getAnchoredDraggableState$material3().getOffset());
            }
        };
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.density$delegate = mutableStateOf$default;
        this.openDrawerMotionSpec = AnimationSpecKt.snap$default(0, 1, null);
        this.closeDrawerMotionSpec = AnimationSpecKt.snap$default(0, 1, null);
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, ps0 ps0Var, int i, sb0 sb0Var) {
        this(drawerValue, (i & 2) != 0 ? new ua0(20) : ps0Var);
    }

    public static final boolean _init_$lambda$0(DrawerValue drawerValue) {
        return true;
    }

    public static /* synthetic */ float a(float f) {
        return anchoredDraggableState$lambda$1(f);
    }

    public static final float anchoredDraggableState$lambda$1(float f) {
        float f2;
        f2 = NavigationDrawerKt.DrawerPositionalThreshold;
        return f2 * f;
    }

    public static final float anchoredDraggableState$lambda$3(DrawerState drawerState) {
        float f;
        Density requireDensity = drawerState.requireDensity();
        f = NavigationDrawerKt.DrawerVelocityThreshold;
        return requireDensity.mo473toPx0680j_4(f);
    }

    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, float f, a10 a10Var) {
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.anchoredDraggableState, drawerValue, null, new DrawerState$animateTo$3(this, f, animationSpec, null), a10Var, 2, null);
        return anchoredDrag$default == e50.a ? anchoredDrag$default : vy2.a;
    }

    public static /* synthetic */ Object animateTo$default(DrawerState drawerState, DrawerValue drawerValue, AnimationSpec animationSpec, float f, a10 a10Var, int i, Object obj) {
        if ((i & 4) != 0) {
            f = drawerState.anchoredDraggableState.getLastVelocity();
        }
        return drawerState.animateTo(drawerValue, animationSpec, f, a10Var);
    }

    public static /* synthetic */ boolean b(DrawerValue drawerValue) {
        return _init_$lambda$0(drawerValue);
    }

    public static /* synthetic */ float c(DrawerState drawerState) {
        return anchoredDraggableState$lambda$3(drawerState);
    }

    public static /* synthetic */ void getAnchoredDraggableState$material3$annotations() {
    }

    @hd0
    public static /* synthetic */ void getOffset$annotations() {
    }

    private final Density requireDensity() {
        Density density$material3 = getDensity$material3();
        if (density$material3 != null) {
            return density$material3;
        }
        z72.m(this, "The density on DrawerState (", ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?");
        return null;
    }

    @hd0
    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, a10 a10Var) {
        Object animateTo$default = animateTo$default(this, drawerValue, animationSpec, 0.0f, a10Var, 4, null);
        return animateTo$default == e50.a ? animateTo$default : vy2.a;
    }

    public final Object close(a10 a10Var) {
        Object animateTo$default = animateTo$default(this, DrawerValue.Closed, this.closeDrawerMotionSpec, 0.0f, a10Var, 4, null);
        return animateTo$default == e50.a ? animateTo$default : vy2.a;
    }

    public final FiniteAnimationSpec<Float> getAnchoredDraggableMotionSpec$material3() {
        return this.anchoredDraggableMotionSpec;
    }

    public final AnchoredDraggableState<DrawerValue> getAnchoredDraggableState$material3() {
        return this.anchoredDraggableState;
    }

    public final FiniteAnimationSpec<Float> getCloseDrawerMotionSpec$material3() {
        return this.closeDrawerMotionSpec;
    }

    public final ps0 getConfirmStateChange$material3() {
        return this.confirmStateChange;
    }

    public final float getCurrentOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    public final DrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getSettledValue();
    }

    public final Density getDensity$material3() {
        return (Density) this.density$delegate.getValue();
    }

    public final State<Float> getOffset() {
        return this.offset;
    }

    public final FiniteAnimationSpec<Float> getOpenDrawerMotionSpec$material3() {
        return this.openDrawerMotionSpec;
    }

    public final DrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isAnimationRunning() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final boolean isClosed() {
        return getCurrentValue() == DrawerValue.Closed;
    }

    public final boolean isOpen() {
        return getCurrentValue() == DrawerValue.Open;
    }

    public final Object open(a10 a10Var) {
        Object animateTo$default = animateTo$default(this, DrawerValue.Open, this.openDrawerMotionSpec, 0.0f, a10Var, 4, null);
        return animateTo$default == e50.a ? animateTo$default : vy2.a;
    }

    public final float requireOffset$material3() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setAnchoredDraggableMotionSpec$material3(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.anchoredDraggableMotionSpec = finiteAnimationSpec;
    }

    public final void setCloseDrawerMotionSpec$material3(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.closeDrawerMotionSpec = finiteAnimationSpec;
    }

    public final void setDensity$material3(Density density) {
        this.density$delegate.setValue(density);
    }

    public final void setOpenDrawerMotionSpec$material3(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.openDrawerMotionSpec = finiteAnimationSpec;
    }

    public final Object snapTo(DrawerValue drawerValue, a10 a10Var) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, drawerValue, a10Var);
        return snapTo == e50.a ? snapTo : vy2.a;
    }
}
