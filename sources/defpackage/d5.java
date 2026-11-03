package defpackage;

import androidx.compose.material3.DatePickerKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.model.WorkSpecDao_Impl;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d5 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ d5(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        boolean requestFocusBypassUnfocusableComposeView$lambda$0;
        boolean requestFocusViewFocusFix$lambda$1;
        boolean requestFocusCurrent$lambda$0;
        boolean requestFocusBypassUnfocusableComposeView$lambda$1;
        vy2 maxSqlCacheSize$lambda$11;
        vy2 _set_version_$lambda$1;
        boolean needUpgrade$lambda$9;
        List allEligibleWorkSpecsForScheduling$lambda$29;
        List eligibleWorkForScheduling$lambda$25;
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                requestFocusBypassUnfocusableComposeView$lambda$0 = AndroidComposeView.requestFocusBypassUnfocusableComposeView$lambda$0(i2, (FocusTargetNode) obj);
                return Boolean.valueOf(requestFocusBypassUnfocusableComposeView$lambda$0);
            case 1:
                requestFocusViewFocusFix$lambda$1 = AndroidComposeView.requestFocusViewFocusFix$lambda$1(i2, (FocusTargetNode) obj);
                return Boolean.valueOf(requestFocusViewFocusFix$lambda$1);
            case 2:
                requestFocusCurrent$lambda$0 = AndroidComposeView.requestFocusCurrent$lambda$0(i2, (FocusTargetNode) obj);
                return Boolean.valueOf(requestFocusCurrent$lambda$0);
            case 3:
                requestFocusBypassUnfocusableComposeView$lambda$1 = AndroidComposeView.requestFocusBypassUnfocusableComposeView$lambda$1(i2, (FocusTargetNode) obj);
                return Boolean.valueOf(requestFocusBypassUnfocusableComposeView$lambda$1);
            case 4:
                maxSqlCacheSize$lambda$11 = AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setMaxSqlCacheSize$lambda$11(i2, (SupportSQLiteDatabase) obj);
                return maxSqlCacheSize$lambda$11;
            case 5:
                _set_version_$lambda$1 = AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase._set_version_$lambda$1(i2, (SupportSQLiteDatabase) obj);
                return _set_version_$lambda$1;
            case 6:
                needUpgrade$lambda$9 = AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.needUpgrade$lambda$9(i2, (SupportSQLiteDatabase) obj);
                return Boolean.valueOf(needUpgrade$lambda$9);
            case 7:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i2 + '.');
            case 8:
                return Integer.valueOf(DatePickerKt.q(i2, ((Integer) obj).intValue()));
            case 9:
                return Integer.valueOf(DatePickerKt.u(i2, ((Integer) obj).intValue()));
            case 10:
                return Boolean.valueOf(FocusOwnerImpl.c(i2, (FocusTargetNode) obj));
            case 11:
                return Boolean.valueOf(FocusOwnerImpl.b(i2, (FocusTargetNode) obj));
            case 12:
                return Boolean.valueOf(FocusTargetNode.c(i2, (FocusTargetNode) obj));
            case 13:
                allEligibleWorkSpecsForScheduling$lambda$29 = WorkSpecDao_Impl.getAllEligibleWorkSpecsForScheduling$lambda$29("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", i2, (SQLiteConnection) obj);
                return allEligibleWorkSpecsForScheduling$lambda$29;
            default:
                eligibleWorkForScheduling$lambda$25 = WorkSpecDao_Impl.getEligibleWorkForScheduling$lambda$25("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", i2, (SQLiteConnection) obj);
                return eligibleWorkForScheduling$lambda$25;
        }
    }
}
