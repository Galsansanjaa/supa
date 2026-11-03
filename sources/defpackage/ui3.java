package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ui3 extends yh3 {
    public final ArrayList h;
    public final String i;
    public final ArrayList j;

    public ui3(ArrayList arrayList, ArrayList arrayList2, String str) {
        this.h = arrayList;
        this.i = str;
        this.j = arrayList2;
    }

    @Override // defpackage.yh3
    public final String d() {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(new JSONObject(((za3) obj).d()));
        }
        jSONObject.put("userEvents", new JSONArray((Collection) arrayList));
        jSONObject.putOpt("acceptanceState", this.i);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.j;
        int size2 = arrayList4.size();
        while (i < size2) {
            Object obj2 = arrayList4.get(i);
            i++;
            dv1 dv1Var = (dv1) obj2;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(String.valueOf(((Number) dv1Var.a).intValue()), dv1Var.b);
            arrayList3.add(jSONObject2);
        }
        jSONObject.putOpt("gbcData", new JSONArray((Collection) arrayList3));
        c(jSONObject);
        String jSONObject3 = jSONObject.toString();
        jSONObject3.getClass();
        return jSONObject3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui3)) {
            return false;
        }
        ui3 ui3Var = (ui3) obj;
        return this.h.equals(ui3Var.h) && this.i.equals(ui3Var.i) && this.j.equals(ui3Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + k93.j(this.h.hashCode() * 31, 31, this.i);
    }

    public final String toString() {
        return "TrackingUserGBCDoneLog(userEvents=" + this.h + ", acceptanceState=" + ((Object) this.i) + ", gbcData=" + this.j + ')';
    }
}
