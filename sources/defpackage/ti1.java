package defpackage;

import android.view.View;
import com.google.android.material.datepicker.MaterialDatePicker;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ti1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialDatePicker b;

    public /* synthetic */ ti1(MaterialDatePicker materialDatePicker, int i) {
        this.a = i;
        this.b = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        MaterialDatePicker materialDatePicker = this.b;
        switch (i) {
            case 0:
                MaterialDatePicker.a(materialDatePicker, view);
                return;
            case 1:
                materialDatePicker.onPositiveButtonClick(view);
                return;
            default:
                materialDatePicker.onNegativeButtonClick(view);
                return;
        }
    }
}
