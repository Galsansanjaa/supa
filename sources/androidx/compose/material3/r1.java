package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.input.TextFieldValue;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ r1(MutableState mutableState, int i) {
        this.a = i;
        this.b = mutableState;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                return TimePickerKt$TimeInputImpl$2$1.f(mutableState, (TextFieldValue) obj);
            case 1:
                return TimePickerKt$TimeInputImpl$2$1.a(mutableState, (TextFieldValue) obj);
            case 2:
                return TooltipKt$TooltipBox$wrappedContent$1.a(mutableState, (LayoutCoordinates) obj);
            default:
                return WideNavigationRailKt$Scrim$dismissModalRail$1$1.a(mutableState, (Offset) obj);
        }
    }
}
