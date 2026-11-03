package defpackage;

import android.database.Cursor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class b62 {
    public String c;
    public int a = -1;
    public long b = -1;
    public int d = -1;

    public final void a(Cursor cursor) {
        this.a = cursor.getInt(0);
        this.b = cursor.getLong(1);
        this.c = cursor.getString(2);
        this.d = cursor.getInt(3);
    }

    public final String toString() {
        return "{id=" + this.a + ", appId=" + this.b + ", deviceName=" + this.c + ", downloadId=" + this.d + "}";
    }
}
