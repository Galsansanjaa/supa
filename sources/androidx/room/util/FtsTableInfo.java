package androidx.room.util;

import androidx.room.driver.SupportSQLiteConnection;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import defpackage.sb0;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class FtsTableInfo {
    public static final Companion Companion = new Companion(null);
    public final Set<String> columns;
    public final String name;
    public final Set<String> options;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final FtsTableInfo read(SQLiteConnection sQLiteConnection, String str) {
            sQLiteConnection.getClass();
            str.getClass();
            return new FtsTableInfo(str, SchemaInfoUtilKt.readFtsColumns(sQLiteConnection, str), SchemaInfoUtilKt.readFtsOptions(sQLiteConnection, str));
        }

        public final FtsTableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            supportSQLiteDatabase.getClass();
            str.getClass();
            return read(new SupportSQLiteConnection(supportSQLiteDatabase), str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FtsTableInfo(String str, Set<String> set, String str2) {
        this(str, set, SchemaInfoUtilKt.parseFtsOptions(str2));
        str.getClass();
        set.getClass();
        str2.getClass();
    }

    public FtsTableInfo(String str, Set<String> set, Set<String> set2) {
        str.getClass();
        set.getClass();
        set2.getClass();
        this.name = str;
        this.columns = set;
        this.options = set2;
    }

    public static final FtsTableInfo read(SQLiteConnection sQLiteConnection, String str) {
        return Companion.read(sQLiteConnection, str);
    }

    public static final FtsTableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    public boolean equals(Object obj) {
        return FtsTableInfoKt.equalsCommon(this, obj);
    }

    public int hashCode() {
        return FtsTableInfoKt.hashCodeCommon(this);
    }

    public String toString() {
        return FtsTableInfoKt.toStringCommon(this);
    }
}
