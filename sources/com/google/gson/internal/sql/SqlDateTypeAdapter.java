package com.google.gson.internal.sql;

import com.google.gson.b;
import com.google.gson.reflect.TypeToken;
import defpackage.q91;
import defpackage.rx;
import defpackage.sx2;
import defpackage.x91;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
final class SqlDateTypeAdapter extends b {
    public static final sx2 b = new sx2() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // defpackage.sx2
        public final b a(com.google.gson.a aVar, TypeToken typeToken) {
            if (typeToken.a == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };
    public final SimpleDateFormat a;

    private SqlDateTypeAdapter() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }

    public /* synthetic */ SqlDateTypeAdapter(int i) {
        this();
    }

    @Override // com.google.gson.b
    public final Object b(q91 q91Var) {
        Date date;
        if (q91Var.H() == 9) {
            q91Var.D();
            return null;
        }
        String F = q91Var.F();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    date = new Date(this.a.parse(F).getTime());
                } catch (ParseException e) {
                    throw new rx(3, "Failed parsing '" + F + "' as SQL Date; at path " + q91Var.n(true), e);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.gson.b
    public final void c(x91 x91Var, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            x91Var.q();
            return;
        }
        synchronized (this) {
            format = this.a.format((java.util.Date) date);
        }
        x91Var.B(format);
    }
}
