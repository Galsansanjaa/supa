package androidx.compose.foundation.text;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuStateKt;
import defpackage.os0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class CommonContextMenuAreaKt$TextItem$2 implements os0 {
    final /* synthetic */ os0 $operation;
    final /* synthetic */ ContextMenuState $state;

    public CommonContextMenuAreaKt$TextItem$2(os0 os0Var, ContextMenuState contextMenuState) {
        this.$operation = os0Var;
        this.$state = contextMenuState;
    }

    @Override // defpackage.os0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1509invoke();
        return vy2.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1509invoke() {
        this.$operation.invoke();
        ContextMenuStateKt.close(this.$state);
    }
}
