package defpackage;

import androidx.sqlite.SQLiteConnection;
import androidx.work.impl.model.SystemIdInfoDao_Impl;
import androidx.work.impl.model.WorkSpecDao_Impl;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class eo2 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int m;

    public /* synthetic */ eo2(int i, String str) {
        this.a = 2;
        this.m = i;
        this.b = str;
    }

    public /* synthetic */ eo2(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.m = i;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 stopReason$lambda$51;
        vy2 resetWorkSpecNextScheduleTimeOverride$lambda$46;
        int i = this.a;
        int i2 = this.m;
        String str = this.b;
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
        switch (i) {
            case 0:
                return SystemIdInfoDao_Impl.a(str, i2, sQLiteConnection);
            case 1:
                return SystemIdInfoDao_Impl.d(str, i2, sQLiteConnection);
            case 2:
                stopReason$lambda$51 = WorkSpecDao_Impl.setStopReason$lambda$51("UPDATE workspec SET stop_reason=? WHERE id=?", i2, str, sQLiteConnection);
                return stopReason$lambda$51;
            default:
                resetWorkSpecNextScheduleTimeOverride$lambda$46 = WorkSpecDao_Impl.resetWorkSpecNextScheduleTimeOverride$lambda$46("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)", str, i2, sQLiteConnection);
                return resetWorkSpecNextScheduleTimeOverride$lambda$46;
        }
    }
}
