package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class n44 extends jk3 implements IInterface {
    public final int k;

    public n44(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 2);
        dn3.j(bArr.length == 25);
        this.k = Arrays.hashCode(bArr);
    }

    public static byte[] O(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            qq.e(e);
            return null;
        }
    }

    @Override // defpackage.jk3
    public final boolean L(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            l01 N = N();
            parcel2.writeNoException();
            fw3.b(parcel2, N);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.k);
        return true;
    }

    public abstract byte[] M();

    public final l01 N() {
        return new fs1(M());
    }

    public final boolean equals(Object obj) {
        l01 N;
        if (obj instanceof n44) {
            try {
                n44 n44Var = (n44) obj;
                if (n44Var.k == this.k && (N = n44Var.N()) != null) {
                    return Arrays.equals(M(), (byte[]) fs1.N(N));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.k;
    }
}
