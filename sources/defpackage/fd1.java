package defpackage;

import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import java.io.Serializable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fd1 implements LifecycleEventObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ fd1(int i, Serializable serializable, Object obj, Object obj2) {
        this.a = i;
        this.n = obj;
        this.b = serializable;
        this.m = obj2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = this.a;
        Object obj = this.m;
        Serializable serializable = this.b;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                LifecycleEffectKt.j((LifecycleStartStopEffectScope) obj2, (z42) serializable, (ps0) obj, lifecycleOwner, event);
                return;
            case 1:
                LifecycleEffectKt.r((LifecycleResumePauseEffectScope) obj2, (z42) serializable, (ps0) obj, lifecycleOwner, event);
                return;
            default:
                ((MenuHostHelper) obj2).lambda$addMenuProvider$1((Lifecycle.State) serializable, (MenuProvider) obj, lifecycleOwner, event);
                return;
        }
    }
}
