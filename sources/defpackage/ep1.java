package defpackage;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.ui.layout.Placeable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ep1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Placeable b;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Placeable o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Placeable r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;

    public /* synthetic */ ep1(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6) {
        this.a = 1;
        this.b = placeable;
        this.m = i;
        this.n = i2;
        this.o = placeable2;
        this.p = i3;
        this.q = i4;
        this.r = placeable3;
        this.s = i5;
        this.t = i6;
    }

    public /* synthetic */ ep1(Placeable placeable, Placeable placeable2, int i, int i2, Placeable placeable3, int i3, int i4, int i5, int i6, int i7) {
        this.a = i7;
        this.b = placeable;
        this.o = placeable2;
        this.m = i;
        this.n = i2;
        this.r = placeable3;
        this.p = i3;
        this.q = i4;
        this.s = i5;
        this.t = i6;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 placeIcon_X9ElhV4$lambda$25;
        vy2 placeIcon_X9ElhV4$lambda$36;
        vy2 placeIcon_X9ElhV4$lambda$20;
        switch (this.a) {
            case 0:
                Placeable placeable = this.b;
                int i = this.m;
                int i2 = this.n;
                Placeable placeable2 = this.o;
                int i3 = this.p;
                int i4 = this.q;
                placeIcon_X9ElhV4$lambda$25 = NavigationBarKt.placeIcon_X9ElhV4$lambda$25(placeable, placeable2, i, i2, this.r, i3, i4, this.s, this.t, (Placeable.PlacementScope) obj);
                return placeIcon_X9ElhV4$lambda$25;
            case 1:
                placeIcon_X9ElhV4$lambda$36 = NavigationItemKt.placeIcon_X9ElhV4$lambda$36(this.b, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, (Placeable.PlacementScope) obj);
                return placeIcon_X9ElhV4$lambda$36;
            default:
                Placeable placeable3 = this.b;
                int i5 = this.m;
                int i6 = this.n;
                Placeable placeable4 = this.o;
                int i7 = this.p;
                int i8 = this.q;
                placeIcon_X9ElhV4$lambda$20 = NavigationRailKt.placeIcon_X9ElhV4$lambda$20(placeable3, placeable4, i5, i6, this.r, i7, i8, this.s, this.t, (Placeable.PlacementScope) obj);
                return placeIcon_X9ElhV4$lambda$20;
        }
    }
}
