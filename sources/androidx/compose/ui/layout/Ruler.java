package androidx.compose.ui.layout;

import defpackage.sb0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class Ruler {
    public static final int $stable = 0;
    private final ts0 calculate;

    private Ruler(ts0 ts0Var) {
        this.calculate = ts0Var;
    }

    public /* synthetic */ Ruler(ts0 ts0Var, sb0 sb0Var) {
        this(ts0Var);
    }

    public abstract float calculateCoordinate$ui(float f, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2);

    public final ts0 getCalculate$ui() {
        return this.calculate;
    }
}
