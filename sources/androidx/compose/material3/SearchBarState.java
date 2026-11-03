package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import defpackage.a10;
import defpackage.bp0;
import defpackage.e50;
import defpackage.ea0;
import defpackage.nb0;
import defpackage.nb2;
import defpackage.qk0;
import defpackage.sb0;
import defpackage.vy2;
import defpackage.wp1;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SearchBarState {
    public static final int $stable = 0;
    private static final float Collapsed = 0.0f;
    public static final Companion Companion = new Companion(null);
    private static final float Expanded = 1.0f;
    private final Animatable<Float, AnimationVector1D> animatable;
    private final AnimationSpec<Float> animationSpecForCollapse;
    private final AnimationSpec<Float> animationSpecForExpand;
    private final MutableState collapsedCoords$delegate;
    private final State currentValue$delegate;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public static final List Saver$lambda$0(SaverScope saverScope, SearchBarState searchBarState) {
            return nb0.C(Float.valueOf(searchBarState.getProgress()));
        }

        public static final SearchBarState Saver$lambda$1(AnimationSpec animationSpec, AnimationSpec animationSpec2, List list) {
            return new SearchBarState(new Animatable(list.get(0), VectorConvertersKt.getVectorConverter(bp0.a), null, null, 12, null), animationSpec, animationSpec2, null);
        }

        public static /* synthetic */ List a(SaverScope saverScope, SearchBarState searchBarState) {
            return Saver$lambda$0(saverScope, searchBarState);
        }

        public static /* synthetic */ SearchBarState b(AnimationSpec animationSpec, AnimationSpec animationSpec2, List list) {
            return Saver$lambda$1(animationSpec, animationSpec2, list);
        }

        public final Saver<SearchBarState, ?> Saver(AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2) {
            return ListSaverKt.listSaver(new nb2(3), new qk0(24, animationSpec, animationSpec2));
        }
    }

    private SearchBarState(Animatable<Float, AnimationVector1D> animatable, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2) {
        MutableState mutableStateOf$default;
        this.animatable = animatable;
        this.animationSpecForExpand = animationSpec;
        this.animationSpecForCollapse = animationSpec2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.collapsedCoords$delegate = mutableStateOf$default;
        this.currentValue$delegate = SnapshotStateKt.derivedStateOf(new wp1(this, 23));
    }

    public /* synthetic */ SearchBarState(Animatable animatable, AnimationSpec animationSpec, AnimationSpec animationSpec2, sb0 sb0Var) {
        this((Animatable<Float, AnimationVector1D>) animatable, (AnimationSpec<Float>) animationSpec, (AnimationSpec<Float>) animationSpec2);
    }

    public SearchBarState(SearchBarValue searchBarValue, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2) {
        this((Animatable<Float, AnimationVector1D>) AnimatableKt.Animatable$default(searchBarValue == SearchBarValue.Expanded ? 1.0f : 0.0f, 0.0f, 2, null), animationSpec, animationSpec2);
    }

    public static /* synthetic */ SearchBarValue a(SearchBarState searchBarState) {
        return currentValue_delegate$lambda$0(searchBarState);
    }

    public static final SearchBarValue currentValue_delegate$lambda$0(SearchBarState searchBarState) {
        return searchBarState.animatable.getValue().floatValue() == 0.0f ? SearchBarValue.Collapsed : SearchBarValue.Expanded;
    }

    public final Object animateToCollapsed(a10 a10Var) {
        Object animateTo$default = Animatable.animateTo$default(this.animatable, new Float(0.0f), this.animationSpecForCollapse, null, null, a10Var, 12, null);
        return animateTo$default == e50.a ? animateTo$default : vy2.a;
    }

    public final Object animateToExpanded(a10 a10Var) {
        Object animateTo$default = Animatable.animateTo$default(this.animatable, new Float(1.0f), this.animationSpecForExpand, null, null, a10Var, 12, null);
        return animateTo$default == e50.a ? animateTo$default : vy2.a;
    }

    public final LayoutCoordinates getCollapsedCoords() {
        return (LayoutCoordinates) this.collapsedCoords$delegate.getValue();
    }

    public final SearchBarValue getCurrentValue() {
        return (SearchBarValue) this.currentValue$delegate.getValue();
    }

    public final float getProgress() {
        return ea0.n(this.animatable.getValue().floatValue(), 0.0f, 1.0f);
    }

    public final SearchBarValue getTargetValue() {
        return this.animatable.getTargetValue().floatValue() == 1.0f ? SearchBarValue.Expanded : SearchBarValue.Collapsed;
    }

    public final boolean isAnimating() {
        return this.animatable.isRunning();
    }

    public final void setCollapsedCoords(LayoutCoordinates layoutCoordinates) {
        this.collapsedCoords$delegate.setValue(layoutCoordinates);
    }

    public final Object snapTo(float f, a10 a10Var) {
        Object snapTo = this.animatable.snapTo(new Float(f), a10Var);
        return snapTo == e50.a ? snapTo : vy2.a;
    }
}
