package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class wv1 implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r0v0, types: [xv1, java.lang.Object] */
    public static xv1 a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ?? obj = new Object();
        if (!jSONObject.isNull("permission")) {
            obj.b = jSONObject.optString("permission");
        }
        if (!jSONObject.isNull("description")) {
            obj.m = jSONObject.optString("description");
        }
        if (!jSONObject.isNull(HintConstants.AUTOFILL_HINT_NAME)) {
            obj.a = jSONObject.optString(HintConstants.AUTOFILL_HINT_NAME);
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [xv1, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        ?? obj = new Object();
        obj.a = parcel.readString();
        obj.b = parcel.readString();
        obj.m = parcel.readString();
        return obj;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new xv1[i];
    }
}
