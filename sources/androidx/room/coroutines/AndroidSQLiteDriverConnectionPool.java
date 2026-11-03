package androidx.room.coroutines;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.driver.AndroidSQLiteConnection;
import defpackage.a10;
import defpackage.co2;
import defpackage.k2;
import defpackage.nb1;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class AndroidSQLiteDriverConnectionPool implements ConnectionPool {
    private final nb1 androidConnection$delegate;
    private final SQLiteDriver driver;
    private final String fileName;

    public AndroidSQLiteDriverConnectionPool(SQLiteDriver sQLiteDriver, String str) {
        sQLiteDriver.getClass();
        str.getClass();
        this.driver = sQLiteDriver;
        this.fileName = str;
        this.androidConnection$delegate = new co2(new k2(this, 6));
    }

    public static /* synthetic */ AndroidSQLiteDriverPooledConnection a(AndroidSQLiteDriverConnectionPool androidSQLiteDriverConnectionPool) {
        return androidConnection_delegate$lambda$0(androidSQLiteDriverConnectionPool);
    }

    public static final AndroidSQLiteDriverPooledConnection androidConnection_delegate$lambda$0(AndroidSQLiteDriverConnectionPool androidSQLiteDriverConnectionPool) {
        SQLiteConnection open = androidSQLiteDriverConnectionPool.driver.open(androidSQLiteDriverConnectionPool.fileName);
        open.getClass();
        return new AndroidSQLiteDriverPooledConnection((AndroidSQLiteConnection) open);
    }

    private final AndroidSQLiteDriverPooledConnection getAndroidConnection() {
        return (AndroidSQLiteDriverPooledConnection) this.androidConnection$delegate.getValue();
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        getAndroidConnection().getDelegate().close();
    }

    @Override // androidx.room.coroutines.ConnectionPool
    public <R> Object useConnection(boolean z, ts0 ts0Var, a10 a10Var) {
        return ts0Var.invoke(getAndroidConnection(), a10Var);
    }
}
