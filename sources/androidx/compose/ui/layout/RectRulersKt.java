package androidx.compose.ui.layout;

import androidx.compose.ui.layout.RectRulers;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class RectRulersKt {
    public static final RectRulers RectRulers() {
        return new RectRulersImpl(null);
    }

    public static final RectRulers RectRulers(String str) {
        return new RectRulersImpl(str);
    }

    public static final RectRulers innermostOf(RectRulers.Companion companion, RectRulers... rectRulersArr) {
        return new InnerRectRulers(rectRulersArr);
    }

    public static final RectRulers outermostOf(RectRulers.Companion companion, RectRulers... rectRulersArr) {
        return new OuterRectRulers(rectRulersArr);
    }
}
