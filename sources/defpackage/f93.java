package defpackage;

import androidx.sqlite.SQLiteConnection;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao_Impl;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f93 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ WorkSpecDao_Impl m;

    public /* synthetic */ f93(String str, WorkSpecDao_Impl workSpecDao_Impl, int i) {
        this.a = i;
        this.b = str;
        this.m = workSpecDao_Impl;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        List workStatusPojoFlowForTag$lambda$13;
        List workStatusPojoForTag$lambda$12;
        List workStatusPojoLiveDataForName$lambda$16;
        List workStatusPojoForName$lambda$15;
        List workStatusPojoFlowForName$lambda$17;
        WorkSpec.WorkInfoPojo workStatusPojoForId$lambda$8;
        List workStatusPojoLiveDataForTag$lambda$14;
        int i = this.a;
        WorkSpecDao_Impl workSpecDao_Impl = this.m;
        String str = this.b;
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
        switch (i) {
            case 0:
                workStatusPojoFlowForTag$lambda$13 = WorkSpecDao_Impl.getWorkStatusPojoFlowForTag$lambda$13("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", str, workSpecDao_Impl, sQLiteConnection);
                return workStatusPojoFlowForTag$lambda$13;
            case 1:
                workStatusPojoForTag$lambda$12 = WorkSpecDao_Impl.getWorkStatusPojoForTag$lambda$12("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", str, workSpecDao_Impl, sQLiteConnection);
                return workStatusPojoForTag$lambda$12;
            case 2:
                workStatusPojoLiveDataForName$lambda$16 = WorkSpecDao_Impl.getWorkStatusPojoLiveDataForName$lambda$16("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", str, workSpecDao_Impl, sQLiteConnection);
                return workStatusPojoLiveDataForName$lambda$16;
            case 3:
                workStatusPojoForName$lambda$15 = WorkSpecDao_Impl.getWorkStatusPojoForName$lambda$15("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", str, workSpecDao_Impl, sQLiteConnection);
                return workStatusPojoForName$lambda$15;
            case 4:
                workStatusPojoFlowForName$lambda$17 = WorkSpecDao_Impl.getWorkStatusPojoFlowForName$lambda$17("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", str, workSpecDao_Impl, sQLiteConnection);
                return workStatusPojoFlowForName$lambda$17;
            case 5:
                workStatusPojoForId$lambda$8 = WorkSpecDao_Impl.getWorkStatusPojoForId$lambda$8("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=?", str, workSpecDao_Impl, sQLiteConnection);
                return workStatusPojoForId$lambda$8;
            default:
                workStatusPojoLiveDataForTag$lambda$14 = WorkSpecDao_Impl.getWorkStatusPojoLiveDataForTag$lambda$14("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", str, workSpecDao_Impl, sQLiteConnection);
                return workStatusPojoLiveDataForTag$lambda$14;
        }
    }
}
