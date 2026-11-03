package androidx.compose.ui.layout;

import defpackage.sb0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class AlignmentLine {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int Unspecified = Integer.MIN_VALUE;
    private final ts0 merger;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }
    }

    private AlignmentLine(ts0 ts0Var) {
        this.merger = ts0Var;
    }

    public /* synthetic */ AlignmentLine(ts0 ts0Var, sb0 sb0Var) {
        this(ts0Var);
    }

    public final ts0 getMerger$ui() {
        return this.merger;
    }
}
