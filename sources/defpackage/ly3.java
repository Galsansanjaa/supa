package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ly3 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ km b;

    public ly3(km kmVar, int i) {
        this.b = kmVar;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        km kmVar = this.b;
        if (iBinder == null) {
            kmVar.u();
            return;
        }
        synchronized (kmVar.h) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                kmVar.i = (queryLocalInterface == null || !(queryLocalInterface instanceof um3)) ? new um3(iBinder) : (um3) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        km kmVar2 = this.b;
        int i = this.a;
        vz3 vz3Var = new vz3(kmVar2, 0, null);
        vu3 vu3Var = kmVar2.f;
        vu3Var.sendMessage(vu3Var.obtainMessage(7, i, -1, vz3Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        km kmVar = this.b;
        synchronized (kmVar.h) {
            kmVar.i = null;
        }
        km kmVar2 = this.b;
        int i = this.a;
        vu3 vu3Var = kmVar2.f;
        vu3Var.sendMessage(vu3Var.obtainMessage(6, i, 1));
    }
}
