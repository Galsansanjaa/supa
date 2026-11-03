package androidx.compose.material3;

import defpackage.os0;
import defpackage.ps0;
import defpackage.ts0;
import defpackage.us0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AppBarScopeImpl implements AppBarScope, AppBarItemProvider {
    public static final int $stable = 8;
    private final List<AppBarItem> items = new ArrayList();

    @Override // androidx.compose.material3.AppBarScope
    public void clickableItem(os0 os0Var, ts0 ts0Var, String str, boolean z) {
        getItems().add(new ClickableAppBarItem(os0Var, ts0Var, z, str));
    }

    @Override // androidx.compose.material3.AppBarScope
    public void customItem(ts0 ts0Var, us0 us0Var) {
        getItems().add(new CustomAppBarItem(ts0Var, us0Var));
    }

    @Override // androidx.compose.material3.AppBarItemProvider
    public List<AppBarItem> getItems() {
        return this.items;
    }

    @Override // androidx.compose.material3.AppBarItemProvider
    public int getItemsCount() {
        return getItems().size();
    }

    @Override // androidx.compose.material3.AppBarScope
    public void toggleableItem(boolean z, ps0 ps0Var, ts0 ts0Var, String str, boolean z2) {
        getItems().add(new ToggleableAppBarItem(z, ps0Var, ts0Var, z2, str));
    }
}
