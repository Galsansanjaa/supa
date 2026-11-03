package defpackage;

import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidPlatformTextInputSession;
import androidx.compose.ui.platform.ComposeViewContext;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f5 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AndroidComposeView b;

    public /* synthetic */ f5(AndroidComposeView androidComposeView, int i) {
        this.a = i;
        this.b = androidComposeView;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        AndroidPlatformTextInputSession textInputSession$lambda$0;
        vy2 snapshotObserver$lambda$0;
        vy2 indirectPointerNavigationGestureDetector$lambda$0;
        int i = this.a;
        AndroidComposeView androidComposeView = this.b;
        switch (i) {
            case 0:
                textInputSession$lambda$0 = AndroidComposeView.textInputSession$lambda$0(androidComposeView, (y40) obj);
                return textInputSession$lambda$0;
            case 1:
                snapshotObserver$lambda$0 = AndroidComposeView.snapshotObserver$lambda$0(androidComposeView, (os0) obj);
                return snapshotObserver$lambda$0;
            case 2:
                indirectPointerNavigationGestureDetector$lambda$0 = AndroidComposeView.indirectPointerNavigationGestureDetector$lambda$0(androidComposeView, (FocusDirection) obj);
                return indirectPointerNavigationGestureDetector$lambda$0;
            case 3:
                return ComposeViewContext.f(androidComposeView, (CompositionLocalAccessorScope) obj);
            default:
                return Boolean.valueOf(ComposeViewContext.c(androidComposeView, (CompositionLocalAccessorScope) obj));
        }
    }
}
