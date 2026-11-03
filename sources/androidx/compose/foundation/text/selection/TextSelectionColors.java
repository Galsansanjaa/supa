package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.Color;
import defpackage.sb0;
import defpackage.wa2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextSelectionColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long handleColor;

    private TextSelectionColors(long j, long j2) {
        this.handleColor = j;
        this.backgroundColor = j2;
    }

    public /* synthetic */ TextSelectionColors(long j, long j2, sb0 sb0Var) {
        this(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextSelectionColors)) {
            return false;
        }
        TextSelectionColors textSelectionColors = (TextSelectionColors) obj;
        return Color.m5333equalsimpl0(this.handleColor, textSelectionColors.handleColor) && Color.m5333equalsimpl0(this.backgroundColor, textSelectionColors.backgroundColor);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m2193getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getHandleColor-0d7_KjU, reason: not valid java name */
    public final long m2194getHandleColor0d7_KjU() {
        return this.handleColor;
    }

    public int hashCode() {
        return Color.m5339hashCodeimpl(this.backgroundColor) + (Color.m5339hashCodeimpl(this.handleColor) * 31);
    }

    public String toString() {
        return wa2.t("SelectionColors(selectionHandleColor=", Color.m5340toStringimpl(this.handleColor), ", selectionBackgroundColor=", Color.m5340toStringimpl(this.backgroundColor), ")");
    }
}
