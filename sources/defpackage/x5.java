package defpackage;

import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.IntRect;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class x5 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ x5(MutableState mutableState, int i) {
        this.a = i;
        this.b = mutableState;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        IntRect intRect = (IntRect) obj;
        IntRect intRect2 = (IntRect) obj2;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                return AndroidMenu_androidKt.e(mutableState, intRect, intRect2);
            default:
                return ExposedDropdownMenuBoxScope.e(mutableState, intRect, intRect2);
        }
    }
}
