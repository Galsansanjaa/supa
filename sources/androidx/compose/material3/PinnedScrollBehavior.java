package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import defpackage.a10;
import defpackage.os0;
import defpackage.sb0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class PinnedScrollBehavior implements TopAppBarScrollBehavior {
    private final os0 canScroll;
    private final DecayAnimationSpec<Float> flingAnimationSpec;
    private final boolean isPinned;
    private NestedScrollConnection nestedScrollConnection;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final TopAppBarState state;

    public PinnedScrollBehavior(TopAppBarState topAppBarState, os0 os0Var) {
        this.state = topAppBarState;
        this.canScroll = os0Var;
        this.isPinned = true;
        this.nestedScrollConnection = new NestedScrollConnection() { // from class: androidx.compose.material3.PinnedScrollBehavior$nestedScrollConnection$1
            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostFling-RZ2iAVY */
            public Object mo632onPostFlingRZ2iAVY(long j, long j2, a10 a10Var) {
                Velocity m8274boximpl;
                if (Velocity.m8284getYimpl(j2) > 0.0f) {
                    PinnedScrollBehavior.this.getState().setContentOffset(0.0f);
                }
                m8274boximpl = Velocity.m8274boximpl(Velocity.Companion.m8294getZero9UxMQ8M());
                return m8274boximpl;
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo633onPostScrollDzOQY0M(long j, long j2, int i) {
                if (!((Boolean) PinnedScrollBehavior.this.getCanScroll().invoke()).booleanValue()) {
                    return Offset.Companion.m5106getZeroF1C5BW0();
                }
                TopAppBarState state = PinnedScrollBehavior.this.getState();
                state.setContentOffset(Float.intBitsToFloat((int) (j & 4294967295L)) + state.getContentOffset());
                return Offset.Companion.m5106getZeroF1C5BW0();
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreFling-QWom1Mo */
            public final Object mo634onPreFlingQWom1Mo(long j, a10 a10Var) {
                Velocity m8274boximpl;
                m8274boximpl = Velocity.m8274boximpl(Velocity.Companion.m8294getZero9UxMQ8M());
                return m8274boximpl;
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public final long mo635onPreScrollOzD1aCk(long j, int i) {
                return Offset.Companion.m5106getZeroF1C5BW0();
            }
        };
    }

    public /* synthetic */ PinnedScrollBehavior(TopAppBarState topAppBarState, os0 os0Var, int i, sb0 sb0Var) {
        this(topAppBarState, (i & 2) != 0 ? new w(7) : os0Var);
    }

    public static final boolean _init_$lambda$0() {
        return true;
    }

    public final os0 getCanScroll() {
        return this.canScroll;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return this.flingAnimationSpec;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public AnimationSpec<Float> getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public TopAppBarState getState() {
        return this.state;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public boolean isPinned() {
        return this.isPinned;
    }

    public void setNestedScrollConnection(NestedScrollConnection nestedScrollConnection) {
        this.nestedScrollConnection = nestedScrollConnection;
    }
}
