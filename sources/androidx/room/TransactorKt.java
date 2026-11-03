package androidx.room;

import androidx.room.Transactor;
import androidx.sqlite.SQLiteStatement;
import defpackage.a10;
import defpackage.e50;
import defpackage.pp2;
import defpackage.ts0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class TransactorKt {
    public static final <R> Object deferredTransaction(Transactor transactor, ts0 ts0Var, a10 a10Var) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.DEFERRED, ts0Var, a10Var);
    }

    public static final <R> Object exclusiveTransaction(Transactor transactor, ts0 ts0Var, a10 a10Var) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.EXCLUSIVE, ts0Var, a10Var);
    }

    public static final Object execSQL(PooledConnection pooledConnection, String str, a10 a10Var) {
        Object usePrepared = pooledConnection.usePrepared(str, new pp2(27), a10Var);
        return usePrepared == e50.a ? usePrepared : vy2.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean execSQL$lambda$0(SQLiteStatement sQLiteStatement) {
        sQLiteStatement.getClass();
        return sQLiteStatement.step();
    }

    public static final <R> Object immediateTransaction(Transactor transactor, ts0 ts0Var, a10 a10Var) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.IMMEDIATE, ts0Var, a10Var);
    }
}
