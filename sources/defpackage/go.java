package defpackage;

import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.PopupPositionProvider;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class go implements ts0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ rs0 q;

    public /* synthetic */ go(PopupPositionProvider popupPositionProvider, BasicTooltipState basicTooltipState, y40 y40Var, boolean z, ts0 ts0Var, int i) {
        this.n = popupPositionProvider;
        this.o = basicTooltipState;
        this.p = y40Var;
        this.b = z;
        this.q = ts0Var;
        this.m = i;
    }

    public /* synthetic */ go(boolean z, Shape shape, os0 os0Var, TimePickerColors timePickerColors, us0 us0Var, int i) {
        this.b = z;
        this.n = shape;
        this.o = os0Var;
        this.p = timePickerColors;
        this.q = us0Var;
        this.m = i;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        vy2 TooltipPopup$lambda$2;
        vy2 ToggleItem$lambda$50;
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                TooltipPopup$lambda$2 = BasicTooltipKt.TooltipPopup$lambda$2((PopupPositionProvider) this.n, (BasicTooltipState) this.o, (y40) this.p, this.b, (ts0) this.q, this.m, (Composer) obj, intValue);
                return TooltipPopup$lambda$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                ToggleItem$lambda$50 = TimePickerKt.ToggleItem$lambda$50(this.b, (Shape) this.n, (os0) this.o, (TimePickerColors) this.p, (us0) this.q, this.m, (Composer) obj, intValue2);
                return ToggleItem$lambda$50;
        }
    }
}
