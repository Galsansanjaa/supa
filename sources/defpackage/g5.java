package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.text.intl.LocaleList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g5 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AndroidComposeView b;

    public /* synthetic */ g5(AndroidComposeView androidComposeView, int i) {
        this.a = i;
        this.b = androidComposeView;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 onAttachedToWindow$lambda$0;
        boolean isAttached;
        LocaleList localeList_delegate$lambda$0;
        vy2 resendMotionEventOnLayout$lambda$0;
        vy2 layoutChildViewsIfNeeded$lambda$0;
        int i = this.a;
        AndroidComposeView androidComposeView = this.b;
        switch (i) {
            case 0:
                onAttachedToWindow$lambda$0 = AndroidComposeView.onAttachedToWindow$lambda$0(androidComposeView);
                return onAttachedToWindow$lambda$0;
            case 1:
                isAttached = androidComposeView.isAttached();
                return Boolean.valueOf(isAttached);
            case 2:
                localeList_delegate$lambda$0 = AndroidComposeView.localeList_delegate$lambda$0(androidComposeView);
                return localeList_delegate$lambda$0;
            case 3:
                resendMotionEventOnLayout$lambda$0 = AndroidComposeView.resendMotionEventOnLayout$lambda$0(androidComposeView);
                return resendMotionEventOnLayout$lambda$0;
            default:
                layoutChildViewsIfNeeded$lambda$0 = AndroidComposeView.layoutChildViewsIfNeeded$lambda$0(androidComposeView);
                return layoutChildViewsIfNeeded$lambda$0;
        }
    }
}
