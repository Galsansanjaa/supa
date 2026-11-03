package defpackage;

import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.internal.FloatProducer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class jc0 implements FloatProducer {
    public final /* synthetic */ int a;

    public /* synthetic */ jc0(int i) {
        this.a = i;
    }

    @Override // androidx.compose.material3.internal.FloatProducer
    public final float invoke() {
        switch (this.a) {
            case 0:
                return DefaultTwoRowsTopAppBarOverride.e();
            default:
                return NavigationDrawerKt.i();
        }
    }
}
