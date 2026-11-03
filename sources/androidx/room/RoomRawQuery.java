package androidx.room;

import androidx.sqlite.SQLiteStatement;
import defpackage.ps0;
import defpackage.qu1;
import defpackage.sb0;
import defpackage.vy2;
import defpackage.y4;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class RoomRawQuery {
    private final ps0 bindingFunction;
    private final String sql;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomRawQuery(String str) {
        this(str, null, 2, null);
        str.getClass();
    }

    public RoomRawQuery(String str, ps0 ps0Var) {
        str.getClass();
        ps0Var.getClass();
        this.sql = str;
        this.bindingFunction = new y4(ps0Var, 10);
    }

    public /* synthetic */ RoomRawQuery(String str, ps0 ps0Var, int i, sb0 sb0Var) {
        this(str, (i & 2) != 0 ? new qu1(19) : ps0Var);
    }

    public static final vy2 _init_$lambda$0(SQLiteStatement sQLiteStatement) {
        sQLiteStatement.getClass();
        return vy2.a;
    }

    public static /* synthetic */ vy2 a(SQLiteStatement sQLiteStatement) {
        return _init_$lambda$0(sQLiteStatement);
    }

    public static final vy2 bindingFunction$lambda$1(ps0 ps0Var, SQLiteStatement sQLiteStatement) {
        sQLiteStatement.getClass();
        ps0Var.invoke(new BindOnlySQLiteStatement(sQLiteStatement));
        return vy2.a;
    }

    public final ps0 getBindingFunction() {
        return this.bindingFunction;
    }

    public final String getSql() {
        return this.sql;
    }
}
