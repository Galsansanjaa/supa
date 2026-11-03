package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import defpackage.d82;
import defpackage.f31;
import defpackage.v5;
import defpackage.wa2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AndroidFontLoader implements PlatformFontLoader {
    public static final int $stable = 8;
    private final Object cacheKey;
    private final Context context;

    public AndroidFontLoader(Context context) {
        this.context = context.getApplicationContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitLoad(androidx.compose.ui.text.font.Font r6, defpackage.a10 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L37
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.ui.text.font.Font) r6
            defpackage.ta3.H(r7)
            goto L66
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r5)
            return r2
        L33:
            defpackage.ta3.H(r7)
            return r7
        L37:
            defpackage.ta3.H(r7)
            boolean r7 = r6 instanceof androidx.compose.ui.text.font.AndroidFont
            e50 r1 = defpackage.e50.a
            if (r7 == 0) goto L52
            androidx.compose.ui.text.font.AndroidFont r6 = (androidx.compose.ui.text.font.AndroidFont) r6
            androidx.compose.ui.text.font.AndroidFont$TypefaceLoader r7 = r6.getTypefaceLoader()
            android.content.Context r5 = r5.context
            r0.label = r4
            java.lang.Object r5 = r7.awaitLoad(r5, r6, r0)
            if (r5 != r1) goto L51
            goto L65
        L51:
            return r5
        L52:
            boolean r7 = r6 instanceof androidx.compose.ui.text.font.ResourceFont
            if (r7 == 0) goto L75
            r7 = r6
            androidx.compose.ui.text.font.ResourceFont r7 = (androidx.compose.ui.text.font.ResourceFont) r7
            android.content.Context r2 = r5.context
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = androidx.compose.ui.text.font.AndroidFontLoader_androidKt.access$loadAsync(r7, r2, r0)
            if (r7 != r1) goto L66
        L65:
            return r1
        L66:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            androidx.compose.ui.text.font.ResourceFont r6 = (androidx.compose.ui.text.font.ResourceFont) r6
            androidx.compose.ui.text.font.FontVariation$Settings r6 = r6.getVariationSettings()
            android.content.Context r5 = r5.context
            android.graphics.Typeface r5 = androidx.compose.ui.text.font.PlatformTypefaces_androidKt.setFontVariationSettings(r7, r6, r5)
            return r5
        L75:
            java.lang.String r5 = "Unknown font type: "
            defpackage.sn0.n(r6, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AndroidFontLoader.awaitLoad(androidx.compose.ui.text.font.Font, a10):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public android.graphics.Typeface loadBlocking(Font font) {
        Object d82Var;
        android.graphics.Typeface typeface;
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
        }
        if (font instanceof ResourceFont) {
            ResourceFont resourceFont = (ResourceFont) font;
            int mo7543getLoadingStrategyPKNRLFQ = resourceFont.mo7543getLoadingStrategyPKNRLFQ();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
            if (FontLoadingStrategy.m7586equalsimpl0(mo7543getLoadingStrategyPKNRLFQ, companion.m7591getBlockingPKNRLFQ())) {
                typeface = AndroidFontLoader_androidKt.load(resourceFont, this.context);
            } else if (FontLoadingStrategy.m7586equalsimpl0(mo7543getLoadingStrategyPKNRLFQ, companion.m7592getOptionalLocalPKNRLFQ())) {
                try {
                    d82Var = AndroidFontLoader_androidKt.load((ResourceFont) font, this.context);
                } catch (Throwable th) {
                    d82Var = new d82(th);
                }
                typeface = (android.graphics.Typeface) (d82Var instanceof d82 ? null : d82Var);
            } else {
                if (FontLoadingStrategy.m7586equalsimpl0(mo7543getLoadingStrategyPKNRLFQ, companion.m7590getAsyncPKNRLFQ())) {
                    f31.f("Unsupported Async font load path");
                    return null;
                }
                v5.m(wa2.y("Unknown loading type ", FontLoadingStrategy.m7588toStringimpl(resourceFont.mo7543getLoadingStrategyPKNRLFQ())));
            }
            return PlatformTypefaces_androidKt.setFontVariationSettings(typeface, resourceFont.getVariationSettings(), this.context);
        }
        return null;
    }
}
