package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import defpackage.lt;
import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class Shadow {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Shadow None = new Shadow(0, 0, 0.0f, 7, null);
    private final float blurRadius;
    private final long color;
    private final long offset;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public static /* synthetic */ void getNone$annotations() {
        }

        public final Shadow getNone() {
            return Shadow.None;
        }
    }

    private Shadow(long j, long j2, float f) {
        this.color = j;
        this.offset = j2;
        this.blurRadius = f;
    }

    public /* synthetic */ Shadow(long j, long j2, float f, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? ColorKt.Color(4278190080L) : j, (i & 2) != 0 ? Offset.Companion.m5106getZeroF1C5BW0() : j2, (i & 4) != 0 ? 0.0f : f, null);
    }

    public /* synthetic */ Shadow(long j, long j2, float f, sb0 sb0Var) {
        this(j, j2, f);
    }

    /* renamed from: copy-qcb84PM$default, reason: not valid java name */
    public static /* synthetic */ Shadow m5671copyqcb84PM$default(Shadow shadow, long j, long j2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = shadow.color;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = shadow.offset;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            f = shadow.blurRadius;
        }
        return shadow.m5674copyqcb84PM(j3, j4, f);
    }

    public static /* synthetic */ void getBlurRadius$annotations() {
    }

    /* renamed from: getColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m5672getColor0d7_KjU$annotations() {
    }

    /* renamed from: getOffset-F1C5BW0$annotations, reason: not valid java name */
    public static /* synthetic */ void m5673getOffsetF1C5BW0$annotations() {
    }

    /* renamed from: copy-qcb84PM, reason: not valid java name */
    public final Shadow m5674copyqcb84PM(long j, long j2, float f) {
        return new Shadow(j, j2, f, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return Color.m5333equalsimpl0(this.color, shadow.color) && Offset.m5087equalsimpl0(this.offset, shadow.offset) && this.blurRadius == shadow.blurRadius;
    }

    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m5675getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m5676getOffsetF1C5BW0() {
        return this.offset;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.blurRadius) + ((Offset.m5092hashCodeimpl(this.offset) + (Color.m5339hashCodeimpl(this.color) * 31)) * 31);
    }

    public String toString() {
        String m5340toStringimpl = Color.m5340toStringimpl(this.color);
        String m5098toStringimpl = Offset.m5098toStringimpl(this.offset);
        return sg3.s(lt.D("Shadow(color=", m5340toStringimpl, ", offset=", m5098toStringimpl, ", blurRadius="), ")", this.blurRadius);
    }
}
