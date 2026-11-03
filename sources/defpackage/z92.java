package defpackage;

import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class z92 {
    public static final tv3 a;

    static {
        m81 m81Var = new m81();
        wg wgVar = wg.a;
        m81Var.a(z92.class, wgVar);
        m81Var.a(sj.class, wgVar);
        a = new tv3(m81Var, 14);
    }

    public static sj a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new sj(j, string, string2, string3, string4);
    }
}
