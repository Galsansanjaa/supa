package androidx.compose.material3;

import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ModalWideNavigationRailDialogWrapper b;

    public /* synthetic */ p0(ModalWideNavigationRailDialogWrapper modalWideNavigationRailDialogWrapper, int i) {
        this.a = i;
        this.b = modalWideNavigationRailDialogWrapper;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        ModalWideNavigationRailDialogWrapper modalWideNavigationRailDialogWrapper = this.b;
        switch (i) {
            case 0:
                return ModalWideNavigationRailDialogWrapper.b(modalWideNavigationRailDialogWrapper, (OnBackPressedCallback) obj);
            default:
                return WideNavigationRail_androidKt.b(modalWideNavigationRailDialogWrapper, (DisposableEffectScope) obj);
        }
    }
}
