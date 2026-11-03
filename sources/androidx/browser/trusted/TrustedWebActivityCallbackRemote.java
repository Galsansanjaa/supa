package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.w01;
import defpackage.x01;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public class TrustedWebActivityCallbackRemote {
    private final x01 mCallbackBinder;

    private TrustedWebActivityCallbackRemote(x01 x01Var) {
        this.mCallbackBinder = x01Var;
    }

    public static TrustedWebActivityCallbackRemote fromBinder(IBinder iBinder) {
        x01 asInterface = iBinder == null ? null : w01.asInterface(iBinder);
        if (asInterface == null) {
            return null;
        }
        return new TrustedWebActivityCallbackRemote(asInterface);
    }

    public void runExtraCallback(String str, Bundle bundle) throws RemoteException {
        this.mCallbackBinder.onExtraCallback(str, bundle);
    }
}
