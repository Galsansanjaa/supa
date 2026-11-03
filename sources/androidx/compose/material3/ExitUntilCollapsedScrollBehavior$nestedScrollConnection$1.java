package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import defpackage.a10;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ ExitUntilCollapsedScrollBehavior this$0;

    public ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1(ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior) {
        this.this$0 = exitUntilCollapsedScrollBehavior;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r7 == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo632onPostFlingRZ2iAVY(long r6, long r8, defpackage.a10 r10) {
        /*
            r5 = this;
            boolean r6 = r10 instanceof androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1
            if (r6 == 0) goto L13
            r6 = r10
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r6 = (androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1) r6
            int r7 = r6.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r7 & r0
            if (r1 == 0) goto L13
            int r7 = r7 - r0
            r6.label = r7
            goto L18
        L13:
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r6 = new androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1
            r6.<init>(r5, r10)
        L18:
            java.lang.Object r7 = r6.result
            int r10 = r6.label
            r0 = 2
            r1 = 1
            e50 r2 = defpackage.e50.a
            if (r10 == 0) goto L39
            if (r10 == r1) goto L33
            if (r10 != r0) goto L2c
            long r5 = r6.J$0
            defpackage.ta3.H(r7)
            goto L81
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r5)
            r5 = 0
            return r5
        L33:
            long r8 = r6.J$0
            defpackage.ta3.H(r7)
            goto L59
        L39:
            defpackage.ta3.H(r7)
            float r7 = androidx.compose.ui.unit.Velocity.m8284getYimpl(r8)
            r10 = 0
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 <= 0) goto L4e
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r7 = r5.this$0
            androidx.compose.material3.TopAppBarState r7 = r7.getState()
            r7.setContentOffset(r10)
        L4e:
            r6.J$0 = r8
            r6.label = r1
            androidx.compose.ui.unit.Velocity r7 = defpackage.vg1.J()
            if (r7 != r2) goto L59
            goto L7f
        L59:
            androidx.compose.ui.unit.Velocity r7 = (androidx.compose.ui.unit.Velocity) r7
            long r3 = r7.m8292unboximpl()
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r7 = r5.this$0
            androidx.compose.material3.TopAppBarState r7 = r7.getState()
            float r8 = androidx.compose.ui.unit.Velocity.m8284getYimpl(r8)
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r9 = r5.this$0
            androidx.compose.animation.core.DecayAnimationSpec r9 = r9.getFlingAnimationSpec()
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r5 = r5.this$0
            androidx.compose.animation.core.AnimationSpec r5 = r5.getSnapAnimationSpec()
            r6.J$0 = r3
            r6.label = r0
            java.lang.Object r7 = androidx.compose.material3.AppBarKt.access$settleAppBar(r7, r8, r9, r5, r6)
            if (r7 != r2) goto L80
        L7f:
            return r2
        L80:
            r5 = r3
        L81:
            androidx.compose.ui.unit.Velocity r7 = (androidx.compose.ui.unit.Velocity) r7
            long r7 = r7.m8292unboximpl()
            long r5 = androidx.compose.ui.unit.Velocity.m8287plusAH228Gc(r5, r7)
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.ui.unit.Velocity.m8274boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1.mo632onPostFlingRZ2iAVY(long, long, a10):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo633onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!((Boolean) this.this$0.getCanScroll().invoke()).booleanValue()) {
            return Offset.Companion.m5106getZeroF1C5BW0();
        }
        TopAppBarState state = this.this$0.getState();
        int i2 = (int) (j & 4294967295L);
        state.setContentOffset(Float.intBitsToFloat(i2) + state.getContentOffset());
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i3) < 0.0f || Float.intBitsToFloat(i2) < 0.0f) {
            float heightOffset = this.this$0.getState().getHeightOffset();
            this.this$0.getState().setHeightOffset(Float.intBitsToFloat(i2) + this.this$0.getState().getHeightOffset());
            float heightOffset2 = this.this$0.getState().getHeightOffset() - heightOffset;
            return Offset.m5082constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(heightOffset2) & 4294967295L));
        }
        if (Float.intBitsToFloat(i3) <= 0.0f) {
            return Offset.Companion.m5106getZeroF1C5BW0();
        }
        float heightOffset3 = this.this$0.getState().getHeightOffset();
        this.this$0.getState().setHeightOffset(Float.intBitsToFloat(i3) + this.this$0.getState().getHeightOffset());
        float heightOffset4 = this.this$0.getState().getHeightOffset() - heightOffset3;
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(heightOffset4) & 4294967295L));
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
    public long mo635onPreScrollOzD1aCk(long j, int i) {
        if (((Boolean) this.this$0.getCanScroll().invoke()).booleanValue()) {
            int i2 = (int) (4294967295L & j);
            if (Float.intBitsToFloat(i2) <= 0.0f) {
                float heightOffset = this.this$0.getState().getHeightOffset();
                this.this$0.getState().setHeightOffset(Float.intBitsToFloat(i2) + this.this$0.getState().getHeightOffset());
                return heightOffset == this.this$0.getState().getHeightOffset() ? Offset.Companion.m5106getZeroF1C5BW0() : Offset.m5084copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
            }
        }
        return Offset.Companion.m5106getZeroF1C5BW0();
    }
}
