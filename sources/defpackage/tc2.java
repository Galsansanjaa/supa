package defpackage;

import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SearchBarState;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class tc2 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y40 b;
    public final /* synthetic */ SearchBarState m;

    public /* synthetic */ tc2(y40 y40Var, SearchBarState searchBarState) {
        this.a = 0;
        this.m = searchBarState;
        this.b = y40Var;
    }

    public /* synthetic */ tc2(y40 y40Var, SearchBarState searchBarState, int i) {
        this.a = i;
        this.b = y40Var;
        this.m = searchBarState;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 InputField$lambda$17$lambda$16;
        vy2 DockedSearchBarLayout_nbWgWpA$lambda$51$lambda$50;
        vy2 ExpandedFullScreenSearchBar__UtchM0$lambda$8$lambda$7;
        vy2 ExpandedDockedSearchBar_qKj4JfE$lambda$13$lambda$12;
        switch (this.a) {
            case 0:
                InputField$lambda$17$lambda$16 = SearchBarDefaults.InputField$lambda$17$lambda$16(this.m, this.b);
                return InputField$lambda$17$lambda$16;
            case 1:
                DockedSearchBarLayout_nbWgWpA$lambda$51$lambda$50 = SearchBarKt.DockedSearchBarLayout_nbWgWpA$lambda$51$lambda$50(this.b, this.m);
                return DockedSearchBarLayout_nbWgWpA$lambda$51$lambda$50;
            case 2:
                ExpandedFullScreenSearchBar__UtchM0$lambda$8$lambda$7 = SearchBarKt.ExpandedFullScreenSearchBar__UtchM0$lambda$8$lambda$7(this.b, this.m);
                return ExpandedFullScreenSearchBar__UtchM0$lambda$8$lambda$7;
            default:
                ExpandedDockedSearchBar_qKj4JfE$lambda$13$lambda$12 = SearchBarKt.ExpandedDockedSearchBar_qKj4JfE$lambda$13$lambda$12(this.b, this.m);
                return ExpandedDockedSearchBar_qKj4JfE$lambda$13$lambda$12;
        }
    }
}
