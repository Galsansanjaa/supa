package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t90 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t90(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Handler) obj).post(runnable);
                return;
            default:
                TextInputServiceAndroid_androidKt.a((Choreographer) obj, runnable);
                return;
        }
    }
}
