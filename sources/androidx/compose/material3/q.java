package androidx.compose.material3;

import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DatePickerState b;

    public /* synthetic */ q(DatePickerState datePickerState, int i) {
        this.a = i;
        this.b = datePickerState;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return DatePickerKt$DatePicker$5.a(this.b, (DisplayMode) obj);
            case 1:
                return DatePickerKt$DatePicker$6.b(this.b, (Long) obj);
            default:
                return DatePickerKt$DatePicker$6.a(this.b, ((Long) obj).longValue());
        }
    }
}
