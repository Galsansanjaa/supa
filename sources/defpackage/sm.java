package defpackage;

import androidx.compose.foundation.BasicMarqueeKt;
import androidx.compose.foundation.MarqueeSpacing;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class sm implements MarqueeSpacing {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ sm(float f, int i) {
        this.a = i;
        this.b = f;
    }

    @Override // androidx.compose.foundation.MarqueeSpacing
    public final int calculateSpacing(Density density, int i, int i2) {
        int fractionOfContainer$lambda$0;
        int i3 = this.a;
        float f = this.b;
        switch (i3) {
            case 0:
                return BasicMarqueeKt.a(f, density, i, i2);
            default:
                fractionOfContainer$lambda$0 = MarqueeSpacing.Companion.fractionOfContainer$lambda$0(f, density, i, i2);
                return fractionOfContainer$lambda$0;
        }
    }
}
