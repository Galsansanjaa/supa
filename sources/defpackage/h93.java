package defpackage;

import androidx.sqlite.SQLiteConnection;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao_Impl;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h93 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WorkSpecDao_Impl b;
    public final /* synthetic */ WorkSpec m;

    public /* synthetic */ h93(WorkSpecDao_Impl workSpecDao_Impl, WorkSpec workSpec, int i) {
        this.a = i;
        this.b = workSpecDao_Impl;
        this.m = workSpec;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 updateWorkSpec$lambda$1;
        vy2 insertWorkSpec$lambda$0;
        int i = this.a;
        WorkSpec workSpec = this.m;
        WorkSpecDao_Impl workSpecDao_Impl = this.b;
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
        switch (i) {
            case 0:
                updateWorkSpec$lambda$1 = WorkSpecDao_Impl.updateWorkSpec$lambda$1(workSpecDao_Impl, workSpec, sQLiteConnection);
                return updateWorkSpec$lambda$1;
            default:
                insertWorkSpec$lambda$0 = WorkSpecDao_Impl.insertWorkSpec$lambda$0(workSpecDao_Impl, workSpec, sQLiteConnection);
                return insertWorkSpec$lambda$0;
        }
    }
}
