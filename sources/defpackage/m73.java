package defpackage;

import androidx.compose.material3.DefaultModalWideNavigationRailOverride;
import androidx.compose.material3.DefaultWideNavigationRailOverride;
import androidx.compose.material3.ModalWideNavigationRailOverride;
import androidx.compose.material3.WideNavigationRailOverride;
import androidx.compose.material3.WideNavigationRail_androidKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.viewmodel.ViewModelStoreProvider;
import androidx.window.area.WindowAreaController;
import androidx.window.layout.WindowInfoTracker;
import java.util.UUID;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m73 implements os0 {
    public final /* synthetic */ int a;

    public /* synthetic */ m73(int i) {
        this.a = i;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        WideNavigationRailOverride wideNavigationRailOverride;
        ModalWideNavigationRailOverride modalWideNavigationRailOverride;
        UUID ModalWideNavigationRailDialog$lambda$2$lambda$1;
        switch (this.a) {
            case 0:
                return ViewModelLazy.a();
            case 1:
                return ViewModelStoreProvider.c();
            case 2:
                wideNavigationRailOverride = DefaultWideNavigationRailOverride.INSTANCE;
                return wideNavigationRailOverride;
            case 3:
                modalWideNavigationRailOverride = DefaultModalWideNavigationRailOverride.INSTANCE;
                return modalWideNavigationRailOverride;
            case 4:
                ModalWideNavigationRailDialog$lambda$2$lambda$1 = WideNavigationRail_androidKt.ModalWideNavigationRailDialog$lambda$2$lambda$1();
                return ModalWideNavigationRailDialog$lambda$2$lambda$1;
            case 5:
                return WindowAreaController.a();
            default:
                return WindowInfoTracker.Companion.a();
        }
    }
}
