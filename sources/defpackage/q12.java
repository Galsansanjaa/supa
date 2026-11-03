package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class q12 extends c1 {
    public static final Parcelable.Creator<q12> CREATOR = new jr3(10);
    public final t12 a;
    public final rr b;

    public q12(String str, int i) {
        dn3.o(str);
        try {
            this.a = t12.a(str);
            try {
                this.b = rr.a(i);
            } catch (qr e) {
                throw new IllegalArgumentException(e);
            }
        } catch (s12 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q12)) {
            return false;
        }
        q12 q12Var = (q12) obj;
        return this.a.equals(q12Var.a) && this.b.equals(q12Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return wa2.t("PublicKeyCredentialParameters{\n type=", String.valueOf(this.a), ", \n algorithm=", String.valueOf(this.b), "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = xu3.U(parcel, 20293);
        this.a.getClass();
        xu3.K(parcel, 2, "public-key");
        xu3.I(parcel, 3, Integer.valueOf(this.b.a.a()));
        xu3.Y(parcel, U);
    }
}
