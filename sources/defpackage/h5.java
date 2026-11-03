package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AndroidComposeView b;

    public /* synthetic */ h5(AndroidComposeView androidComposeView, int i) {
        this.a = i;
        this.b = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AndroidComposeView androidComposeView = this.b;
        switch (i) {
            case 0:
                AndroidComposeView.n(androidComposeView);
                return;
            case 1:
                AndroidComposeView.u(androidComposeView);
                return;
            case 2:
                AndroidComposeView.Companion.b(androidComposeView);
                return;
            default:
                AndroidComposeView.Companion.c(androidComposeView);
                return;
        }
    }
}
