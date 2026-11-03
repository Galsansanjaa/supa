package defpackage;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupLayout;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h6 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PopupLayout b;

    public /* synthetic */ h6(PopupLayout popupLayout, int i) {
        this.a = i;
        this.b = popupLayout;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 snapshotStateObserver$lambda$0;
        int i = this.a;
        PopupLayout popupLayout = this.b;
        switch (i) {
            case 0:
                return AndroidPopup_androidKt.d(popupLayout, (LayoutCoordinates) obj);
            case 1:
                return AndroidPopup_androidKt.l(popupLayout, (IntSize) obj);
            default:
                snapshotStateObserver$lambda$0 = PopupLayout.snapshotStateObserver$lambda$0(popupLayout, (os0) obj);
                return snapshotStateObserver$lambda$0;
        }
    }
}
