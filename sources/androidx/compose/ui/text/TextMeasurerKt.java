package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextOverflow;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TextMeasurerKt {
    private static final int DefaultCacheSize = 8;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m7464isEllipsisMW5ApA(int i) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return TextOverflow.m7987equalsimpl0(i, companion.m7997getEllipsisgIe3tQ8()) || TextOverflow.m7987equalsimpl0(i, companion.m7999getStartEllipsisgIe3tQ8()) || TextOverflow.m7987equalsimpl0(i, companion.m7998getMiddleEllipsisgIe3tQ8());
    }
}
