package com.google.android.material.textfield;

import android.view.View;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EndIconDelegate b;

    public /* synthetic */ b(EndIconDelegate endIconDelegate, int i) {
        this.a = i;
        this.b = endIconDelegate;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        EndIconDelegate endIconDelegate = this.b;
        switch (i) {
            case 0:
                ((ClearTextEndIconDelegate) endIconDelegate).lambda$new$1(view, z);
                return;
            default:
                ((DropdownMenuEndIconDelegate) endIconDelegate).lambda$new$1(view, z);
                return;
        }
    }
}
