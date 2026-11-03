package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import defpackage.df2;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class SpanStyleKt {
    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;
    private static final TextForegroundStyle DefaultColorForegroundStyle;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);

    static {
        Color.Companion companion = Color.Companion;
        DefaultBackgroundColor = companion.m5367getTransparent0d7_KjU();
        long m5358getBlack0d7_KjU = companion.m5358getBlack0d7_KjU();
        DefaultColor = m5358getBlack0d7_KjU;
        DefaultColorForegroundStyle = TextForegroundStyle.Companion.m7966from8_81llA(m5358getBlack0d7_KjU);
    }

    public static /* synthetic */ TextForegroundStyle a() {
        return DefaultColorForegroundStyle;
    }

    private static final Shadow dropAlpha(Shadow shadow) {
        return Shadow.m5671copyqcb84PM$default(shadow, Color.m5331copywmQWz5c$default(shadow.m5675getColor0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0083, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m8236equalsimpl0(r34, r22.m7431getLetterSpacingXSAIIZE()) == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x002f, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m8236equalsimpl0(r11, r22.m7428getFontSizeXSAIIZE()) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0058, code lost:
    
        if (r30.equals(r22.m7429getFontStyle4Lr2A7w()) == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0064, code lost:
    
        if (r29.equals(r22.getFontWeight()) == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x006c, code lost:
    
        if (r32 != r22.getFontFamily()) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00dd, code lost:
    
        if (r14.equals(r22.getTextGeometricTransform()) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (androidx.compose.ui.graphics.Color.m5333equalsimpl0(r23, r22.getTextForegroundStyle$ui_text().mo7819getColor0d7_KjU()) == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ee, code lost:
    
        if (r38.equals(r22.getLocaleList()) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0101, code lost:
    
        if (androidx.compose.ui.graphics.Color.m5333equalsimpl0(r7, r22.m7425getBackground0d7_KjU()) != false) goto L184;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* renamed from: fastMerge-dSHsh3o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.text.SpanStyle m7432fastMergedSHsh3o(androidx.compose.ui.text.SpanStyle r22, long r23, androidx.compose.ui.graphics.Brush r25, float r26, long r27, androidx.compose.ui.text.font.FontWeight r29, androidx.compose.ui.text.font.FontStyle r30, androidx.compose.ui.text.font.FontSynthesis r31, androidx.compose.ui.text.font.FontFamily r32, java.lang.String r33, long r34, androidx.compose.ui.text.style.BaselineShift r36, androidx.compose.ui.text.style.TextGeometricTransform r37, androidx.compose.ui.text.intl.LocaleList r38, long r39, androidx.compose.ui.text.style.TextDecoration r41, androidx.compose.ui.graphics.Shadow r42, androidx.compose.ui.text.PlatformSpanStyle r43, androidx.compose.ui.graphics.drawscope.DrawStyle r44) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SpanStyleKt.m7432fastMergedSHsh3o(androidx.compose.ui.text.SpanStyle, long, androidx.compose.ui.graphics.Brush, float, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle):androidx.compose.ui.text.SpanStyle");
    }

    public static final SpanStyle lerp(SpanStyle spanStyle, SpanStyle spanStyle2, float f) {
        TextForegroundStyle lerp = TextDrawStyleKt.lerp(spanStyle.getTextForegroundStyle$ui_text(), spanStyle2.getTextForegroundStyle$ui_text(), f);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f);
        long m7433lerpTextUnitInheritableC3pnCVY = m7433lerpTextUnitInheritableC3pnCVY(spanStyle.m7428getFontSizeXSAIIZE(), spanStyle2.m7428getFontSizeXSAIIZE(), f);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontWeight lerp2 = FontWeightKt.lerp(fontWeight, fontWeight2, f);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(spanStyle.m7429getFontStyle4Lr2A7w(), spanStyle2.m7429getFontStyle4Lr2A7w(), f);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(spanStyle.m7430getFontSynthesisZQGJjVo(), spanStyle2.m7430getFontSynthesisZQGJjVo(), f);
        String str = (String) lerpDiscrete(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f);
        long m7433lerpTextUnitInheritableC3pnCVY2 = m7433lerpTextUnitInheritableC3pnCVY(spanStyle.m7431getLetterSpacingXSAIIZE(), spanStyle2.m7431getLetterSpacingXSAIIZE(), f);
        BaselineShift m7426getBaselineShift5SSeXJ0 = spanStyle.m7426getBaselineShift5SSeXJ0();
        float m7807unboximpl = m7426getBaselineShift5SSeXJ0 != null ? m7426getBaselineShift5SSeXJ0.m7807unboximpl() : BaselineShift.m7802constructorimpl(0.0f);
        BaselineShift m7426getBaselineShift5SSeXJ02 = spanStyle2.m7426getBaselineShift5SSeXJ0();
        float m7817lerpjWV1Mfo = BaselineShiftKt.m7817lerpjWV1Mfo(m7807unboximpl, m7426getBaselineShift5SSeXJ02 != null ? m7426getBaselineShift5SSeXJ02.m7807unboximpl() : BaselineShift.m7802constructorimpl(0.0f), f);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text();
        }
        return new SpanStyle(lerp, m7433lerpTextUnitInheritableC3pnCVY, lerp2, fontStyle, fontSynthesis, fontFamily, str, m7433lerpTextUnitInheritableC3pnCVY2, BaselineShift.m7801boximpl(m7817lerpjWV1Mfo), TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f), (LocaleList) lerpDiscrete(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f), ColorKt.m5383lerpjxsXWHM(spanStyle.m7425getBackground0d7_KjU(), spanStyle2.m7425getBackground0d7_KjU(), f), (TextDecoration) lerpDiscrete(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f), nullSafeLerp(spanStyle.getShadow(), spanStyle2.getShadow(), f), lerpPlatformStyle(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f), (DrawStyle) lerpDiscrete(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f), (sb0) null);
    }

    public static final <T> T lerpDiscrete(T t, T t2, float f) {
        return ((double) f) < 0.5d ? t : t2;
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.Companion.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f);
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY */
    public static final long m7433lerpTextUnitInheritableC3pnCVY(long j, long j2, float f) {
        return (TextUnit.m8237getRawTypeimpl(j) == 0 || TextUnit.m8237getRawTypeimpl(j2) == 0) ? ((TextUnit) lerpDiscrete(TextUnit.m8229boximpl(j), TextUnit.m8229boximpl(j2), f)).m8248unboximpl() : TextUnitKt.m8259lerpC3pnCVY(j, j2, f);
    }

    private static final PlatformSpanStyle mergePlatformStyle(SpanStyle spanStyle, PlatformSpanStyle platformSpanStyle) {
        return spanStyle.getPlatformStyle() == null ? platformSpanStyle : platformSpanStyle == null ? spanStyle.getPlatformStyle() : spanStyle.getPlatformStyle().merge(platformSpanStyle);
    }

    public static final Shadow nullSafeLerp(Shadow shadow, Shadow shadow2, float f) {
        if (shadow == null && shadow2 == null) {
            return null;
        }
        if (shadow != null) {
            return shadow2 == null ? ShadowKt.lerp(shadow, dropAlpha(shadow), f) : ShadowKt.lerp(shadow, shadow2, f);
        }
        shadow2.getClass();
        return ShadowKt.lerp(dropAlpha(shadow2), shadow2, f);
    }

    public static final SpanStyle resolveSpanStyleDefaults(SpanStyle spanStyle) {
        TextForegroundStyle takeOrElse = spanStyle.getTextForegroundStyle$ui_text().takeOrElse(new df2(9));
        long m7428getFontSizeXSAIIZE = TextUnit.m8237getRawTypeimpl(spanStyle.m7428getFontSizeXSAIIZE()) == 0 ? DefaultFontSize : spanStyle.m7428getFontSizeXSAIIZE();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle m7429getFontStyle4Lr2A7w = spanStyle.m7429getFontStyle4Lr2A7w();
        FontStyle m7596boximpl = FontStyle.m7596boximpl(m7429getFontStyle4Lr2A7w != null ? m7429getFontStyle4Lr2A7w.m7602unboximpl() : FontStyle.Companion.m7606getNormal_LCdwA());
        FontSynthesis m7430getFontSynthesisZQGJjVo = spanStyle.m7430getFontSynthesisZQGJjVo();
        FontSynthesis m7607boximpl = FontSynthesis.m7607boximpl(m7430getFontSynthesisZQGJjVo != null ? m7430getFontSynthesisZQGJjVo.m7615unboximpl() : FontSynthesis.Companion.m7616getAllGVVA2EU());
        FontFamily fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.Companion.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long m7431getLetterSpacingXSAIIZE = TextUnit.m8237getRawTypeimpl(spanStyle.m7431getLetterSpacingXSAIIZE()) == 0 ? DefaultLetterSpacing : spanStyle.m7431getLetterSpacingXSAIIZE();
        BaselineShift m7426getBaselineShift5SSeXJ0 = spanStyle.m7426getBaselineShift5SSeXJ0();
        float m7807unboximpl = m7426getBaselineShift5SSeXJ0 != null ? m7426getBaselineShift5SSeXJ0.m7807unboximpl() : BaselineShift.Companion.m7812getNoney9eOQZs();
        if (Float.isNaN(m7807unboximpl)) {
            m7807unboximpl = BaselineShift.Companion.m7812getNoney9eOQZs();
        }
        BaselineShift m7801boximpl = BaselineShift.m7801boximpl(m7807unboximpl);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.Companion.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long m7425getBackground0d7_KjU = spanStyle.m7425getBackground0d7_KjU();
        if (m7425getBackground0d7_KjU == 16) {
            m7425getBackground0d7_KjU = DefaultBackgroundColor;
        }
        long j = m7425getBackground0d7_KjU;
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = spanStyle.getPlatformStyle();
        DrawStyle drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(takeOrElse, m7428getFontSizeXSAIIZE, fontWeight2, m7596boximpl, m7607boximpl, fontFamily2, str, m7431getLetterSpacingXSAIIZE, m7801boximpl, textGeometricTransform2, localeList2, j, textDecoration2, shadow2, platformStyle, drawStyle, (sb0) null);
    }
}
