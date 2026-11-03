package androidx.work.impl.model;

import androidx.sqlite.db.SupportSQLiteQuery;
import defpackage.jp0;
import defpackage.w20;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class RawWorkInfoDaoKt {
    public static final jp0 getWorkInfoPojosFlow(RawWorkInfoDao rawWorkInfoDao, w20 w20Var, SupportSQLiteQuery supportSQLiteQuery) {
        rawWorkInfoDao.getClass();
        w20Var.getClass();
        supportSQLiteQuery.getClass();
        return WorkSpecDaoKt.dedup(rawWorkInfoDao.getWorkInfoPojosFlow(supportSQLiteQuery), w20Var);
    }
}
