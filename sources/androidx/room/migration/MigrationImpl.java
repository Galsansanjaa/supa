package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
final class MigrationImpl extends Migration {
    private final ps0 migrateCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigrationImpl(int i, int i2, ps0 ps0Var) {
        super(i, i2);
        ps0Var.getClass();
        this.migrateCallback = ps0Var;
    }

    public final ps0 getMigrateCallback() {
        return this.migrateCallback;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.getClass();
        this.migrateCallback.invoke(supportSQLiteDatabase);
    }
}
