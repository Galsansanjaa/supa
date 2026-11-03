package defpackage;

import androidx.autofill.HintConstants;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class jn0 {
    public File a;
    public String b;
    public String c;
    public String d;
    public long e;
    public String f;

    public final void a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        try {
            if (!jSONObject.isNull(HintConstants.AUTOFILL_HINT_NAME)) {
                this.b = jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME);
            }
            if (!jSONObject.isNull("sha256")) {
                this.c = jSONObject.getString("sha256");
            }
            if (!jSONObject.isNull("icon")) {
                this.d = jSONObject.getString("icon");
            }
            if (!jSONObject.isNull("size")) {
                this.e = jSONObject.getLong("size");
            }
            if (jSONObject.isNull("senderDeviceName")) {
                return;
            }
            this.f = jSONObject.getString("senderDeviceName");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
