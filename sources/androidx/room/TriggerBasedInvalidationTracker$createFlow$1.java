package androidx.room;

import defpackage.a10;
import defpackage.e50;
import defpackage.hu2;
import defpackage.kp0;
import defpackage.lb0;
import defpackage.ta3;
import defpackage.tn2;
import defpackage.ts0;
import defpackage.vy2;
import defpackage.y40;
import defpackage.z42;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", f = "InvalidationTracker.kt", l = {233, 233, 237}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TriggerBasedInvalidationTracker$createFlow$1 extends tn2 implements ts0 {
    final /* synthetic */ boolean $emitInitialState;
    final /* synthetic */ String[] $resolvedTableNames;
    final /* synthetic */ int[] $tableIds;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    @lb0(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", f = "InvalidationTracker.kt", l = {233}, m = "invokeSuspend")
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends tn2 implements ts0 {
        int label;
        final /* synthetic */ TriggerBasedInvalidationTracker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, a10 a10Var) {
            super(2, a10Var);
            this.this$0 = triggerBasedInvalidationTracker;
        }

        @Override // defpackage.cm
        public final a10 create(Object obj, a10 a10Var) {
            return new AnonymousClass1(this.this$0, a10Var);
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
                TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = this.this$0;
                this.label = 1;
                Object syncTriggers$room_runtime_release = triggerBasedInvalidationTracker.syncTriggers$room_runtime_release(this);
                e50 e50Var = e50.a;
                if (syncTriggers$room_runtime_release == e50Var) {
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

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2<T> implements kp0 {
        final /* synthetic */ kp0 $$this$flow;
        final /* synthetic */ z42 $currentVersions;
        final /* synthetic */ boolean $emitInitialState;
        final /* synthetic */ String[] $resolvedTableNames;
        final /* synthetic */ int[] $tableIds;

        public AnonymousClass2(z42 z42Var, boolean z, kp0 kp0Var, String[] strArr, int[] iArr) {
            this.$currentVersions = z42Var;
            this.$emitInitialState = z;
            this.$$this$flow = kp0Var;
            this.$resolvedTableNames = strArr;
            this.$tableIds = iArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        
            if (r15.emit(r1, r0) == r5) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a2, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
        
            if (r15.emit(r1, r0) == r5) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // defpackage.kp0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(int[] r14, defpackage.a10 r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1
                if (r0 == 0) goto L13
                r0 = r15
                androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1
                r0.<init>(r13, r15)
            L18:
                java.lang.Object r15 = r0.result
                int r1 = r0.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L39
                if (r1 == r4) goto L2c
                if (r1 != r3) goto L26
                goto L2c
            L26:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.hu2.h(r13)
                return r2
            L2c:
                java.lang.Object r13 = r0.L$1
                r14 = r13
                int[] r14 = (int[]) r14
                java.lang.Object r13 = r0.L$0
                androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2 r13 = (androidx.room.TriggerBasedInvalidationTracker$createFlow$1.AnonymousClass2) r13
                defpackage.ta3.H(r15)
                goto La3
            L39:
                defpackage.ta3.H(r15)
                z42 r15 = r13.$currentVersions
                java.lang.Object r1 = r15.a
                e50 r5 = defpackage.e50.a
                if (r1 != 0) goto L5d
                boolean r15 = r13.$emitInitialState
                if (r15 == 0) goto La3
                kp0 r15 = r13.$$this$flow
                java.lang.String[] r1 = r13.$resolvedTableNames
                java.util.Set r1 = defpackage.wd.R0(r1)
                r0.L$0 = r13
                r0.L$1 = r14
                r0.label = r4
                java.lang.Object r15 = r15.emit(r1, r0)
                if (r15 != r5) goto La3
                goto La2
            L5d:
                java.lang.String[] r1 = r13.$resolvedTableNames
                int[] r4 = r13.$tableIds
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                int r7 = r1.length
                r8 = 0
                r9 = r8
            L69:
                if (r8 >= r7) goto L8a
                r10 = r1[r8]
                int r11 = r9 + 1
                java.lang.Object r12 = r15.a
                if (r12 == 0) goto L84
                int[] r12 = (int[]) r12
                r9 = r4[r9]
                r12 = r12[r9]
                r9 = r14[r9]
                if (r12 == r9) goto L80
                r6.add(r10)
            L80:
                int r8 = r8 + 1
                r9 = r11
                goto L69
            L84:
                java.lang.String r13 = "Required value was null."
                defpackage.hu2.h(r13)
                return r2
            L8a:
                boolean r15 = r6.isEmpty()
                if (r15 != 0) goto La3
                kp0 r15 = r13.$$this$flow
                java.util.Set r1 = defpackage.kw.P0(r6)
                r0.L$0 = r13
                r0.L$1 = r14
                r0.label = r3
                java.lang.Object r15 = r15.emit(r1, r0)
                if (r15 != r5) goto La3
            La2:
                return r5
            La3:
                z42 r13 = r13.$currentVersions
                r13.a = r14
                vy2 r13 = defpackage.vy2.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$createFlow$1.AnonymousClass2.emit(int[], a10):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$createFlow$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, int[] iArr, boolean z, String[] strArr, a10 a10Var) {
        super(2, a10Var);
        this.this$0 = triggerBasedInvalidationTracker;
        this.$tableIds = iArr;
        this.$emitInitialState = z;
        this.$resolvedTableNames = strArr;
    }

    @Override // defpackage.cm
    public final a10 create(Object obj, a10 a10Var) {
        TriggerBasedInvalidationTracker$createFlow$1 triggerBasedInvalidationTracker$createFlow$1 = new TriggerBasedInvalidationTracker$createFlow$1(this.this$0, this.$tableIds, this.$emitInitialState, this.$resolvedTableNames, a10Var);
        triggerBasedInvalidationTracker$createFlow$1.L$0 = obj;
        return triggerBasedInvalidationTracker$createFlow$1;
    }

    @Override // defpackage.ts0
    public final Object invoke(kp0 kp0Var, a10 a10Var) {
        return ((TriggerBasedInvalidationTracker$createFlow$1) create(kp0Var, a10Var)).invokeSuspend(vy2.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        if (r14.collect(r6, r13) != r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (defpackage.od4.D((defpackage.j20) r14, r4, r13) == r5) goto L28;
     */
    /* JADX WARN: Type inference failed for: r7v0, types: [z42, java.lang.Object] */
    @Override // defpackage.cm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.label
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            e50 r5 = defpackage.e50.a
            if (r0 == 0) goto L2f
            if (r0 == r4) goto L27
            if (r0 == r3) goto L1f
            if (r0 == r2) goto L16
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r13)
            return r1
        L16:
            defpackage.ta3.H(r14)     // Catch: java.lang.Throwable -> L1b
            goto L91
        L1b:
            r0 = move-exception
            r14 = r0
            goto L98
        L1f:
            java.lang.Object r0 = r13.L$0
            kp0 r0 = (defpackage.kp0) r0
            defpackage.ta3.H(r14)
            goto L6d
        L27:
            java.lang.Object r0 = r13.L$0
            kp0 r0 = (defpackage.kp0) r0
            defpackage.ta3.H(r14)
            goto L59
        L2f:
            defpackage.ta3.H(r14)
            java.lang.Object r14 = r13.L$0
            kp0 r14 = (defpackage.kp0) r14
            androidx.room.TriggerBasedInvalidationTracker r0 = r13.this$0
            androidx.room.ObservedTableStates r0 = androidx.room.TriggerBasedInvalidationTracker.access$getObservedTableStates$p(r0)
            int[] r6 = r13.$tableIds
            boolean r0 = r0.onObserverAdded$room_runtime_release(r6)
            if (r0 == 0) goto L6f
            androidx.room.TriggerBasedInvalidationTracker r0 = r13.this$0
            androidx.room.RoomDatabase r0 = androidx.room.TriggerBasedInvalidationTracker.access$getDatabase$p(r0)
            r13.L$0 = r14
            r13.label = r4
            r4 = 0
            java.lang.Object r0 = androidx.room.util.DBUtil.getCoroutineContext(r0, r4, r13)
            if (r0 != r5) goto L56
            goto L90
        L56:
            r12 = r0
            r0 = r14
            r14 = r12
        L59:
            j20 r14 = (defpackage.j20) r14
            androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1 r4 = new androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1
            androidx.room.TriggerBasedInvalidationTracker r6 = r13.this$0
            r4.<init>(r6, r1)
            r13.L$0 = r0
            r13.label = r3
            java.lang.Object r14 = defpackage.od4.D(r14, r4, r13)
            if (r14 != r5) goto L6d
            goto L90
        L6d:
            r9 = r0
            goto L70
        L6f:
            r9 = r14
        L70:
            z42 r7 = new z42     // Catch: java.lang.Throwable -> L1b
            r7.<init>()     // Catch: java.lang.Throwable -> L1b
            androidx.room.TriggerBasedInvalidationTracker r14 = r13.this$0     // Catch: java.lang.Throwable -> L1b
            androidx.room.ObservedTableVersions r14 = androidx.room.TriggerBasedInvalidationTracker.access$getObservedTableVersions$p(r14)     // Catch: java.lang.Throwable -> L1b
            androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2 r6 = new androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2     // Catch: java.lang.Throwable -> L1b
            boolean r8 = r13.$emitInitialState     // Catch: java.lang.Throwable -> L1b
            java.lang.String[] r10 = r13.$resolvedTableNames     // Catch: java.lang.Throwable -> L1b
            int[] r11 = r13.$tableIds     // Catch: java.lang.Throwable -> L1b
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1b
            r13.L$0 = r1     // Catch: java.lang.Throwable -> L1b
            r13.label = r2     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r14 = r14.collect(r6, r13)     // Catch: java.lang.Throwable -> L1b
            if (r14 != r5) goto L91
        L90:
            return r5
        L91:
            rx r14 = new rx     // Catch: java.lang.Throwable -> L1b
            r0 = 4
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            throw r14     // Catch: java.lang.Throwable -> L1b
        L98:
            androidx.room.TriggerBasedInvalidationTracker r0 = r13.this$0
            androidx.room.ObservedTableStates r0 = androidx.room.TriggerBasedInvalidationTracker.access$getObservedTableStates$p(r0)
            int[] r13 = r13.$tableIds
            r0.onObserverRemoved$room_runtime_release(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$createFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
