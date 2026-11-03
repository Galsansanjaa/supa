package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDragScope;
import defpackage.ts0;
import defpackage.w42;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ w42 m;

    public /* synthetic */ q0(Object obj, w42 w42Var, int i) {
        this.a = i;
        this.b = obj;
        this.m = w42Var;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        w42 w42Var = this.m;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ModalWideNavigationRailState$animateTo$2.d((AnchoredDragScope) obj3, w42Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            case 1:
                return SheetState$animateTo$2.d((AnchoredDragScope) obj3, w42Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            default:
                return DrawerState$animateTo$3.d((androidx.compose.foundation.gestures.AnchoredDragScope) obj3, w42Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
        }
    }
}
