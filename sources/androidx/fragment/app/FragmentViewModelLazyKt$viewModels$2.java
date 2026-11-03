package androidx.fragment.app;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import defpackage.bb1;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class FragmentViewModelLazyKt$viewModels$2 extends bb1 implements os0 {
    final /* synthetic */ os0 $ownerProducer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$2(os0 os0Var) {
        super(0);
        this.$ownerProducer = os0Var;
    }

    @Override // defpackage.os0
    public final ViewModelStore invoke() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) this.$ownerProducer.invoke()).getViewModelStore();
        viewModelStore.getClass();
        return viewModelStore;
    }
}
