package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ew1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        int readInt = parcel.readInt();
        wv1 wv1Var = xv1.CREATOR;
        return new fw1(readInt, parcel.createTypedArrayList(wv1Var), parcel.createTypedArrayList(wv1Var), parcel.createTypedArrayList(wv1Var));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new fw1[i];
    }
}
