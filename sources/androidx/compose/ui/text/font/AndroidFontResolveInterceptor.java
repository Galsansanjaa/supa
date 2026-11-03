package androidx.compose.ui.text.font;

import defpackage.ea0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AndroidFontResolveInterceptor implements PlatformResolveInterceptor {
    public static final int $stable = 0;
    private final int fontWeightAdjustment;

    public AndroidFontResolveInterceptor(int i) {
        this.fontWeightAdjustment = i;
    }

    private final int component1() {
        return this.fontWeightAdjustment;
    }

    public static /* synthetic */ AndroidFontResolveInterceptor copy$default(AndroidFontResolveInterceptor androidFontResolveInterceptor, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = androidFontResolveInterceptor.fontWeightAdjustment;
        }
        return androidFontResolveInterceptor.copy(i);
    }

    public final AndroidFontResolveInterceptor copy(int i) {
        return new AndroidFontResolveInterceptor(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidFontResolveInterceptor) && this.fontWeightAdjustment == ((AndroidFontResolveInterceptor) obj).fontWeightAdjustment;
    }

    public int hashCode() {
        return this.fontWeightAdjustment;
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    public final FontFamily interceptFontFamily(FontFamily fontFamily) {
        return fontFamily;
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    /* renamed from: interceptFontStyle-T2F_aPo, reason: not valid java name */
    public final int mo7550interceptFontStyleT2F_aPo(int i) {
        return i;
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    /* renamed from: interceptFontSynthesis-Mscr08Y, reason: not valid java name */
    public final int mo7551interceptFontSynthesisMscr08Y(int i) {
        return i;
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    public FontWeight interceptFontWeight(FontWeight fontWeight) {
        int i = this.fontWeightAdjustment;
        return (i == 0 || i == Integer.MAX_VALUE) ? fontWeight : new FontWeight(ea0.o(fontWeight.getWeight() + this.fontWeightAdjustment, 1, 1000));
    }

    public String toString() {
        return sg3.o(this.fontWeightAdjustment, "AndroidFontResolveInterceptor(fontWeightAdjustment=", ")");
    }
}
