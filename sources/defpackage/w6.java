package defpackage;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.ui.geometry.Rect;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class w6 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AndroidTextContextMenuToolbarProvider b;
    public final /* synthetic */ TextContextMenuDataProvider m;

    public /* synthetic */ w6(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, TextContextMenuDataProvider textContextMenuDataProvider, int i) {
        this.a = i;
        this.b = androidTextContextMenuToolbarProvider;
        this.m = textContextMenuDataProvider;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        TextContextMenuData observeAndGetData;
        Rect observeAndGetBounds;
        Rect observeAndGetBounds$lambda$0;
        int i = this.a;
        TextContextMenuDataProvider textContextMenuDataProvider = this.m;
        AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = this.b;
        switch (i) {
            case 0:
                observeAndGetData = androidTextContextMenuToolbarProvider.observeAndGetData(textContextMenuDataProvider);
                return observeAndGetData;
            case 1:
                observeAndGetBounds = androidTextContextMenuToolbarProvider.observeAndGetBounds(textContextMenuDataProvider);
                return observeAndGetBounds;
            default:
                observeAndGetBounds$lambda$0 = AndroidTextContextMenuToolbarProvider.observeAndGetBounds$lambda$0(androidTextContextMenuToolbarProvider, textContextMenuDataProvider);
                return observeAndGetBounds$lambda$0;
        }
    }
}
