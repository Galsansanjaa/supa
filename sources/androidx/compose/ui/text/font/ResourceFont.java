package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import defpackage.jh2;
import defpackage.lt;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ResourceFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final int resId;
    private final int style;
    private final FontVariation.Settings variationSettings;
    private final FontWeight weight;

    private ResourceFont(int i, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3) {
        this.resId = i;
        this.weight = fontWeight;
        this.style = i2;
        this.variationSettings = settings;
        this.loadingStrategy = i3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ResourceFont(int r8, androidx.compose.ui.text.font.FontWeight r9, int r10, androidx.compose.ui.text.font.FontVariation.Settings r11, int r12, int r13, defpackage.sb0 r14) {
        /*
            r7 = this;
            r14 = r13 & 2
            if (r14 == 0) goto La
            androidx.compose.ui.text.font.FontWeight$Companion r9 = androidx.compose.ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r9 = r9.getNormal()
        La:
            r2 = r9
            r9 = r13 & 4
            if (r9 == 0) goto L15
            androidx.compose.ui.text.font.FontStyle$Companion r9 = androidx.compose.ui.text.font.FontStyle.Companion
            int r10 = r9.m7606getNormal_LCdwA()
        L15:
            r3 = r10
            r9 = r13 & 8
            if (r9 == 0) goto L23
            androidx.compose.ui.text.font.FontVariation r9 = androidx.compose.ui.text.font.FontVariation.INSTANCE
            r10 = 0
            androidx.compose.ui.text.font.FontVariation$Setting[] r10 = new androidx.compose.ui.text.font.FontVariation.Setting[r10]
            androidx.compose.ui.text.font.FontVariation$Settings r11 = r9.m7622Settings6EWAqTQ(r2, r3, r10)
        L23:
            r4 = r11
            r9 = r13 & 16
            if (r9 == 0) goto L2e
            androidx.compose.ui.text.font.FontLoadingStrategy$Companion r9 = androidx.compose.ui.text.font.FontLoadingStrategy.Companion
            int r12 = r9.m7590getAsyncPKNRLFQ()
        L2e:
            r5 = r12
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.ResourceFont.<init>(int, androidx.compose.ui.text.font.FontWeight, int, androidx.compose.ui.text.font.FontVariation$Settings, int, int, sb0):void");
    }

    public /* synthetic */ ResourceFont(int i, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3, sb0 sb0Var) {
        this(i, fontWeight, i2, settings, i3);
    }

    /* renamed from: copy-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m7634copyF3nL8kk$default(ResourceFont resourceFont, int i, FontWeight fontWeight, int i2, int i3, FontVariation.Settings settings, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = resourceFont.resId;
        }
        if ((i4 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i4 & 4) != 0) {
            i2 = resourceFont.mo7553getStyle_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = resourceFont.mo7543getLoadingStrategyPKNRLFQ();
        }
        if ((i4 & 16) != 0) {
            settings = resourceFont.variationSettings;
        }
        FontVariation.Settings settings2 = settings;
        int i5 = i2;
        return resourceFont.m7636copyF3nL8kk(i, fontWeight, i5, i3, settings2);
    }

    /* renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m7635copyRetOiIg$default(ResourceFont resourceFont, int i, FontWeight fontWeight, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = resourceFont.resId;
        }
        if ((i3 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i3 & 4) != 0) {
            i2 = resourceFont.mo7553getStyle_LCdwA();
        }
        return resourceFont.m7637copyRetOiIg(i, fontWeight, i2);
    }

    /* renamed from: copy-F3nL8kk, reason: not valid java name */
    public final ResourceFont m7636copyF3nL8kk(int i, FontWeight fontWeight, int i2, int i3, FontVariation.Settings settings) {
        return new ResourceFont(i, fontWeight, i2, settings, i3, null);
    }

    /* renamed from: copy-RetOiIg, reason: not valid java name */
    public final ResourceFont m7637copyRetOiIg(int i, FontWeight fontWeight, int i2) {
        return m7634copyF3nL8kk$default(this, i, fontWeight, i2, mo7543getLoadingStrategyPKNRLFQ(), null, 16, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) obj;
        return this.resId == resourceFont.resId && jh2.k(getWeight(), resourceFont.getWeight()) && FontStyle.m7599equalsimpl0(mo7553getStyle_LCdwA(), resourceFont.mo7553getStyle_LCdwA()) && jh2.k(this.variationSettings, resourceFont.variationSettings) && FontLoadingStrategy.m7586equalsimpl0(mo7543getLoadingStrategyPKNRLFQ(), resourceFont.mo7543getLoadingStrategyPKNRLFQ());
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getLoadingStrategy-PKNRLFQ */
    public int mo7543getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo7553getStyle_LCdwA() {
        return this.style;
    }

    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.variationSettings.hashCode() + ((FontLoadingStrategy.m7587hashCodeimpl(mo7543getLoadingStrategyPKNRLFQ()) + ((FontStyle.m7600hashCodeimpl(mo7553getStyle_LCdwA()) + ((getWeight().hashCode() + (this.resId * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        int i = this.resId;
        FontWeight weight = getWeight();
        String m7601toStringimpl = FontStyle.m7601toStringimpl(mo7553getStyle_LCdwA());
        String m7588toStringimpl = FontLoadingStrategy.m7588toStringimpl(mo7543getLoadingStrategyPKNRLFQ());
        StringBuilder sb = new StringBuilder("ResourceFont(resId=");
        sb.append(i);
        sb.append(", weight=");
        sb.append(weight);
        sb.append(", style=");
        return lt.B(sb, m7601toStringimpl, ", loadingStrategy=", m7588toStringimpl, ")");
    }
}
