package defpackage;

import android.os.Message;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class je0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Message b;

    public /* synthetic */ je0(Message message, int i) {
        this.a = i;
        this.b = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Message message = this.b;
        switch (i) {
            case 0:
                throw new AssertionError("Unknown handler message received: " + message.what);
            default:
                throw new AssertionError("Unhandled stats message." + message.what);
        }
    }
}
