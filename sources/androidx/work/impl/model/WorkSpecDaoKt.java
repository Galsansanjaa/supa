package androidx.work.impl.model;

import defpackage.a10;
import defpackage.c10;
import defpackage.e50;
import defpackage.jh2;
import defpackage.jp0;
import defpackage.kp0;
import defpackage.kx;
import defpackage.lb0;
import defpackage.nb0;
import defpackage.vy2;
import defpackage.w20;
import java.util.UUID;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class WorkSpecDaoKt {
    private static final String WORK_INFO_BY_IDS = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)";
    private static final String WORK_INFO_BY_NAME = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)";
    private static final String WORK_INFO_BY_TAG = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)";
    private static final String WORK_INFO_COLUMNS = "id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason";

    public static final jp0 dedup(final jp0 jp0Var, w20 w20Var) {
        jp0Var.getClass();
        w20Var.getClass();
        return jh2.x(kx.r(new jp0() { // from class: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1

            /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
            /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements kp0 {
                final /* synthetic */ kp0 $this_unsafeFlow;

                @lb0(c = "androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2", f = "WorkSpecDao.kt", l = {50}, m = "emit")
                /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends c10 {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(a10 a10Var) {
                        super(a10Var);
                    }

                    @Override // defpackage.cm
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kp0 kp0Var) {
                    this.$this_unsafeFlow = kp0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // defpackage.kp0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.a10 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1 r0 = (androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1 r0 = new androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r2) goto L25
                        defpackage.ta3.H(r6)
                        goto L63
                    L25:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.hu2.h(r4)
                        r4 = 0
                        return r4
                    L2c:
                        defpackage.ta3.H(r6)
                        kp0 r4 = r4.$this_unsafeFlow
                        java.util.List r5 = (java.util.List) r5
                        java.lang.Iterable r5 = (java.lang.Iterable) r5
                        java.util.ArrayList r6 = new java.util.ArrayList
                        r1 = 10
                        int r1 = defpackage.lw.Z(r5, r1)
                        r6.<init>(r1)
                        java.util.Iterator r5 = r5.iterator()
                    L44:
                        boolean r1 = r5.hasNext()
                        if (r1 == 0) goto L58
                        java.lang.Object r1 = r5.next()
                        androidx.work.impl.model.WorkSpec$WorkInfoPojo r1 = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) r1
                        androidx.work.WorkInfo r1 = r1.toWorkInfo()
                        r6.add(r1)
                        goto L44
                    L58:
                        r0.label = r2
                        java.lang.Object r4 = r4.emit(r6, r0)
                        e50 r5 = defpackage.e50.a
                        if (r4 != r5) goto L63
                        return r5
                    L63:
                        vy2 r4 = defpackage.vy2.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, a10):java.lang.Object");
                }
            }

            @Override // defpackage.jp0
            public Object collect(kp0 kp0Var, a10 a10Var) {
                Object collect = jp0.this.collect(new AnonymousClass2(kp0Var), a10Var);
                return collect == e50.a ? collect : vy2.a;
            }
        }), w20Var);
    }

    public static final jp0 getWorkStatusPojoFlowDataForIds(WorkSpecDao workSpecDao, UUID uuid) {
        workSpecDao.getClass();
        uuid.getClass();
        final jp0 workStatusPojoFlowDataForIds = workSpecDao.getWorkStatusPojoFlowDataForIds(nb0.C(String.valueOf(uuid)));
        return kx.r(new jp0() { // from class: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1

            /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
            /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements kp0 {
                final /* synthetic */ kp0 $this_unsafeFlow;

                @lb0(c = "androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2", f = "WorkSpecDao.kt", l = {50}, m = "emit")
                /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends c10 {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(a10 a10Var) {
                        super(a10Var);
                    }

                    @Override // defpackage.cm
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kp0 kp0Var) {
                    this.$this_unsafeFlow = kp0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
                @Override // defpackage.kp0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.a10 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1 r0 = (androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1 r0 = new androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 0
                        r3 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r3) goto L26
                        defpackage.ta3.H(r6)
                        goto L4a
                    L26:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.hu2.h(r4)
                        return r2
                    L2c:
                        defpackage.ta3.H(r6)
                        kp0 r4 = r4.$this_unsafeFlow
                        java.util.List r5 = (java.util.List) r5
                        java.lang.Object r5 = defpackage.kw.r0(r5)
                        androidx.work.impl.model.WorkSpec$WorkInfoPojo r5 = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) r5
                        if (r5 == 0) goto L3f
                        androidx.work.WorkInfo r2 = r5.toWorkInfo()
                    L3f:
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r2, r0)
                        e50 r5 = defpackage.e50.a
                        if (r4 != r5) goto L4a
                        return r5
                    L4a:
                        vy2 r4 = defpackage.vy2.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, a10):java.lang.Object");
                }
            }

            @Override // defpackage.jp0
            public Object collect(kp0 kp0Var, a10 a10Var) {
                Object collect = jp0.this.collect(new AnonymousClass2(kp0Var), a10Var);
                return collect == e50.a ? collect : vy2.a;
            }
        });
    }

    public static final jp0 getWorkStatusPojoFlowForName(WorkSpecDao workSpecDao, w20 w20Var, String str) {
        workSpecDao.getClass();
        w20Var.getClass();
        str.getClass();
        return dedup(workSpecDao.getWorkStatusPojoFlowForName(str), w20Var);
    }

    public static final jp0 getWorkStatusPojoFlowForTag(WorkSpecDao workSpecDao, w20 w20Var, String str) {
        workSpecDao.getClass();
        w20Var.getClass();
        str.getClass();
        return dedup(workSpecDao.getWorkStatusPojoFlowForTag(str), w20Var);
    }
}
