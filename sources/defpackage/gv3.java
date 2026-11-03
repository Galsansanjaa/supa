package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class gv3 extends c1 implements Iterable {
    public static final Parcelable.Creator<gv3> CREATOR = new jr3(25);
    public final Bundle a;

    public gv3(Bundle bundle) {
        this.a = bundle;
    }

    public final Object c(String str) {
        return this.a.get(str);
    }

    public final Double d() {
        return Double.valueOf(this.a.getDouble("value"));
    }

    public final String e() {
        return this.a.getString("currency");
    }

    public final Bundle f() {
        return new Bundle(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new fv3(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = xu3.U(parcel, 20293);
        xu3.D(parcel, 2, f());
        xu3.Y(parcel, U);
    }
}
