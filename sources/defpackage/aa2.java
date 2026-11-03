package defpackage;

import androidx.room.DatabaseConfiguration;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class aa2 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RoomDatabase b;

    public /* synthetic */ aa2(RoomDatabase roomDatabase, int i) {
        this.a = i;
        this.b = roomDatabase;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 endTransaction$lambda$9;
        SupportSQLiteOpenHelper createConnectionManager$lambda$1;
        vy2 beginTransaction$lambda$8;
        int i = this.a;
        RoomDatabase roomDatabase = this.b;
        switch (i) {
            case 0:
                endTransaction$lambda$9 = RoomDatabase.endTransaction$lambda$9(roomDatabase, (SupportSQLiteDatabase) obj);
                return endTransaction$lambda$9;
            case 1:
                createConnectionManager$lambda$1 = RoomDatabase.createConnectionManager$lambda$1(roomDatabase, (DatabaseConfiguration) obj);
                return createConnectionManager$lambda$1;
            default:
                beginTransaction$lambda$8 = RoomDatabase.beginTransaction$lambda$8(roomDatabase, (SupportSQLiteDatabase) obj);
                return beginTransaction$lambda$8;
        }
    }
}
