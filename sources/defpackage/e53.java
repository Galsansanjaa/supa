package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class e53 implements Parcelable {
    public static Parcelable.Creator<e53> CREATOR = new sj1(26);
    public long a;
    public String b;
    public int m;
    public int n;
    public int o;
    public int p;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.m);
        parcel.writeInt(this.p);
    }
}
