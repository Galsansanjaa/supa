package defpackage;

import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class pj2 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SliderColors b;
    public final /* synthetic */ boolean m;

    public /* synthetic */ pj2(SliderColors sliderColors, boolean z, int i) {
        this.a = i;
        this.b = sliderColors;
        this.m = z;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        vy2 Track_mnvyFg4$lambda$19$lambda$18;
        vy2 Track_4EFweAY$lambda$35$lambda$34;
        vy2 CenteredTrack_7LSsfP0$lambda$23$lambda$22;
        vy2 Track_4EFweAY$lambda$15$lambda$14;
        vy2 Track_mnvyFg4$lambda$39$lambda$38;
        DrawScope drawScope = (DrawScope) obj;
        Offset offset = (Offset) obj2;
        switch (this.a) {
            case 0:
                Track_mnvyFg4$lambda$19$lambda$18 = SliderDefaults.Track_mnvyFg4$lambda$19$lambda$18(this.b, this.m, drawScope, offset);
                return Track_mnvyFg4$lambda$19$lambda$18;
            case 1:
                Track_4EFweAY$lambda$35$lambda$34 = SliderDefaults.Track_4EFweAY$lambda$35$lambda$34(this.b, this.m, drawScope, offset);
                return Track_4EFweAY$lambda$35$lambda$34;
            case 2:
                CenteredTrack_7LSsfP0$lambda$23$lambda$22 = SliderDefaults.CenteredTrack_7LSsfP0$lambda$23$lambda$22(this.b, this.m, drawScope, offset);
                return CenteredTrack_7LSsfP0$lambda$23$lambda$22;
            case 3:
                Track_4EFweAY$lambda$15$lambda$14 = SliderDefaults.Track_4EFweAY$lambda$15$lambda$14(this.b, this.m, drawScope, offset);
                return Track_4EFweAY$lambda$15$lambda$14;
            default:
                Track_mnvyFg4$lambda$39$lambda$38 = SliderDefaults.Track_mnvyFg4$lambda$39$lambda$38(this.b, this.m, drawScope, offset);
                return Track_mnvyFg4$lambda$39$lambda$38;
        }
    }
}
