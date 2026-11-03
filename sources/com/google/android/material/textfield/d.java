package com.google.android.material.textfield;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EndIconDelegate b;

    public /* synthetic */ d(EndIconDelegate endIconDelegate, int i) {
        this.a = i;
        this.b = endIconDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        EndIconDelegate endIconDelegate = this.b;
        switch (i) {
            case 0:
                ((ClearTextEndIconDelegate) endIconDelegate).lambda$tearDown$2();
                return;
            default:
                ((DropdownMenuEndIconDelegate) endIconDelegate).lambda$afterEditTextChanged$3();
                return;
        }
    }
}
