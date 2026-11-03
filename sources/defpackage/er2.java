package defpackage;

import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class er2 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TimePickerState b;
    public final /* synthetic */ TimePickerColors m;
    public final /* synthetic */ int n;

    public /* synthetic */ er2(TimePickerState timePickerState, TimePickerColors timePickerColors, int i, int i2) {
        this.a = i2;
        this.b = timePickerState;
        this.m = timePickerColors;
        this.n = i;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        vy2 VerticalClockDisplay$lambda$34;
        vy2 HorizontalClockDisplay$lambda$31;
        vy2 ClockDisplayNumbers$lambda$35;
        int i = this.a;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                VerticalClockDisplay$lambda$34 = TimePickerKt.VerticalClockDisplay$lambda$34(this.b, this.m, this.n, composer, intValue);
                return VerticalClockDisplay$lambda$34;
            case 1:
                HorizontalClockDisplay$lambda$31 = TimePickerKt.HorizontalClockDisplay$lambda$31(this.b, this.m, this.n, composer, intValue);
                return HorizontalClockDisplay$lambda$31;
            default:
                ClockDisplayNumbers$lambda$35 = TimePickerKt.ClockDisplayNumbers$lambda$35(this.b, this.m, this.n, composer, intValue);
                return ClockDisplayNumbers$lambda$35;
        }
    }
}
