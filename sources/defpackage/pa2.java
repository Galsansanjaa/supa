package defpackage;

import androidx.compose.foundation.layout.RulerAlignmentKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RectRulers;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class pa2 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RectRulers b;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Measurable o;

    public /* synthetic */ pa2(RectRulers rectRulers, int i, int i2, Measurable measurable, int i3) {
        this.a = i3;
        this.b = rectRulers;
        this.m = i;
        this.n = i2;
        this.o = measurable;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return RulerAlignmentKt.c(this.b, this.m, this.n, this.o, (Placeable.PlacementScope) obj);
            default:
                return RulerAlignmentKt.b(this.b, this.m, this.n, this.o, (Placeable.PlacementScope) obj);
        }
    }
}
