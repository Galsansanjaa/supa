package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TextIndentKt {
    public static final TextIndent lerp(TextIndent textIndent, TextIndent textIndent2, float f) {
        return new TextIndent(SpanStyleKt.m7433lerpTextUnitInheritableC3pnCVY(textIndent.m7969getFirstLineXSAIIZE(), textIndent2.m7969getFirstLineXSAIIZE(), f), SpanStyleKt.m7433lerpTextUnitInheritableC3pnCVY(textIndent.m7970getRestLineXSAIIZE(), textIndent2.m7970getRestLineXSAIIZE(), f), null);
    }
}
