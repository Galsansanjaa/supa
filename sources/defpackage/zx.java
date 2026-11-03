package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.savedstate.SavedStateRegistry;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zx implements SavedStateRegistry.SavedStateProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zx(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        Bundle _init_$lambda$4;
        Bundle lambda$init$0;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                _init_$lambda$4 = ComponentActivity._init_$lambda$4((ComponentActivity) obj);
                return _init_$lambda$4;
            case 1:
                return DisposableSaveableStateRegistry_androidKt.a((SaveableStateRegistry) obj);
            case 2:
                lambda$init$0 = ((FragmentActivity) obj).lambda$init$0();
                return lambda$init$0;
            case 3:
                return FragmentManager.b((FragmentManager) obj);
            default:
                return SavedStateHandleImpl.a((SavedStateHandleImpl) obj);
        }
    }
}
