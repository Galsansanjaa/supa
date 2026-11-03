package defpackage;

import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.SingleRowTopAppBarOverrideScope;
import androidx.compose.material3.TwoRowsTopAppBarOverrideScope;
import androidx.compose.material3.internal.FloatProducer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class fc0 implements FloatProducer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fc0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.material3.internal.FloatProducer
    public final float invoke() {
        float TwoRowsTopAppBar$lambda$27$lambda$26$lambda$25$lambda$24;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return DefaultSingleRowTopAppBarOverride.f((SingleRowTopAppBarOverrideScope) obj);
            default:
                TwoRowsTopAppBar$lambda$27$lambda$26$lambda$25$lambda$24 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$27$lambda$26$lambda$25$lambda$24((TwoRowsTopAppBarOverrideScope) obj);
                return TwoRowsTopAppBar$lambda$27$lambda$26$lambda$25$lambda$24;
        }
    }
}
