package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class uz extends c1 {
    public final int a;
    public final int b;
    public final PendingIntent m;
    public final String n;
    public final Integer o;
    public static final uz p = new uz(null, null, 0);
    public static final Parcelable.Creator<uz> CREATOR = new kk3(24);

    public uz(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.a = i;
        this.b = i2;
        this.m = pendingIntent;
        this.n = str;
        this.o = num;
    }

    public uz(String str, PendingIntent pendingIntent, int i) {
        this(1, i, pendingIntent, str, null);
    }

    public static String c(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uz)) {
            return false;
        }
        uz uzVar = (uz) obj;
        return this.b == uzVar.b && od4.k(this.m, uzVar.m) && od4.k(this.n, uzVar.n) && od4.k(this.o, uzVar.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.m, this.n, this.o});
    }

    public final String toString() {
        dq1 dq1Var = new dq1(this);
        dq1Var.b(c(this.b), "statusCode");
        dq1Var.b(this.m, "resolution");
        dq1Var.b(this.n, "message");
        dq1Var.b(this.o, "clientMethodKey");
        return dq1Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = xu3.U(parcel, 20293);
        xu3.S(parcel, 1, 4);
        parcel.writeInt(this.a);
        xu3.S(parcel, 2, 4);
        parcel.writeInt(this.b);
        xu3.J(parcel, 3, this.m, i);
        xu3.K(parcel, 4, this.n);
        xu3.I(parcel, 5, this.o);
        xu3.Y(parcel, U);
    }
}
