package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class tb3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        String readString4 = parcel.readString();
        if (readString4 == null) {
            readString4 = "";
        }
        String readString5 = parcel.readString();
        if (readString5 == null) {
            readString5 = "";
        }
        String readString6 = parcel.readString();
        if (readString6 == null) {
            readString6 = "";
        }
        String readString7 = parcel.readString();
        if (readString7 == null) {
            readString7 = "";
        }
        String readString8 = parcel.readString();
        if (readString8 == null) {
            readString8 = "";
        }
        String readString9 = parcel.readString();
        return new pc3(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9 == null ? null : Boolean.valueOf(Boolean.parseBoolean(readString9)));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new pc3[i];
    }
}
