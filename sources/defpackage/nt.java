package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class nt implements Parcelable {
    public int a;
    public String b;
    public String m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public ArrayList r;
    public ArrayList s;
    public static final List t = nb0.D(5, 5, 5, 5, 5, 1, 5, 1, 5, 1, 1, 6, 6, 6);
    public static Parcelable.Creator<nt> CREATOR = new sm3(3);

    public /* synthetic */ nt(int i, String str, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (String) null);
    }

    public nt(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.m = str2;
    }

    public static int a(is2 is2Var) {
        int ordinal = is2Var.d.ordinal();
        if (ordinal == 1) {
            return 0;
        }
        if (ordinal == 6) {
            return 5;
        }
        if (ordinal == 8) {
            return 3;
        }
        if (ordinal == 3) {
            return 8;
        }
        if (ordinal == 4) {
            int i = is2Var.a.a;
            if (i == 523) {
                return 4;
            }
            if (i == 524 || i == 525 || i == 607) {
                return 6;
            }
        }
        return 1;
    }

    public final void b(JSONObject jSONObject) {
        if (!jSONObject.isNull("id")) {
            this.a = jSONObject.optInt("id");
        }
        if (!jSONObject.isNull(HintConstants.AUTOFILL_HINT_NAME)) {
            this.b = jSONObject.optString(HintConstants.AUTOFILL_HINT_NAME);
        }
        if (!jSONObject.isNull("description")) {
            this.m = jSONObject.optString("description");
        }
        if (!jSONObject.isNull("parentCategoryID")) {
            this.p = jSONObject.optInt("parentCategoryID");
        }
        if (jSONObject.isNull("isGame")) {
            return;
        }
        this.q = jSONObject.optInt("isGame");
    }

    public final void c(JSONObject jSONObject, int i) {
        if (!jSONObject.isNull(HintConstants.AUTOFILL_HINT_NAME)) {
            this.b = jSONObject.optString(HintConstants.AUTOFILL_HINT_NAME);
        }
        if (!jSONObject.isNull("id")) {
            this.a = jSONObject.optInt("id");
        }
        this.p = i;
    }

    public final void d(JSONObject jSONObject) {
        if (!jSONObject.isNull("id")) {
            this.a = jSONObject.optInt("id");
        }
        if (!jSONObject.isNull(HintConstants.AUTOFILL_HINT_NAME)) {
            this.b = jSONObject.optString(HintConstants.AUTOFILL_HINT_NAME);
        } else if (!jSONObject.isNull("value")) {
            this.b = jSONObject.optString("value");
        }
        if (!jSONObject.isNull("description")) {
            this.m = jSONObject.optString("description");
        }
        this.n = true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    public final void e(Bundle bundle) {
        this.a = bundle.getInt("id");
        this.b = bundle.getString(HintConstants.AUTOFILL_HINT_NAME);
        this.m = bundle.getString("description");
        this.n = bundle.getBoolean("isFloating");
        this.p = bundle.getInt("parentCategoryId");
        this.q = bundle.getInt("isGame");
        this.o = bundle.getBoolean("isLeaf");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(JSONObject jSONObject) {
        if (!jSONObject.isNull("id")) {
            this.a = jSONObject.optInt("id");
        }
        if (!jSONObject.isNull(HintConstants.AUTOFILL_HINT_NAME)) {
            this.b = jSONObject.optString(HintConstants.AUTOFILL_HINT_NAME);
        }
        if (!jSONObject.isNull("description")) {
            this.m = jSONObject.optString("description");
        }
        if (!jSONObject.isNull("parentCategoryID")) {
            this.p = jSONObject.optInt("parentCategoryID");
        }
        Object[] objArr = 0;
        if (!jSONObject.isNull("isFloating")) {
            this.n = jSONObject.optInt("isFloating") == 1;
        }
        if (jSONObject.isNull("relatedCategories")) {
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("relatedCategories");
        if (optJSONArray != null) {
            this.s = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                nt ntVar = new nt((int) (objArr == true ? 1 : 0), (String) null, 7);
                optJSONObject.getClass();
                ntVar.f(optJSONObject);
                ArrayList arrayList = this.s;
                arrayList.getClass();
                arrayList.add(ntVar);
            }
        }
        this.n = jSONObject.optInt("isFloating") == 1;
    }

    public final Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.a);
        bundle.putString(HintConstants.AUTOFILL_HINT_NAME, this.b);
        bundle.putString("description", this.m);
        bundle.putBoolean("isFloating", this.n);
        bundle.putInt("parentCategoryId", this.p);
        bundle.putInt("isGame", this.q);
        bundle.putBoolean("isLeaf", this.o);
        return bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.m);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeTypedList(this.r);
    }
}
