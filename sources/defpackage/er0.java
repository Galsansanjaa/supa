package defpackage;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.ui.focus.FocusRestorerKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class er0 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ er0(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return FocusRestorerKt.a(i2);
            default:
                return ScrollKt.a(i2);
        }
    }
}
