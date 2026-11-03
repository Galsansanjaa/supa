package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class jx3 extends ek3 implements lx3 {
    public jx3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 3);
    }

    @Override // defpackage.lx3
    public final int c() {
        Parcel G = G(H(), 2);
        int readInt = G.readInt();
        G.recycle();
        return readInt;
    }

    @Override // defpackage.lx3
    public final void g(String str, String str2, Bundle bundle, long j) {
        Parcel H = H();
        H.writeString(str);
        H.writeString(str2);
        mv3.b(H, bundle);
        H.writeLong(j);
        I(H, 1);
    }
}
