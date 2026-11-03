package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class i72 implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r2v1, types: [j72, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        ?? obj = new Object();
        obj.a = parcel.readString();
        obj.m = parcel.readInt();
        obj.n = parcel.readInt();
        obj.o = parcel.readLong();
        ArrayList arrayList = obj.p;
        if (arrayList == null || arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            obj.p = arrayList2;
            parcel.readList(arrayList2, v21.class.getClassLoader());
        }
        ArrayList arrayList3 = obj.q;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            obj.q = arrayList4;
            parcel.readList(arrayList4, qt.class.getClassLoader());
        }
        obj.b = parcel.readString();
        obj.r = parcel.readString();
        obj.s = parcel.readString();
        obj.t = parcel.readString();
        obj.v = parcel.readInt();
        obj.u = parcel.readString();
        return obj;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new j72[i];
    }
}
