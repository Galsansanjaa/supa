package defpackage;

import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p92 implements DoubleFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferParameters b;

    public /* synthetic */ p92(TransferParameters transferParameters, int i) {
        this.a = i;
        this.b = transferParameters;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        int i = this.a;
        TransferParameters transferParameters = this.b;
        switch (i) {
            case 0:
                return Rgb.Companion.a(transferParameters, d);
            case 1:
                return Rgb.Companion.d(transferParameters, d);
            case 2:
                return Rgb.Companion.b(transferParameters, d);
            case 3:
                return Rgb.Companion.g(transferParameters, d);
            case 4:
                return Rgb.Companion.f(transferParameters, d);
            case 5:
                return Rgb.Companion.e(transferParameters, d);
            case 6:
                return Rgb.Companion.h(transferParameters, d);
            default:
                return Rgb.Companion.c(transferParameters, d);
        }
    }
}
