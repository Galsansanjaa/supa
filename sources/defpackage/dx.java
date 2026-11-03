package defpackage;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.CommonContextMenuAreaKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class dx implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContextMenuState b;

    public /* synthetic */ dx(ContextMenuState contextMenuState, int i) {
        this.a = i;
        this.b = contextMenuState;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        ContextMenuState contextMenuState = this.b;
        switch (i) {
            case 0:
                return CommonContextMenuAreaKt.b(contextMenuState);
            case 1:
                return CommonContextMenuAreaKt.h(contextMenuState);
            default:
                return CommonContextMenuAreaKt.a(contextMenuState);
        }
    }
}
