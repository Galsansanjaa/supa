package com.google.android.material.textfield;

import android.view.View;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EndIconDelegate b;

    public /* synthetic */ a(EndIconDelegate endIconDelegate, int i) {
        this.a = i;
        this.b = endIconDelegate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        EndIconDelegate endIconDelegate = this.b;
        switch (i) {
            case 0:
                ClearTextEndIconDelegate.a((ClearTextEndIconDelegate) endIconDelegate, view);
                return;
            case 1:
                DropdownMenuEndIconDelegate.g((DropdownMenuEndIconDelegate) endIconDelegate, view);
                return;
            default:
                PasswordToggleEndIconDelegate.a((PasswordToggleEndIconDelegate) endIconDelegate, view);
                return;
        }
    }
}
