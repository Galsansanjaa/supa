package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class cx1 extends Handler {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx1(Looper looper, int i) {
        super(looper);
        this.a = i;
        switch (i) {
            case 4:
                super(looper);
                Looper.getMainLooper();
                return;
            case 5:
                super(looper);
                Looper.getMainLooper();
                return;
            default:
                Looper.getMainLooper();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cx1(Looper looper, int i, boolean z) {
        super(looper);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cx1(Looper looper, Handler.Callback callback, int i) {
        super(looper, callback);
        this.a = i;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == 3) {
                    x1 x1Var = (x1) message.obj;
                    x1Var.a.a(x1Var.d());
                    return;
                }
                if (i != 8) {
                    if (i != 13) {
                        throw new AssertionError("Unknown handler message received: " + message.what);
                    }
                    List list = (List) message.obj;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        x1 x1Var2 = (x1) list.get(i2);
                        dx1 dx1Var = x1Var2.a;
                        Bitmap g = dx1Var.g(x1Var2.d);
                        if (g != null) {
                            dx1Var.b(g, 1, x1Var2, null);
                        } else {
                            dx1Var.c(x1Var2);
                        }
                    }
                    return;
                }
                List list2 = (List) message.obj;
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    wo woVar = (wo) list2.get(i3);
                    dx1 dx1Var2 = woVar.b;
                    x1 x1Var3 = woVar.t;
                    ArrayList arrayList = woVar.u;
                    boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
                    if (x1Var3 != null || z) {
                        Exception exc = woVar.y;
                        Bitmap bitmap = woVar.v;
                        int i4 = woVar.x;
                        if (x1Var3 != null) {
                            dx1Var2.b(bitmap, i4, x1Var3, exc);
                        }
                        if (z) {
                            int size3 = arrayList.size();
                            for (int i5 = 0; i5 < size3; i5++) {
                                dx1Var2.b(bitmap, i4, (x1) arrayList.get(i5), exc);
                            }
                        }
                    }
                }
                return;
            case 1:
                sendMessageDelayed(obtainMessage(), 1000L);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }
}
