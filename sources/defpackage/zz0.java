package defpackage;

import android.content.Context;
import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.model.ChoiceError;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class zz0 {
    public JSONObject a;

    public zz0(Context context) {
        context.getClass();
        JSONObject jSONObject = new JSONObject();
        this.a = jSONObject;
        c(0, "autoplay");
        c(0, "mute");
        c(0, "controls");
        c(1, "enablejsapi");
        c(0, "fs");
        String str = "https://" + context.getPackageName();
        try {
            jSONObject.put("origin", str);
            c(0, "rel");
            c(3, "iv_load_policy");
            c(0, "cc_load_policy");
        } catch (JSONException unused) {
            qq.h("Illegal JSON value origin: ".concat(str));
            throw null;
        }
    }

    public Object a(String str) {
        str.getClass();
        try {
            this.a = new JSONObject(str);
            return new lf3(b(), d());
        } catch (JSONException unused) {
            ChoiceCmpCallback callback = ChoiceCmp.INSTANCE.getCallback();
            if (callback != null) {
                callback.onCmpError(ChoiceError.INVALID_JSON_FORMAT);
            }
            return new lf3();
        }
    }

    public ArrayList b() {
        Boolean bool;
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            jh2.b0("json");
            throw null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("disclosures");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String optString = jSONObject2.optString("identifier");
            optString.getClass();
            String optString2 = jSONObject2.optString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            optString2.getClass();
            int optInt = jSONObject2.optInt("maxAgeSeconds");
            String optString3 = jSONObject2.optString("domain");
            optString3.getClass();
            ArrayList a = xu3.a(jSONObject2, "purposes");
            ArrayList a2 = xu3.a(jSONObject2, "specialPurposes");
            ArrayList a3 = xu3.a(jSONObject2, "features");
            ArrayList a4 = xu3.a(jSONObject2, "specialFeatures");
            try {
                bool = Boolean.valueOf(jSONObject2.getBoolean("optOut"));
            } catch (JSONException unused) {
                bool = null;
            }
            arrayList.add(new kg3(optString, optString2, optInt, optString3, a, a2, a3, a4, bool));
            i = i2;
        }
        return arrayList;
    }

    public void c(int i, String str) {
        try {
            this.a.put(str, i);
        } catch (JSONException unused) {
            throw new RuntimeException("Illegal JSON value " + str + ": " + i);
        }
    }

    public List d() {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            jh2.b0("json");
            throw null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("sdks");
        if (optJSONArray == null) {
            return oi0.a;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            String optString = jSONObject2.optString(HintConstants.AUTOFILL_HINT_NAME);
            optString.getClass();
            String optString2 = jSONObject2.optString("use");
            optString2.getClass();
            arrayList.add(new fj3(optString, optString2));
            i = i2;
        }
        return arrayList;
    }
}
