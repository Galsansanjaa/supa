package defpackage;

import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.runtime.DisposableEffectScope;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class x6 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AndroidTextContextMenuToolbarProvider b;

    public /* synthetic */ x6(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, int i) {
        this.a = i;
        this.b = androidTextContextMenuToolbarProvider;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 snapshotStateObserver$lambda$0;
        vy2 onDataChange$lambda$0;
        vy2 onPositionChange$lambda$0;
        int i = this.a;
        AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = this.b;
        switch (i) {
            case 0:
                snapshotStateObserver$lambda$0 = AndroidTextContextMenuToolbarProvider.snapshotStateObserver$lambda$0(androidTextContextMenuToolbarProvider, (os0) obj);
                return snapshotStateObserver$lambda$0;
            case 1:
                onDataChange$lambda$0 = AndroidTextContextMenuToolbarProvider.onDataChange$lambda$0(androidTextContextMenuToolbarProvider, obj);
                return onDataChange$lambda$0;
            case 2:
                onPositionChange$lambda$0 = AndroidTextContextMenuToolbarProvider.onPositionChange$lambda$0(androidTextContextMenuToolbarProvider, obj);
                return onPositionChange$lambda$0;
            default:
                return AndroidTextContextMenuToolbarProvider_androidKt.c(androidTextContextMenuToolbarProvider, (DisposableEffectScope) obj);
        }
    }
}
