package defpackage;

import androidx.core.app.NotificationCompat;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class za3 extends yh3 {
    public long h;
    public final String i;

    public za3(long j, String str) {
        this.h = j;
        this.i = str;
    }

    @Override // defpackage.yh3
    public final long a() {
        return this.h;
    }

    @Override // defpackage.yh3
    public final void b(long j) {
        this.h = j;
    }

    @Override // defpackage.yh3
    public final String d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.i);
        jSONObject.putOpt("clientTimestamp", Long.valueOf(this.h));
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za3)) {
            return false;
        }
        za3 za3Var = (za3) obj;
        return this.h == za3Var.h && this.i.equals(za3Var.i);
    }

    public final int hashCode() {
        long j = this.h;
        return this.i.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserEvent(clientTimestamp=");
        sb.append(this.h);
        sb.append(", event=");
        return lt.z(sb, this.i, ')');
    }
}
