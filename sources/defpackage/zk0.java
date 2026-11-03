package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class zk0 extends c1 {
    public static final Parcelable.Creator<zk0> CREATOR = new jr3(19);
    public final String a;
    public final int b;
    public final long m;
    public final boolean n;

    public zk0(String str, int i, long j, boolean z) {
        this.a = str;
        this.b = i;
        this.m = j;
        this.n = z;
    }

    public zk0(String str, long j) {
        this(str, -1, j, false);
    }

    public final long c() {
        long j = this.m;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zk0) {
            zk0 zk0Var = (zk0) obj;
            if (od4.k(this.a, zk0Var.a) && c() == zk0Var.c() && this.n == zk0Var.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(c()), Boolean.valueOf(this.n)});
    }

    public final String toString() {
        dq1 dq1Var = new dq1(this);
        dq1Var.b(this.a, HintConstants.AUTOFILL_HINT_NAME);
        dq1Var.b(Long.valueOf(c()), "version");
        dq1Var.b(Boolean.valueOf(this.n), "is_fully_rolled_out");
        return dq1Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = xu3.U(parcel, 20293);
        xu3.K(parcel, 1, this.a);
        xu3.S(parcel, 2, 4);
        parcel.writeInt(this.b);
        long c = c();
        xu3.S(parcel, 3, 8);
        parcel.writeLong(c);
        xu3.S(parcel, 4, 4);
        parcel.writeInt(this.n ? 1 : 0);
        xu3.Y(parcel, U);
    }
}
