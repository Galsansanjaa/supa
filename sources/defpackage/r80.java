package defpackage;

import androidx.credentials.playservices.controllers.CredentialProviderController;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r80 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps0 b;
    public final /* synthetic */ z42 m;

    public /* synthetic */ r80(ps0 ps0Var, z42 z42Var, int i) {
        this.a = i;
        this.b = ps0Var;
        this.m = z42Var;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        z42 z42Var = this.m;
        ps0 ps0Var = this.b;
        switch (i) {
            case 0:
                return CredentialProviderController.Companion.b(ps0Var, z42Var);
            default:
                return CredentialProviderController.Companion.a(ps0Var, z42Var);
        }
    }
}
