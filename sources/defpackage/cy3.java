package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class cy3 extends c1 {
    public static final Parcelable.Creator<cy3> CREATOR = new ux3(2);
    public final int a;
    public final String b;
    public final Intent m;

    public cy3(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.m = intent;
    }

    public static cy3 c(Activity activity) {
        return new cy3(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy3)) {
            return false;
        }
        cy3 cy3Var = (cy3) obj;
        return this.a == cy3Var.a && Objects.equals(this.b, cy3Var.b) && Objects.equals(this.m, cy3Var.m);
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = xu3.U(parcel, 20293);
        xu3.S(parcel, 1, 4);
        parcel.writeInt(this.a);
        xu3.K(parcel, 2, this.b);
        xu3.J(parcel, 3, this.m, i);
        xu3.Y(parcel, U);
    }
}
