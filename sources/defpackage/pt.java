package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class pt implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r1v1, types: [qt, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        ?? obj = new Object();
        obj.a = parcel.readString();
        obj.b = parcel.readInt();
        obj.m = parcel.readInt();
        return obj;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new qt[i];
    }
}
