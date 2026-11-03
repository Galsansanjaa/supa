package defpackage;

import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.window.PopupLayout;
import androidx.core.view.ViewKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ os0 b;

    public /* synthetic */ e2(os0 os0Var, int i) {
        this.a = i;
        this.b = os0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        os0 os0Var = this.b;
        switch (i) {
            case 0:
                os0Var.invoke();
                return;
            case 1:
                os0Var.invoke();
                return;
            case 2:
                os0Var.invoke();
                return;
            case 3:
                AndroidTextContextMenuToolbarProvider.i(os0Var);
                return;
            case 4:
                AndroidViewHolder.b(os0Var);
                return;
            case 5:
                AndroidViewHolder.m(os0Var);
                return;
            case 6:
                PopupLayout.g(os0Var);
                return;
            default:
                ViewKt.a(os0Var);
                return;
        }
    }
}
