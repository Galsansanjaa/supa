package defpackage;

import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class dr2 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TimePickerState b;

    public /* synthetic */ dr2(int i, TimePickerState timePickerState) {
        this.a = i;
        this.b = timePickerState;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        TimePickerState timePickerState = this.b;
        switch (i) {
            case 0:
                return TimePickerKt.f(timePickerState);
            case 1:
                return TimePickerKt.b(timePickerState);
            case 2:
                return TimePickerKt.j(timePickerState);
            default:
                return TimePickerKt.F(timePickerState);
        }
    }
}
