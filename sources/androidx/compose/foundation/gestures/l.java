package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import defpackage.ts0;
import defpackage.w42;
import defpackage.y42;
import java.io.Serializable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object m;

    public /* synthetic */ l(int i, Serializable serializable, Object obj) {
        this.a = i;
        this.b = serializable;
        this.m = obj;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ScrollExtensionsKt$animateScrollBy$2.d((w42) this.b, (ScrollScope) this.m, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            case 1:
                return ScrollExtensionsKt$animateScrollBy$4.d((y42) this.b, (Scroll2DScope) this.m, (Offset) obj, (Offset) obj2);
            default:
                return Scrollable2DKt$semanticsScrollBy$2.d((y42) this.b, (NestedScrollScope) this.m, (Offset) obj, (Offset) obj2);
        }
    }
}
