package defpackage;

import androidx.compose.foundation.layout.RulerAlignmentKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.RectRulers;
import androidx.compose.ui.unit.Constraints;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class qa2 implements us0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RectRulers b;

    public /* synthetic */ qa2(RectRulers rectRulers, int i) {
        this.a = i;
        this.b = rectRulers;
    }

    @Override // defpackage.us0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MeasureResult fitInside$lambda$0;
        MeasureResult fitOutside$lambda$0;
        int i = this.a;
        MeasureScope measureScope = (MeasureScope) obj;
        Measurable measurable = (Measurable) obj2;
        Constraints constraints = (Constraints) obj3;
        RectRulers rectRulers = this.b;
        switch (i) {
            case 0:
                fitInside$lambda$0 = RulerAlignmentKt.fitInside$lambda$0(rectRulers, measureScope, measurable, constraints);
                return fitInside$lambda$0;
            default:
                fitOutside$lambda$0 = RulerAlignmentKt.fitOutside$lambda$0(rectRulers, measureScope, measurable, constraints);
                return fitOutside$lambda$0;
        }
    }
}
