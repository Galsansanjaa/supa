package defpackage;

import androidx.compose.ui.focus.FocusOrderModifierKt;
import androidx.compose.ui.focus.FocusOrderToProperties;
import androidx.compose.ui.focus.FocusProperties;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class br0 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FocusOrderToProperties b;

    public /* synthetic */ br0(FocusOrderToProperties focusOrderToProperties, int i) {
        this.a = i;
        this.b = focusOrderToProperties;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        FocusOrderToProperties focusOrderToProperties = this.b;
        FocusProperties focusProperties = (FocusProperties) obj;
        switch (i) {
            case 0:
                return FocusOrderModifierKt.b(focusOrderToProperties, focusProperties);
            default:
                return FocusOrderModifierKt.a(focusOrderToProperties, focusProperties);
        }
    }
}
