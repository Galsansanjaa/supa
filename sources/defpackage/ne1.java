package defpackage;

import androidx.compose.material3.ListItemKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ne1 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ rs0 o;

    public /* synthetic */ ne1(long j, Object obj, rs0 rs0Var, int i, int i2) {
        this.a = i2;
        this.b = j;
        this.n = obj;
        this.o = rs0Var;
        this.m = i;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        vy2 Indicator_3J_VO9M$lambda$45;
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                return ListItemKt.e(this.b, (TypographyKeyTokens) this.n, (ts0) this.o, this.m, (Composer) obj, intValue);
            default:
                int intValue2 = ((Integer) obj2).intValue();
                Indicator_3J_VO9M$lambda$45 = NavigationItemKt.Indicator_3J_VO9M$lambda$45(this.b, (Shape) this.n, (os0) this.o, this.m, (Composer) obj, intValue2);
                return Indicator_3J_VO9M$lambda$45;
        }
    }
}
