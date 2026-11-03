package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Placeable;
import defpackage.ps0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object m;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.m = obj2;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.m;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ClickableTextKt$ClickableText$pressIndicator$1$1.a((MutableState) obj3, (ps0) obj2, (Offset) obj);
            case 1:
                return LinksTextMeasurePolicy.a((List) obj3, (LinksTextMeasurePolicy) obj2, (Placeable.PlacementScope) obj);
            default:
                return TextMeasurePolicy.a((List) obj3, (List) obj2, (Placeable.PlacementScope) obj);
        }
    }
}
