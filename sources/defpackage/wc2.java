package defpackage;

import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class wc2 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ String n;

    public /* synthetic */ wc2(String str, String str2, boolean z, int i) {
        this.a = i;
        this.b = str;
        this.m = z;
        this.n = str2;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return SearchBarDefaults.c(this.b, this.m, this.n, (SemanticsPropertyReceiver) obj);
            default:
                return SearchBarDefaults.g(this.b, this.m, this.n, (SemanticsPropertyReceiver) obj);
        }
    }
}
