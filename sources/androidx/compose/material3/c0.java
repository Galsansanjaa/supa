package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.ui.unit.IntSize;
import defpackage.ps0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EnterAlwaysSearchBarScrollBehavior b;

    public /* synthetic */ c0(EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, int i) {
        this.a = i;
        this.b = enterAlwaysSearchBarScrollBehavior;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 vy2Var;
        vy2 searchBarScrollBehavior$lambda$0;
        vy2 searchBarScrollBehavior$lambda$3;
        int i = this.a;
        EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior = this.b;
        switch (i) {
            case 0:
                vy2Var = EnterAlwaysSearchBarScrollBehavior.settleSearchBar_OhffZ5M$lambda$5(enterAlwaysSearchBarScrollBehavior, (AnimationScope) obj);
                return vy2Var;
            case 1:
                searchBarScrollBehavior$lambda$0 = EnterAlwaysSearchBarScrollBehavior.searchBarScrollBehavior$lambda$0(enterAlwaysSearchBarScrollBehavior, ((Float) obj).floatValue());
                return searchBarScrollBehavior$lambda$0;
            default:
                searchBarScrollBehavior$lambda$3 = EnterAlwaysSearchBarScrollBehavior.searchBarScrollBehavior$lambda$3(enterAlwaysSearchBarScrollBehavior, (IntSize) obj);
                return searchBarScrollBehavior$lambda$3;
        }
    }
}
