package androidx.compose.material3;

import defpackage.os0;
import defpackage.ps0;
import defpackage.ts0;
import defpackage.us0;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AppBarColumnScopeImpl implements AppBarColumnScope, AppBarScope, AppBarItemProvider {
    private final AppBarScopeImpl impl;

    public AppBarColumnScopeImpl(AppBarScopeImpl appBarScopeImpl) {
        this.impl = appBarScopeImpl;
    }

    @Override // androidx.compose.material3.AppBarScope
    public void clickableItem(os0 os0Var, ts0 ts0Var, String str, boolean z) {
        this.impl.clickableItem(os0Var, ts0Var, str, z);
    }

    @Override // androidx.compose.material3.AppBarScope
    public void customItem(ts0 ts0Var, us0 us0Var) {
        this.impl.customItem(ts0Var, us0Var);
    }

    public final AppBarScopeImpl getImpl() {
        return this.impl;
    }

    @Override // androidx.compose.material3.AppBarItemProvider
    public List<AppBarItem> getItems() {
        return this.impl.getItems();
    }

    @Override // androidx.compose.material3.AppBarItemProvider
    public int getItemsCount() {
        return this.impl.getItemsCount();
    }

    @Override // androidx.compose.material3.AppBarScope
    public void toggleableItem(boolean z, ps0 ps0Var, ts0 ts0Var, String str, boolean z2) {
        this.impl.toggleableItem(z, ps0Var, ts0Var, str, z2);
    }
}
