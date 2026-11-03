package androidx.leanback.widget;

import android.view.View;
import androidx.leanback.widget.ItemBridgeAdapter;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class ItemBridgeAdapterShadowOverlayWrapper extends ItemBridgeAdapter.Wrapper {
    private final ShadowOverlayHelper mHelper;

    public ItemBridgeAdapterShadowOverlayWrapper(ShadowOverlayHelper shadowOverlayHelper) {
        this.mHelper = shadowOverlayHelper;
    }

    @Override // androidx.leanback.widget.ItemBridgeAdapter.Wrapper
    public View createWrapper(View view) {
        return this.mHelper.createShadowOverlayContainer(view.getContext());
    }

    @Override // androidx.leanback.widget.ItemBridgeAdapter.Wrapper
    public void wrap(View view, View view2) {
        ((ShadowOverlayContainer) view).wrap(view2);
    }
}
