package defpackage;

import androidx.sqlite.SQLiteConnection;
import androidx.work.impl.model.WorkSpecDao_Impl;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i93 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String m;

    public /* synthetic */ i93(String str, int i, long j) {
        this.a = i;
        this.b = j;
        this.m = str;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 nextScheduleTimeOverride$lambda$45;
        int markWorkSpecScheduled$lambda$47;
        vy2 lastEnqueueTime$lambda$42;
        int i = this.a;
        String str = this.m;
        long j = this.b;
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
        switch (i) {
            case 0:
                nextScheduleTimeOverride$lambda$45 = WorkSpecDao_Impl.setNextScheduleTimeOverride$lambda$45("UPDATE workspec SET next_schedule_time_override=? WHERE id=?", j, str, sQLiteConnection);
                return nextScheduleTimeOverride$lambda$45;
            case 1:
                markWorkSpecScheduled$lambda$47 = WorkSpecDao_Impl.markWorkSpecScheduled$lambda$47("UPDATE workspec SET schedule_requested_at=? WHERE id=?", j, str, sQLiteConnection);
                return Integer.valueOf(markWorkSpecScheduled$lambda$47);
            default:
                lastEnqueueTime$lambda$42 = WorkSpecDao_Impl.setLastEnqueueTime$lambda$42("UPDATE workspec SET last_enqueue_time=? WHERE id=?", j, str, sQLiteConnection);
                return lastEnqueueTime$lambda$42;
        }
    }
}
