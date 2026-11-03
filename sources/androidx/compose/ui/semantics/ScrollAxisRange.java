package androidx.compose.ui.semantics;

import defpackage.os0;
import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ScrollAxisRange {
    public static final int $stable = 0;
    private final os0 maxValue;
    private final boolean reverseScrolling;
    private final os0 value;

    public ScrollAxisRange(os0 os0Var, os0 os0Var2, boolean z) {
        this.value = os0Var;
        this.maxValue = os0Var2;
        this.reverseScrolling = z;
    }

    public /* synthetic */ ScrollAxisRange(os0 os0Var, os0 os0Var2, boolean z, int i, sb0 sb0Var) {
        this(os0Var, os0Var2, (i & 4) != 0 ? false : z);
    }

    public final os0 getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final os0 getValue() {
        return this.value;
    }

    public String toString() {
        Object invoke = this.value.invoke();
        Object invoke2 = this.maxValue.invoke();
        boolean z = this.reverseScrolling;
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(invoke);
        sb.append(", maxValue=");
        sb.append(invoke2);
        sb.append(", reverseScrolling=");
        return sg3.u(sb, z, ")");
    }
}
