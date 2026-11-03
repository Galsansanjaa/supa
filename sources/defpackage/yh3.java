package defpackage;

import androidx.core.app.NotificationCompat;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class yh3 {
    public long a;
    public String c;
    public String g;
    public int b = 4;
    public String d = "";
    public String e = "";
    public String f = "";

    public long a() {
        return this.a;
    }

    public void b(long j) {
        this.a = j;
    }

    public final void c(JSONObject jSONObject) {
        String str;
        jSONObject.putOpt("clientTimestamp", Long.valueOf(a()));
        if (this.b != 5) {
            jSONObject.putOpt("sessionId", this.c);
        }
        jSONObject.putOpt("domain", this.d);
        jSONObject.putOpt("cmpVersion", "2.4.3");
        jSONObject.putOpt("cmpPlatform", "android");
        jSONObject.putOpt("deviceType", this.f);
        jSONObject.putOpt("country", this.e);
        jSONObject.putOpt("siteUuid", this.g);
        switch (this.b) {
            case 1:
                str = "init";
                break;
            case 2:
                str = NotificationCompat.CATEGORY_NAVIGATION;
                break;
            case 3:
                str = "done";
                break;
            case 4:
                str = "none";
                break;
            case 5:
                str = "visit";
                break;
            case 6:
                str = "click";
                break;
            default:
                throw null;
        }
        jSONObject.putOpt("operationType", str);
    }

    public abstract String d();
}
