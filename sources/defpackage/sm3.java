package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sm3 implements Parcelable.Creator {
    public static final sm3 b = new sm3(0);
    public final /* synthetic */ int a;

    public /* synthetic */ sm3(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v36, types: [we0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v37, types: [hf0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v38, types: [gg0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v39, types: [hg0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v42, types: [nl0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [r7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [ux] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        ux uxVar = 0;
        Bundle bundle = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        l80 l80Var = null;
        ArrayList arrayList = null;
        Bundle bundle4 = null;
        Bundle bundle5 = null;
        String str = null;
        Bundle bundle6 = null;
        Bundle bundle7 = null;
        String str2 = null;
        PendingIntent pendingIntent = null;
        Bundle bundle8 = null;
        switch (this.a) {
            case 0:
                int dataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(dataPosition - 4);
                    return p7.n;
                }
                int N = np3.N(parcel);
                while (parcel.dataPosition() < N) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        uxVar = (ux) np3.t(parcel, readInt, ux.CREATOR);
                    } else if (c != 2) {
                        np3.K(parcel, readInt);
                    } else {
                        z = np3.E(parcel, readInt);
                    }
                }
                np3.y(parcel, N);
                return new p7(uxVar, z);
            case 1:
                parcel.getClass();
                ?? obj = new Object();
                obj.a = -1L;
                obj.n = -1L;
                q7 q7Var = q7.b;
                obj.q = q7Var;
                obj.I = -1;
                obj.a = parcel.readLong();
                obj.b = parcel.readString();
                obj.m = parcel.readString();
                obj.n = parcel.readLong();
                obj.o = parcel.readString();
                obj.p = parcel.readString();
                int readInt2 = parcel.readInt();
                if (readInt2 == 0) {
                    obj.q = q7.a;
                } else if (readInt2 != 1) {
                    obj.q = q7.m;
                } else {
                    obj.q = q7Var;
                }
                obj.r = parcel.readInt();
                obj.s = parcel.readInt();
                obj.t = parcel.readInt();
                obj.u = parcel.readInt();
                obj.v = parcel.readString();
                obj.w = parcel.readInt();
                obj.x = parcel.readLong();
                obj.y = parcel.readLong();
                obj.z = parcel.readInt();
                obj.A = parcel.readString();
                obj.B = parcel.readLong();
                obj.C = parcel.readString();
                obj.D = parcel.readInt();
                obj.G = parcel.readLong();
                obj.H = parcel.readInt();
                obj.L = parcel.readInt() == 1;
                return obj;
            case 2:
                parcel.getClass();
                return new cc(parcel);
            case 3:
                parcel.getClass();
                nt ntVar = new nt(z ? 1 : 0, (String) uxVar, 7);
                ntVar.a = parcel.readInt();
                ntVar.b = parcel.readString();
                ntVar.m = parcel.readString();
                ntVar.n = parcel.readInt() == 1;
                ntVar.o = parcel.readInt() == 1;
                ntVar.p = parcel.readInt();
                ntVar.q = parcel.readInt();
                ntVar.r = parcel.createTypedArrayList(nt.CREATOR);
                return ntVar;
            case 4:
                int N2 = np3.N(parcel);
                while (parcel.dataPosition() < N2) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        np3.K(parcel, readInt3);
                    } else {
                        z4 = np3.E(parcel, readInt3);
                    }
                }
                np3.y(parcel, N2);
                return new ov(z4);
            case 5:
                int N3 = np3.N(parcel);
                while (parcel.dataPosition() < N3) {
                    np3.K(parcel, parcel.readInt());
                }
                np3.y(parcel, N3);
                return new Object();
            case 6:
                int N4 = np3.N(parcel);
                while (parcel.dataPosition() < N4) {
                    np3.K(parcel, parcel.readInt());
                }
                np3.y(parcel, N4);
                return new Object();
            case 7:
                int N5 = np3.N(parcel);
                while (parcel.dataPosition() < N5) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        np3.K(parcel, readInt4);
                    } else {
                        z3 = np3.E(parcel, readInt4);
                    }
                }
                np3.y(parcel, N5);
                return new rv(z3);
            case 8:
                int N6 = np3.N(parcel);
                while (parcel.dataPosition() < N6) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        np3.K(parcel, readInt5);
                    } else {
                        z2 = np3.E(parcel, readInt5);
                    }
                }
                np3.y(parcel, N6);
                return new sv(z2);
            case 9:
                int N7 = np3.N(parcel);
                while (parcel.dataPosition() < N7) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        np3.K(parcel, readInt6);
                    } else {
                        bundle8 = np3.p(parcel, readInt6);
                    }
                }
                np3.y(parcel, N7);
                return new tv(bundle8);
            case 10:
                int N8 = np3.N(parcel);
                s70 s70Var = null;
                while (parcel.dataPosition() < N8) {
                    int readInt7 = parcel.readInt();
                    char c2 = (char) readInt7;
                    if (c2 == 1) {
                        pendingIntent = (PendingIntent) np3.t(parcel, readInt7, PendingIntent.CREATOR);
                    } else if (c2 != 2) {
                        np3.K(parcel, readInt7);
                    } else {
                        s70Var = (s70) np3.t(parcel, readInt7, s70.CREATOR);
                    }
                }
                np3.y(parcel, N8);
                return new q70(pendingIntent, s70Var);
            case 11:
                int N9 = np3.N(parcel);
                String str3 = null;
                Bundle bundle9 = null;
                Bundle bundle10 = null;
                String str4 = null;
                String str5 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < N9) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            str3 = np3.u(parcel, readInt8);
                            break;
                        case 2:
                            bundle9 = np3.p(parcel, readInt8);
                            break;
                        case 3:
                            bundle10 = np3.p(parcel, readInt8);
                            break;
                        case 4:
                            str4 = np3.u(parcel, readInt8);
                            break;
                        case 5:
                            str5 = np3.u(parcel, readInt8);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) np3.t(parcel, readInt8, ResultReceiver.CREATOR);
                            break;
                        default:
                            np3.K(parcel, readInt8);
                            break;
                    }
                }
                np3.y(parcel, N9);
                return new r70(str3, bundle9, bundle10, str4, str5, resultReceiver);
            case 12:
                int N10 = np3.N(parcel);
                Bundle bundle11 = null;
                while (parcel.dataPosition() < N10) {
                    int readInt9 = parcel.readInt();
                    char c3 = (char) readInt9;
                    if (c3 == 1) {
                        str2 = np3.u(parcel, readInt9);
                    } else if (c3 != 2) {
                        np3.K(parcel, readInt9);
                    } else {
                        bundle11 = np3.p(parcel, readInt9);
                    }
                }
                np3.y(parcel, N10);
                return new s70(str2, bundle11);
            case 13:
                int N11 = np3.N(parcel);
                while (parcel.dataPosition() < N11) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        np3.K(parcel, readInt10);
                    } else {
                        bundle7 = np3.p(parcel, readInt10);
                    }
                }
                np3.y(parcel, N11);
                return new i80(bundle7);
            case 14:
                int N12 = np3.N(parcel);
                while (parcel.dataPosition() < N12) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        np3.K(parcel, readInt11);
                    } else {
                        bundle6 = np3.p(parcel, readInt11);
                    }
                }
                np3.y(parcel, N12);
                return new j80(bundle6);
            case 15:
                int N13 = np3.N(parcel);
                Bundle bundle12 = null;
                while (parcel.dataPosition() < N13) {
                    int readInt12 = parcel.readInt();
                    char c4 = (char) readInt12;
                    if (c4 == 1) {
                        str = np3.u(parcel, readInt12);
                    } else if (c4 != 2) {
                        np3.K(parcel, readInt12);
                    } else {
                        bundle12 = np3.p(parcel, readInt12);
                    }
                }
                np3.y(parcel, N13);
                return new l80(str, bundle12);
            case 16:
                int N14 = np3.N(parcel);
                String str6 = "";
                String str7 = str6;
                String str8 = str7;
                Bundle bundle13 = null;
                Bundle bundle14 = null;
                String str9 = null;
                while (parcel.dataPosition() < N14) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            str6 = np3.u(parcel, readInt13);
                            break;
                        case 2:
                            bundle13 = np3.p(parcel, readInt13);
                            break;
                        case 3:
                            bundle14 = np3.p(parcel, readInt13);
                            break;
                        case 4:
                            str9 = np3.u(parcel, readInt13);
                            break;
                        case 5:
                            str7 = np3.u(parcel, readInt13);
                            break;
                        case 6:
                            str8 = np3.u(parcel, readInt13);
                            break;
                        default:
                            np3.K(parcel, readInt13);
                            break;
                    }
                }
                np3.y(parcel, N14);
                return new n80(str6, bundle13, bundle14, str9, str7, str8);
            case 17:
                int N15 = np3.N(parcel);
                while (parcel.dataPosition() < N15) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        np3.K(parcel, readInt14);
                    } else {
                        bundle5 = np3.p(parcel, readInt14);
                    }
                }
                np3.y(parcel, N15);
                return new o90(bundle5);
            case 18:
                parcel.getClass();
                ?? obj2 = new Object();
                obj2.a = parcel.readString();
                obj2.b = parcel.readString();
                obj2.m = parcel.readString();
                obj2.n = parcel.readString();
                obj2.o = parcel.readString();
                obj2.p = parcel.readInt();
                obj2.q = parcel.readInt();
                obj2.r = parcel.readInt();
                obj2.s = parcel.readString();
                return obj2;
            case 19:
                parcel.getClass();
                ?? obj3 = new Object();
                obj3.a = -1;
                obj3.n = 1;
                obj3.o = -1L;
                obj3.r = -1L;
                obj3.A = -1L;
                obj3.D = -1L;
                obj3.E = -1L;
                obj3.G = new ArrayList();
                obj3.a = parcel.readInt();
                obj3.b = parcel.readString();
                obj3.m = parcel.readInt();
                obj3.n = parcel.readInt();
                obj3.o = parcel.readLong();
                obj3.p = parcel.readString();
                obj3.q = parcel.readInt();
                obj3.r = parcel.readLong();
                obj3.s = parcel.readInt();
                obj3.t = parcel.readString();
                obj3.u = parcel.readString();
                obj3.v = parcel.readInt();
                obj3.w = parcel.readString();
                obj3.x = parcel.readString();
                obj3.y = parcel.readLong();
                obj3.z = parcel.createStringArrayList();
                parcel.readTypedList(obj3.G, gg0.CREATOR);
                obj3.A = parcel.readLong();
                obj3.B = parcel.readInt();
                obj3.C = parcel.readInt();
                return obj3;
            case 20:
                parcel.getClass();
                ?? obj4 = new Object();
                obj4.a = -1L;
                obj4.b = -1L;
                obj4.m = -1L;
                obj4.o = -1L;
                obj4.a = parcel.readLong();
                obj4.b = parcel.readLong();
                obj4.m = parcel.readLong();
                obj4.n = parcel.readString();
                obj4.o = parcel.readLong();
                obj4.p = parcel.readLong();
                obj4.q = parcel.readString();
                obj4.r = parcel.readString();
                obj4.s = parcel.readInt();
                obj4.t = parcel.readLong();
                return obj4;
            case 21:
                parcel.getClass();
                ?? obj5 = new Object();
                obj5.a = -1;
                obj5.n = 1;
                obj5.a = parcel.readInt();
                obj5.b = parcel.readLong();
                obj5.m = parcel.readString();
                obj5.n = parcel.readInt();
                return obj5;
            case 22:
                int N16 = np3.N(parcel);
                while (parcel.dataPosition() < N16) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        np3.K(parcel, readInt15);
                    } else {
                        bundle4 = np3.p(parcel, readInt15);
                    }
                }
                np3.y(parcel, N16);
                return new jk0(bundle4);
            case 23:
                parcel.getClass();
                ?? obj6 = new Object();
                obj6.a = parcel.readLong();
                obj6.b = parcel.readString();
                obj6.m = parcel.readLong();
                obj6.n = parcel.readString();
                obj6.o = parcel.readInt();
                obj6.p = parcel.readString();
                obj6.q = parcel.readInt();
                obj6.r = parcel.readString();
                obj6.s = parcel.readString();
                obj6.t = parcel.readString();
                obj6.u = parcel.readLong();
                obj6.v = parcel.readString();
                obj6.w = parcel.readInt();
                obj6.x = parcel.readString();
                obj6.y = parcel.readLong();
                obj6.z = parcel.readString();
                obj6.A = parcel.readString();
                obj6.B = parcel.readLong();
                obj6.C = parcel.readLong();
                obj6.D = parcel.readString();
                obj6.E = parcel.readString();
                obj6.F = parcel.readString();
                obj6.G = parcel.readString();
                obj6.H = parcel.readInt();
                return obj6;
            case 24:
                int N17 = np3.N(parcel);
                Bundle bundle15 = null;
                String str10 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < N17) {
                    int readInt16 = parcel.readInt();
                    char c5 = (char) readInt16;
                    if (c5 == 1) {
                        arrayList = np3.x(parcel, readInt16, n80.CREATOR);
                    } else if (c5 == 2) {
                        bundle15 = np3.p(parcel, readInt16);
                    } else if (c5 == 3) {
                        str10 = np3.u(parcel, readInt16);
                    } else if (c5 != 4) {
                        np3.K(parcel, readInt16);
                    } else {
                        resultReceiver2 = (ResultReceiver) np3.t(parcel, readInt16, ResultReceiver.CREATOR);
                    }
                }
                np3.y(parcel, N17);
                return new GetCredentialRequest(arrayList, bundle15, str10, resultReceiver2);
            case 25:
                int N18 = np3.N(parcel);
                while (parcel.dataPosition() < N18) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        np3.K(parcel, readInt17);
                    } else {
                        l80Var = (l80) np3.t(parcel, readInt17, l80.CREATOR);
                    }
                }
                np3.y(parcel, N18);
                return new bu0(l80Var);
            case 26:
                int N19 = np3.N(parcel);
                while (parcel.dataPosition() < N19) {
                    int readInt18 = parcel.readInt();
                    if (((char) readInt18) != 1) {
                        np3.K(parcel, readInt18);
                    } else {
                        bundle3 = np3.p(parcel, readInt18);
                    }
                }
                np3.y(parcel, N19);
                return new fu0(bundle3);
            case 27:
                int N20 = np3.N(parcel);
                while (parcel.dataPosition() < N20) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        np3.K(parcel, readInt19);
                    } else {
                        bundle2 = np3.p(parcel, readInt19);
                    }
                }
                np3.y(parcel, N20);
                return new gu0(bundle2);
            case 28:
                int N21 = np3.N(parcel);
                while (parcel.dataPosition() < N21) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        np3.K(parcel, readInt20);
                    } else {
                        bundle = np3.p(parcel, readInt20);
                    }
                }
                np3.y(parcel, N21);
                return new m21(bundle);
            default:
                return new MediaBrowserCompat$MediaItem(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new p7[i];
            case 1:
                return new r7[i];
            case 2:
                return new cc[i];
            case 3:
                return new nt[i];
            case 4:
                return new ov[i];
            case 5:
                return new pv[i];
            case 6:
                return new qv[i];
            case 7:
                return new rv[i];
            case 8:
                return new sv[i];
            case 9:
                return new tv[i];
            case 10:
                return new q70[i];
            case 11:
                return new r70[i];
            case 12:
                return new s70[i];
            case 13:
                return new i80[i];
            case 14:
                return new j80[i];
            case 15:
                return new l80[i];
            case 16:
                return new n80[i];
            case 17:
                return new o90[i];
            case 18:
                return new we0[i];
            case 19:
                return new hf0[i];
            case 20:
                return new gg0[i];
            case 21:
                return new hg0[i];
            case 22:
                return new jk0[i];
            case 23:
                return new nl0[i];
            case 24:
                return new GetCredentialRequest[i];
            case 25:
                return new bu0[i];
            case 26:
                return new fu0[i];
            case 27:
                return new gu0[i];
            case 28:
                return new m21[i];
            default:
                return new MediaBrowserCompat$MediaItem[i];
        }
    }
}
