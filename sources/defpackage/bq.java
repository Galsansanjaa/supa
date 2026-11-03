package defpackage;

import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.internal.ViewUtils;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class bq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ bq(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                BottomAppBar.a(view);
                return;
            default:
                ViewUtils.requestFocusAndShowKeyboard(view, false);
                return;
        }
    }
}
