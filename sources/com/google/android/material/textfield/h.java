package com.google.android.material.textfield;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements CheckableImageButton.OnFocusableChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinearLayout b;

    public /* synthetic */ h(LinearLayout linearLayout, int i) {
        this.a = i;
        this.b = linearLayout;
    }

    @Override // com.google.android.material.internal.CheckableImageButton.OnFocusableChangedListener
    public final void onFocusableChanged(View view, boolean z) {
        int i = this.a;
        LinearLayout linearLayout = this.b;
        switch (i) {
            case 0:
                ((EndCompoundLayout) linearLayout).lambda$new$0(view, z);
                return;
            case 1:
                ((EndCompoundLayout) linearLayout).lambda$new$1(view, z);
                return;
            default:
                StartCompoundLayout.a((StartCompoundLayout) linearLayout, view, z);
                return;
        }
    }
}
