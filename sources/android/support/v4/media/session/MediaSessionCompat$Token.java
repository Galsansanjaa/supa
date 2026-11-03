package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.h01;
import defpackage.sj1;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new sj1(4);
    public final Object a;
    public h01 b;

    public MediaSessionCompat$Token(Object obj, h01 h01Var) {
        this.a = obj;
        this.b = h01Var;
    }

    public static MediaSessionCompat$Token a(Parcelable parcelable, h01 h01Var) {
        if (parcelable != null) {
            if (parcelable instanceof MediaSession.Token) {
                return new MediaSessionCompat$Token(parcelable, h01Var);
            }
            v5.m("token is not a valid MediaSession.Token object");
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Object obj2 = ((MediaSessionCompat$Token) obj).a;
        Object obj3 = this.a;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.a, i);
    }
}
