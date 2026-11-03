package defpackage;

import android.database.Cursor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class br1 {
    public int a = -1;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public final void a(Cursor cursor) {
        this.a = cursor.getInt(0);
        this.b = cursor.getString(1);
        this.c = cursor.getString(2);
        this.d = cursor.getString(3);
        this.e = cursor.getString(4);
        this.f = cursor.getString(5);
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        StringBuilder sb = new StringBuilder("{id=");
        sb.append(i);
        sb.append(", timestamp=");
        sb.append(str);
        sb.append(", title='");
        lt.L(sb, str2, "', msg='", str3, "', actions='");
        return lt.B(sb, str4, "', extraInfo='", str5, "'}");
    }
}
