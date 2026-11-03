package androidx.activity;

import androidx.activity.ComponentActivity;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ComponentActivity.ReportFullyDrawnExecutorImpl.a((ComponentActivity.ReportFullyDrawnExecutorImpl) obj);
                return;
            default:
                ComponentActivity$onBackPressedDispatcher$2.b((ComponentActivity) obj);
                return;
        }
    }
}
