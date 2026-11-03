package androidx.room.driver;

import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.coroutines.ConnectionPool;
import androidx.room.coroutines.RawConnectionAccessor;
import androidx.sqlite.SQLiteConnection;
import defpackage.a10;
import defpackage.hu2;
import defpackage.jh2;
import defpackage.ps0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
final class SupportSQLitePooledConnection implements Transactor, RawConnectionAccessor {
    private Transactor.SQLiteTransactionType currentTransactionType;
    private final SupportSQLiteConnection delegate;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public final class SupportSQLiteTransactor<T> implements TransactionScope<T>, RawConnectionAccessor {
        public SupportSQLiteTransactor() {
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        public SQLiteConnection getRawConnection() {
            return SupportSQLitePooledConnection.this.getRawConnection();
        }

        @Override // androidx.room.TransactionScope
        public Object rollback(T t, a10 a10Var) {
            throw new ConnectionPool.RollbackException(t);
        }

        @Override // androidx.room.PooledConnection
        public <R> Object usePrepared(String str, ps0 ps0Var, a10 a10Var) {
            return SupportSQLitePooledConnection.this.usePrepared(str, ps0Var, a10Var);
        }

        @Override // androidx.room.TransactionScope
        public <R> Object withNestedTransaction(ts0 ts0Var, a10 a10Var) {
            SupportSQLitePooledConnection supportSQLitePooledConnection = SupportSQLitePooledConnection.this;
            Transactor.SQLiteTransactionType sQLiteTransactionType = supportSQLitePooledConnection.currentTransactionType;
            if (sQLiteTransactionType != null) {
                return supportSQLitePooledConnection.transaction(sQLiteTransactionType, ts0Var, a10Var);
            }
            hu2.h("Required value was null.");
            return null;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Transactor.SQLiteTransactionType.values().length];
            try {
                iArr[Transactor.SQLiteTransactionType.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SupportSQLitePooledConnection(SupportSQLiteConnection supportSQLiteConnection) {
        supportSQLiteConnection.getClass();
        this.delegate = supportSQLiteConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object transaction(androidx.room.Transactor.SQLiteTransactionType r6, defpackage.ts0 r7, defpackage.a10 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.room.driver.SupportSQLitePooledConnection$transaction$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.driver.SupportSQLitePooledConnection$transaction$1 r0 = (androidx.room.driver.SupportSQLitePooledConnection$transaction$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.driver.SupportSQLitePooledConnection$transaction$1 r0 = new androidx.room.driver.SupportSQLitePooledConnection$transaction$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 != r3) goto L34
            java.lang.Object r5 = r0.L$1
            androidx.sqlite.db.SupportSQLiteDatabase r5 = (androidx.sqlite.db.SupportSQLiteDatabase) r5
            java.lang.Object r6 = r0.L$0
            androidx.room.driver.SupportSQLitePooledConnection r6 = (androidx.room.driver.SupportSQLitePooledConnection) r6
            defpackage.ta3.H(r8)     // Catch: java.lang.Throwable -> L2e androidx.room.coroutines.ConnectionPool.RollbackException -> L31
            goto L82
        L2e:
            r7 = move-exception
            goto La8
        L31:
            r7 = move-exception
            goto L98
        L34:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r5)
            return r2
        L3a:
            defpackage.ta3.H(r8)
            androidx.room.driver.SupportSQLiteConnection r8 = r5.delegate
            androidx.sqlite.db.SupportSQLiteDatabase r8 = r8.getDb()
            boolean r1 = r8.inTransaction()
            if (r1 != 0) goto L4b
            r5.currentTransactionType = r6
        L4b:
            int[] r1 = androidx.room.driver.SupportSQLitePooledConnection.WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r1[r6]
            if (r6 == r3) goto L67
            r1 = 2
            if (r6 == r1) goto L63
            r1 = 3
            if (r6 != r1) goto L5f
            r8.beginTransaction()
            goto L6a
        L5f:
            defpackage.hu2.e()
            return r2
        L63:
            r8.beginTransactionNonExclusive()
            goto L6a
        L67:
            r8.beginTransactionReadOnly()
        L6a:
            androidx.room.driver.SupportSQLitePooledConnection$SupportSQLiteTransactor r6 = new androidx.room.driver.SupportSQLitePooledConnection$SupportSQLiteTransactor     // Catch: java.lang.Throwable -> L91 androidx.room.coroutines.ConnectionPool.RollbackException -> L95
            r6.<init>()     // Catch: java.lang.Throwable -> L91 androidx.room.coroutines.ConnectionPool.RollbackException -> L95
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L91 androidx.room.coroutines.ConnectionPool.RollbackException -> L95
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L91 androidx.room.coroutines.ConnectionPool.RollbackException -> L95
            r0.label = r3     // Catch: java.lang.Throwable -> L91 androidx.room.coroutines.ConnectionPool.RollbackException -> L95
            java.lang.Object r6 = r7.invoke(r6, r0)     // Catch: java.lang.Throwable -> L91 androidx.room.coroutines.ConnectionPool.RollbackException -> L95
            e50 r7 = defpackage.e50.a
            if (r6 != r7) goto L7e
            return r7
        L7e:
            r4 = r6
            r6 = r5
            r5 = r8
            r8 = r4
        L82:
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2e androidx.room.coroutines.ConnectionPool.RollbackException -> L31
            r5.endTransaction()
            boolean r5 = r5.inTransaction()
            if (r5 != 0) goto L90
            r6.currentTransactionType = r2
        L90:
            return r8
        L91:
            r7 = move-exception
            r6 = r5
            r5 = r8
            goto La8
        L95:
            r7 = move-exception
            r6 = r5
            r5 = r8
        L98:
            java.lang.Object r7 = r7.getResult()     // Catch: java.lang.Throwable -> L2e
            r5.endTransaction()
            boolean r5 = r5.inTransaction()
            if (r5 != 0) goto La7
            r6.currentTransactionType = r2
        La7:
            return r7
        La8:
            r5.endTransaction()
            boolean r5 = r5.inTransaction()
            if (r5 != 0) goto Lb3
            r6.currentTransactionType = r2
        Lb3:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.driver.SupportSQLitePooledConnection.transaction(androidx.room.Transactor$SQLiteTransactionType, ts0, a10):java.lang.Object");
    }

    public final SupportSQLiteConnection getDelegate() {
        return this.delegate;
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    public SQLiteConnection getRawConnection() {
        return this.delegate;
    }

    @Override // androidx.room.Transactor
    public Object inTransaction(a10 a10Var) {
        return Boolean.valueOf(this.delegate.getDb().inTransaction());
    }

    @Override // androidx.room.PooledConnection
    public <R> Object usePrepared(String str, ps0 ps0Var, a10 a10Var) {
        SupportSQLiteStatement prepare = this.delegate.prepare(str);
        try {
            Object invoke = ps0Var.invoke(prepare);
            jh2.r(prepare, null);
            return invoke;
        } finally {
        }
    }

    @Override // androidx.room.Transactor
    public <R> Object withTransaction(Transactor.SQLiteTransactionType sQLiteTransactionType, ts0 ts0Var, a10 a10Var) {
        return transaction(sQLiteTransactionType, ts0Var, a10Var);
    }
}
