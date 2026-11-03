package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ec4 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        String str = null;
        switch (this.a) {
            case 0:
                int N = np3.N(parcel);
                boolean z = false;
                int i = 0;
                boolean z2 = false;
                boolean z3 = false;
                int i2 = 0;
                int i3 = 0;
                boolean z4 = true;
                boolean z5 = true;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                Boolean bool = null;
                ArrayList arrayList2 = null;
                String str8 = null;
                String str9 = null;
                long j = 0;
                long j2 = 0;
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                long j6 = 0;
                long j7 = 0;
                long j8 = 0;
                String str10 = "";
                String str11 = str10;
                String str12 = str11;
                String str13 = str12;
                int i4 = 100;
                long j9 = -2147483648L;
                while (parcel.dataPosition() < N) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str2 = np3.u(parcel, readInt);
                            break;
                        case 3:
                            str3 = np3.u(parcel, readInt);
                            break;
                        case 4:
                            str4 = np3.u(parcel, readInt);
                            break;
                        case 5:
                            str5 = np3.u(parcel, readInt);
                            break;
                        case 6:
                            j = np3.I(parcel, readInt);
                            break;
                        case 7:
                            j2 = np3.I(parcel, readInt);
                            break;
                        case '\b':
                            str6 = np3.u(parcel, readInt);
                            break;
                        case '\t':
                            z4 = np3.E(parcel, readInt);
                            break;
                        case '\n':
                            z = np3.E(parcel, readInt);
                            break;
                        case 11:
                            j9 = np3.I(parcel, readInt);
                            break;
                        case '\f':
                            str7 = np3.u(parcel, readInt);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            np3.K(parcel, readInt);
                            break;
                        case 14:
                            j3 = np3.I(parcel, readInt);
                            break;
                        case 15:
                            i = np3.G(parcel, readInt);
                            break;
                        case 16:
                            z5 = np3.E(parcel, readInt);
                            break;
                        case 18:
                            z2 = np3.E(parcel, readInt);
                            break;
                        case 21:
                            int J = np3.J(parcel, readInt);
                            if (J != 0) {
                                np3.V(parcel, J, 4);
                                bool = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            } else {
                                bool = null;
                                break;
                            }
                        case 22:
                            j4 = np3.I(parcel, readInt);
                            break;
                        case 23:
                            arrayList2 = np3.v(parcel, readInt);
                            break;
                        case 25:
                            str10 = np3.u(parcel, readInt);
                            break;
                        case 26:
                            str11 = np3.u(parcel, readInt);
                            break;
                        case 27:
                            str8 = np3.u(parcel, readInt);
                            break;
                        case 28:
                            z3 = np3.E(parcel, readInt);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                            j5 = np3.I(parcel, readInt);
                            break;
                        case 30:
                            i4 = np3.G(parcel, readInt);
                            break;
                        case 31:
                            str12 = np3.u(parcel, readInt);
                            break;
                        case ' ':
                            i2 = np3.G(parcel, readInt);
                            break;
                        case '\"':
                            j6 = np3.I(parcel, readInt);
                            break;
                        case '#':
                            str9 = np3.u(parcel, readInt);
                            break;
                        case '$':
                            str13 = np3.u(parcel, readInt);
                            break;
                        case '%':
                            j7 = np3.I(parcel, readInt);
                            break;
                        case '&':
                            i3 = np3.G(parcel, readInt);
                            break;
                        case '\'':
                            j8 = np3.I(parcel, readInt);
                            break;
                    }
                }
                np3.y(parcel, N);
                return new ob4(str2, str3, str4, str5, j, j2, str6, z4, z, j9, str7, j3, i, z5, z2, bool, j4, arrayList2, str10, str11, str8, z3, j5, i4, str12, i2, j6, str9, str13, j7, i3, j8);
            case 1:
                int N2 = np3.N(parcel);
                while (parcel.dataPosition() < N2) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        np3.K(parcel, readInt2);
                    } else {
                        arrayList = np3.x(parcel, readInt2, wa4.CREATOR);
                    }
                }
                np3.y(parcel, N2);
                return new bc4(arrayList);
            case 2:
                int N3 = np3.N(parcel);
                while (parcel.dataPosition() < N3) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        np3.K(parcel, readInt3);
                    } else {
                        np3.E(parcel, readInt3);
                    }
                }
                np3.y(parcel, N3);
                return new Object();
            case 3:
                try {
                    return ij0.a(parcel.readInt());
                } catch (hj0 e) {
                    throw new IllegalArgumentException(e);
                }
            case 4:
                int N4 = np3.N(parcel);
                while (parcel.dataPosition() < N4) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 2) {
                        np3.K(parcel, readInt4);
                    } else {
                        str = np3.u(parcel, readInt4);
                    }
                }
                np3.y(parcel, N4);
                return new dm0(str);
            default:
                int N5 = np3.N(parcel);
                int i5 = 0;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                while (parcel.dataPosition() < N5) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            str14 = np3.u(parcel, readInt5);
                            break;
                        case 2:
                            str15 = np3.u(parcel, readInt5);
                            break;
                        case 3:
                            str16 = np3.u(parcel, readInt5);
                            break;
                        case 4:
                            str17 = np3.u(parcel, readInt5);
                            break;
                        case 5:
                            str18 = np3.u(parcel, readInt5);
                            break;
                        case 6:
                            i5 = np3.G(parcel, readInt5);
                            break;
                        case 7:
                            str19 = np3.u(parcel, readInt5);
                            break;
                        default:
                            np3.K(parcel, readInt5);
                            break;
                    }
                }
                np3.y(parcel, N5);
                return new m52(str14, str15, str16, str17, str18, i5, str19);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ob4[i];
            case 1:
                return new bc4[i];
            case 2:
                return new rc4[i];
            case 3:
                return new ij0[i];
            case 4:
                return new dm0[i];
            default:
                return new m52[i];
        }
    }
}
