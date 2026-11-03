package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.spatial.RectListKt;
import defpackage.a10;
import defpackage.c82;
import defpackage.e50;
import defpackage.ea0;
import defpackage.hu2;
import defpackage.lb0;
import defpackage.ta3;
import defpackage.tn2;
import defpackage.ts0;
import defpackage.us0;
import defpackage.vy2;
import defpackage.y40;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1", f = "AndroidDragAndDropSource.android.kt", l = {45}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DragAndDropSourceDefaults$DefaultStartDetector$1 extends tn2 implements ts0 {
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    @lb0(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1", f = "AndroidDragAndDropSource.android.kt", l = {46}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends tn2 implements ts0 {
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        final /* synthetic */ DragAndDropStartDetectorScope $this;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        @lb0(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1", f = "AndroidDragAndDropSource.android.kt", l = {48, 50, RectListKt.BitOffsetForGesturable}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00061 extends c82 implements ts0 {
            final /* synthetic */ y40 $$this$coroutineScope;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            final /* synthetic */ DragAndDropStartDetectorScope $this;
            private /* synthetic */ Object L$0;
            int label;

            /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
            @lb0(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$7", f = "AndroidDragAndDropSource.android.kt", l = {}, m = "invokeSuspend", v = 1)
            /* renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$7, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass7 extends tn2 implements us0 {
                int label;

                public AnonymousClass7(a10 a10Var) {
                    super(3, a10Var);
                }

                @Override // defpackage.us0
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return m462invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m5100unboximpl(), (a10) obj3);
                }

                /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                public final Object m462invoked4ec7I(PressGestureScope pressGestureScope, long j, a10 a10Var) {
                    return new AnonymousClass7(a10Var).invokeSuspend(vy2.a);
                }

                @Override // defpackage.cm
                public final Object invokeSuspend(Object obj) {
                    if (this.label == 0) {
                        ta3.H(obj);
                        return vy2.a;
                    }
                    hu2.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00061(y40 y40Var, PressGestureScopeImpl pressGestureScopeImpl, DragAndDropStartDetectorScope dragAndDropStartDetectorScope, a10 a10Var) {
                super(2, a10Var);
                this.$$this$coroutineScope = y40Var;
                this.$pressScope = pressGestureScopeImpl;
                this.$this = dragAndDropStartDetectorScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0() {
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final vy2 invokeSuspend$lambda$1(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
                dragAndDropStartDetectorScope.mo465requestDragAndDropTransferk4lQ0M(pointerInputChange.m6591getPositionF1C5BW0());
                return vy2.a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final vy2 invokeSuspend$lambda$2(PointerInputChange pointerInputChange, Offset offset) {
                return vy2.a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final vy2 invokeSuspend$lambda$4(PointerInputChange pointerInputChange) {
                return vy2.a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final vy2 invokeSuspend$lambda$5(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, Offset offset) {
                dragAndDropStartDetectorScope.mo465requestDragAndDropTransferk4lQ0M(offset.m5100unboximpl());
                return vy2.a;
            }

            @Override // defpackage.cm
            public final a10 create(Object obj, a10 a10Var) {
                C00061 c00061 = new C00061(this.$$this$coroutineScope, this.$pressScope, this.$this, a10Var);
                c00061.L$0 = obj;
                return c00061;
            }

            @Override // defpackage.ts0
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, a10 a10Var) {
                return ((C00061) create(awaitPointerEventScope, a10Var)).invokeSuspend(vy2.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
            
                if (androidx.compose.foundation.gestures.DragGestureDetectorKt.processDragGesture(r0, r6, r2, null, r8, r1, r6, r4, r11) == r9) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
            
                return r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0098, code lost:
            
                if (androidx.compose.foundation.gestures.TapGestureDetectorKt.processTapGesture(r0, r3, r4, null, r4, r1, null, r11) == r9) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
            
                if (r6 == r9) goto L22;
             */
            /* JADX WARN: Type inference failed for: r1v4, types: [ts0, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, ps0] */
            @Override // defpackage.cm
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    int r0 = r11.label
                    r1 = 0
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    e50 r9 = defpackage.e50.a
                    if (r0 == 0) goto L26
                    if (r0 == r4) goto L1d
                    if (r0 == r3) goto L18
                    if (r0 != r2) goto L12
                    goto L18
                L12:
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.hu2.h(r0)
                    return r5
                L18:
                    defpackage.ta3.H(r12)
                    goto L9b
                L1d:
                    java.lang.Object r0 = r11.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                    defpackage.ta3.H(r12)
                    r6 = r12
                    goto L3a
                L26:
                    defpackage.ta3.H(r12)
                    java.lang.Object r0 = r11.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                    androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                    r11.L$0 = r0
                    r11.label = r4
                    java.lang.Object r6 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(r0, r1, r6, r11)
                    if (r6 != r9) goto L3a
                    goto L9a
                L3a:
                    androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
                    int r8 = r6.m6594getTypeT8wyACA()
                    androidx.compose.ui.input.pointer.PointerType$Companion r10 = androidx.compose.ui.input.pointer.PointerType.Companion
                    int r10 = r10.m6657getMouseT8wyACA()
                    boolean r8 = androidx.compose.ui.input.pointer.PointerType.m6652equalsimpl0(r8, r10)
                    if (r8 == 0) goto L79
                    androidx.compose.foundation.draganddrop.a r2 = new androidx.compose.foundation.draganddrop.a
                    r2.<init>()
                    androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope r1 = r11.$this
                    androidx.compose.foundation.draganddrop.b r8 = new androidx.compose.foundation.draganddrop.b
                    r8.<init>()
                    androidx.compose.foundation.draganddrop.c r1 = new androidx.compose.foundation.draganddrop.c
                    r1.<init>()
                    r10 = r1
                    r1 = r6
                    androidx.compose.foundation.draganddrop.a r6 = new androidx.compose.foundation.draganddrop.a
                    r6.<init>()
                    androidx.compose.foundation.draganddrop.d r4 = new androidx.compose.foundation.draganddrop.d
                    r4.<init>()
                    r11.L$0 = r5
                    r11.label = r3
                    r3 = 0
                    r7 = r4
                    r4 = r8
                    r5 = r10
                    r8 = r11
                    java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.processDragGesture(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                    if (r0 != r9) goto L9b
                    goto L9a
                L79:
                    y40 r3 = r11.$$this$coroutineScope
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = r11.$pressScope
                    androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope r6 = r11.$this
                    r8 = r4
                    androidx.compose.foundation.draganddrop.e r4 = new androidx.compose.foundation.draganddrop.e
                    r4.<init>(r6, r1)
                    androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$7 r1 = new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$7
                    r1.<init>(r5)
                    r11.L$0 = r5
                    r11.label = r2
                    r5 = r1
                    r1 = r3
                    r3 = 0
                    r6 = 0
                    r7 = r11
                    r2 = r8
                    java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.processTapGesture(r0, r1, r2, r3, r4, r5, r6, r7)
                    if (r0 != r9) goto L9b
                L9a:
                    return r9
                L9b:
                    vy2 r0 = defpackage.vy2.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1.AnonymousClass1.C00061.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, PressGestureScopeImpl pressGestureScopeImpl, a10 a10Var) {
            super(2, a10Var);
            this.$this = dragAndDropStartDetectorScope;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // defpackage.cm
        public final a10 create(Object obj, a10 a10Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this, this.$pressScope, a10Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.ts0
        public final Object invoke(y40 y40Var, a10 a10Var) {
            return ((AnonymousClass1) create(y40Var, a10Var)).invokeSuspend(vy2.a);
        }

        @Override // defpackage.cm
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ta3.H(obj);
                y40 y40Var = (y40) this.L$0;
                DragAndDropStartDetectorScope dragAndDropStartDetectorScope = this.$this;
                C00061 c00061 = new C00061(y40Var, this.$pressScope, dragAndDropStartDetectorScope, null);
                this.label = 1;
                Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(dragAndDropStartDetectorScope, c00061, this);
                e50 e50Var = e50.a;
                if (awaitEachGesture == e50Var) {
                    return e50Var;
                }
            } else {
                if (i != 1) {
                    hu2.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ta3.H(obj);
            }
            return vy2.a;
        }
    }

    public DragAndDropSourceDefaults$DefaultStartDetector$1(a10 a10Var) {
        super(2, a10Var);
    }

    @Override // defpackage.cm
    public final a10 create(Object obj, a10 a10Var) {
        DragAndDropSourceDefaults$DefaultStartDetector$1 dragAndDropSourceDefaults$DefaultStartDetector$1 = new DragAndDropSourceDefaults$DefaultStartDetector$1(a10Var);
        dragAndDropSourceDefaults$DefaultStartDetector$1.L$0 = obj;
        return dragAndDropSourceDefaults$DefaultStartDetector$1;
    }

    @Override // defpackage.ts0
    public final Object invoke(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, a10 a10Var) {
        return ((DragAndDropSourceDefaults$DefaultStartDetector$1) create(dragAndDropStartDetectorScope, a10Var)).invokeSuspend(vy2.a);
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            ta3.H(obj);
            DragAndDropStartDetectorScope dragAndDropStartDetectorScope = (DragAndDropStartDetectorScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dragAndDropStartDetectorScope, new PressGestureScopeImpl(dragAndDropStartDetectorScope), null);
            this.label = 1;
            Object u = ea0.u(anonymousClass1, this);
            e50 e50Var = e50.a;
            if (u == e50Var) {
                return e50Var;
            }
        } else {
            if (i != 1) {
                hu2.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ta3.H(obj);
        }
        return vy2.a;
    }
}
