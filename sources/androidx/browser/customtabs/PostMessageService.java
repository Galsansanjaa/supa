package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.n01;
import defpackage.o01;
import defpackage.sz0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public class PostMessageService extends Service {
    private n01 mBinder = new n01() { // from class: androidx.browser.customtabs.PostMessageService.1
        {
            attachInterface(this, o01.f);
        }

        @Override // defpackage.o01
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // defpackage.o01
        public void onMessageChannelReady(sz0 sz0Var, Bundle bundle) throws RemoteException {
            sz0Var.onMessageChannelReady(bundle);
        }

        @Override // defpackage.o01
        public void onPostMessage(sz0 sz0Var, String str, Bundle bundle) throws RemoteException {
            sz0Var.onPostMessage(str, bundle);
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }
}
