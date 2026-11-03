package defpackage;

import androidx.compose.material3.NavigationItemKt;
import androidx.compose.ui.layout.Placeable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class mp1 implements ps0 {
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
    public final /* synthetic */ Placeable u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    public /* synthetic */ mp1(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6, Placeable placeable4, int i7, int i8, int i9) {
        this.a = i9;
        this.b = placeable;
        this.m = i;
        this.n = i2;
        this.o = placeable2;
        this.p = i3;
        this.q = i4;
        this.r = placeable3;
        this.s = i5;
        this.t = i6;
        this.u = placeable4;
        this.v = i7;
        this.w = i8;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 placeLabelAndTopIcon_qoqLrGI$lambda$37;
        vy2 placeLabelAndStartIcon_nru01g4$lambda$38;
        switch (this.a) {
            case 0:
                placeLabelAndTopIcon_qoqLrGI$lambda$37 = NavigationItemKt.placeLabelAndTopIcon_qoqLrGI$lambda$37(this.b, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, (Placeable.PlacementScope) obj);
                return placeLabelAndTopIcon_qoqLrGI$lambda$37;
            default:
                placeLabelAndStartIcon_nru01g4$lambda$38 = NavigationItemKt.placeLabelAndStartIcon_nru01g4$lambda$38(this.b, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, (Placeable.PlacementScope) obj);
                return placeLabelAndStartIcon_nru01g4$lambda$38;
        }
    }
}
