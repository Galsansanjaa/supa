package androidx.compose.material3;

import androidx.compose.material3.TimePickerKt$ClockFace$1;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class p1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ p1(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.b;
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                return TimePickerKt$ClockFace$1.AnonymousClass2.AnonymousClass1.a(i2, semanticsPropertyReceiver);
            default:
                return TimePickerKt$ClockFace$1.AnonymousClass2.AnonymousClass1.C00222.a(i2, semanticsPropertyReceiver);
        }
    }
}
