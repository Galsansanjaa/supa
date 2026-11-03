package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.core.app.PendingIntentCompat;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xk3 extends cx1 {
    public final Context b;
    public final /* synthetic */ uu0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk3(uu0 uu0Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 2);
        this.c = uu0Var;
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.cx1, android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = vu0.a;
        uu0 uu0Var = this.c;
        Context context = this.b;
        int b = uu0Var.b(context, i2);
        int i3 = fv0.e;
        if (b == 1 || b == 2 || b == 3 || b == 9) {
            Intent a = uu0Var.a(context, b, "n");
            uu0Var.f(context, b, a == null ? null : PendingIntentCompat.getActivity(context, 0, a, GroupFlagsKt.HasRecompositionRequiredFlag, false));
        }
    }
}
