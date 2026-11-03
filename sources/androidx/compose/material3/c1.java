package androidx.compose.material3;

import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SnackbarData b;

    public /* synthetic */ c1(SnackbarData snackbarData, int i) {
        this.a = i;
        this.b = snackbarData;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        SnackbarData snackbarData = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(SnackbarHostKt$FadeInFadeOutWithScale$1$1.b(snackbarData));
            case 1:
                return SnackbarKt$Snackbar$actionComposable$1.a(snackbarData);
            default:
                return SnackbarKt$Snackbar$dismissActionComposable$1.a(snackbarData);
        }
    }
}
