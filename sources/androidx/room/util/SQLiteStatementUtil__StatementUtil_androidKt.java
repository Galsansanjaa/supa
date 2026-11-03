package androidx.room.util;

import android.os.Build;
import androidx.sqlite.SQLiteStatement;
import defpackage.bn2;
import defpackage.wa2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class SQLiteStatementUtil__StatementUtil_androidKt {
    public static final int columnIndexOf(SQLiteStatement sQLiteStatement, String str) {
        sQLiteStatement.getClass();
        str.getClass();
        int columnIndexOfCommon = SQLiteStatementUtil.columnIndexOfCommon(sQLiteStatement, str);
        if (columnIndexOfCommon >= 0) {
            return columnIndexOfCommon;
        }
        int columnIndexOfCommon2 = SQLiteStatementUtil.columnIndexOfCommon(sQLiteStatement, "`" + str + '`');
        return columnIndexOfCommon2 >= 0 ? columnIndexOfCommon2 : findColumnIndexBySuffix$SQLiteStatementUtil__StatementUtil_androidKt(sQLiteStatement, str);
    }

    private static final int findColumnIndexBySuffix$SQLiteStatementUtil__StatementUtil_androidKt(SQLiteStatement sQLiteStatement, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        int columnCount = sQLiteStatement.getColumnCount();
        String concat = ".".concat(str);
        String r = wa2.r(".", str, '`');
        for (int i = 0; i < columnCount; i++) {
            String columnName = sQLiteStatement.getColumnName(i);
            if (columnName.length() >= str.length() + 2 && (bn2.b0(columnName, concat, false) || (columnName.charAt(0) == '`' && bn2.b0(columnName, r, false)))) {
                return i;
            }
        }
        return -1;
    }
}
