package defpackage;

import androidx.compose.ui.viewinterop.ViewFactoryHolder;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j73 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewFactoryHolder b;

    public /* synthetic */ j73(ViewFactoryHolder viewFactoryHolder, int i) {
        this.a = i;
        this.b = viewFactoryHolder;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        ViewFactoryHolder viewFactoryHolder = this.b;
        switch (i) {
            case 0:
                return ViewFactoryHolder.q(viewFactoryHolder);
            case 1:
                return ViewFactoryHolder.t(viewFactoryHolder);
            case 2:
                return ViewFactoryHolder.r(viewFactoryHolder);
            default:
                return ViewFactoryHolder.s(viewFactoryHolder);
        }
    }
}
