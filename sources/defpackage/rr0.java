package defpackage;

import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.TypefaceRequest;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr0 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FontFamilyResolverImpl b;

    public /* synthetic */ rr0(FontFamilyResolverImpl fontFamilyResolverImpl, int i) {
        this.a = i;
        this.b = fontFamilyResolverImpl;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        FontFamilyResolverImpl fontFamilyResolverImpl = this.b;
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        switch (i) {
            case 0:
                return FontFamilyResolverImpl.d(fontFamilyResolverImpl, typefaceRequest);
            default:
                return FontFamilyResolverImpl.b(fontFamilyResolverImpl, typefaceRequest);
        }
    }
}
