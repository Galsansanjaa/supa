package defpackage;

import androidx.compose.material3.DividerKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ye0 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long m;

    public /* synthetic */ ye0(float f, long j, int i) {
        this.a = i;
        this.b = f;
        this.m = j;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return DividerKt.c(this.b, this.m, (DrawScope) obj);
            default:
                return DividerKt.d(this.b, this.m, (DrawScope) obj);
        }
    }
}
