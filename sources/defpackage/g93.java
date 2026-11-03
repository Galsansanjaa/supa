package defpackage;

import androidx.sqlite.SQLiteConnection;
import androidx.work.impl.model.WorkSpecDao_Impl;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g93 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List m;
    public final /* synthetic */ WorkSpecDao_Impl n;

    public /* synthetic */ g93(String str, List list, WorkSpecDao_Impl workSpecDao_Impl, int i) {
        this.a = i;
        this.b = str;
        this.m = list;
        this.n = workSpecDao_Impl;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        WorkSpecDao_Impl workSpecDao_Impl = this.n;
        List list = this.m;
        String str = this.b;
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
        switch (i) {
            case 0:
                return WorkSpecDao_Impl.K(str, list, workSpecDao_Impl, sQLiteConnection);
            case 1:
                return WorkSpecDao_Impl.L(str, list, workSpecDao_Impl, sQLiteConnection);
            default:
                return WorkSpecDao_Impl.M(str, list, workSpecDao_Impl, sQLiteConnection);
        }
    }
}
