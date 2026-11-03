package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class t12 implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    t12 EF5;
    public static final /* synthetic */ t12[] a = {new Enum("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<t12> CREATOR = new jr3(12);

    public static t12 a(String str) {
        for (t12 t12Var : values()) {
            t12Var.getClass();
            if (str.equals("public-key")) {
                return t12Var;
            }
        }
        throw new Exception(k93.m("PublicKeyCredentialType ", str, " not supported"));
    }

    public static t12 valueOf(String str) {
        return (t12) Enum.valueOf(t12.class, str);
    }

    public static t12[] values() {
        return (t12[]) a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("public-key");
    }
}
