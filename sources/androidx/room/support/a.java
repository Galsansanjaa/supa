package androidx.room.support;

import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.sqlite.db.SupportSQLiteStatement;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ps0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        SupportSQLiteStatement supportSQLiteStatement = (SupportSQLiteStatement) obj;
        switch (this.a) {
            case 0:
                return Long.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.l(supportSQLiteStatement));
            case 1:
                return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.d(supportSQLiteStatement);
            case 2:
                return Integer.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.a(supportSQLiteStatement));
            case 3:
                return Long.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.g(supportSQLiteStatement));
            default:
                return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.e(supportSQLiteStatement);
        }
    }
}
