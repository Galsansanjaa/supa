package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class qi3 extends yh3 {
    public final ArrayList h;

    public qi3(ArrayList arrayList) {
        this.h = arrayList;
    }

    @Override // defpackage.yh3
    public final String d() {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(new JSONObject(((za3) obj).d()));
        }
        jSONObject.put("userEvents", new JSONArray((Collection) arrayList));
        c(jSONObject);
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qi3) && this.h.equals(((qi3) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "TrackingUserEventsLog(userEvents=" + this.h + ')';
    }
}
