package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ s(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                return DatePickerKt$DatePickerContent$2$4$2.b(str, semanticsPropertyReceiver);
            case 1:
                return DatePickerKt$MonthsNavigation$1$1.a(str, semanticsPropertyReceiver);
            case 2:
                return DefaultBasicAlertDialogOverride$BasicAlertDialog$1.a(str, semanticsPropertyReceiver);
            default:
                return TimePickerKt$TimeSelector$3.a(str, semanticsPropertyReceiver);
        }
    }
}
