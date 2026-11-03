package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xj0 implements h12 {
    public final /* synthetic */ int a;
    public final h12 b;

    public /* synthetic */ xj0(h12 h12Var, int i) {
        this.a = i;
        this.b = h12Var;
    }

    @Override // defpackage.h12
    public final Object get() {
        int i = this.a;
        h12 h12Var = this.b;
        switch (i) {
            case 0:
                String packageName = ((Context) h12Var.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                hu2.q("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new vb2((Context) h12Var.get(), Integer.valueOf(vb2.n).intValue(), "com.google.android.datatransport.events");
        }
    }
}
