package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.sj1;
import defpackage.vg1;
import defpackage.vj1;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new sj1(9);
    public final int a;
    public final long b;
    public final long m;
    public final float n;
    public final long o;
    public final int p;
    public final CharSequence q;
    public final long r;
    public final ArrayList s;
    public final long t;
    public final Bundle u;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();
        public final String a;
        public final CharSequence b;
        public final int m;
        public final Bundle n;
        public Object o;

        public CustomAction(Parcel parcel) {
            this.a = parcel.readString();
            this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.m = parcel.readInt();
            this.n = parcel.readBundle(vj1.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.a = str;
            this.b = charSequence;
            this.m = i;
            this.n = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.b) + ", mIcon=" + this.m + ", mExtras=" + this.n;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.b, parcel, i);
            parcel.writeInt(this.m);
            parcel.writeBundle(this.n);
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        this.a = i;
        this.b = j;
        this.m = j2;
        this.n = f;
        this.o = j3;
        this.p = 0;
        this.q = charSequence;
        this.r = j4;
        this.s = new ArrayList(arrayList);
        this.t = j5;
        this.u = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.n = parcel.readFloat();
        this.r = parcel.readLong();
        this.m = parcel.readLong();
        this.o = parcel.readLong();
        this.q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.s = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.t = parcel.readLong();
        this.u = parcel.readBundle(vj1.class.getClassLoader());
        this.p = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", buffered position=");
        sb.append(this.m);
        sb.append(", speed=");
        sb.append(this.n);
        sb.append(", updated=");
        sb.append(this.r);
        sb.append(", actions=");
        sb.append(this.o);
        sb.append(", error code=");
        sb.append(this.p);
        sb.append(", error message=");
        sb.append(this.q);
        sb.append(", custom actions=");
        sb.append(this.s);
        sb.append(", active item id=");
        return vg1.C(this.t, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.n);
        parcel.writeLong(this.r);
        parcel.writeLong(this.m);
        parcel.writeLong(this.o);
        TextUtils.writeToParcel(this.q, parcel, i);
        parcel.writeTypedList(this.s);
        parcel.writeLong(this.t);
        parcel.writeBundle(this.u);
        parcel.writeInt(this.p);
    }
}
