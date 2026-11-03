package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import defpackage.a10;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ScrollableNestedScrollConnection implements NestedScrollConnection {
    public static final int $stable = 8;
    private boolean enabled;
    private final ScrollLogic scrollingLogic;

    public ScrollableNestedScrollConnection(ScrollLogic scrollLogic, boolean z) {
        this.scrollingLogic = scrollLogic;
        this.enabled = z;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final ScrollLogic getScrollingLogic() {
        return this.scrollingLogic;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo632onPostFlingRZ2iAVY(long r3, long r5, defpackage.a10 r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r3 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.label = r4
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r3 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.result
            int r7 = r3.label
            r0 = 1
            if (r7 == 0) goto L2e
            if (r7 != r0) goto L27
            long r5 = r3.J$0
            defpackage.ta3.H(r4)
            goto L53
        L27:
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r2)
            r2 = 0
            return r2
        L2e:
            defpackage.ta3.H(r4)
            boolean r4 = r2.enabled
            if (r4 == 0) goto L5e
            androidx.compose.foundation.gestures.ScrollLogic r4 = r2.scrollingLogic
            boolean r4 = r4.isFlinging()
            if (r4 == 0) goto L44
            androidx.compose.ui.unit.Velocity$Companion r2 = androidx.compose.ui.unit.Velocity.Companion
            long r2 = r2.m8294getZero9UxMQ8M()
            goto L59
        L44:
            androidx.compose.foundation.gestures.ScrollLogic r2 = r2.scrollingLogic
            r3.J$0 = r5
            r3.label = r0
            java.lang.Object r4 = r2.mo620doFlingAnimationQWom1Mo(r5, r3)
            e50 r2 = defpackage.e50.a
            if (r4 != r2) goto L53
            return r2
        L53:
            androidx.compose.ui.unit.Velocity r4 = (androidx.compose.ui.unit.Velocity) r4
            long r2 = r4.m8292unboximpl()
        L59:
            long r2 = androidx.compose.ui.unit.Velocity.m8286minusAH228Gc(r5, r2)
            goto L64
        L5e:
            androidx.compose.ui.unit.Velocity$Companion r2 = androidx.compose.ui.unit.Velocity.Companion
            long r2 = r2.m8294getZero9UxMQ8M()
        L64:
            androidx.compose.ui.unit.Velocity r2 = androidx.compose.ui.unit.Velocity.m8274boximpl(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.mo632onPostFlingRZ2iAVY(long, long, a10):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public long mo633onPostScrollDzOQY0M(long j, long j2, int i) {
        return this.enabled ? this.scrollingLogic.mo621performRawScrollMKHz9U(j2) : Offset.Companion.m5106getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public final Object mo634onPreFlingQWom1Mo(long j, a10 a10Var) {
        Velocity m8274boximpl;
        m8274boximpl = Velocity.m8274boximpl(Velocity.Companion.m8294getZero9UxMQ8M());
        return m8274boximpl;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public final long mo635onPreScrollOzD1aCk(long j, int i) {
        return Offset.Companion.m5106getZeroF1C5BW0();
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }
}
