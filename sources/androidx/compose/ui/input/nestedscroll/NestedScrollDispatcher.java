package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import defpackage.hu2;
import defpackage.kf0;
import defpackage.os0;
import defpackage.y40;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class NestedScrollDispatcher {
    public static final int $stable = 8;
    private os0 calculateNestedScrollScope = new kf0(this, 29);
    private NestedScrollNode lastKnownParentNode;
    private NestedScrollNode nestedScrollNode;
    private y40 scope;

    public static /* synthetic */ y40 a(NestedScrollDispatcher nestedScrollDispatcher) {
        return nestedScrollDispatcher.scope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r0 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (r0 == r1) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* renamed from: dispatchPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6453dispatchPostFlingRZ2iAVY(long r5, long r7, defpackage.a10 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L14
            r0 = r9
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r4, r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.result
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.ta3.H(r0)
            goto L6a
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            r4 = 0
            return r4
        L31:
            defpackage.ta3.H(r0)
            goto L4d
        L35:
            defpackage.ta3.H(r0)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r0 = r4.getParent$ui()
            e50 r1 = defpackage.e50.a
            if (r0 != 0) goto L5b
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r4 = r4.lastKnownParentNode
            if (r4 == 0) goto L54
            r9.label = r3
            java.lang.Object r0 = r4.mo632onPostFlingRZ2iAVY(r5, r7, r9)
            if (r0 != r1) goto L4d
            goto L69
        L4d:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r4 = r0.m8292unboximpl()
            goto L77
        L54:
            androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.ui.unit.Velocity.Companion
            long r4 = r4.m8294getZero9UxMQ8M()
            goto L77
        L5b:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r4 = r4.getParent$ui()
            if (r4 == 0) goto L71
            r9.label = r2
            java.lang.Object r0 = r4.mo632onPostFlingRZ2iAVY(r5, r7, r9)
            if (r0 != r1) goto L6a
        L69:
            return r1
        L6a:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r4 = r0.m8292unboximpl()
            goto L77
        L71:
            androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.ui.unit.Velocity.Companion
            long r4 = r4.m8294getZero9UxMQ8M()
        L77:
            androidx.compose.ui.unit.Velocity r4 = androidx.compose.ui.unit.Velocity.m8274boximpl(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.m6453dispatchPostFlingRZ2iAVY(long, long, a10):java.lang.Object");
    }

    /* renamed from: dispatchPostScroll-DzOQY0M */
    public final long m6454dispatchPostScrollDzOQY0M(long j, long j2, int i) {
        NestedScrollConnection parent$ui = getParent$ui();
        return parent$ui != null ? parent$ui.mo633onPostScrollDzOQY0M(j, j2, i) : Offset.Companion.m5106getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: dispatchPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6455dispatchPreFlingQWom1Mo(long r5, defpackage.a10 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.ta3.H(r7)
            goto L40
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.ta3.H(r7)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r4 = r4.getParent$ui()
            if (r4 == 0) goto L47
            r0.label = r2
            java.lang.Object r7 = r4.mo634onPreFlingQWom1Mo(r5, r0)
            e50 r4 = defpackage.e50.a
            if (r7 != r4) goto L40
            return r4
        L40:
            androidx.compose.ui.unit.Velocity r7 = (androidx.compose.ui.unit.Velocity) r7
            long r4 = r7.m8292unboximpl()
            goto L4d
        L47:
            androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.ui.unit.Velocity.Companion
            long r4 = r4.m8294getZero9UxMQ8M()
        L4d:
            androidx.compose.ui.unit.Velocity r4 = androidx.compose.ui.unit.Velocity.m8274boximpl(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.m6455dispatchPreFlingQWom1Mo(long, a10):java.lang.Object");
    }

    /* renamed from: dispatchPreScroll-OzD1aCk */
    public final long m6456dispatchPreScrollOzD1aCk(long j, int i) {
        NestedScrollConnection parent$ui = getParent$ui();
        return parent$ui != null ? parent$ui.mo635onPreScrollOzD1aCk(j, i) : Offset.Companion.m5106getZeroF1C5BW0();
    }

    public final os0 getCalculateNestedScrollScope$ui() {
        return this.calculateNestedScrollScope;
    }

    public final y40 getCoroutineScope() {
        y40 y40Var = (y40) this.calculateNestedScrollScope.invoke();
        if (y40Var != null) {
            return y40Var;
        }
        hu2.h("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final NestedScrollNode getLastKnownParentNode$ui() {
        return this.lastKnownParentNode;
    }

    public final NestedScrollNode getNestedScrollNode$ui() {
        return this.nestedScrollNode;
    }

    public final NestedScrollConnection getParent$ui() {
        NestedScrollNode nestedScrollNode = this.nestedScrollNode;
        if (nestedScrollNode != null) {
            return nestedScrollNode.getParentNestedScrollNode$ui();
        }
        return null;
    }

    public final y40 getScope$ui() {
        return this.scope;
    }

    public final void setCalculateNestedScrollScope$ui(os0 os0Var) {
        this.calculateNestedScrollScope = os0Var;
    }

    public final void setLastKnownParentNode$ui(NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    public final void setNestedScrollNode$ui(NestedScrollNode nestedScrollNode) {
        this.nestedScrollNode = nestedScrollNode;
    }

    public final void setScope$ui(y40 y40Var) {
        this.scope = y40Var;
    }
}
