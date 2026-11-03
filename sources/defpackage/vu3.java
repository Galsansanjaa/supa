package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class vu3 extends cx1 {
    public final /* synthetic */ km b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu3(km kmVar, Looper looper) {
        super(looper, 5);
        this.b = kmVar;
    }

    @Override // defpackage.cx1, android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        tm3 tm3Var;
        km kmVar = this.b;
        int i = kmVar.x.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (tm3Var = (tm3) message.obj) != null) {
                tm3Var.c();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !kmVar.q()) {
            tm3 tm3Var2 = (tm3) message.obj;
            if (tm3Var2 != null) {
                tm3Var2.c();
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            kmVar.u = new uz(null, null, message.arg2);
            if (!kmVar.v && !TextUtils.isEmpty(kmVar.m()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(kmVar.m());
                    if (!kmVar.v) {
                        kmVar.v(null, 3);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            uz uzVar = kmVar.u;
            if (uzVar == null) {
                uzVar = new uz(null, null, 8);
            }
            kmVar.j.h(uzVar);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            uz uzVar2 = kmVar.u;
            if (uzVar2 == null) {
                uzVar2 = new uz(null, null, 8);
            }
            kmVar.j.h(uzVar2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            kmVar.j.h(new uz(null, obj instanceof PendingIntent ? (PendingIntent) obj : null, message.arg2));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            kmVar.v(null, 5);
            hm hmVar = kmVar.o;
            if (hmVar != null) {
                hmVar.d(message.arg2);
            }
            System.currentTimeMillis();
            kmVar.t(5, 1, null);
            return;
        }
        if (i4 == 2 && !kmVar.p()) {
            tm3 tm3Var3 = (tm3) message.obj;
            if (tm3Var3 != null) {
                tm3Var3.c();
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", wa2.u(new StringBuilder(String.valueOf(i5).length() + 34), "Don't know how to handle message: ", i5), new Exception());
            return;
        }
        tm3 tm3Var4 = (tm3) message.obj;
        synchronized (tm3Var4) {
            try {
                bool = tm3Var4.a;
                if (tm3Var4.b) {
                    String obj2 = tm3Var4.toString();
                    StringBuilder sb = new StringBuilder(obj2.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(obj2);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            km kmVar2 = tm3Var4.f;
            int i6 = tm3Var4.d;
            if (i6 != 0) {
                kmVar2.v(null, 1);
                Bundle bundle = tm3Var4.e;
                tm3Var4.b(new uz(null, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, i6));
            } else if (!tm3Var4.a()) {
                kmVar2.v(null, 1);
                tm3Var4.b(new uz(null, null, 8));
            }
        }
        synchronized (tm3Var4) {
            tm3Var4.b = true;
        }
        tm3Var4.c();
    }
}
