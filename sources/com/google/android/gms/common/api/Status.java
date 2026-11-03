package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.c1;
import defpackage.dq1;
import defpackage.j82;
import defpackage.od4;
import defpackage.ux3;
import defpackage.uz;
import defpackage.wa2;
import defpackage.xu3;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class Status extends c1 implements j82, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent m;
    public final uz n;
    public static final Status o = new Status(0, null, null, null);
    public static final Status p = new Status(14, null, null, null);
    public static final Status q = new Status(8, null, null, null);
    public static final Status r = new Status(15, null, null, null);
    public static final Status s = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new ux3(3);

    public Status(int i, String str, PendingIntent pendingIntent, uz uzVar) {
        this.a = i;
        this.b = str;
        this.m = pendingIntent;
        this.n = uzVar;
    }

    public final boolean c() {
        return this.a <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && od4.k(this.b, status.b) && od4.k(this.m, status.m) && od4.k(this.n, status.n);
    }

    @Override // defpackage.j82
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.m, this.n});
    }

    public final String toString() {
        dq1 dq1Var = new dq1(this);
        String str = this.b;
        if (str == null) {
            int i = this.a;
            switch (i) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = wa2.u(new StringBuilder(String.valueOf(i).length() + 21), "unknown status code: ", i);
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        dq1Var.b(str, "statusCode");
        dq1Var.b(this.m, "resolution");
        return dq1Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = xu3.U(parcel, 20293);
        xu3.S(parcel, 1, 4);
        parcel.writeInt(this.a);
        xu3.K(parcel, 2, this.b);
        xu3.J(parcel, 3, this.m, i);
        xu3.J(parcel, 4, this.n, i);
        xu3.Y(parcel, U);
    }
}
