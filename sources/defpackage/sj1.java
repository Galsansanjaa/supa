package defpackage;

import android.app.PendingIntent;
import android.media.MediaDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sj1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ sj1(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [s01, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, b72] */
    /* JADX WARN: Type inference failed for: r8v27, types: [l82, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Object, t82] */
    /* JADX WARN: Type inference failed for: r8v29, types: [xb2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.Object, n23] */
    /* JADX WARN: Type inference failed for: r8v36, types: [s33, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v38, types: [e53, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v39, types: [d73, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, ms1] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        int i2 = 0;
        PendingIntent pendingIntent = null;
        ArrayList arrayList = null;
        Bundle bundle = null;
        String str = null;
        t01 t01Var = null;
        Bundle bundle2 = null;
        PendingIntent pendingIntent2 = null;
        switch (this.a) {
            case 0:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            case 1:
                return new MediaMetadataCompat(parcel);
            case 2:
                return new MediaSessionCompat$QueueItem(parcel);
            case 3:
                ?? obj = new Object();
                obj.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return obj;
            case 4:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 5:
                parcel.getClass();
                ?? obj2 = new Object();
                obj2.b = -1L;
                obj2.n = -1L;
                obj2.s = new ArrayList();
                obj2.a = parcel.readString();
                obj2.m = parcel.readString();
                obj2.n = parcel.readLong();
                obj2.o = parcel.readString();
                obj2.p = parcel.readString();
                obj2.q = parcel.readString();
                obj2.b = parcel.readLong();
                return obj2;
            case 6:
                ?? obj3 = new Object();
                obj3.a = parcel.readInt();
                obj3.m = parcel.readInt();
                obj3.n = parcel.readInt();
                obj3.o = parcel.readInt();
                obj3.b = parcel.readInt();
                return obj3;
            case 7:
                int N = np3.N(parcel);
                while (parcel.dataPosition() < N) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        np3.K(parcel, readInt);
                    } else {
                        pendingIntent = (PendingIntent) np3.t(parcel, readInt, PendingIntent.CREATOR);
                    }
                }
                np3.y(parcel, N);
                return new uv1(pendingIntent);
            case 8:
                int N2 = np3.N(parcel);
                while (parcel.dataPosition() < N2) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        np3.K(parcel, readInt2);
                    } else {
                        pendingIntent2 = (PendingIntent) np3.t(parcel, readInt2, PendingIntent.CREATOR);
                    }
                }
                np3.y(parcel, N2);
                return new vv1(pendingIntent2);
            case 9:
                return new PlaybackStateCompat(parcel);
            case 10:
                parcel.getClass();
                r32 r32Var = new r32();
                r32Var.a = parcel.readString();
                r32Var.b = parcel.readInt();
                r32Var.m = parcel.readInt();
                r32Var.n = parcel.readString();
                r32Var.o = parcel.readInt();
                return r32Var;
            case 11:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 12:
                int N3 = np3.N(parcel);
                while (parcel.dataPosition() < N3) {
                    np3.K(parcel, parcel.readInt());
                }
                np3.y(parcel, N3);
                return new Object();
            case 13:
                int N4 = np3.N(parcel);
                while (parcel.dataPosition() < N4) {
                    np3.K(parcel, parcel.readInt());
                }
                np3.y(parcel, N4);
                return new Object();
            case 14:
                int N5 = np3.N(parcel);
                while (parcel.dataPosition() < N5) {
                    np3.K(parcel, parcel.readInt());
                }
                np3.y(parcel, N5);
                return new Object();
            case 15:
                int N6 = np3.N(parcel);
                while (parcel.dataPosition() < N6) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 2) {
                        np3.K(parcel, readInt3);
                    } else {
                        bundle2 = np3.p(parcel, readInt3);
                    }
                }
                np3.y(parcel, N6);
                return new c62(bundle2);
            case 16:
                parcel.getClass();
                ?? obj4 = new Object();
                obj4.a = parcel.readLong();
                obj4.o = parcel.readLong();
                obj4.b = parcel.readString();
                obj4.m = parcel.readString();
                obj4.n = parcel.readString();
                obj4.p = parcel.readString();
                obj4.q = parcel.readString();
                obj4.r = parcel.readInt();
                obj4.s = parcel.readInt();
                obj4.t = parcel.readInt();
                obj4.u = parcel.readString();
                obj4.v = parcel.readInt();
                return obj4;
            case 17:
                ?? obj5 = new Object();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i3 = k82.k;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(t01.g);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof t01)) {
                        ?? obj6 = new Object();
                        obj6.j = readStrongBinder;
                        t01Var = obj6;
                    } else {
                        t01Var = (t01) queryLocalInterface;
                    }
                }
                obj5.a = t01Var;
                return obj5;
            case 18:
                parcel.getClass();
                ?? obj7 = new Object();
                obj7.a = parcel.readLong();
                obj7.o = parcel.readLong();
                obj7.m = parcel.readString();
                obj7.b = parcel.readString();
                obj7.n = parcel.readString();
                obj7.p = parcel.readString();
                obj7.q = parcel.readInt();
                obj7.r = parcel.readInt();
                obj7.s = parcel.readString();
                obj7.t = parcel.readInt();
                obj7.u = parcel.readInt();
                obj7.v = parcel.readString();
                obj7.w = parcel.readInt();
                obj7.x = parcel.readString();
                obj7.y = parcel.readInt();
                return obj7;
            case 19:
                parcel.getClass();
                ?? obj8 = new Object();
                obj8.a = parcel.readString();
                obj8.b = parcel.readInt();
                obj8.m = parcel.readInt();
                obj8.n = parcel.readInt();
                return obj8;
            case 20:
                int N7 = np3.N(parcel);
                String str2 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < N7) {
                    int readInt4 = parcel.readInt();
                    char c = (char) readInt4;
                    if (c == 1) {
                        str = np3.u(parcel, readInt4);
                    } else if (c == 2) {
                        str2 = np3.u(parcel, readInt4);
                    } else if (c != 3) {
                        np3.K(parcel, readInt4);
                    } else {
                        bundle3 = np3.p(parcel, readInt4);
                    }
                }
                np3.y(parcel, N7);
                return new kj2(str, str2, bundle3);
            case 21:
                int N8 = np3.N(parcel);
                while (parcel.dataPosition() < N8) {
                    np3.K(parcel, parcel.readInt());
                }
                np3.y(parcel, N8);
                return new Object();
            case 22:
                parcel.getClass();
                return new gz2(parcel);
            case 23:
                parcel.getClass();
                ?? obj9 = new Object();
                obj9.o = -1L;
                obj9.p = "type0";
                obj9.s = -1;
                obj9.a = parcel.readString();
                obj9.b = parcel.readString();
                obj9.m = parcel.readString();
                obj9.n = parcel.readString();
                obj9.w = parcel.readString();
                obj9.p = parcel.readString();
                obj9.o = parcel.readLong();
                obj9.q = parcel.readString();
                obj9.x = parcel.readInt() == 1;
                obj9.r = parcel.readInt();
                obj9.v = parcel.readString();
                obj9.s = parcel.readInt();
                obj9.t = parcel.readInt();
                obj9.u = parcel.readInt();
                obj9.y = parcel.readInt() == 1;
                obj9.z = parcel.readInt() == 1;
                return obj9;
            case 24:
                parcel.getClass();
                ?? obj10 = new Object();
                obj10.a = parcel.readString();
                obj10.b = parcel.readInt();
                obj10.m = parcel.readInt();
                obj10.n = parcel.readInt();
                obj10.o = parcel.readInt();
                obj10.p = parcel.readInt();
                obj10.q = parcel.readInt();
                obj10.r = parcel.readInt();
                return obj10;
            case 25:
                parcel.getClass();
                return new u33(parcel);
            case 26:
                parcel.getClass();
                ?? obj11 = new Object();
                obj11.a = parcel.readLong();
                obj11.b = parcel.readString();
                obj11.n = parcel.readInt();
                obj11.o = parcel.readInt();
                obj11.m = parcel.readInt();
                obj11.p = parcel.readInt();
                return obj11;
            case 27:
                parcel.getClass();
                ?? obj12 = new Object();
                obj12.a = parcel.readString();
                obj12.b = parcel.readString();
                return obj12;
            case 28:
                int N9 = np3.N(parcel);
                int i4 = 0;
                while (parcel.dataPosition() < N9) {
                    int readInt5 = parcel.readInt();
                    char c2 = (char) readInt5;
                    if (c2 == 1) {
                        i2 = np3.G(parcel, readInt5);
                    } else if (c2 == 2) {
                        i4 = np3.G(parcel, readInt5);
                    } else if (c2 != 3) {
                        np3.K(parcel, readInt5);
                    } else {
                        bundle = np3.p(parcel, readInt5);
                    }
                }
                np3.y(parcel, N9);
                return new hv0(i2, i4, bundle);
            default:
                int N10 = np3.N(parcel);
                while (parcel.dataPosition() < N10) {
                    int readInt6 = parcel.readInt();
                    char c3 = (char) readInt6;
                    if (c3 == 1) {
                        i = np3.G(parcel, readInt6);
                    } else if (c3 != 2) {
                        np3.K(parcel, readInt6);
                    } else {
                        arrayList = np3.x(parcel, readInt6, jk1.CREATOR);
                    }
                }
                np3.y(parcel, N10);
                return new cp2(i, arrayList);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new MediaDescriptionCompat[i];
            case 1:
                return new MediaMetadataCompat[i];
            case 2:
                return new MediaSessionCompat$QueueItem[i];
            case 3:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 4:
                return new MediaSessionCompat$Token[i];
            case 5:
                return new ms1[i];
            case 6:
                return new ParcelableVolumeInfo[i];
            case 7:
                return new uv1[i];
            case 8:
                return new vv1[i];
            case 9:
                return new PlaybackStateCompat[i];
            case 10:
                return new r32[i];
            case 11:
                return new RatingCompat[i];
            case 12:
                return new k52[i];
            case 13:
                return new l52[i];
            case 14:
                return new n52[i];
            case 15:
                return new c62[i];
            case 16:
                return new b72[i];
            case 17:
                return new l82[i];
            case 18:
                return new t82[i];
            case 19:
                return new xb2[i];
            case 20:
                return new kj2[i];
            case 21:
                return new lj2[i];
            case 22:
                return new gz2[i];
            case 23:
                return new n23[i];
            case 24:
                return new s33[i];
            case 25:
                return new u33[i];
            case 26:
                return new e53[i];
            case 27:
                return new d73[i];
            case 28:
                return new hv0[i];
            default:
                return new cp2[i];
        }
    }
}
