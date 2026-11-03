package defpackage;

import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ku1 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FloatProducer b;

    public /* synthetic */ ku1(FloatProducer floatProducer, int i) {
        this.a = i;
        this.b = floatProducer;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        FloatProducer floatProducer = this.b;
        switch (i) {
            case 0:
                return OutlinedTextFieldKt.b(floatProducer);
            case 1:
                return Float.valueOf(PullToRefreshKt.c(floatProducer));
            default:
                return TextFieldKt.a(floatProducer);
        }
    }
}
