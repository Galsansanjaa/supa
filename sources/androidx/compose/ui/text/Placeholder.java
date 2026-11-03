package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.TextUnit;
import defpackage.lt;
import defpackage.sb0;
import defpackage.wa2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class Placeholder {
    public static final int $stable = 0;
    private final long height;
    private final int placeholderVerticalAlign;
    private final long width;

    private Placeholder(long j, long j2, int i) {
        this.width = j;
        this.height = j2;
        this.placeholderVerticalAlign = i;
        if (TextUnit.m8237getRawTypeimpl(j) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if (TextUnit.m8237getRawTypeimpl(j2) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }

    public /* synthetic */ Placeholder(long j, long j2, int i, sb0 sb0Var) {
        this(j, j2, i);
    }

    /* renamed from: copy-K8Q-__8$default, reason: not valid java name */
    public static /* synthetic */ Placeholder m7395copyK8Q__8$default(Placeholder placeholder, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = placeholder.width;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = placeholder.height;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = placeholder.placeholderVerticalAlign;
        }
        return placeholder.m7396copyK8Q__8(j3, j4, i);
    }

    /* renamed from: copy-K8Q-__8, reason: not valid java name */
    public final Placeholder m7396copyK8Q__8(long j, long j2, int i) {
        return new Placeholder(j, j2, i, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        return TextUnit.m8236equalsimpl0(this.width, placeholder.width) && TextUnit.m8236equalsimpl0(this.height, placeholder.height) && PlaceholderVerticalAlign.m7403equalsimpl0(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign);
    }

    /* renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m7397getHeightXSAIIZE() {
        return this.height;
    }

    /* renamed from: getPlaceholderVerticalAlign-J6kI3mc, reason: not valid java name */
    public final int m7398getPlaceholderVerticalAlignJ6kI3mc() {
        return this.placeholderVerticalAlign;
    }

    /* renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m7399getWidthXSAIIZE() {
        return this.width;
    }

    public int hashCode() {
        return PlaceholderVerticalAlign.m7404hashCodeimpl(this.placeholderVerticalAlign) + ((TextUnit.m8240hashCodeimpl(this.height) + (TextUnit.m8240hashCodeimpl(this.width) * 31)) * 31);
    }

    public String toString() {
        String m8246toStringimpl = TextUnit.m8246toStringimpl(this.width);
        String m8246toStringimpl2 = TextUnit.m8246toStringimpl(this.height);
        return wa2.v(lt.D("Placeholder(width=", m8246toStringimpl, ", height=", m8246toStringimpl2, ", placeholderVerticalAlign="), PlaceholderVerticalAlign.m7405toStringimpl(this.placeholderVerticalAlign), ")");
    }
}
