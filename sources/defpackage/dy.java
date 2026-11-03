package defpackage;

import android.content.IntentSender;
import androidx.activity.ComponentActivity$activityResultRegistry$1;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.profileinstaller.DeviceProfileWriter;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class dy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ dy(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.b = obj;
        this.m = i;
        this.n = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.n;
        int i2 = this.m;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ComponentActivity$activityResultRegistry$1.c((ComponentActivity$activityResultRegistry$1) obj2, i2, (ActivityResultContract.SynchronousResult) obj);
                return;
            case 1:
                ComponentActivity$activityResultRegistry$1.b((ComponentActivity$activityResultRegistry$1) obj2, i2, (IntentSender.SendIntentException) obj);
                return;
            default:
                DeviceProfileWriter.a((DeviceProfileWriter) obj2, i2, obj);
                return;
        }
    }
}
