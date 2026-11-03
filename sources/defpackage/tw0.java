package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class tw0 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ CoordinatorLayout.Behavior m;

    public /* synthetic */ tw0(CoordinatorLayout.Behavior behavior, View view, int i) {
        this.a = i;
        this.m = behavior;
        this.b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        int i = this.a;
        View view = this.b;
        CoordinatorLayout.Behavior behavior = this.m;
        switch (i) {
            case 0:
                HideBottomViewOnScrollBehavior.a((HideBottomViewOnScrollBehavior) behavior, view, z);
                return;
            default:
                HideViewOnScrollBehavior.a((HideViewOnScrollBehavior) behavior, view, z);
                return;
        }
    }
}
