package defpackage;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class cp1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableIntState b;

    public /* synthetic */ cp1(MutableIntState mutableIntState, int i) {
        this.a = i;
        this.b = mutableIntState;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableIntState mutableIntState = this.b;
        IntSize intSize = (IntSize) obj;
        switch (i) {
            case 0:
                return NavigationBarKt.a(mutableIntState, intSize);
            case 1:
                return NavigationItemKt.i(mutableIntState, intSize);
            default:
                return NavigationItemKt.n(mutableIntState, intSize);
        }
    }
}
