package defpackage;

import androidx.window.layout.SafeWindowLayoutComponentProvider;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ib2 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SafeWindowLayoutComponentProvider b;

    public /* synthetic */ ib2(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, int i) {
        this.a = i;
        this.b = safeWindowLayoutComponentProvider;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        boolean c;
        int i = this.a;
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = this.b;
        switch (i) {
            case 0:
                c = SafeWindowLayoutComponentProvider.c(safeWindowLayoutComponentProvider);
                break;
            case 1:
                c = SafeWindowLayoutComponentProvider.d(safeWindowLayoutComponentProvider);
                break;
            case 2:
                c = SafeWindowLayoutComponentProvider.g(safeWindowLayoutComponentProvider);
                break;
            case 3:
                c = SafeWindowLayoutComponentProvider.e(safeWindowLayoutComponentProvider);
                break;
            case 4:
                c = SafeWindowLayoutComponentProvider.a(safeWindowLayoutComponentProvider);
                break;
            case 5:
                c = SafeWindowLayoutComponentProvider.b(safeWindowLayoutComponentProvider);
                break;
            default:
                c = SafeWindowLayoutComponentProvider.f(safeWindowLayoutComponentProvider);
                break;
        }
        return Boolean.valueOf(c);
    }
}
