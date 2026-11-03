package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class as0 implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ as0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Cursor query$lambda$2;
        Cursor query$lambda$1;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                query$lambda$2 = FrameworkSQLiteDatabase.query$lambda$2((SupportSQLiteQuery) obj, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$2;
            default:
                query$lambda$1 = FrameworkSQLiteDatabase.query$lambda$1((c6) obj, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$1;
        }
    }
}
