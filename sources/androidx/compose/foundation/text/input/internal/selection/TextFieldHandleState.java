package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.sb0;
import defpackage.sg3;
import defpackage.yo0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextFieldHandleState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextFieldHandleState Hidden = new TextFieldHandleState(false, Offset.Companion.m5105getUnspecifiedF1C5BW0(), 0.0f, ResolvedTextDirection.Ltr, false, null);
    private final ResolvedTextDirection direction;
    private final boolean handlesCrossed;
    private final float lineHeight;
    private final long position;
    private final boolean visible;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final TextFieldHandleState getHidden() {
            return TextFieldHandleState.Hidden;
        }
    }

    private TextFieldHandleState(boolean z, long j, float f, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        this.visible = z;
        this.position = j;
        this.lineHeight = f;
        this.direction = resolvedTextDirection;
        this.handlesCrossed = z2;
    }

    public /* synthetic */ TextFieldHandleState(boolean z, long j, float f, ResolvedTextDirection resolvedTextDirection, boolean z2, sb0 sb0Var) {
        this(z, j, f, resolvedTextDirection, z2);
    }

    /* renamed from: copy-YqVAtuI$default, reason: not valid java name */
    public static /* synthetic */ TextFieldHandleState m2001copyYqVAtuI$default(TextFieldHandleState textFieldHandleState, boolean z, long j, float f, ResolvedTextDirection resolvedTextDirection, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = textFieldHandleState.visible;
        }
        if ((i & 2) != 0) {
            j = textFieldHandleState.position;
        }
        if ((i & 4) != 0) {
            f = textFieldHandleState.lineHeight;
        }
        if ((i & 8) != 0) {
            resolvedTextDirection = textFieldHandleState.direction;
        }
        if ((i & 16) != 0) {
            z2 = textFieldHandleState.handlesCrossed;
        }
        boolean z3 = z2;
        float f2 = f;
        return textFieldHandleState.m2003copyYqVAtuI(z, j, f2, resolvedTextDirection, z3);
    }

    public final boolean component1() {
        return this.visible;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m2002component2F1C5BW0() {
        return this.position;
    }

    public final float component3() {
        return this.lineHeight;
    }

    public final ResolvedTextDirection component4() {
        return this.direction;
    }

    public final boolean component5() {
        return this.handlesCrossed;
    }

    /* renamed from: copy-YqVAtuI, reason: not valid java name */
    public final TextFieldHandleState m2003copyYqVAtuI(boolean z, long j, float f, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        return new TextFieldHandleState(z, j, f, resolvedTextDirection, z2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldHandleState)) {
            return false;
        }
        TextFieldHandleState textFieldHandleState = (TextFieldHandleState) obj;
        return this.visible == textFieldHandleState.visible && Offset.m5087equalsimpl0(this.position, textFieldHandleState.position) && Float.compare(this.lineHeight, textFieldHandleState.lineHeight) == 0 && this.direction == textFieldHandleState.direction && this.handlesCrossed == textFieldHandleState.handlesCrossed;
    }

    public final ResolvedTextDirection getDirection() {
        return this.direction;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m2004getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return ((this.direction.hashCode() + yo0.i(this.lineHeight, (Offset.m5092hashCodeimpl(this.position) + ((this.visible ? 1231 : 1237) * 31)) * 31, 31)) * 31) + (this.handlesCrossed ? 1231 : 1237);
    }

    public String toString() {
        boolean z = this.visible;
        String m5098toStringimpl = Offset.m5098toStringimpl(this.position);
        float f = this.lineHeight;
        ResolvedTextDirection resolvedTextDirection = this.direction;
        boolean z2 = this.handlesCrossed;
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(z);
        sb.append(", position=");
        sb.append(m5098toStringimpl);
        sb.append(", lineHeight=");
        sb.append(f);
        sb.append(", direction=");
        sb.append(resolvedTextDirection);
        sb.append(", handlesCrossed=");
        return sg3.u(sb, z2, ")");
    }
}
