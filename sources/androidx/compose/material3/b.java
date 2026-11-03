package androidx.compose.material3;

import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppBarMenuState b;

    public /* synthetic */ b(AppBarMenuState appBarMenuState, int i) {
        this.a = i;
        this.b = appBarMenuState;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        AppBarMenuState appBarMenuState = this.b;
        switch (i) {
            case 0:
                return AppBarColumnKt$AppBarColumn$2.a(appBarMenuState);
            default:
                return AppBarRowKt$AppBarRow$2.a(appBarMenuState);
        }
    }
}
