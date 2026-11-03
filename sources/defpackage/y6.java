package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DragHandleKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class y6 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ y6(MutableState mutableState, int i) {
        this.a = i;
        this.b = mutableState;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        LayoutCoordinates ProvidePlatformTextContextMenuToolbar$lambda$4$0;
        List LayoutWithLinksAndInlineContent_11Od_4g$lambda$9$0;
        vy2 DatePickerContent$lambda$36$lambda$33$lambda$32;
        vy2 ExposedDropdownMenu_vNxi1II$lambda$2$lambda$1;
        int i = this.a;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                ProvidePlatformTextContextMenuToolbar$lambda$4$0 = AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$4$0(mutableState);
                return ProvidePlatformTextContextMenuToolbar$lambda$4$0;
            case 1:
                return BasicTextContextMenuProviderKt.d(mutableState);
            case 2:
                LayoutWithLinksAndInlineContent_11Od_4g$lambda$9$0 = BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$9$0(mutableState);
                return LayoutWithLinksAndInlineContent_11Od_4g$lambda$9$0;
            case 3:
                DatePickerContent$lambda$36$lambda$33$lambda$32 = DatePickerKt.DatePickerContent$lambda$36$lambda$33$lambda$32(mutableState);
                return DatePickerContent$lambda$36$lambda$33$lambda$32;
            case 4:
                return DragHandleKt.e(mutableState);
            case 5:
                return DragHandleKt.d(mutableState);
            case 6:
                ExposedDropdownMenu_vNxi1II$lambda$2$lambda$1 = ExposedDropdownMenuBoxScope.ExposedDropdownMenu_vNxi1II$lambda$2$lambda$1(mutableState);
                return ExposedDropdownMenu_vNxi1II$lambda$2$lambda$1;
            case 7:
                return PlatformDefaultTextContextMenuProviders_androidKt.c(mutableState);
            case 8:
                return TooltipKt.j(mutableState);
            default:
                return Boolean.valueOf(WideNavigationRailKt.l(mutableState));
        }
    }
}
