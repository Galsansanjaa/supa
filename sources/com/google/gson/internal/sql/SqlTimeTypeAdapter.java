package com.google.gson.internal.sql;

import com.google.gson.b;
import com.google.gson.reflect.TypeToken;
import defpackage.q91;
import defpackage.rx;
import defpackage.sx2;
import defpackage.x91;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
final class SqlTimeTypeAdapter extends b {
    public static final sx2 b = new sx2() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // defpackage.sx2
        public final b a(com.google.gson.a aVar, TypeToken typeToken) {
            if (typeToken.a == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };
    public final SimpleDateFormat a;

    private SqlTimeTypeAdapter() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }

    public /* synthetic */ SqlTimeTypeAdapter(int i) {
        this();
    }

    @Override // com.google.gson.b
    public final Object b(q91 q91Var) {
        Time time;
        if (q91Var.H() == 9) {
            q91Var.D();
            return null;
        }
        String F = q91Var.F();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    time = new Time(this.a.parse(F).getTime());
                } catch (ParseException e) {
                    throw new rx(3, "Failed parsing '" + F + "' as SQL Time; at path " + q91Var.n(true), e);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.gson.b
    public final void c(x91 x91Var, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            x91Var.q();
            return;
        }
        synchronized (this) {
            format = this.a.format((Date) time);
        }
        x91Var.B(format);
    }
}
