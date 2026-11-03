package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.internal.MutableWindowInsets;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ob2 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableWindowInsets b;
    public final /* synthetic */ WindowInsets m;

    public /* synthetic */ ob2(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets, int i) {
        this.a = i;
        this.b = mutableWindowInsets;
        this.m = windowInsets;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 FullScreenSearchBarLayout_EQC0FA8$lambda$65$lambda$64;
        vy2 SearchBarLayout$lambda$42$lambda$41;
        int i = this.a;
        WindowInsets windowInsets = this.m;
        MutableWindowInsets mutableWindowInsets = this.b;
        WindowInsets windowInsets2 = (WindowInsets) obj;
        switch (i) {
            case 0:
                return ScaffoldKt.b(mutableWindowInsets, windowInsets, windowInsets2);
            case 1:
                FullScreenSearchBarLayout_EQC0FA8$lambda$65$lambda$64 = SearchBarKt.FullScreenSearchBarLayout_EQC0FA8$lambda$65$lambda$64(mutableWindowInsets, windowInsets, windowInsets2);
                return FullScreenSearchBarLayout_EQC0FA8$lambda$65$lambda$64;
            default:
                SearchBarLayout$lambda$42$lambda$41 = SearchBarKt.SearchBarLayout$lambda$42$lambda$41(mutableWindowInsets, windowInsets, windowInsets2);
                return SearchBarLayout$lambda$42$lambda$41;
        }
    }
}
