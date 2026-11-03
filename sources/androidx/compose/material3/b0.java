package androidx.compose.material3;

import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DelegatingThemeAwareRippleNode b;

    public /* synthetic */ b0(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, int i) {
        this.a = i;
        this.b = delegatingThemeAwareRippleNode;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.b;
        switch (i) {
            case 0:
                return DelegatingThemeAwareRippleNode.b(delegatingThemeAwareRippleNode);
            default:
                return DelegatingThemeAwareRippleNode.a(delegatingThemeAwareRippleNode);
        }
    }
}
