package com.google.gson.internal.sql;

import com.google.gson.b;
import com.google.gson.reflect.TypeToken;
import defpackage.q91;
import defpackage.sx2;
import defpackage.x91;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
class SqlTimestampTypeAdapter extends b {
    public static final sx2 b = new sx2() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // defpackage.sx2
        public final b a(com.google.gson.a aVar, TypeToken typeToken) {
            if (typeToken.a != Timestamp.class) {
                return null;
            }
            aVar.getClass();
            return new SqlTimestampTypeAdapter(aVar.b(new TypeToken(Date.class)));
        }
    };
    public final b a;

    public SqlTimestampTypeAdapter(b bVar) {
        this.a = bVar;
    }

    @Override // com.google.gson.b
    public final Object b(q91 q91Var) {
        Date date = (Date) this.a.b(q91Var);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.b
    public final void c(x91 x91Var, Object obj) {
        this.a.c(x91Var, (Timestamp) obj);
    }
}
