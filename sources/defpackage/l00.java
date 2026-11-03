package defpackage;

import androidx.core.widget.ContentLoadingProgressBar;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContentLoadingProgressBar b;

    public /* synthetic */ l00(ContentLoadingProgressBar contentLoadingProgressBar, int i) {
        this.a = i;
        this.b = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ContentLoadingProgressBar contentLoadingProgressBar = this.b;
        switch (i) {
            case 0:
                contentLoadingProgressBar.lambda$new$0();
                return;
            case 1:
                contentLoadingProgressBar.lambda$new$1();
                return;
            case 2:
                contentLoadingProgressBar.showOnUiThread();
                return;
            default:
                contentLoadingProgressBar.hideOnUiThread();
                return;
        }
    }
}
