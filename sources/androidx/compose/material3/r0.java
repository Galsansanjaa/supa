package androidx.compose.material3;

import androidx.compose.material3.internal.FloatProducer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements FloatProducer {
    public final /* synthetic */ int a;
    public final /* synthetic */ DrawerState b;

    public /* synthetic */ r0(DrawerState drawerState, int i) {
        this.a = i;
        this.b = drawerState;
    }

    @Override // androidx.compose.material3.internal.FloatProducer
    public final float invoke() {
        int i = this.a;
        DrawerState drawerState = this.b;
        switch (i) {
            case 0:
                return NavigationDrawerKt$DismissibleDrawerSheet$2.a(drawerState);
            default:
                return NavigationDrawerKt$ModalDrawerSheet$2.a(drawerState);
        }
    }
}
