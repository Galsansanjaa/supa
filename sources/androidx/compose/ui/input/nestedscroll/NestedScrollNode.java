package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import defpackage.ea0;
import defpackage.hu2;
import defpackage.wp1;
import defpackage.y40;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class NestedScrollNode extends Modifier.Node implements TraversableNode, NestedScrollConnection {
    public static final int $stable = 8;
    private NestedScrollConnection connection;
    private NestedScrollNode lastKnownParentNode;
    private NestedScrollDispatcher resolvedDispatcher;
    private final Object traverseKey;

    public NestedScrollNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.resolvedDispatcher = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y40 getNestedCoroutineScope() {
        NestedScrollNode parentNestedScrollNode$ui = getParentNestedScrollNode$ui();
        y40 nestedCoroutineScope = parentNestedScrollNode$ui != null ? parentNestedScrollNode$ui.getNestedCoroutineScope() : null;
        if (nestedCoroutineScope != null && ea0.A(nestedCoroutineScope)) {
            return nestedCoroutineScope;
        }
        y40 scope$ui = this.resolvedDispatcher.getScope$ui();
        if (scope$ui != null) {
            return scope$ui;
        }
        hu2.h("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    private static /* synthetic */ void getNestedCoroutineScope$annotations() {
    }

    private final NestedScrollConnection getParentConnection() {
        if (isAttached()) {
            return getParentNestedScrollNode$ui();
        }
        return null;
    }

    private final void resetDispatcherFields() {
        if (this.resolvedDispatcher.getNestedScrollNode$ui() == this) {
            this.resolvedDispatcher.setNestedScrollNode$ui(null);
            if (ComposeUiFlags.isClearNestedScrollCoroutineScopeFixEnabled) {
                this.resolvedDispatcher.setScope$ui(null);
                this.resolvedDispatcher.setCalculateNestedScrollScope$ui(NestedScrollNodeKt.access$getCancelledScope$p());
            }
        }
    }

    private final void updateDispatcher(NestedScrollDispatcher nestedScrollDispatcher) {
        resetDispatcherFields();
        if (nestedScrollDispatcher == null) {
            this.resolvedDispatcher = new NestedScrollDispatcher();
        } else if (nestedScrollDispatcher != this.resolvedDispatcher) {
            this.resolvedDispatcher = nestedScrollDispatcher;
        }
        if (isAttached()) {
            updateDispatcherFields();
        }
    }

    private final void updateDispatcherFields() {
        this.resolvedDispatcher.setNestedScrollNode$ui(this);
        this.resolvedDispatcher.setLastKnownParentNode$ui(null);
        this.lastKnownParentNode = null;
        this.resolvedDispatcher.setCalculateNestedScrollScope$ui(new wp1(this, 0));
        this.resolvedDispatcher.setScope$ui(getCoroutineScope());
    }

    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    public final NestedScrollNode getLastKnownParentNode$ui() {
        return this.lastKnownParentNode;
    }

    public final NestedScrollNode getParentNestedScrollNode$ui() {
        if (isAttached()) {
            return (NestedScrollNode) TraversableNodeKt.findNearestAncestor(this);
        }
        return null;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDispatcherFields();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        NestedScrollNode nestedScrollNode = (NestedScrollNode) NestedScrollNodeKt.access$findNearestAttachedAncestor(this);
        this.lastKnownParentNode = nestedScrollNode;
        this.resolvedDispatcher.setLastKnownParentNode$ui(nestedScrollNode);
        resetDispatcherFields();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo632onPostFlingRZ2iAVY(long r12, long r14, defpackage.a10 r16) {
        /*
            r11 = this;
            r1 = r16
            boolean r2 = r1 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            if (r2 == 0) goto L16
            r2 = r1
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
        L14:
            r8 = r2
            goto L1c
        L16:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r2 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            r2.<init>(r11, r1)
            goto L14
        L1c:
            java.lang.Object r1 = r8.result
            int r2 = r8.label
            r9 = 2
            r3 = 1
            e50 r10 = defpackage.e50.a
            if (r2 == 0) goto L3f
            if (r2 == r3) goto L37
            if (r2 != r9) goto L30
            long r2 = r8.J$0
            defpackage.ta3.H(r1)
            goto L84
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r0)
            r0 = 0
            return r0
        L37:
            long r2 = r8.J$1
            long r4 = r8.J$0
            defpackage.ta3.H(r1)
            goto L56
        L3f:
            defpackage.ta3.H(r1)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r11.connection
            r8.J$0 = r12
            r8.J$1 = r14
            r8.label = r3
            r4 = r12
            r6 = r14
            r3 = r1
            java.lang.Object r1 = r3.mo632onPostFlingRZ2iAVY(r4, r6, r8)
            if (r1 != r10) goto L54
            goto L82
        L54:
            r4 = r12
            r2 = r14
        L56:
            androidx.compose.ui.unit.Velocity r1 = (androidx.compose.ui.unit.Velocity) r1
            long r6 = r1.m8292unboximpl()
            boolean r1 = r11.isAttached()
            if (r1 == 0) goto L67
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r0 = r11.getParentConnection()
            goto L69
        L67:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = r11.lastKnownParentNode
        L69:
            if (r0 == 0) goto L8c
            long r4 = androidx.compose.ui.unit.Velocity.m8287plusAH228Gc(r4, r6)
            long r1 = androidx.compose.ui.unit.Velocity.m8286minusAH228Gc(r2, r6)
            r8.J$0 = r6
            r8.label = r9
            r11 = r0
            r14 = r1
            r12 = r4
            r16 = r8
            java.lang.Object r1 = r11.mo632onPostFlingRZ2iAVY(r12, r14, r16)
            if (r1 != r10) goto L83
        L82:
            return r10
        L83:
            r2 = r6
        L84:
            androidx.compose.ui.unit.Velocity r1 = (androidx.compose.ui.unit.Velocity) r1
            long r0 = r1.m8292unboximpl()
            r6 = r2
            goto L92
        L8c:
            androidx.compose.ui.unit.Velocity$Companion r0 = androidx.compose.ui.unit.Velocity.Companion
            long r0 = r0.m8294getZero9UxMQ8M()
        L92:
            long r0 = androidx.compose.ui.unit.Velocity.m8287plusAH228Gc(r6, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m8274boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.mo632onPostFlingRZ2iAVY(long, long, a10):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo633onPostScrollDzOQY0M(long j, long j2, int i) {
        long mo633onPostScrollDzOQY0M = this.connection.mo633onPostScrollDzOQY0M(j, j2, i);
        NestedScrollConnection parentConnection = getParentConnection();
        return Offset.m5095plusMKHz9U(mo633onPostScrollDzOQY0M, parentConnection != null ? parentConnection.mo633onPostScrollDzOQY0M(Offset.m5095plusMKHz9U(j, mo633onPostScrollDzOQY0M), Offset.m5094minusMKHz9U(j2, mo633onPostScrollDzOQY0M), i) : Offset.Companion.m5106getZeroF1C5BW0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r10 == r4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo634onPreFlingQWom1Mo(long r8, defpackage.a10 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            e50 r4 = defpackage.e50.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            long r7 = r0.J$0
            defpackage.ta3.H(r10)
            goto L6c
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r7)
            r7 = 0
            return r7
        L33:
            long r8 = r0.J$0
            defpackage.ta3.H(r10)
            goto L4d
        L39:
            defpackage.ta3.H(r10)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r10 = r7.getParentConnection()
            if (r10 == 0) goto L54
            r0.J$0 = r8
            r0.label = r3
            java.lang.Object r10 = r10.mo634onPreFlingQWom1Mo(r8, r0)
            if (r10 != r4) goto L4d
            goto L6a
        L4d:
            androidx.compose.ui.unit.Velocity r10 = (androidx.compose.ui.unit.Velocity) r10
            long r5 = r10.m8292unboximpl()
            goto L5a
        L54:
            androidx.compose.ui.unit.Velocity$Companion r10 = androidx.compose.ui.unit.Velocity.Companion
            long r5 = r10.m8294getZero9UxMQ8M()
        L5a:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r7 = r7.connection
            long r8 = androidx.compose.ui.unit.Velocity.m8286minusAH228Gc(r8, r5)
            r0.J$0 = r5
            r0.label = r2
            java.lang.Object r10 = r7.mo634onPreFlingQWom1Mo(r8, r0)
            if (r10 != r4) goto L6b
        L6a:
            return r4
        L6b:
            r7 = r5
        L6c:
            androidx.compose.ui.unit.Velocity r10 = (androidx.compose.ui.unit.Velocity) r10
            long r9 = r10.m8292unboximpl()
            long r7 = androidx.compose.ui.unit.Velocity.m8287plusAH228Gc(r7, r9)
            androidx.compose.ui.unit.Velocity r7 = androidx.compose.ui.unit.Velocity.m8274boximpl(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.mo634onPreFlingQWom1Mo(long, a10):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo635onPreScrollOzD1aCk(long j, int i) {
        NestedScrollConnection parentConnection = getParentConnection();
        long mo635onPreScrollOzD1aCk = parentConnection != null ? parentConnection.mo635onPreScrollOzD1aCk(j, i) : Offset.Companion.m5106getZeroF1C5BW0();
        return Offset.m5095plusMKHz9U(mo635onPreScrollOzD1aCk, this.connection.mo635onPreScrollOzD1aCk(Offset.m5094minusMKHz9U(j, mo635onPreScrollOzD1aCk), i));
    }

    public final void setConnection(NestedScrollConnection nestedScrollConnection) {
        this.connection = nestedScrollConnection;
    }

    public final void setLastKnownParentNode$ui(NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    public final void updateNode$ui(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        updateDispatcher(nestedScrollDispatcher);
    }
}
