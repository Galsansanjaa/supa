package androidx.compose.foundation.gestures;

import androidx.compose.runtime.SnapshotStateKt;
import defpackage.a10;
import defpackage.e50;
import defpackage.ea0;
import defpackage.hu2;
import defpackage.jp0;
import defpackage.kp0;
import defpackage.lb0;
import defpackage.os0;
import defpackage.ta3;
import defpackage.tn2;
import defpackage.ts0;
import defpackage.vy2;
import defpackage.y40;
import defpackage.z42;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {1580}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$restartable$2 extends tn2 implements ts0 {
    final /* synthetic */ ts0 $block;
    final /* synthetic */ os0 $inputs;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1<T> implements kp0 {
        final /* synthetic */ y40 $$this$coroutineScope;
        final /* synthetic */ ts0 $block;
        final /* synthetic */ z42 $previousDrag;

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        @lb0(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {1587}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends tn2 implements ts0 {
            final /* synthetic */ y40 $$this$coroutineScope;
            final /* synthetic */ ts0 $block;
            final /* synthetic */ I $latestInputs;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ts0 ts0Var, I i, y40 y40Var, a10 a10Var) {
                super(2, a10Var);
                this.$block = ts0Var;
                this.$latestInputs = i;
                this.$$this$coroutineScope = y40Var;
            }

            @Override // defpackage.cm
            public final a10 create(Object obj, a10 a10Var) {
                return new AnonymousClass2(this.$block, this.$latestInputs, this.$$this$coroutineScope, a10Var);
            }

            @Override // defpackage.ts0
            public final Object invoke(y40 y40Var, a10 a10Var) {
                return ((AnonymousClass2) create(y40Var, a10Var)).invokeSuspend(vy2.a);
            }

            @Override // defpackage.cm
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    ta3.H(obj);
                    ts0 ts0Var = this.$block;
                    Object obj2 = this.$latestInputs;
                    this.label = 1;
                    Object invoke = ts0Var.invoke(obj2, this);
                    e50 e50Var = e50.a;
                    if (invoke == e50Var) {
                        return e50Var;
                    }
                } else {
                    if (i != 1) {
                        hu2.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ta3.H(obj);
                }
                ea0.j(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                return vy2.a;
            }
        }

        public AnonymousClass1(z42 z42Var, y40 y40Var, ts0 ts0Var) {
            this.$previousDrag = z42Var;
            this.$$this$coroutineScope = y40Var;
            this.$block = ts0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        @Override // defpackage.kp0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(I r5, defpackage.a10 r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                int r1 = r0.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L32
                if (r1 != r3) goto L2c
                java.lang.Object r5 = r0.L$1
                r71 r5 = (defpackage.r71) r5
                java.lang.Object r5 = r0.L$0
                defpackage.ta3.H(r6)
                goto L54
            L2c:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.hu2.h(r4)
                return r2
            L32:
                defpackage.ta3.H(r6)
                z42 r6 = r4.$previousDrag
                java.lang.Object r6 = r6.a
                r71 r6 = (defpackage.r71) r6
                if (r6 == 0) goto L54
                androidx.compose.foundation.gestures.AnchoredDragFinishedSignal r1 = new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal
                r1.<init>()
                r6.cancel(r1)
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r6 = r6.j(r0)
                e50 r0 = defpackage.e50.a
                if (r6 != r0) goto L54
                return r0
            L54:
                z42 r6 = r4.$previousDrag
                y40 r0 = r4.$$this$coroutineScope
                androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2 r1 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2
                ts0 r4 = r4.$block
                r1.<init>(r4, r5, r0, r2)
                g50 r4 = defpackage.g50.n
                rl2 r4 = defpackage.od4.s(r0, r2, r4, r1, r3)
                r6.a = r4
                vy2 r4 = defpackage.vy2.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2.AnonymousClass1.emit(java.lang.Object, a10):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$restartable$2(os0 os0Var, ts0 ts0Var, a10 a10Var) {
        super(2, a10Var);
        this.$inputs = os0Var;
        this.$block = ts0Var;
    }

    @Override // defpackage.cm
    public final a10 create(Object obj, a10 a10Var) {
        AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(this.$inputs, this.$block, a10Var);
        anchoredDraggableKt$restartable$2.L$0 = obj;
        return anchoredDraggableKt$restartable$2;
    }

    @Override // defpackage.ts0
    public final Object invoke(y40 y40Var, a10 a10Var) {
        return ((AnchoredDraggableKt$restartable$2) create(y40Var, a10Var)).invokeSuspend(vy2.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [z42, java.lang.Object] */
    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            ta3.H(obj);
            y40 y40Var = (y40) this.L$0;
            ?? obj2 = new Object();
            jp0 snapshotFlow = SnapshotStateKt.snapshotFlow(this.$inputs);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(obj2, y40Var, this.$block);
            this.label = 1;
            Object collect = snapshotFlow.collect(anonymousClass1, this);
            e50 e50Var = e50.a;
            if (collect == e50Var) {
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
