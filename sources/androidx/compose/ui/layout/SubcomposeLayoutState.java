package androidx.compose.ui.layout;

import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ShouldPauseCallback;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.LayoutNode;
import defpackage.hd0;
import defpackage.ps0;
import defpackage.ts0;
import defpackage.v5;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class SubcomposeLayoutState {
    public static final int $stable = 8;
    private LayoutNodeSubcompositionsState _state;
    private final ts0 setCompositionContext;
    private final ts0 setMeasurePolicy;
    private final ts0 setRoot;
    private final SubcomposeSlotReusePolicy slotReusePolicy;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public interface PausedPrecomposition {
        PrecomposedSlotHandle apply();

        void cancel();

        boolean isComplete();

        boolean resume(ShouldPauseCallback shouldPauseCallback);
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public interface PrecomposedSlotHandle {
        void dispose();

        int getPlaceablesCount();

        /* renamed from: getSize-YEO4UFw */
        long mo6731getSizeYEO4UFw(int i);

        /* renamed from: premeasure-0kLqBqw */
        void mo6732premeasure0kLqBqw(int i, long j);

        void traverseDescendants(Object obj, ps0 ps0Var);
    }

    public SubcomposeLayoutState() {
        this(NoOpSubcomposeSlotReusePolicy.INSTANCE);
    }

    @hd0
    public SubcomposeLayoutState(int i) {
        this(SubcomposeLayoutKt.SubcomposeSlotReusePolicy(i));
    }

    public SubcomposeLayoutState(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.slotReusePolicy = subcomposeSlotReusePolicy;
        final int i = 0;
        this.setRoot = new ts0(this) { // from class: fn2
            public final /* synthetic */ SubcomposeLayoutState b;

            {
                this.b = this;
            }

            @Override // defpackage.ts0
            public final Object invoke(Object obj, Object obj2) {
                vy2 root$lambda$0;
                vy2 compositionContext$lambda$0;
                vy2 measurePolicy$lambda$0;
                int i2 = i;
                SubcomposeLayoutState subcomposeLayoutState = this.b;
                LayoutNode layoutNode = (LayoutNode) obj;
                switch (i2) {
                    case 0:
                        root$lambda$0 = SubcomposeLayoutState.setRoot$lambda$0(subcomposeLayoutState, layoutNode, (SubcomposeLayoutState) obj2);
                        return root$lambda$0;
                    case 1:
                        compositionContext$lambda$0 = SubcomposeLayoutState.setCompositionContext$lambda$0(subcomposeLayoutState, layoutNode, (CompositionContext) obj2);
                        return compositionContext$lambda$0;
                    default:
                        measurePolicy$lambda$0 = SubcomposeLayoutState.setMeasurePolicy$lambda$0(subcomposeLayoutState, layoutNode, (ts0) obj2);
                        return measurePolicy$lambda$0;
                }
            }
        };
        final int i2 = 1;
        this.setCompositionContext = new ts0(this) { // from class: fn2
            public final /* synthetic */ SubcomposeLayoutState b;

            {
                this.b = this;
            }

            @Override // defpackage.ts0
            public final Object invoke(Object obj, Object obj2) {
                vy2 root$lambda$0;
                vy2 compositionContext$lambda$0;
                vy2 measurePolicy$lambda$0;
                int i22 = i2;
                SubcomposeLayoutState subcomposeLayoutState = this.b;
                LayoutNode layoutNode = (LayoutNode) obj;
                switch (i22) {
                    case 0:
                        root$lambda$0 = SubcomposeLayoutState.setRoot$lambda$0(subcomposeLayoutState, layoutNode, (SubcomposeLayoutState) obj2);
                        return root$lambda$0;
                    case 1:
                        compositionContext$lambda$0 = SubcomposeLayoutState.setCompositionContext$lambda$0(subcomposeLayoutState, layoutNode, (CompositionContext) obj2);
                        return compositionContext$lambda$0;
                    default:
                        measurePolicy$lambda$0 = SubcomposeLayoutState.setMeasurePolicy$lambda$0(subcomposeLayoutState, layoutNode, (ts0) obj2);
                        return measurePolicy$lambda$0;
                }
            }
        };
        final int i3 = 2;
        this.setMeasurePolicy = new ts0(this) { // from class: fn2
            public final /* synthetic */ SubcomposeLayoutState b;

            {
                this.b = this;
            }

            @Override // defpackage.ts0
            public final Object invoke(Object obj, Object obj2) {
                vy2 root$lambda$0;
                vy2 compositionContext$lambda$0;
                vy2 measurePolicy$lambda$0;
                int i22 = i3;
                SubcomposeLayoutState subcomposeLayoutState = this.b;
                LayoutNode layoutNode = (LayoutNode) obj;
                switch (i22) {
                    case 0:
                        root$lambda$0 = SubcomposeLayoutState.setRoot$lambda$0(subcomposeLayoutState, layoutNode, (SubcomposeLayoutState) obj2);
                        return root$lambda$0;
                    case 1:
                        compositionContext$lambda$0 = SubcomposeLayoutState.setCompositionContext$lambda$0(subcomposeLayoutState, layoutNode, (CompositionContext) obj2);
                        return compositionContext$lambda$0;
                    default:
                        measurePolicy$lambda$0 = SubcomposeLayoutState.setMeasurePolicy$lambda$0(subcomposeLayoutState, layoutNode, (ts0) obj2);
                        return measurePolicy$lambda$0;
                }
            }
        };
    }

    private final LayoutNodeSubcompositionsState getState() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this._state;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        v5.m("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy2 setCompositionContext$lambda$0(SubcomposeLayoutState subcomposeLayoutState, LayoutNode layoutNode, CompositionContext compositionContext) {
        subcomposeLayoutState.getState().setCompositionContext(compositionContext);
        return vy2.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy2 setMeasurePolicy$lambda$0(SubcomposeLayoutState subcomposeLayoutState, LayoutNode layoutNode, ts0 ts0Var) {
        layoutNode.setMeasurePolicy(subcomposeLayoutState.getState().createMeasurePolicy(ts0Var));
        return vy2.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy2 setRoot$lambda$0(SubcomposeLayoutState subcomposeLayoutState, LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState2) {
        LayoutNodeSubcompositionsState subcompositionsState$ui = layoutNode.getSubcompositionsState$ui();
        if (subcompositionsState$ui == null) {
            subcompositionsState$ui = new LayoutNodeSubcompositionsState(layoutNode, subcomposeLayoutState.slotReusePolicy);
            layoutNode.setSubcompositionsState$ui(subcompositionsState$ui);
        }
        subcomposeLayoutState._state = subcompositionsState$ui;
        subcomposeLayoutState.getState().makeSureStateIsConsistent();
        subcomposeLayoutState.getState().setSlotReusePolicy(subcomposeLayoutState.slotReusePolicy);
        return vy2.a;
    }

    public final PausedPrecomposition createPausedPrecomposition(Object obj, ts0 ts0Var) {
        return getState().precomposePaused(obj, ts0Var);
    }

    public final void forceRecomposeChildren$ui() {
        getState().forceRecomposeChildren();
    }

    public final ts0 getSetCompositionContext$ui() {
        return this.setCompositionContext;
    }

    public final ts0 getSetMeasurePolicy$ui() {
        return this.setMeasurePolicy;
    }

    public final ts0 getSetRoot$ui() {
        return this.setRoot;
    }

    public final PrecomposedSlotHandle precompose(Object obj, ts0 ts0Var) {
        return getState().precompose(obj, ts0Var);
    }
}
