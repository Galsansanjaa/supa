package defpackage;

import androidx.window.SafeWindowExtensionsProvider;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class hb2 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SafeWindowExtensionsProvider b;

    public /* synthetic */ hb2(SafeWindowExtensionsProvider safeWindowExtensionsProvider, int i) {
        this.a = i;
        this.b = safeWindowExtensionsProvider;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        SafeWindowExtensionsProvider safeWindowExtensionsProvider = this.b;
        switch (i) {
            case 0:
                return SafeWindowExtensionsProvider.a(safeWindowExtensionsProvider);
            default:
                return Boolean.valueOf(SafeWindowExtensionsProvider.b(safeWindowExtensionsProvider));
        }
    }
}
